package com.algorithmization.practice6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task3 {
    final static int MAX_ARRAY_SIZE = 100;

    static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int size_array = 0;

        do {
            System.out.printf("Введите размер массива (1, %d): ", MAX_ARRAY_SIZE);
            size_array = sc.nextInt();
        } while (size_array < 1 || size_array > MAX_ARRAY_SIZE);

        int[] array = new int[size_array];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1, 250);
        }
        System.out.println("Массив со случайнными числами: " + Arrays.toString(array));

        System.out.println("Введите число, которое хотите изменить: ");
        int user_number = sc.nextInt();

        System.out.println("Введите число, на которое хотите изменить: ");
        int user_replace_number = sc.nextInt();

        boolean isfound = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == user_number) {
                array[i] = user_replace_number;
                isfound = true;
                break;
            }
        }
        if (isfound) {
            System.out.printf("Число (%d) находится в массиве и он изменён на (%d)", user_number, user_replace_number);
            System.out.println();
            System.out.println("Изменённый массив: " + Arrays.toString(array));
        } else {
            System.out.printf("Числа (%d) нет в массиве", user_number);
        }
    }
}
