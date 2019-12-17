package com.gq.modules.transportPrice.entity;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.Date;

/**
 * @author hjy 2019-12-03
 */
@Data
public class BaseEntity<T> {
    private T id;
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;
    private Integer updateUserId;
    private Integer createUserId;
    private String comments;
    private Integer status;
}
