package com.fxw.homework.homework8;

public class SavingsAccount extends BankAccount {
    private double rate = 0.01;
    private int count = 3;
    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }


    //存款
    public void deposit(double amount)  {
        if (count > 0) {
            super.deposit(amount);
        } else {
            super.deposit(amount - 1);
        }
        count--;
    }
    //取款
    public void withdraw(double amount)  {
        if (count > 0) {
            super.withdraw(amount);
        } else {
            super.withdraw(amount + 1);
        }
        count--;
    }

    public void earnMonthlyInterrst() {
        count = 3;
        super.deposit(getBalance() * rate);
    }

}
