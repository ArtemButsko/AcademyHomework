package by.academy.homework3;

import by.academy.homework3.Validator.BelarusPhoneValidator;
import by.academy.homework3.Validator.AmericanPhoneValidator;
import by.academy.homework3.Validator.DateOfBirthValidator;
import by.academy.homework3.Validator.EmailValidator;

import java.util.Scanner;

public class App {

    public static void main(String... args) {

        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();
        Deal deal = new Deal();

        menu.mainMenu(sc, deal);

        sc.close();

    }

}
