package com.cruz.erick.mymangacollection.DAO;

/**
 * basicamente a interface que define meus métodos
 * das operações CRUD
 * C - create
 * R - read
 * U - update
 * D - delete
 */

public interface DAO {
    public void create(Object o);
    public Object read(Object o);
    public void update(Object o);
    public void delete(Object o);
}
