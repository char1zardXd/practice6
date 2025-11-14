package com.algorithmization.practice6;

import java.util.Random;
import java.util.Scanner;

public class task2 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] angles;

        System.out.println("Введите количество углов многоугольника: ");
        int n = scanner.nextInt();
        angles = new int[n];
        int sum = 0;

        System.out.println("Введите градусы углов: ");
        for (int i = 0; i < n; i++) {
            angles[i] = scanner.nextInt();
            sum += angles[i];
        }
        int w = 180 * (n - 2);

        if (sum == w) {
            System.out.println("Такой многоугольник может существовать");
        } else {
            System.out.println("Такой многоугольник НЕ может существовать");
        }
    }
}
