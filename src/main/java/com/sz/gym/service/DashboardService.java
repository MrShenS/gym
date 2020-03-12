package com.sz.gym.service;

import com.sz.gym.model.VO.BaseVO;
import com.sz.gym.model.dto.HeaderNumberDTO;
import org.springframework.stereotype.Service;

@Service
public interface DashboardService {
    public BaseVO<HeaderNumberDTO> getHeaderNumber();
}
