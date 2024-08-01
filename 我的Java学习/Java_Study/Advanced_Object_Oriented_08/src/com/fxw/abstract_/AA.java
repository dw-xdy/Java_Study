package com.fxw.abstract_;

public class AA extends Template {

    public void job() {
        long sum = 0;
        for (long i = 0; i < 1000000; i++) {
            sum += i;
        }
    }
}
