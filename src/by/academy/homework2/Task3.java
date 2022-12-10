package by.academy.homework2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a;
        int b;

        System.out.println("Напишите первое слово");
        String str1 = sc.nextLine();

        if (str1.length() % 2 != 0) {
            System.out.println("слово должно содеражать четное число букв");
            return;
        }

        System.out.println("Напишите второе слово");
        String str2 = sc.nextLine();

        if (str2.length() % 2 != 0) {
            System.out.println("слово должно содеражать четное число букв");
            return;
        }
        a = str1.length()/2;
        b = str2.length()/2;

        str1 = str1.substring(0,a);
        str2 = str2.substring(b,str2.length());

        System.out.println("Новое слово: "+ str1+str2);

        sc.close();

    }
}
