package com.Epam.Task1;

import java.util.Scanner;
import java.util.Arrays;

public class Ex3 {
    public static void main(String[] args) {
        System.out.print("Задайте размер пирамиды от 1 до 9: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[][] array = new int[9][9];

        for (int i = 0; i < array.length; i++) {
            int z = (int) array.length / 2;
            int x = (int) (size - array[i][z]);
            for (int j = 0; j < array.length; j++) {
                array[i][z] = i + 1;
                for (int c = 0; c < x; c++) {
                    if (j != z) {

                    }
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        //Попытка нарисовать пирамиду
      /*      System.out.println();
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length - i; j++) {
                    System.out.print(" ");
                    for (int k = 0; k <= i; k++) {
                        System.out.print(array[i][j] + " ");
                    }
                    System.out.println("");
                }
            }
*/
    }
}