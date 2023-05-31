package com.inner.innerexe01;

public class InnerExercise01 {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        cellphone.alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("懒猪起床了");
            }
        });
        cellphone.alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("小伙伴们上课了");
            }
        });
        String a = "1";

    }
}
interface Bell{
    public void ring();
}
class Cellphone {
    public void alarmclock(Bell bell){
        bell.ring();
    }
}