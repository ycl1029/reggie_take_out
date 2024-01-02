package com.itheima.reggie_take_out.common;

import jdk.nashorn.internal.runtime.FindProperty;

/**
 * Class Name: BaseContext
 * Description:
 *
 * @Author 原常乐
 * @Create 2023/12/29 11:34
 * @Version 1.0
 */
public class BaseContext {
    private static ThreadLocal<Long> threadLocal = new ThreadLocal<>();

    public static void setCurrentId(Long id){
        threadLocal.set(id);
    }

    public static Long getCurrentId(){
        return threadLocal.get();
    }
}
