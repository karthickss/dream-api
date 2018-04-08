package com.dream.app.core.service;

import java.util.List;

/**
 * Created by karthickraj 08/04/2108.
 */
public interface BaseService<T> {
    public T create(T entity);
    public T update(T entity);
    public List<T> saveAll(List<T> tList);
    public List<T> findAll();
    //public T findByUid(String uid);
    public void deleteAll();
    //public void deleteByUid(String uid);
    public T suspend(T entity);
}