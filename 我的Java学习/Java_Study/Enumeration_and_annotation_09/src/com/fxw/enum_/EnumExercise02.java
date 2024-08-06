package com.fxw.enum_;

/**
 * @author 冯肖伟
 * @version 1.0
 */
public class EnumExercise02 {
    public static void main(String[] args) {
        Week[] week = Week.values();

        for (Week week1 : week) {
            System.out.println(week1);
        }
    }
}


enum Week {
    MONDAY("星期一"), TUESDAY("星期二"), WEDNESDAY("星期三"), THURSDAY("星期四"),
    FRIDAY("星期五"), SATURDAY("星期六"), SUNDAY("星期日");
    private String week;

    Week(String week) {
        this.week = week;
    }

    @Override
    public String toString() {
        return week;
    }
}