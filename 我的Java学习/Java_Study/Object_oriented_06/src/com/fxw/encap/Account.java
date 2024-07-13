package com.fxw.encap;

public class Account {
    private String name;
    private int balance;
    private String password;

    public Account() {
    }

    public Account(String name, int balance, String password) {
        this.setName(name);
        this.setBalance(balance);
        this.setPassword(password);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        int len = name.length();
        if (len == 2 || len == 3 || len == 4) {
            this.name = name;
        } else {
            System.out.println("你的名字不正确, 默认输出");
            this.name = "匿名";
        }

    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if (balance > 20) {
            this.balance = balance;
        } else {
            System.out.println("您的余额不正确, 默认值为");
            this.balance = 20;
        }

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        int len = password.length();
        if (len == 6) {
            this.password = password;
        } else {
            System.out.println("您的密码不正确, 默认密码为：");
            this.password = "123456";
        }
    }

    public void showInfo() {
        // 可以在这里增加一个访问权限的条件, 比如验证身份, 要是身份不对那就输出无权限访问
        System.out.println("name = " + name + " balance = " + balance
                + " password = " + password);
    }
}
