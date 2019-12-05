package com.Epam.Task1;

import java.util.Scanner;
import java.util.Arrays;

import static java.util.Arrays.binarySearch;

public class Ex1 {
    public static void main(String[] args) {
        System.out.print("Задайте положительное число в 10-ичной системе: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int count, j = 32;

        int[] array = new int[j + 1];
        for (int i = 0; i <= 32; i++) {
            count = number % 2;
            number = number / 2;

            array[j] = count;
            j = j - 1;
        }


            System.out.println(Arrays.toString(array));

        }

    }

