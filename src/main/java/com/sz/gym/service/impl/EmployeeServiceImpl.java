package com.sz.gym.service.impl;
import com.sz.gym.dao.EmployeeMapper;
import com.sz.gym.exception.NotFountException;
import com.sz.gym.model.param.LoginParam;
import com.sz.gym.model.param.QueryParam;
import com.sz.gym.model.vo.BaseVO;
import com.sz.gym.model.vo.TableShowVO;
import com.sz.gym.model.entity.Employee;
import com.sz.gym.model.entity.EmployeeExample;
import com.sz.gym.service.EmployeeService;
import com.sz.gym.utils.RedisUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * @ClassNameEmployeeServiceImpl
 * @Description TODO
 * @Author zhen.zhen
 * @Date 2020/3/912:33
 * @Version 1.0
 */
@Service
@Slf4j
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    public EmployeeMapper employeeMapper;

    @Autowired
    public RedisUtil redisUtil;

    static final String SUCCESS="success";

    static final String LOSER="loser";

    @Override
    public BaseVO<Employee> register(Employee employee) {
        log.info("注册信息："+employee.toString());
        BaseVO<Employee> employeeBaseVO = new BaseVO<>();
        if(existEmployeeRegister(employee.getEmployeeName()).size()!=0){
            return getBaseVO(LOSER,"用户已存在",employee);
        }
        employee.setEmployeePost("");
        employee.setCreateTime(new Date());
        employee.setSalary(0.0);
        employee.setUpdateTime(new Date());
        int insert = employeeMapper.insert(employee);
        System.out.println(insert);
        return getBaseVO(SUCCESS,"注册成功",employee);
    }

    @Override
    public BaseVO<LoginParam> login(LoginParam LoginParam) {
        List<Employee> employees=null;
        Employee employee=null;
        try{
            employees = existEmployee(LoginParam.getUsername());
            employee = employees.get(0);
        }catch (NotFountException e){
            log.error("此处发生异常");
            e.printStackTrace();
//            e.getErrorData();
            return new BaseVO<LoginParam>(LOSER,"用户名或密码不存在",LoginParam);
        }

        employee = employees.get(0);
        if(!LoginParam.password.equals(employee.getEmployeePassword())){
            return  new BaseVO<LoginParam>(LOSER,"密码错误",LoginParam);
        }

        return new BaseVO<LoginParam>(SUCCESS,"登录成功",LoginParam);
    }

    @Transactional
    @Override
    public BaseVO<List<Employee>> getAllEmployee() {
        return new BaseVO<List<Employee>>(SUCCESS,"查询成功",employeeMapper.selectByExample(new EmployeeExample()));
    }

    @Override
    public BaseVO<TableShowVO> getEmployeeShow() {
        List<Employee> employees = employeeMapper.selectByExample(new EmployeeExample());

        return new BaseVO<TableShowVO>(SUCCESS,"查询成功",new TableShowVO(employees,employees.size()));
    }

    @Override
    public BaseVO<String> updateEmployee(Employee employee) {
        int i = employeeMapper.updateByPrimaryKey(employee);
        if(i==0){
         return new BaseVO<String>(LOSER,"修改失败 具体问题请联系技术人员" ,"");
        }
        return new BaseVO<String>(SUCCESS,"修改成功" ,"");
    }

    @Transactional
    @Cacheable(value = "redisCache", key = "'redis_user_'+#queryParam")
    @Override
    public BaseVO<TableShowVO> getEmployeeByQueryParam(QueryParam queryParam) {
        EmployeeExample employeeExample = new EmployeeExample();
        employeeExample.createCriteria().andEmployeeAddressLike("%"+queryParam.getEmployeeAddress()+"%")
                .andEmployeeNameLike("%"+queryParam.getEmployeeName()+"%");
        List<Employee> employees = employeeMapper.selectByExample(employeeExample);

        for (Employee employee :
             employees) {
            log.info(employee.toString());
        }
        return new BaseVO<TableShowVO>(SUCCESS,"成功",new TableShowVO(employees,employees.size()));
    }

    @Override
    public BaseVO<List<Employee>> deleteAllEmployees(List<Employee> employees) {
        try {
            for (Employee employee:
                    employees) {
                employeeMapper.deleteByPrimaryKey(employee.getEmployeeId());
            }
        }catch (Exception e){
            return new BaseVO<List<Employee>>(LOSER,"删除失败 联系系统管理员",employees);
        }
        return new BaseVO<List<Employee>>(SUCCESS,"删除成功",employees);
    }

    @Override
    public BaseVO<Employee> deleteEmployees(Employee employees) {
        int i = employeeMapper.deleteByPrimaryKey(employees.getEmployeeId());
        return new BaseVO<Employee>(SUCCESS,"删除成功",employees);
    }

    //判断用户是否存在
    public List<Employee> existEmployee(String employeeName) throws NotFountException{
        EmployeeExample example = new EmployeeExample();
        example.createCriteria().andEmployeeNameEqualTo(employeeName);
        List<Employee> employees = employeeMapper.selectByExample(example);
        if(employees.size()==0){
            throw new NotFountException("用户不存在");
        }
        return employees;
    }

    //判断用户不存在
    public List<Employee> existEmployeeRegister(String employeeName) {
        EmployeeExample example = new EmployeeExample();
        example.createCriteria().andEmployeeNameEqualTo(employeeName);
        List<Employee> employees = employeeMapper.selectByExample(example);
        return employees;
    }
    //封装Vo对象
    public BaseVO<Employee> getBaseVO( String status,String message,Employee employee){
        return new BaseVO<Employee>(status,message,employee);
    }
}
