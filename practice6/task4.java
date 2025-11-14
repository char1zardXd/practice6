package com.algorithmization.practice6;

public class task4 {
    static void main(String[] args) {
        int count = 0;

        for (int degree = 0; degree <= 90; degree++) {
            double radian = Math.toRadians(degree);
            double sin = Math.sin(radian);

            System.out.printf("%.5f", sin);
            count++;

            if (count == 10) {
                System.out.println();
                count = 0;
            }
        }
    }
}
