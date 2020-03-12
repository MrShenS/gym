package com.sz.gym.web.controller;

import com.sz.gym.event.EventConfig;
import com.sz.gym.event.Event_xx;
import com.sz.gym.model.entity.Customer;
import com.sz.gym.model.entity.Employee;
import javafx.scene.control.Tab;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.beans.Customizer;
import java.util.Date;

/**
 * @ClassNameTestConsoller
 * @Description TODO
 * @Author zhen.zhen
 * @Date 2020/2/1310:42
 * @Version 1.0
 */
@RestController
@CrossOrigin
@Slf4j
public class TestController  {
    @GetMapping("/getEvent")
    public void getEvent(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);
        System.out.println("事件发布");
        context.publishEvent(new Event_xx(""));
        context.close();
        System.out.println("监听事件结束");
    }


    @GetMapping("/getTxt")
    public String getTxt(){
        return "申震是个好人";
    }

    @PostMapping("/postTxt")
    public String postTxt(){
        return "post参数";
    }

    @PostMapping("/getCustomer")
    public  Customer getC(@RequestParam("username") String name){
        System.out.println("进来自己动");
        Customer customer = new Customer();
        log.info("参数",name);
        customer.setCustomerId(12);
        return customer;
    }

    @PostMapping("/GetCustomer")
    public Customer getCustomer(@RequestBody Employee x){
        log.info("调用成功");
        Customer customer = new Customer();
        customer.setCustomerName("申震");
        log.info("对象："+x.toString());
        customer.setBirthday(new Date());
        return customer;
    }

//    @RequestMapping(value = "/updateTabByIdRoot/{Tid}")
//    @ResponseBody
//    public String updateTabByIdRoot(@PathVariable("Tid") int Tid, HttpServletRequest request){
//        Tab tab = JSON.parseObject(request.getParameter("tab"),Tab.class);
//        System.out.println(tab.toString());
//        tab.setId(Tid);
//        //这里填修改的属性
//        int result =  tabService.updateTab(tab);
//        if(result<0){
//            return "修改失败";
//        }else{
//            return  "修改成功";
//        }

}
