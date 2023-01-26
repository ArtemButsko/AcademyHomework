package by.academy.homework6.Task4;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;
import java.nio.charset.StandardCharsets;

public class App {

    private static final Random rand = new Random();

    public static void main(String[] args) throws IOException {


        int sizeFile = 0;
        File dir = new File("./src/by/academy/homework6/Task4/Text_Files");

        if (!dir.exists()) {
            dir.mkdir();
        }

        File resultFile = new File("./src/by/academy/homework6/Task4/Result.txt");

        if (!resultFile.exists()) {
            resultFile.createNewFile();
        }

        try (FileWriter resultWriter = new FileWriter(resultFile)) {

            String text = new String(Files.readAllBytes(Paths.get("./src/by/academy/homework6/Task2/Text_task_2")));
            sizeFile = text.length();

            for (int i = 1; i <= 100; i++) {

                File outputFile = new File(dir, Integer.valueOf(i) + ".txt");

                if (!outputFile.exists()) {
                    try {
                        outputFile.createNewFile();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }

                }

                int j = rand.nextInt(sizeFile);

                try (FileWriter writer = new FileWriter(outputFile)) {

                    writer.write(text.substring(0, j));

                } catch (IOException ex) {
                    ex.printStackTrace();
                }

                resultWriter.write(outputFile.getName() + ", size: " + j + "\n");

            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
