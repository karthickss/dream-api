package com.dream.app.core.repository;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by karthick on 08/04/18.
 */
public interface BaseRepository<T, ID extends java.io.Serializable> extends CrudRepository<T, ID> {
    //public T findByUid(String uid);
    //public void deleteByUid(String uid);
}
