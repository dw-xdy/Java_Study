package com.fxw.interclass;

import com.sun.media.jfxmediaimpl.HostUtils;

public class InnerClass01 {
    public static void main(String[] args) {

    }
}

class Outerclass {
    private int n1 = 1000;

    public void hi() {
        System.out.println("hi()........");
    }

    public Outerclass(int n1) {
        this.n1 = n1;
    }

    {
        System.out.println("daimakuaizhixing");
    }

    class Interclass {

    }
}
