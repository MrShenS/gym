package com.sz.gym.service;

import com.sz.gym.model.dto.DashboardSchartDTO;
import com.sz.gym.model.dto.FacilitiesRatioDTO;
import com.sz.gym.model.vo.BaseVO;
import com.sz.gym.model.dto.HeaderNumberDTO;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.List;

@Service
public interface DashboardService {
    public BaseVO<HeaderNumberDTO> getHeaderNumber();

    BaseVO<List<FacilitiesRatioDTO>> getFacilitiesRatio();

    BaseVO<DashboardSchartDTO> getDashboardSchartOfOptions() throws ParseException;

}
