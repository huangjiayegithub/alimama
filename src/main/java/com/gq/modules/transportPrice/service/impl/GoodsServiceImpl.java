package com.gq.modules.transportPrice.service.impl;

import com.gq.modules.transportPrice.entity.Goods;
import com.gq.modules.transportPrice.dao.GoodsDao;
import com.gq.modules.transportPrice.service.GoodsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 商品表(Goods)表服务实现类
 *
 * @author huangjiaye
 * @since 2019-12-03 15:12:48
 */
@Service
public class GoodsServiceImpl extends AbstractCrudService<GoodsDao,Goods> implements GoodsService {
    
}