package by.academy.homework6.Task4;

import java.io.*;
import java.util.Random;


public class App {

    private static final Random rand = new Random();

    public static void main(String[] args) {

        File dir = new File("./src/by/academy/homework6/Task4/Text_Files");

        if (!dir.exists()) {
            dir.mkdir();
        }

        int sizeFile = 0;

        File readFile = new File(".\\src\\by\\academy\\homework6\\Task2\\Text_task_2");

        try (FileReader reader = new FileReader(readFile)) {

            while (reader.read() != -1) {
                sizeFile++;
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        File resultFile = new File("./src/by/academy/homework6/Task4/Result.txt");

        if (!resultFile.exists()) {
            try {
                resultFile.createNewFile();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }


        try (FileWriter resultWriter = new FileWriter(resultFile)) { // writer for resulting file

            for (int i = 1; i <= 100; i++) {
                File outputFile = new File(dir, Integer.valueOf(i) + ".txt");

                if (!outputFile.exists()) {
                    try {
                        outputFile.createNewFile();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }

                int length = rand.nextInt(sizeFile);

                try (BufferedReader reader = new BufferedReader(new FileReader(readFile));
                     BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

                    char[] chars = new char[length];
                    reader.read(chars);
                    writer.write(chars);
                    resultWriter.write(outputFile.getName() + ", size: " + length + "\n");

                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
