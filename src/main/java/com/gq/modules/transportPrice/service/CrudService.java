package com.gq.modules.transportPrice.service;

import com.gq.modules.transportPrice.dao.BaseDAO;
import com.gq.modules.transportPrice.entity.BaseEntity;

import java.util.List;
import java.util.Map;

public interface CrudService<D extends BaseDAO, T extends BaseEntity> {
    List<T> findList(Map params);

    List<T> queryPage(Map params);

    T fetch(Object id);

    int insert(T entity);

    int update(T entity);

    int deleteById(Object id);
}
