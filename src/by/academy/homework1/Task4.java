package by.academy.homework1;

public class Task4 {
    public static void main(String[] args) {

        int j = 2;
        int i = 0;

        while (i < 1_000_000) {

            i = (int) Math.pow(2, j);
            j++;

            System.out.print(i + " ");
        }


    }
}
