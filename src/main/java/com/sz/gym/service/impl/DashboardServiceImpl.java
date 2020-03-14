package com.sz.gym.service.impl;

import com.sz.gym.dao.CustomerMapper;
import com.sz.gym.dao.EmployeeMapper;
import com.sz.gym.dao.FacilitiesMapper;
import com.sz.gym.model.vo.BaseVO;
import com.sz.gym.model.dto.HeaderNumberDTO;
import com.sz.gym.model.entity.*;
import com.sz.gym.service.DashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassNameDashboardServiceImpl
 * @Description TODO
 * @Author zhen.zhen
 * @Date 2020/3/119:52
 * @Version 1.0
 */
@Service
public class DashboardServiceImpl implements DashboardService {

    static final String SUCCESS="success";

    static final String LOSER="loser";

    @Autowired
    public EmployeeMapper employeeMapper;
    @Autowired
    public FacilitiesMapper facilitiesMapper;
    @Autowired
    public CustomerMapper customerMapper;

    @Override
    public BaseVO<HeaderNumberDTO> getHeaderNumber() {
        List<Customer> customers = customerMapper.selectByExample(new CustomerExample());
        List<Facilities> facilities = facilitiesMapper.selectByExample(new FacilitiesExample());
        List<Employee> employees = employeeMapper.selectByExample(new EmployeeExample());
        HeaderNumberDTO headerNumberDTO = new HeaderNumberDTO(employees.size(), facilities.size(), customers.size());
        BaseVO<HeaderNumberDTO> headerNumberDTOBaseVO = new BaseVO<>(SUCCESS, "查询成功", headerNumberDTO);
        return headerNumberDTOBaseVO;
    }
}
