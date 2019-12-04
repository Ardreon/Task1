package com.Epam.Task1;

public class Ex2 {
    public static void main(String[] args) {


        for (int i = 1; i <= 10000; i++) {
            if (isPerfect(i)) {
                System.out.println(i);
            }
        }
    }
         private static boolean isPerfect (int i) {
            int s = 0;
            for(int j = 1; j < i; j++){
                if( i % j == 0 ) s = s + j;
            }
            return(s == i);
        }

}


