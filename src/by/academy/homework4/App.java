package by.academy.homework4;

import by.academy.homework3.Validator.Validator;
import by.academy.homework3.Validator.DateOfBirthValidator;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        CustomerArrayList<String> list = new CustomerArrayList<>(2);

        list.print();

        list.add("test1");
        list.add("test2");
        list.add("test3");
        list.add("test4");

        list.print();
        System.out.println(list.get(2));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        list.remove(1);
        list.remove("test3");
        list.print();


        Scanner sc = new Scanner(System.in);

        System.out.println("Введите дату: ");

        String myDate = sc.next();

        CustomDate customDate = new CustomDate(myDate);
        sc.close();
        try {
            System.out.println(customDate.toString());
            System.out.println(customDate.leapYear());
        } catch (NullPointerException e) {

            System.out.println("Возможно вы ввели не правильный формат даты");

        } finally {
            Body body = new Body();
            body.live();





//bug fixing
           /* Integer[] num = new Integer[]{1,2,10,5};
            CustomIterator<Integer> myIterator = new CustomIterator<Integer>(num);

            while (myIterator.hasNext()){

            }*/


        }


    }
}
