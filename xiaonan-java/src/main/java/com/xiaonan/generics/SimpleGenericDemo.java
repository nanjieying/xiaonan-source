package com.xiaonan.generics;

/**
 * @Author: jynan
 * @CreateTime: 2026-10-08  19:03
 * @Description: 一个简单的泛型
 * @Version: 1.0
 */
public class SimpleGenericDemo {
    
    public static void main(String[] args) {
        
        // 泛型类的使用
        Point<String> p = new Point<String>();
        p.setVar("Hello, World!");
        System.out.println(p.getVar());
        System.out.println(p.getVar().length());
        
        // 泛型类的使用多类型
        Notepad<String, Integer> notepad = new Notepad<>();
        notepad.setKey("Age");
        notepad.setValue(25);
        System.out.println(notepad.getKey() + ": " + notepad.getValue());
        
    }

}

class Point<T> {
    private T var;
    
    public T getVar() {
        return var;
    }
    
    public void setVar(T var) {
        this.var = var;
    }
}

class Notepad<K, V> {
    
    private K key;
    private V value;
    
    public K getKey() {
        return key;
    }
    
    public void setKey(K key) {
        this.key = key;
    }
    
    public V getValue() {
        return value;
    }
    
    public void setValue(V value) {
        this.value = value;
    }
}