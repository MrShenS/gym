package com.sz.gym.service.impl;

import com.sz.gym.dao.CustomerMapper;
import com.sz.gym.dao.EmployeeMapper;
import com.sz.gym.dao.FacilitiesMapper;
import com.sz.gym.dao.FinanceMapper;
import com.sz.gym.model.dto.DashboardSchartDTO;
import com.sz.gym.model.dto.FacilitiesRatioDTO;
import com.sz.gym.model.enums.ConstantEnum;
import com.sz.gym.model.vo.BaseVO;
import com.sz.gym.model.dto.HeaderNumberDTO;
import com.sz.gym.model.entity.*;
import com.sz.gym.service.DashboardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.Array;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @ClassNameDashboardServiceImpl
 * @Description TODO
 * @Author zhen.zhen
 * @Date 2020/3/119:52
 * @Version 1.0
 */
@Service
@Slf4j
public class DashboardServiceImpl implements DashboardService {

    static final String SUCCESS="success";

    static final String LOSER="loser";

    @Autowired
    public EmployeeMapper employeeMapper;
    @Autowired
    public FacilitiesMapper facilitiesMapper;
    @Autowired
    public CustomerMapper customerMapper;
    @Autowired
    public FinanceMapper financeMapper;


    @Override
    public BaseVO<HeaderNumberDTO> getHeaderNumber() {
        log.info("获取首页的数量信息");
        List<Customer> customers = customerMapper.selectByExample(new CustomerExample());
        List<Facilities> facilities = facilitiesMapper.selectByExample(new FacilitiesExample());
        List<Employee> employees = employeeMapper.selectByExample(new EmployeeExample());
        HeaderNumberDTO headerNumberDTO = new HeaderNumberDTO(employees.size(), facilities.size(), customers.size());
        BaseVO<HeaderNumberDTO> headerNumberDTOBaseVO = new BaseVO<>(SUCCESS, "查询成功", headerNumberDTO);
        return headerNumberDTOBaseVO;
    }

    @Transactional
//    @Cacheable(value = "redisCache", key = "'redis_getFacilitiesRatio'")
    @Override
    public BaseVO<List<FacilitiesRatioDTO>> getFacilitiesRatio() {
        log.info("==================获取首页的数量信息========Service================");
        final String type1="有氧健身器械";
        final String type2="无氧健身器械";
        final String type3="特殊器械";
        List<Facilities> facilities = facilitiesMapper.selectByExample(new FacilitiesExample());
        ArrayList<Facilities> facilitiesByType1 = new ArrayList<>();
        ArrayList<Facilities> facilitiesByType2 = new ArrayList<>();
        ArrayList<Facilities> facilitiesByType3 = new ArrayList<>();
        for (Facilities f :facilities) {
            switch (f.getFacilitiesType()){
                case type1:facilitiesByType1.add(f);break;
                case type2:facilitiesByType2.add(f);break;
                case type3:facilitiesByType3.add(f);break;
            }
        }
        int sum = facilities.size();
        log.debug("=======================计算不同的比列==============================");
        //有氧健身比例
        FacilitiesRatioDTO facilitiesRatioDTO1 =
                new FacilitiesRatioDTO(type1,
                        Math.round(facilitiesByType1.size() * 100/ sum),"green");
        log.debug("==================有氧健身："+facilitiesByType1.size() * 100/ sum);
        //无氧健身比例
        FacilitiesRatioDTO facilitiesRatioDTO2 =
                new FacilitiesRatioDTO(type2,
                        Math.round(facilitiesByType2.size()* 100 / sum ),"red");
        //特殊健身器材比例
        FacilitiesRatioDTO facilitiesRatioDTO3 =
                new FacilitiesRatioDTO(type3,
                        Math.round(facilitiesByType3.size() * 100 / sum ),"blue");
        List<FacilitiesRatioDTO> ratioDTOS = Arrays.asList(facilitiesRatioDTO1, facilitiesRatioDTO2, facilitiesRatioDTO3);
        return new BaseVO<List<FacilitiesRatioDTO>>(SUCCESS,"成功",ratioDTOS);
    }

    @Override
    @Transactional
    public BaseVO<DashboardSchartDTO> getDashboardSchartOfOptions() throws ParseException {
        //设置DashboardSchartDTO的type
        String type="bar";
        //设置xRorate参数
        int xRorate=25;
        //设置title
        DashboardSchartDTO.TitleBean titleBean = new DashboardSchartDTO.TitleBean();
        titleBean.setText("最近三天健身房财务状况");
        //获取三天内的流水记录
        Date date = this.getDate(-3);
        FinanceExample financeExample = new FinanceExample();
        financeExample.createCriteria().andCreateTimeBetween(date,new Date());
        List<Finance> financesInThreeDays = financeMapper.selectByExample(financeExample);
        //将三天内的全部的输入流水提取出来
        ArrayList<Finance> financesIn=getFinances(financesInThreeDays,"income");
        //将三天内的全部消费记录提出出来
        ArrayList<Finance> financesOut=getFinances(financesInThreeDays,"disburse");
        //获取收入的datasets对象
        DashboardSchartDTO.DatasetsBean datasetsBeanIn=getDataSetBean(financesIn,"收入");
        //获取消费的datasets对象
        DashboardSchartDTO.DatasetsBean datasetsBeanOut=getDataSetBean(financesOut,"支出");
        //获取DatasetsBean集合对象
        List<DashboardSchartDTO.DatasetsBean> datasetsBeans = Arrays.asList(datasetsBeanIn, datasetsBeanOut);
        //获取labels集合
        List<String> labels=getLables(financesInThreeDays);
        //获取DashboardSchartDTO对象
        DashboardSchartDTO dashboardSchartDTO=createDashboardSchartDTO(type,titleBean,xRorate,labels,datasetsBeans);

        return new BaseVO<DashboardSchartDTO>(ConstantEnum.success.toString(),"成功",dashboardSchartDTO);
    }

    private DashboardSchartDTO createDashboardSchartDTO(String type, DashboardSchartDTO.TitleBean titleBean, int xRorate, List<String> labels, List<DashboardSchartDTO.DatasetsBean> datasetsBeans) {
        DashboardSchartDTO dashboardSchartDTO = new DashboardSchartDTO();
        dashboardSchartDTO.setType(type);
        dashboardSchartDTO.setTitle(titleBean);
        dashboardSchartDTO.setXRorate(xRorate);
        dashboardSchartDTO.setLabels(labels);
        dashboardSchartDTO.setDatasets(datasetsBeans);
        return dashboardSchartDTO;
    }
    
    
    /**
     * @Author zhen.shen
     * @Description //TODO 获取DashboardSchartDTO对象的Label集合
     * @Date 17:44 2020/3/16
     * @Param 
     * @return 
     **/
    private List<String> getLables(List<Finance> financesInThreeDays) throws ParseException {
        String date1 = getDateString(getDate(-1));
        String date2 = getDateString(getDate(-2));
        String date = getDateString(new Date());
        return Arrays.asList(date,date1,date2);
    }
    /**
     * @Author zhen.shen
     * @Description //TODO 获取DatasetsBean对象
     * @Date 17:40 2020/3/16
     * @Param
     * @return
     **/
    private DashboardSchartDTO.DatasetsBean getDataSetBean(ArrayList<Finance> financesIn,String label) throws ParseException {
        //获取最近三天的时间
        String date1 = getDateString(getDate(-1));
        String date2 = getDateString(getDate(-2));
        String date = getDateString(new Date());
        //设置设置每天的销售金额
        int sum=0;
        int sum1=0;
        int sum2=0;
        //计算每天的金额
        for (Finance finance:financesIn) {
            //将日期转化成指定格式
            String dateString = getDateString(finance.getCreateTime());
            if(date.equals(dateString)){
                sum+=finance.getMoney();
            }else if(date1.equals(dateString)){
                sum1+=finance.getMoney();
            }else {
                sum2+=finance.getMoney();
            }
        }
        List<Integer> doubles = Arrays.asList(sum, sum1, sum2);
        DashboardSchartDTO.DatasetsBean datasetsBean = new DashboardSchartDTO.DatasetsBean();
        datasetsBean.setLabel(label);
        datasetsBean.setData(doubles);
        return datasetsBean;
    }

    /**
     * @Author zhen.shen
     * @Description //TODO 获取指定标志的finance集合
     * @Date 17:13 2020/3/16
     * @Param 指定时间内的财务流水集合    flag 分类标志
     * @return Finances
     **/
    private ArrayList<Finance> getFinances(List<Finance> financesInThreeDays, String flag) {
        ArrayList<Finance> finances = new ArrayList<>();
        for (Finance finance :financesInThreeDays) {
            if(flag.equals(finance.getFinanceType())){
                finances.add(finance);
            }
        }
        return finances;
    }
/**
 * @Author zhen.shen
 * @Description //TODO 获取指定天前的日期对象
 * @Date 17:22 2020/3/16
 * @Param
 * @return
 **/
    public  Date getDate(int num) throws ParseException {
        Calendar calendar2 = Calendar.getInstance();
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        calendar2.add(Calendar.DATE, num);
        String num_days_after = sdf2.format(calendar2.getTime());
        Date parse = sdf2.parse(num_days_after);
        return parse;
    }

    //获取字符串格式的日期
    public String getDateString(Date date){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String s = format.format(date);
        return s;
    }


}
