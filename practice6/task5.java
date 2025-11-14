package com.algorithmization.practice6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task5 {
    static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int size_array = 0;

        System.out.println("Введите размер массива: ");
        size_array = scanner.nextInt();
        int[] array = new int[size_array];

        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(1, 100);
        }
        System.out.println("Массив: " + Arrays.toString(array));

        System.out.println("Что проверить?");
        System.out.println("1 - Возрастание");
        System.out.println("2 - Спадение");
        int choice = scanner.nextInt();

        boolean isOrdered = true;

        if (choice == 1) {
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    isOrdered = false;
                    break;
                }
                }
            System.out.println("Массив растущий: " + isOrdered);

            } else if (choice == 2) {
                for (int i = 1; i < array.length; i++) {
                    if (array[i] < array[i + 1]) {
                        isOrdered = false;
                        break;
                    }
                }
            System.out.println("Массив убывающий: " + isOrdered);
        } else {
            System.out.println("Неправильный выбор!");
        }
    }
}
