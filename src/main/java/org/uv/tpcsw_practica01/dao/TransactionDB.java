/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uv.tpcsw_practica01.dao;

import java.sql.Connection;

/**
 *
 * @author j_dev
 */
public abstract class TransactionDB <T>{
    protected T pojo;
    protected TransactionDB(T pojo){
        this.pojo = pojo;
    }
    
    public abstract boolean execute(Connection con);
}
