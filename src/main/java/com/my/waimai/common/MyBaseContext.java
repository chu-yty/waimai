package com.my.waimai.common;

public class MyBaseContext {

    private static  ThreadLocal<Object> threadLocal=new ThreadLocal();

    /*
    设置线程局部变量值
     */
    public static void setThreadLocal(Object obj)
    {
        threadLocal.set(obj);
    }
    /*
   获取线程局部变量值
    */
    public static Object getMyThreadLocal()
    {
        return threadLocal.get();
    }
}
