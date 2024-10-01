package org.day1;

public class Day1 {
    private static final String JAVA_STRING = "JAVA";
    private static final String SEPARATOR = "-------------------";
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
        ex5();
        ex6();
    }

    public static void separator() {
        System.out.println(SEPARATOR);
    }

    public static void ex1() {
        int count = 1;
        while (count <= 10) {
            System.out.print(JAVA_STRING + " ");
            count++;
        }
        separator();
    }

    public static void ex2() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(JAVA_STRING + " ");
        }
        separator();
    }

    public static void ex3() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + ". " + JAVA_STRING);
        }
        separator();
    }

    public static void ex4() {
        int year = 1980;
        while (year <= 2020) {
            System.out.printf("Олимпиада %d года\n", year);
            year += 4;
        }
        separator();
    }

    public static void ex5() {
        for (int year = 1980; year <= 2020; year += 4) {
            System.out.printf("Олимпиада %d года\n", year);
        }
        separator();
    }

    public static void ex6() {
        int k = 1;
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", k, i, k * i);
        }
    }
}
