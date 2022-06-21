package com.klee.extension;

/**
 * @Date 2022/6/20 20:20
 * @Description: Resolving variable visibility across multiple threads
 * @Version v1.0
 */
public class Holder<T> {
    private volatile T value;
    public T get(){
        return value;
    }
    public void set(T value){this.value = value;}

}
