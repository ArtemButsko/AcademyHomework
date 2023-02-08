package by.academy.homework7.Task2;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Arrays;

public class App {

    public static void main(String[] args) {

        User user = new User
                ("Vincent", "V", LocalDate.of(2000, Month.JUNE, 10),
                        "StreetKid", "Cyberpunk2077", "v.streetkid@nightcity.com", "bye");

        user.printUserInfo();

        try {
            Class<User> userClass = User.class;

            System.out.println("getMethod(\"name\")");
            System.out.println(userClass.getMethod("printUserInfo"));
            System.out.println("getDeclaredMethod(\"name\")");
            System.out.println(userClass.getDeclaredMethod("printUserInfo"));

            System.out.println("getMethods()");
            System.out.println(Arrays.toString(userClass.getMethods()));
            System.out.println("getDeclaredMethods()");
            System.out.println(Arrays.toString(userClass.getDeclaredMethods()));

            System.out.println("getField(\"name\")");
            System.out.println(User.class.getField("greeting"));
            System.out.println("getDeclaredField(\"name\")");
            System.out.println(userClass.getDeclaredField("login"));

            System.out.println("getFields()");
            System.out.println(Arrays.toString(userClass.getFields()));
            System.out.println("getDeclaredFields()");
            System.out.println(Arrays.toString(userClass.getDeclaredFields()));

            Field userFirstName = User.class.getSuperclass().getDeclaredField("firstName");
            userFirstName.setAccessible(true);
            userFirstName.set(user, "Johnny");

            Field userLastName = User.class.getSuperclass().getDeclaredField("lastName");
            userLastName.setAccessible(true);
            userLastName.set(user, "Silverhand");

            Field userDateOfBirth = User.class.getSuperclass().getDeclaredField("dateOfBirth");
            userDateOfBirth.setAccessible(true);
            userDateOfBirth.set(user, LocalDate.of(1988, Month.NOVEMBER, 16));

            Field userAge = User.class.getSuperclass().getDeclaredField("age");
            userAge.setAccessible(true);
            userAge.set(user, Period.between
                    (LocalDate.of(1988, Month.NOVEMBER, 16), LocalDate.now()).getYears());

            Field userLogin = userClass.getDeclaredField("login");
            userLogin.setAccessible(true);
            userLogin.set(user, "SilverJohnny");

            Field userPassword = userClass.getDeclaredField("password");
            userPassword.setAccessible(true);
            userPassword.set(user, "Cyberpunk2@77");

            Field userEmail = userClass.getDeclaredField("email");
            userEmail.setAccessible(true);
            userEmail.set(user, "johnny.silverhand@gmail.com");

            Field userGreeting = userClass.getField("greeting");
            userGreeting.set(user, "hello");

            Method info = userClass.getDeclaredMethod("printUserInfo");
            info.invoke(user);

        } catch (NoSuchMethodException | NoSuchFieldException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
