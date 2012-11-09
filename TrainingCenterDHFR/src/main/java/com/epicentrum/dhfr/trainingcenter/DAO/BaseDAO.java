/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epicentrum.dhfr.trainingcenter.DAO;

import java.util.List;
import org.hibernate.criterion.Order;

/**
 *
 * @author Deni Husni FR
 */
public interface BaseDAO <T>{
     public T get(String kode);

    public void save(T entity);

    public void update(T entity);

    public void delete(T entity);

    public List<T> getAllData(int firstResult, int maxResults, Order order);

    public Long getTotalCount();

    public List<T> getAll();
}
