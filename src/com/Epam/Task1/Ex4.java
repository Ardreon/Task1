package com.Epam.Task1;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {

        //Кол-во строк и столбцов в квадратной матрице
        System.out.print("Задайте размер массива: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[][] array = new int[size][size];
        int[][] array2 = new int[size][size];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = ((int) (Math.random() * 18) - 2);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();


        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array2[i][j] = array[j][size - i - 1];
            }
        }

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }

    }
}
