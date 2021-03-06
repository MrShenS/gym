package com.sz.gym.service;


import com.sz.gym.model.vo.BaseVO;
import com.sz.gym.model.vo.TableShowVO;
import com.sz.gym.model.entity.Category;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author zhen.shen
 * @Description //TODO 活动管理的增删改查
 * @Date 11:05 2020/3/11
 * @Param 
 * @return 
 **/
@Service
public interface CategoryService {
    public BaseVO<Category> saveCategory(Category category);
    public BaseVO<Category> updateCategory(Category category);
    public BaseVO<Category> deleteCategory(Category category);
    public BaseVO<Category> putCategory(Category category);
    public BaseVO<TableShowVO<Category>> selectCategory();
    public BaseVO<List<Category>> getCategoryByCategory(String categoryType);
}
