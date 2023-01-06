package com.skypro.HomeWork7;
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1(){
        int salary = 15_000;
        int total = 0;
        int i = 1;

        while (total < 2_459_000 && i <164) {
            total = total + salary;
            i = i +1;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total +"рублей");
        }
    }
    public static void task2(){
        int a = 0;
        while (a<10){
            a=a+1;
            System.out.print(a + " ");
        }  System.out.println(" ");
        for (int i = 10; i > 0; i--){
            System.out.print(i + " ");
        }
    }
    public static void task3(){
        int a = 12_000_000;
        int b = 17;
        int c = 8;
        int g = 1000;
        int u = a/g;
        int d = (b-c)*u;
        System.out.println(d);
        for (int i = 1; i<11; i++){
            a =  a + d;
            System.out.println("Год " +i+", численность населения составляет " + a);
        }
    }
    public static void task4(){
        int a = 15000;
        int i = 0;
        int total=0;
        for (; total < 12_000_000;i++ ){
            total = total + total/100*7;
            total = total + a;
            System.out.println("Месяц " + i + " сумма накоплений " + total);
        }
    }
    public static void task5() {
        int salary = 15000;
        int total = 0;
        int i = 0;
        for (; total < 12_000_000; i++) {
            total = total + total / 100 * 7;
            total = total + salary;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " Итого " + total);
            }
        }
    }
    public static void task6() {
        int salary = 15000;
        int total = 0;
        int i = 0;
        for (; i<=108; i++) {
            total = total + total/100*7;
            total = total + salary;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " Итого " + total);
            }
        }
    }
    public static void task7() {
        for ( int i = 1; i < 31; i++){
            if (i%7==0){
                System.out.println("Сегодня пятница, "+ i + "-е число. Необходимо подготовить отчет");
            }
        }
    }
    public static void task8() {
        for (int i = 0; i<2122; i=i+79) {
            if (i > 1822 ) {
                System.out.println(i);
            }
        }
    }
}
