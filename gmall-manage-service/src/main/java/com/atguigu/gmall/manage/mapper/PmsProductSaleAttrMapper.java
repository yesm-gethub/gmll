package com.atguigu.gmall.manage.mapper;

import com.atguigu.gmall.bean.PmsProductSaleAttr;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface PmsProductSaleAttrMapper extends Mapper<PmsProductSaleAttr>{

    List<PmsProductSaleAttr> selectSpuSaleAttrListCheckBySku(String productId, String skuId);

}
