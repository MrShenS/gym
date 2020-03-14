package com.sz.gym.service;

import com.sz.gym.model.vo.BaseVO;
import com.sz.gym.model.vo.TableShowVO;
import com.sz.gym.model.dto.FacilitiesWithFinanceDTO;
import com.sz.gym.model.entity.Facilities;

/**
 * @ClassNameFacilitiesService
 * @Description TODO
 * @Author zhen.zhen
 * @Date 2020/3/149:43
 * @Version 1.0
 */
public interface FacilitiesService {
    public BaseVO<Facilities> saveFacilities(FacilitiesWithFinanceDTO facilitiesWithFinanceDTO);
    public BaseVO<Facilities> updateFacilities(FacilitiesWithFinanceDTO facilitiesWithFinanceDTO);
    public BaseVO<Facilities> deleteFacilities(Facilities facilities);
    public BaseVO<TableShowVO<Facilities>> selectFacilities();
}
