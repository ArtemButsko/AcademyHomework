package by.academy.homework1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сумму покупки: ");
        double sum = sc.nextDouble();
        System.out.println("Введите возраст: ");
        int age = sc.nextInt();
        double finalSum = 0;

        if (sum < 100) {
            finalSum = sum - sum * 5 / 100;
        } else if (sum >= 100 & sum < 200) {
            finalSum = sum - sum * 7 / 100;

        } else if (sum >= 200 & sum < 300) {

            if (age > 18) {
                finalSum = sum - sum * 16 / 100;
            } else finalSum = sum - sum * 3 / 100;

        } else if (sum >= 400) {
            finalSum = sum - sum * 20 / 100;

        }
        sc.close();
        System.out.println("Финальная сумма с учетом скидки = "+ finalSum);
    }
}
