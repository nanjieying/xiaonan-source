package com.xiaonan.generics.impl;

import com.xiaonan.generics.Info;

/**
 * @Author: jynan
 * @CreateTime: 2026-10-08  20:23
 * @Description: TODO
 * @Version: 1.0
 */
public class InfoImpl<T> implements Info<T> {
    
    private T var;
    
    public InfoImpl(T var) {
        this.setVar(var);
    }
    
    public void setVar(T var) {
        this.var = var;
    }
    
    @Override
    public T getVar() {
        return this.var;
    }
}
