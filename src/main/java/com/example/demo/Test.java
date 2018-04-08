package com.example.demo;

/**
 * Created by Administrator on 2018/4/8 0008.
 */
public class Test {
    private static Test ourInstance = new Test();

    public static Test getInstance() {
        return ourInstance;
    }

    private Test() {
        System.out.println("123");
    }
}
