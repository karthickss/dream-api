package com.dream.app.core.service.impl;


import com.dream.app.core.repository.BaseRepository;
import com.dream.app.core.service.BaseService;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * Created by karthick on 08/04/2018.
 */

public abstract class BaseServiceImpl<T> implements BaseService<T> {

    private static Logger log = LoggerFactory.getLogger(BaseServiceImpl.class);


    private final Class< T > clazz;

    public BaseServiceImpl(final Class< T > clazzToSet ){
        Preconditions.checkNotNull(clazzToSet);
        clazz = clazzToSet;
    }

    @Override
    public T create(T entity) {
        T target = getDao().save(entity);
        return target;
    }

    @Override
    public T update(T entity) {
        T target = getDao().save(entity);
        return target;
    }

    @Override
    public List<T> findAll() {
        List<T> targets = Lists.newArrayList(getDao().findAll());
        return targets;
    }

    /*
    @Override
    public T findByUid(String uid) {
        T target = getDao().findByUid(uid);
        return target;
    }
    */

    @Override
    public void deleteAll() {
        getDao().deleteAll();
    }

    /*
    @Override
    public void deleteByUid(String uid) {
        getDao().delete(getDao().findByUid(uid));
    }
    */

    @Override
    public T suspend(T entity){
        return entity;
    }

    @Override
    public List<T> saveAll(List<T> tList){
        return Lists.newArrayList(getDao().save(tList));

    }

    protected abstract BaseRepository<T,Long> getDao();
}