package com.sz.gym.service.impl;

import com.sz.gym.dao.CategoryMapper;
import com.sz.gym.model.VO.BaseVO;
import com.sz.gym.model.VO.TableShowVO;
import com.sz.gym.model.entity.Category;
import com.sz.gym.model.entity.CategoryExample;
import com.sz.gym.service.CategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @ClassNameCategoryServiceImpl
 * @Description TODO
 * @Author zhen.zhen
 * @Date 2020/3/1312:06
 * @Version 1.0
 */
@Slf4j
@Service
public class CategoryServiceImpl implements CategoryService {

    static final String SUCCESS="success";

    static final String LOSER="loser";

    @Autowired
    public CategoryMapper categoryMapper;

    @Override
    public BaseVO<Category> saveCategory(Category category) {
        try {
            boolean existCategtoy = this.existCategtoy(category);
            if(existCategtoy){
                return new BaseVO<Category>(LOSER,"类别已存在",category);
            }
            category.setCreateTime(new Date());
            category.setUpdateTime(new Date());
            int insert = categoryMapper.insert(category);
        }catch (Exception e){
            log.error("发生异常 请检查",category);
            e.printStackTrace();
            return new BaseVO<Category>(LOSER,"发生未知异常 请联系管理员",category);
        }

        return new BaseVO<Category>(SUCCESS,"添加成功",category);
    }

    @Override
    public BaseVO<Category> updateCategory(Category category) {

        try {
            boolean existCategtoy = this.existCategtoy(category);
            if(!existCategtoy){
                return new BaseVO<Category>(LOSER,"类别不存在 请更换名字",category);
            }
            CategoryExample categoryExample = new CategoryExample();
            categoryExample.createCriteria().andCategoryIdEqualTo(category.getCategoryId());
            int insert = categoryMapper.updateByExample(category,categoryExample);
        }catch (Exception e){
            log.error("发生异常 请检查",category);
            e.printStackTrace();
            return new BaseVO<Category>(LOSER,"发生未知异常 请联系管理员",category);
        }
        return new BaseVO<Category>(SUCCESS,"添加成功",category);
    }
    @Override
    public BaseVO<Category> deleteCategory(Category category) {
        try {
            CategoryExample categoryExample = new CategoryExample();
            categoryExample.createCriteria().andCategoryIdEqualTo(category.getCategoryId());
            categoryMapper.deleteByExample(categoryExample);
        }catch (Exception e){
            log.error("出现错误哦");
            e.printStackTrace();
            return new BaseVO<Category>(LOSER,"删除失败 请联系管理员",category);
        }


        return new BaseVO<Category>(SUCCESS,"删除成功:"+category.getCategoryName(),category);
    }

    @Override
    public BaseVO<Category> putCategory(Category category) {
        return null;
    }

    @Override
    public BaseVO<TableShowVO<Category>> selectCategory() {
        List<Category> categorys = null;
        TableShowVO<Category> listTableShowVO = new TableShowVO<>();
        try {
            categorys = categoryMapper.selectByExample(new CategoryExample());
            listTableShowVO.setList(categorys);
            listTableShowVO.setNum(categorys.size());
            log.debug("共查询出类目种类"+categorys.size()+"个");
        }catch (Exception e){
            return new BaseVO<TableShowVO<Category>>(LOSER,"查询失败 请联系管理员",listTableShowVO);
        }
        return  new BaseVO<TableShowVO<Category>>(SUCCESS,"查询成功",listTableShowVO);
    }

    //判断类别是否存在
    public boolean existCategtoy(Category category){
        CategoryExample categoryExample = new CategoryExample();
        categoryExample.createCriteria().andCategoryIdEqualTo(category.getCategoryId());
        List<Category> categories = categoryMapper.selectByExample(categoryExample);
        if(categories.size()==0){
//            throw new NotFountException("未找到")
            return false;
        }
        return true;
    }
}
