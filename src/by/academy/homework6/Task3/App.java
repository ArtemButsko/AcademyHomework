package by.academy.homework6.Task3;

import java.util.ArrayList;
import java.io.*;

public class App {

    public static void main(String[] args) {

        ArrayList<User> users = new ArrayList<>();
        users.add(new User("Vasya", "Bybkin", 25));
        users.add(new User("Anton", "Ivanov", 30));
        users.add(new User("Katya", "Popova", 24));
        users.add(new User("Anya", "Sidorova", 21));
        users.add(new User("Oleg", "Kotov", 32));
        users.add(new User("Ilya", "Shuma", 35));
        users.add(new User("Natasha", "Vozba", 29));
        users.add(new User("Inna", "Izmyilova", 18));
        users.add(new User("Olga", "Savko", 23));
        users.add(new User("Ndezda", "Babkina", 33));

        File dir = new File("./src/by/academy/homework6/Task3/users");

        if(!dir.exists()){
            dir.mkdir();
        }

        for (User user : users) {
            File outputFile = new File(dir, user.getName() + "_" + user.getSecondName()+".txt");
            if (!outputFile.exists()) {
                try {
                    outputFile.createNewFile();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
            try (ObjectOutputStream oos = new ObjectOutputStream(
                    new BufferedOutputStream(new FileOutputStream(outputFile)))) {
                oos.writeObject(user);
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }

        }
    }
}
