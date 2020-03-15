package com.sz.gym.service;

import com.sz.gym.model.dto.FacilitiesWithFinanceDTO;
import com.sz.gym.model.dto.ProductWithFinanceDTO;
import com.sz.gym.model.entity.Facilities;
import com.sz.gym.model.entity.Product;
import com.sz.gym.model.vo.BaseVO;
import com.sz.gym.model.vo.TableShowVO;

/**
 * @ClassNameProductService
 * @Description TODO
 * @Author zhen.zhen
 * @Date 2020/3/149:43
 * @Version 1.0
 */
public interface ProductService {
    public BaseVO<Product> saveProduct(ProductWithFinanceDTO productWithFinanceDTO);
    public BaseVO<Product> updateProduct(ProductWithFinanceDTO productWithFinanceDTO);
    public BaseVO<Product> deleteProduct(Product product);
    public BaseVO<TableShowVO<Product>> selectProduct();
}
