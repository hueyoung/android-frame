package com.ytl.frame;

/**
 * Author: HueYoung
 * E-mail: yangtaolue@xuechengjf.com
 * Date: 2017/8/18
 * <p/>
 * Description :
 */
public class A {
    public String a;

    A(String a) {
        this.a = a;
    }

    public String getA() {
        return a;
    }

    public void run() {
        B b = new B("i am b");
        b.run();
    }
}
