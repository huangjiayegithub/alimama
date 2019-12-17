package com.gq.modules.transportPrice.dao;

import com.gq.modules.transportPrice.entity.Goods;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品表(Goods)表数据库访问层
 *
 * @author huangjiaye
 * @since 2019-12-03 15:12:46
 */
@Mapper
public interface GoodsDao extends BaseDAO<Goods>{

}