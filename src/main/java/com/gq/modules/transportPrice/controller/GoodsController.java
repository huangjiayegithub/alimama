package com.gq.modules.transportPrice.controller;

import com.gq.modules.transportPrice.entity.Goods;
import com.gq.modules.transportPrice.service.GoodsService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 商品表(Goods)表控制层
 *
 * @author huangjiaye
 * @since 2019-12-03 15:38:58
 */
@RestController
@RequestMapping("goods")
public class GoodsController{
    /**
     * 服务对象
     */
    @Resource
    private GoodsService goodsService;

    @RequestMapping("/page")
    public List<Goods> page() {
        return goodsService.queryPage(null);
    }

}