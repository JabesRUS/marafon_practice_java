package org.day2;

import org.day1.Day1;

import java.util.Scanner;

public class Day2 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        ex3(scanner);
    }

    public static void ex1(Scanner scanner) {
        int a = scanner.nextInt();
        if (a >=1 && a <= 4) {
            System.out.println("Малоэтажный дом");
        } else if (a >= 5 && a <= 8) {
            System.out.println("Среднеэтажный дом");
        } else if (a >= 9) {
            System.out.println("Многоэтажный дом");
        } else {
            System.out.println("Ошибка ввода");
        }
        Day1.separator();
    }

    public static void ex2(Scanner scanner) {
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        for (int i = a; i <= b; i++) {
            if (i % 5 == 0 && i % 10 != 0) {
                System.out.println(i);
            }
        }
        Day1.separator();
    }

    public static void ex3(Scanner scanner) {
        int x = scanner.nextInt();
        if (x >= 5) {
            System.out.println((Math.pow(x, 2) - 10) / (100 + 7));
        } else if (-3 < x && x < 5) {
            System.out.println((x + 3) * (Math.pow(x, 2) - 2));
        } else {
            System.out.println(420);
        }
    }
}
