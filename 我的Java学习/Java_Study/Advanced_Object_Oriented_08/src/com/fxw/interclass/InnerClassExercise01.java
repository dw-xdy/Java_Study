package com.fxw.interclass;

public class InnerClassExercise01 {
    public static void main(String[] args) {
        f1(new IL() {
            @Override
            public void show() {
                System.out.println("kaishizhixing");
            }
        });
    }

    public static void f1(IL il) {
        il.show();
    }
}



interface IL {
    void show();
}

