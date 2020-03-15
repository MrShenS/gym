package com.sz.gym.web.controller;


import com.sz.gym.model.dto.ProductWithFinanceDTO;
import com.sz.gym.model.entity.Product;
import com.sz.gym.model.enums.ConstantEnum;
import com.sz.gym.model.vo.BaseVO;
import com.sz.gym.model.vo.TableShowVO;
import com.sz.gym.service.ProductService;
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
@RequestMapping("/Product")
public class ProductController {

    @Autowired
    public ProductService productService;



    @GetMapping()
    public BaseVO<TableShowVO<Product>> getProduct(){
        return productService.selectProduct();
    }

    @PutMapping()
    public BaseVO<Product> updateProduct(@RequestBody ProductWithFinanceDTO ProductWithFinanceDTO){
        BaseVO<Product> productBaseVO = new BaseVO<>();
        try {
           productBaseVO  = productService.updateProduct(ProductWithFinanceDTO);
        }catch (Exception e){
            e.printStackTrace();
            return new BaseVO<Product>(ConstantEnum.lower.toString(),e.getMessage(),ProductWithFinanceDTO.getProduct());
        }

        return productBaseVO;
    }

    @PostMapping()
    public BaseVO<Product> saveProduct(@RequestBody ProductWithFinanceDTO ProductWithFinanceDTO){
        return productService.saveProduct(ProductWithFinanceDTO);
    }

    @DeleteMapping()
    public BaseVO<Product> deleteProduct(@RequestBody Product Product){
        return productService.deleteProduct(Product);
    }
}
