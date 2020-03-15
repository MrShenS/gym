package com.sz.gym.test;

import com.sz.gym.model.dto.FacilitiesRatioDTO;
import com.sz.gym.model.vo.BaseVO;
import com.sz.gym.service.impl.DashboardServiceImpl;

import java.util.List;

/**
 * @ClassNametest
 * @Description TODO
 * @Author zhen.zhen
 * @Date 2020/3/1512:21
 * @Version 1.0
 */
public class test {
    public static void main(String[] args) {
        DashboardServiceImpl dashboardService = new DashboardServiceImpl();
        BaseVO<List<FacilitiesRatioDTO>> facilitiesRatio = dashboardService.getFacilitiesRatio();
    }
}
