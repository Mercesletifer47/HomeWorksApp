package ru.geekbrains.java_1_HomeWordsApp;

import java.util.Scanner;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    public static void printThreeWords() {
        System.out.println("_Orange");
        System.out.println("_ Banana");
        System.out.println("_ Apple");
    }
    public static void checkSumSign() {
        int a;
        int b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число А");
        a =scanner.nextInt();
        System.out.println("Введите число B");
        b =scanner.nextInt();
        if (a+b>=0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void printColor() {
        int value;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число value");
        value =scanner.nextInt();
//        value=10; для опеределения как константы
        if (value<=0){
            System.out.println("Красный");
        } else if(0<value && value<=100) {
            System.out.println("Желтый");}
        else {
            System.out.println("Зеленый");
        }
        }
    public static void compareNumbers(){
        int a;
        int b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число А");
        a =scanner.nextInt();
        System.out.println("Введите число B");
        b =scanner.nextInt();
        if (a>=b){
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
    }

