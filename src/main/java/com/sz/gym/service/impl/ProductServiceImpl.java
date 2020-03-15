package com.sz.gym.service.impl;

import com.sz.gym.dao.ProductMapper;
import com.sz.gym.exception.ProductException;
import com.sz.gym.model.dto.ProductWithFinanceDTO;
import com.sz.gym.model.entity.Facilities;
import com.sz.gym.model.entity.Finance;
import com.sz.gym.model.entity.Product;
import com.sz.gym.model.entity.ProductExample;
import com.sz.gym.model.enums.ConstantEnum;
import com.sz.gym.model.vo.BaseVO;
import com.sz.gym.model.vo.TableShowVO;
import com.sz.gym.service.FinanceService;
import com.sz.gym.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * @ClassNameProductServiceImpl
 * @Description TODO
 * @Author zhen.zhen
 * @Date 2020/3/1513:08
 * @Version 1.0
 */
@Slf4j
@Transactional
@Service
public class ProductServiceImpl implements ProductService {

    final String incomeType ="产品收入";
    final String disburseType ="产品支出";

    final static String COMMODITY="健身消耗品";
    final static String CURRICULUM="私教课程";

    @Autowired
    public FinanceService financeService;
    @Autowired
    public ProductMapper productMapper;

    @Override
    public BaseVO<Product> saveProduct(ProductWithFinanceDTO productWithFinanceDTO) {
        Product product = productWithFinanceDTO.getProduct();
        product.setCreateTime(new Date());
        product.setUpdateTime(new Date());
        if(CURRICULUM.equals(product.getProductType())){
            int insert = productMapper.insert(product);
            return new BaseVO<Product>(ConstantEnum.success.toString(),"保存成功",product);
        }
        log.info("提取产品对象");
        try {

            log.debug("保存商品对象");
            product.setCreateTime(new Date());
            product.setUpdateTime(new Date());
            int insert = productMapper.insert(product);
            log.info("计算金额");
            double money = product.getNumber()*product.getPrice();
            log.debug("获取财政对象");
            Finance finance = financeService.getFinance(productWithFinanceDTO.getFinanceName(),
                    productWithFinanceDTO.getFinanceDescription(), ConstantEnum.disburse.toString(),
                    disburseType, money);
            log.debug("保存财政数据");
            financeService.addFinanceRecord(finance);
        }catch (Exception e){
            e.printStackTrace();
            return new BaseVO<Product>(ConstantEnum.lower.toString(),"失败 请联系管理员",product);
        }
        return new BaseVO<Product>(ConstantEnum.success.toString(),"保存成功",product);
    }

    @Override
    public BaseVO<Product> updateProduct(ProductWithFinanceDTO productWithFinanceDTO) {

        Product product = productWithFinanceDTO.getProduct();
        if(CURRICULUM.equals(product.getProductType())){
            int insert = productMapper.updateByPrimaryKey(product);
            return new BaseVO<Product>(ConstantEnum.success.toString(),"保存成功",product);
        }
        try {

            log.debug("=====================================判断财政操作类型===============================");
            log.debug("查询出原来的数量");
            Product selectByPrimaryKey = productMapper.selectByPrimaryKey(product.getProductId());
            Integer sourceNumber = selectByPrimaryKey.getNumber();
            Integer updateNumber = product.getNumber();
            if(sourceNumber!=updateNumber){
                log.info("计算金额");
                log.info("获取一级分类");
                String financeType = updateNumber>sourceNumber?
                        ConstantEnum.disburse.toString():ConstantEnum.income.toString();
                log.info("获取二级分类");
                String financeType2 = updateNumber>sourceNumber?
                        disburseType:incomeType;
                double money = Math.abs((updateNumber-sourceNumber)*product.getPrice());
                if(financeType.equals(ConstantEnum.income.toString())){
                    money=money*1.8;
                }
                log.debug("查看修改的金额："+money+"===========================");
                log.debug("获取财政对象");
                Finance finance = financeService.getFinance(productWithFinanceDTO.getFinanceName(),
                        productWithFinanceDTO.getFinanceDescription(), financeType,
                        financeType2, money);

                log.debug("保存财政数据");
                financeService.addFinanceRecord(finance);
            }
            log.debug("更新器材对象");
            int i = productMapper.updateByPrimaryKey(product);
        }catch (Exception e){
            e.printStackTrace();
            log.error("================修改产品对象发生错误==================================");
            throw new ProductException("修改产品对象是发生错误");
//            return new BaseVO<Product>(ConstantEnum.lower.toString(),"失败 请联系管理员",product);
        }
        return new BaseVO<Product>(ConstantEnum.success.toString(),"保存成功",product);
    }

    @Override
    public BaseVO<Product> deleteProduct(Product product) {

        if(CURRICULUM.equals(product.getProductType())){
            int insert = productMapper.updateByPrimaryKey(product);
            return new BaseVO<Product>(ConstantEnum.success.toString(),"保存成功",product);
        }

        try {
            log.info("计算出库的金额");
            double money = product.getNumber()*product.getPrice();
            Finance finance = financeService.getFinance("清空" + product.getProductName() + "库存", "全部删除"
                    , ConstantEnum.income.toString(), incomeType, money);
            log.info("存储账单");
            BaseVO<Finance> financeBaseVO = financeService.addFinanceRecord(finance);
            log.info("删除记录");
            int i = productMapper.deleteByPrimaryKey(product.getProductId());
        }catch (Exception e){
            log.error("此处出现错误");
            e.printStackTrace();
            return new BaseVO<Product>(ConstantEnum.lower.toString(),"删除失败",product);
        }

        return new BaseVO<Product>(ConstantEnum.success.toString(),"操作成功",product);
    }

    @Override
    public BaseVO<TableShowVO<Product>> selectProduct() {
        List<Product> products = productMapper.selectByExample(new ProductExample());
        return new BaseVO<TableShowVO<Product>> (ConstantEnum.success.toString(),"查询成功",
                new TableShowVO<Product>(products,products.size()));
    }
}
