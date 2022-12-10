package by.academy.homework2;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {

    public static void main(String... args) {

        int players = 0;
        int cardsForPlayer = 5;

        String[] suits = {"пики", "червы", "бубны", "трефы"};
        String[] cardRank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Королева", "Король", "Туз"};

        int numCards = suits.length * cardRank.length;

        String[] cardDeck = new String[numCards];

        for (int i = 0; i < cardRank.length; i++) {

            for (int j = 0; j < suits.length; j++) {

                cardDeck[suits.length * i + j] = cardRank[i] + " " + suits[j];
            }
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество игроков");

        players = sc.nextInt();

        if (players == 0 || players < 0) {
            System.out.println("Количество игроков не может быть равно 0 или быть меньше 0");
            return;
        }

        if (cardsForPlayer * players > numCards) {
            System.out.println("Игроков слишком много");
            return;
        }

        for (int i = 0; i < numCards; i++) {
            int r = i + (int) (Math.random() * (numCards - i)); // случайная карта в колоде
            String temp = cardDeck[r];
            cardDeck[r] = cardDeck[i];
            cardDeck[i] = temp;
        }
        // раздача карт
        for (int i = 0; i < players * cardsForPlayer; i++) {
            System.out.print(cardDeck[i] + ", ");
            if (i % cardsForPlayer == cardsForPlayer - 1)
                System.out.println();
        }

    }
}
