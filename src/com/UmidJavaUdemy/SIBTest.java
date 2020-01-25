package com.UmidJavaUdemy;

public class SIBTest {
    public static final String owner;

    static {
        owner = "三工社";
        System.out.println("SIBTest static 初期化街区が起動しました");
    }

    public SIBTest() {
        System.out.println("SIB コンストラクターが起動しました");
    }
    static {
        System.out.println("二つ目の初期化街区が起動しました");
    }
    public void someMethod(){
        System.out.println("someMethod 起動しました");
    }
}
