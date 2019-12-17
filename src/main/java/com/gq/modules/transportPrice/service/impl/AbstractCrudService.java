package com.gq.modules.transportPrice.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gq.modules.transportPrice.dao.BaseDAO;
import com.gq.modules.transportPrice.entity.BaseEntity;
import com.gq.modules.transportPrice.service.CrudService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

public abstract class AbstractCrudService<D extends BaseDAO, T extends BaseEntity> implements CrudService<D,T> {

    @Autowired
    private D d;

    @Override
    public List<T> findList(Map params) {
        return d.findList(params);
    }

    @Override
    public List<T> queryPage(Map params) {
        PageHelper.startPage(1, 2);
        return d.queryPage(params);
    }

    @Override
    public T fetch(Object id) {
        return (T) d.fetch(id);
    }

    @Override
    public int insert(T entity) {
        return d.insert(entity);
    }

    @Override
    public int update(T entity) {
        return d.update(entity);
    }

    @Override
    public int deleteById(Object id) {
        return d.deleteById(id);
    }
}
