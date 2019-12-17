package com.gq.modules.transportPrice.entity;

import java.util.Date;
import java.io.Serializable;


/**
 * 商品表(Goods)实体类
 *
 * @author huangjiaye
 * @since 2019-12-03 15:12:45
 */

public class Goods extends BaseEntity<Long> implements Serializable {
    private static final long serialVersionUID = 423864330985762849L;
    /**
    * 商品名称
    */
    private String goodName;
    /**
    * 商品属性
    */
    private String goodAttr;
    /**
    * 商品型号
    */
    private String goodModel;
    /**
    * 商品价格
    */
    private Object price;
    /**
    * 商品重量
    */
    private Object weight;
    /**
    * 商品体积
    */
    private Object volume;
    /**
    * 商品单位
    */
    private String unit;


    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }
    
    public String getGoodAttr() {
        return goodAttr;
    }

    public void setGoodAttr(String goodAttr) {
        this.goodAttr = goodAttr;
    }
    
    public String getGoodModel() {
        return goodModel;
    }

    public void setGoodModel(String goodModel) {
        this.goodModel = goodModel;
    }
    
    public Object getPrice() {
        return price;
    }

    public void setPrice(Object price) {
        this.price = price;
    }
    
    public Object getWeight() {
        return weight;
    }

    public void setWeight(Object weight) {
        this.weight = weight;
    }
    
    public Object getVolume() {
        return volume;
    }

    public void setVolume(Object volume) {
        this.volume = volume;
    }
    
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

}