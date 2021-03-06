package com.sz.gym.service;

import com.sz.gym.model.param.LoginParam;
import com.sz.gym.model.param.QueryParam;
import com.sz.gym.model.vo.BaseVO;
import com.sz.gym.model.vo.TableShowVO;
import com.sz.gym.model.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author zhen.shen
 * @Description //TODO 处理员工相关问题
 * @Date 9:03 2020/2/25
 * @Param 
 * @return 
 **/
@Service
public interface EmployeeService {
    
    /**
     * @Author zhen.shen
     * @Description //TODO 员工注册
     * @Date 9:59 2020/2/25
     * @Param 
     * @return 
     **/
//注册 register
    public BaseVO<Employee> register(Employee employee);
    //登录
    public BaseVO<LoginParam> login(LoginParam loginVO);

    public BaseVO<List<Employee>> getAllEmployee();

    public BaseVO<TableShowVO> getEmployeeShow();

    BaseVO<String> updateEmployee(Employee employee);

    BaseVO<TableShowVO> getEmployeeByQueryParam(QueryParam queryParam);

    BaseVO<List<Employee>> deleteAllEmployees(List<Employee> employees);

    BaseVO<Employee> deleteEmployees(Employee employees);
}
