package com.ytl.frame;

/**
 * Author: HueYoung
 * E-mail: yangtaolue@xuechengjf.com
 * Date: 2017/8/18
 * <p/>
 * Description :
 */
public class B {
    public String age;

    B(String b) {
        A a = new A("i am a");
        this.age = a.getA();
    }

    public void run() {
        System.out.println(age);
    }
}
