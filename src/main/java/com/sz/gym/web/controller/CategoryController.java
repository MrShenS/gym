package com.sz.gym.web.controller;

import com.sz.gym.model.vo.BaseVO;
import com.sz.gym.model.vo.TableShowVO;
import com.sz.gym.model.entity.Category;
import com.sz.gym.service.CategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
@RequestMapping("/Category")
public class CategoryController {

    @Autowired
    public CategoryService categoryService;

    @PostMapping
    public BaseVO<Category> saveCategory(@RequestBody Category category){
        return categoryService.saveCategory(category);
    }
    @GetMapping
    public BaseVO<TableShowVO<Category>> getCategory(){
        return categoryService.selectCategory();
    }


    @GetMapping("/CategoryType")
    public BaseVO<List<Category>> getCategory(@RequestParam("categoryType") String categoryType ){
        log.info("打印请求参数："+categoryType );
        return categoryService.getCategoryByCategory(categoryType);
    }

    @PutMapping()
    public BaseVO<Category> updateCategory(@RequestBody Category category){
        return categoryService.updateCategory(category);
    }

    @DeleteMapping()
    public BaseVO<Category> deleteCategory(@RequestBody Category category){
        return categoryService.deleteCategory(category);
    }
}
