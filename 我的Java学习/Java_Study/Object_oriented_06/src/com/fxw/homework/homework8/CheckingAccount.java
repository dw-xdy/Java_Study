package com.fxw.homework.homework8;

public class CheckingAccount extends BankAccount {
    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void deposit(double amount) {//存款
        super.deposit(amount - 1);//巧妙的使用了父类的 deposit
        //1 块钱转入银行的账号
    }

    @Override
    public void withdraw(double amount) {//取款
        super.withdraw(amount + 1);
        //1 块钱转入银行的账号
    }

}
