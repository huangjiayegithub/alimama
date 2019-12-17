package com.gq.modules.transportPrice.dao;

import com.gq.modules.transportPrice.entity.BaseEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 使用同一接口定义，有利于编码习惯统一
 * @param <T>
 */
public interface BaseDAO<T extends BaseEntity> {
    List<T> findList(@Param("condition") Map params);

    List<T> queryPage(@Param("condition") Map params);

    T fetch(Object id);

    int insert(T entity);

    int update(T entity);

    int deleteById(Object id);
}
