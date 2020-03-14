package com.sz.gym.web.controller;

import com.sz.gym.model.vo.BaseVO;
import com.sz.gym.model.vo.TableShowVO;
import com.sz.gym.model.dto.FacilitiesWithFinanceDTO;
import com.sz.gym.model.entity.Facilities;
import com.sz.gym.service.FacilitiesService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author zhen.shen
 * @Description //TODO 操作活动相关数据
 * @Date 11:02 2020/3/11
 * @Param
 * @return
 **/
@RestController
@CrossOrigin
@Slf4j
@RequestMapping("/Facilities")
public class FacilitiesController {

    @Autowired
    public FacilitiesService facilitiesService;



    @GetMapping()
    public BaseVO<TableShowVO<Facilities>> getFacilities(){
        return facilitiesService.selectFacilities();
    }

    @PutMapping()
    public BaseVO<Facilities> updateFacilities(@RequestBody FacilitiesWithFinanceDTO facilitiesWithFinanceDTO){
        return facilitiesService.updateFacilities(facilitiesWithFinanceDTO);
    }

    @PostMapping()
    public BaseVO<Facilities> saveFacilities(@RequestBody FacilitiesWithFinanceDTO facilitiesWithFinanceDTO){
        return facilitiesService.saveFacilities(facilitiesWithFinanceDTO);
    }

    @DeleteMapping()
    public BaseVO<Facilities> deleteFacilities(@RequestBody Facilities facilities){
        return facilitiesService.deleteFacilities(facilities);
    }
}
