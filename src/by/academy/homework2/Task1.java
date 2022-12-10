package by.academy.homework2;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println(result(str1, str2));

        sc.close();
    }

    static boolean result(String a, String b) {

        char[] aArr = a.toCharArray();
        char[] bArr = b.toCharArray();

        int[] letters = new int[256];

        if (aArr.length != bArr.length) {
            return false;
        }
        for (char i : aArr) {
            letters[i]++;
        }

        for (int i = 0; i < b.length(); i++) {

            int c = (int) b.charAt(i);
            if (--letters[c] < 0) {
                return false;
            }

        }
        return true;
    }
}
