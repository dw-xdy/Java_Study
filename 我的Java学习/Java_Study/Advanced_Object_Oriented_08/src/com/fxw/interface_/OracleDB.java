package com.fxw.interface_;

public class OracleDB implements DBInterface {
    @Override
    public void connect() {
        System.out.println("链接Oracle");
    }

    @Override
    public void close() {
        System.out.println("断开Oracle");
    }
}