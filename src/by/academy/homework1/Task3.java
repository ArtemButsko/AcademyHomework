package by.academy.homework1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("введите число от 1 до 10");
        int i = sc.nextInt();


        if (i > 0 & i < 10) {
            System.out.println("Таблица умножения для " + i + ": ");
            for (int j = 1; j <= 10; j++) {
                int a = i * j;
                System.out.println("" + i + " * " + j + " = " + a);
            }
        } else {
            System.out.println("Введите число от 1 до 10");
        }


    }
}
