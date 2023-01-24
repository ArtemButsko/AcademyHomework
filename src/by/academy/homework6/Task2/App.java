package by.academy.homework6.Task2;

import java.io.*;

public class App {
    public static void main(String[] args) throws IOException {

        File dir = new File("AcademyHomeworkFile");
        if (!dir.exists()) {
            dir.mkdir();
        }

        File result = new File(dir, "result.txt");

        if (!result.exists()) {
            result.createNewFile();
        }

        try (BufferedReader bis = new BufferedReader( new FileReader(new File("./src/by/academy/homework6/Task2/Text_task_2")));
             FileOutputStream writeText = new FileOutputStream(result)) {

            String readText = bis.readLine();
            String newText  = readText.replaceAll(" ","");

            writeText.write(newText.getBytes(),0,newText.length());


        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
