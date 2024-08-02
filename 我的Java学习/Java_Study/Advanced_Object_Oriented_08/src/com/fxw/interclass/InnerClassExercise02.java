package com.fxw.interclass;

public class InnerClassExercise02 {
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone();
        cellPhone.alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("懒猪起床了");
            }
        });


        cellPhone.alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("小伙伴上课了");
            }
        });
    }
}


interface Bell {
    void ring();
}

class CellPhone {
    public void alarmclock(Bell bell) {
        System.out.println("传递进来的内部类型为：" + bell.getClass());
        bell.ring();
    }
}
