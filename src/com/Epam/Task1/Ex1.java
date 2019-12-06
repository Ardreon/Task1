package com.Epam.Task1;

import java.util.Scanner;
import java.util.Arrays;

import static java.util.Arrays.binarySearch;

public class Ex1 {

    //В зависиости от выбранной системы счисления конвертирует число
    static void convert(int conv, int numb){
        int  j2 = 32, j8 = 11, j16 = 8;

        switch (conv) {
            case 2: {
                int count;
                int[] array = new int[j2 + 1];
                for (int i = 0; i <= 32; i++) {
                    count = numb % 2;
                    numb = numb / 2;

                    array[j2] = count;
                    j2 = j2 - 1;
                }
                System.out.println(Arrays.toString(array));
            } break;
            case 8: {
                int count;
                int[] array = new int[j8 + 1];
                for (int i = 0; i <= 11; i++) {
                    count = numb % 8;
                    numb = numb / 8;

                    array[j8] = count;
                    j2 = j8 - 1;
                }
                System.out.println(Arrays.toString(array));
            } break;
            case 16: {
                int count;
                int[] array = new int[j16 + 1];
                for (int i = 0; i <= 8; i++) {
                    count = numb % 16;
                    numb = numb / 16;
                         switch (count){
                             case 10: count = 'A'; break;
                             case 11: count = 'B'; break;
                             case 12: count = 'C'; break;
                             case 13: count = 'D'; break;
                             case 14: count = 'E'; break;
                             case 15: count = 'F'; break;
                             default: break;
                         }
                    array[j16] = count;
                    j16 = j16 - 1;
                }
                System.out.println(Arrays.toString(array));
            } break;
            default:
                System.out.println("Неправильно. Введите другую систему счисления"); break;
        }
    }

    public static void main(String[] args) {
        System.out.print("Задайте в какую систему счисления перевести: 2, 8 или 16:  ");
        Scanner convert = new Scanner(System.in);
        int sis = convert.nextInt();

        System.out.print("Задайте положительное число в 10-ичной системе: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        //Вызов метода перевода из одной системы счисления в другую
        convert(sis, number);

        }

    }

