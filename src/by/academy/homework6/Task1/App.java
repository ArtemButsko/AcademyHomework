package by.academy.homework6.Task1;

import java.util.Scanner;
import java.io.*;

public class App {

    private static final String STOP_WORD = "stop";

    public static void main(String[] args) throws IOException {

        File homeWorkFile = new File("home_work_6_task_1.txt");

        if (!homeWorkFile.exists()) {
            homeWorkFile.createNewFile();
        }

        System.out.println("Введите текст для записи в файл, запись остановиться при вводе слова: stop");

        try (FileWriter textWriter = new FileWriter(homeWorkFile); Scanner sc = new Scanner(System.in)) {

            while (sc.hasNext()) {

                String str = sc.nextLine();

                if (str.equals(STOP_WORD)) {
                    System.out.println("Запись в файл остановлена");
                    return;
                } else {
                    textWriter.write(str + "\n");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
