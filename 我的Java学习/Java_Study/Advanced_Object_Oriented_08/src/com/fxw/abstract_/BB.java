package com.fxw.abstract_;

public class BB extends Template {

    public void job() {
        long sum = 0;
        for (long i = 0; i < 8000000; i++) {
            sum += i;
        }
    }
}
