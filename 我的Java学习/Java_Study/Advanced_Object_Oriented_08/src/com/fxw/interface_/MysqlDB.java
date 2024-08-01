package com.fxw.interface_;

public class MysqlDB implements DBInterface {
    @Override
    public void connect() {
        System.out.println("链接NySQL");
    }

    @Override
    public void close() {
        System.out.println("断开MySQL");
    }
}
