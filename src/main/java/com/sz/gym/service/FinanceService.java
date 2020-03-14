package com.sz.gym.service;

import com.sz.gym.model.vo.BaseVO;
import com.sz.gym.model.entity.Finance;
import org.springframework.stereotype.Service;

@Service
public interface FinanceService {
   public BaseVO<Finance> addFinanceRecord(Finance finance);
   public Finance getFinance (String financeName,String financeDescription,String type,String Reclassify,double money);

}
