package com.sz.gym.web.controller;

import com.sz.gym.model.Param.LoginParam;
import com.sz.gym.model.Param.QueryParam;
import com.sz.gym.model.VO.BaseVO;
import com.sz.gym.model.VO.EmployeeShowVO;
import com.sz.gym.model.entity.Employee;
import com.sz.gym.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassNameEmployeeController
 * @Description TODO
 * @Author zhen.zhen
 * @Date 2020/3/912:19
 * @Version 1.0
 */
@RestController
@CrossOrigin
@Slf4j
public class EmployeeController {

    @Autowired
    public EmployeeService employeeService;

    @PostMapping("/register")
    public BaseVO<Employee> register(@RequestBody Employee employee){
        return employeeService.register(employee);
    }

    @PostMapping("/login")
    public BaseVO<LoginParam> login(@RequestBody LoginParam loginParam){
        return employeeService.login(loginParam);
    }

    @GetMapping("/employee")
    public BaseVO<List<Employee>> getAllEmployee(){
        return employeeService.getAllEmployee();
    }

    @PutMapping("/employee")
    public BaseVO<String> updateEmployee(@RequestBody Employee employee){
        return employeeService.updateEmployee(employee);
    }

    @GetMapping("/employeeShow")
    public BaseVO<EmployeeShowVO> getEmployeeShow(){
        return employeeService.getEmployeeShow();
    }

    @PostMapping("/getEmployeeByQueryParam")
    public BaseVO<EmployeeShowVO> getEmployeeByQueryParam(@RequestBody QueryParam queryParam){
        log.info("===========================条件查询======================================");
        log.info("查询条件"+queryParam.toString());
        return employeeService.getEmployeeByQueryParam(queryParam);
    }

    @DeleteMapping("/AllEmployee")
    public BaseVO<List<Employee>> deleteAllEmployees(@RequestBody List<Employee> employees){
        return employeeService.deleteAllEmployees(employees);
    }

    @DeleteMapping("/employee")
    public BaseVO<Employee> deleteEmployees(@RequestBody Employee employees){
        return employeeService.deleteEmployees(employees);
    }
}
