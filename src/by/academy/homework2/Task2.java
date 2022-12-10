package by.academy.homework2;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите слова отделяя каждое пробелом: ");

        String[] strArr = sc.nextLine().split(" ");

        int counter = 0;
        int counterBox = Integer.MAX_VALUE;
        int indexWord = 0;
        int[] repeat = new int[256];

        for (int i = 0; i < strArr.length; i++) {
            counter = 0;

            for (int j = 0; j < strArr[i].length(); j++) {
                repeat[strArr[i].charAt(j)]++;
            }

            for (int j = 0; j < repeat.length; j++) {

                if (repeat[j] > 0) {
                    counter++;
                }
                repeat[j] = 0;
            }

            if (counter < counterBox) {
                counterBox = counter;
                indexWord = i;
            }

        }

        System.out.println(strArr[indexWord]);

        sc.close();
    }
}

