package by.academy.homework3;
import by.academy.homework3.Validator.BelarusPhoneValidator;
import by.academy.homework3.Validator.DateOfBirthValidator;
import by.academy.homework3.Validator.EmailValidator;

import java.time.LocalDate;
import java.util.Scanner;

public class Menu {
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        //System.out.flush();
    }
    public void mainMenu(Scanner sc, Deal deal) {
        clearScreen();
        while (true) {
            System.out.println("Select  menu :");
            System.out.println("1 -- Create Customer");
            System.out.println("2 -- Create Seller");
            System.out.println("3 -- Product menu");
            System.out.println("4 -- Deal menu");
            System.out.println("0 -- return");
            int select = sc.nextInt();

            switch (select) {
                case 1:
                    Person customer = createPerson(sc);
                    deal.setCustomer(customer);
                    break;
                case 2:
                    Person seller = createPerson(sc);
                    deal.setSeller(seller);
                    break;
                case 3:
                    productMenu(sc, deal);
                    break;
                case 4:
                    dealMenu(sc, deal);
                    break;
                case 0:
                    return;
                default:
                    System.out.println("choose again");
            }
        }

    }

    public void productMenu(Scanner sc, Deal deal) {
        clearScreen();
        while (true) {
            System.out.println("Select menu :");
            System.out.println("1 -- Print products array");
            System.out.println("2 -- Create and add product to deal");
            System.out.println("3 -- Delete product by number");
            System.out.println("0 -- return");
            int select = sc.nextInt();
            switch (select) {
                case 1:
                    deal.printProducts();
                    break;
                case 2:
                    Product newProduct = getProduct(sc);
                    deal.addProduct(newProduct);
                    break;
                case 3:
                    deal.printProducts();

                    System.out.println("Choose number product to  remove");
                    int index = sc.nextInt();
                    deal.deleteProduct(index - 1);
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Choose again");

            }
        }
    }

    public void dealMenu(Scanner sc, Deal deal) {
        clearScreen();
        while (true) {
            System.out.println("Select menu :");
            System.out.println("1 -- Deal");
            System.out.println("2 -- Print receipt");
            System.out.println("0 -- return");
            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                    deal.deal();
                    break;
                case 2:
                    deal.printReceipt();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Select again");

            }
        }
    }

    public Person createPerson(Scanner sc) {

        System.out.println("Write name of person: ");
        String personName = sc.next();
        System.out.println("Enter the amount of money: ");
        double money = sc.nextDouble();

        String phoneNumber;
        BelarusPhoneValidator phone = new BelarusPhoneValidator();

        while (true) {
            System.out.println("Write person's phone number: ");
            String numPhone = sc.next();
            if (phone.validate(numPhone)) {
                phoneNumber = numPhone;
                break;
            } else {
                System.out.println("Wrong phone number format");
            }
        }

        String email;
        EmailValidator emailPerson = new EmailValidator();

        while (true) {
            System.out.println("Write person's e-mail: ");
            String strEmail = sc.next();

            if (emailPerson.validate(strEmail)) {
                email = strEmail;
                break;
            } else {
                System.out.println("Wrong e-mail format");
            }
        }
        LocalDate personDateOfBirth;
        DateOfBirthValidator dateOfBirthPerson = new DateOfBirthValidator();

        while (true) {
            System.out.println("Write person's Birthday: ");
            String bD = sc.next();

            if (dateOfBirthPerson.validate(bD)) {

                personDateOfBirth = LocalDate.of(Integer.parseInt(bD.substring(6, 10)), Integer.parseInt(bD.substring(3, 5)),
                        Integer.parseInt(bD.substring(0, 2)));
                break;

            } else {
                System.out.println("Wrong Birthday format");
            }

        }

        return new Person(personName, money, phoneNumber, email, personDateOfBirth);

    }
    public static KindOfBread findByIndex(int index) {
        for (KindOfBread breadType : KindOfBread.values()) {
            if (breadType.index == index) {
                return breadType;
            }
        }
        return null;
    }
    public Product getProduct(Scanner sc) {

        Product retProduct = null;
        System.out.println("Choose new product:");
        System.out.println("1) Milk");
        System.out.println("2) Bread");
        System.out.println("3) Eggs");
        System.out.println("4) Sugar");
        int choose = 0;
        if (sc.hasNextInt()) {
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("Enter the fat percentage of milk");
                    int milkFatPercentage = sc.nextInt();
                    Milk milk = new Milk(milkFatPercentage);
                    retProduct = milk;
                    break;
                case 2:
                    System.out.println("Enter origin country");
                    String country = sc.next();
                    //получение списка из "перечисления"
                    System.out.println("Select type of bread:");
                    KindOfBread[] breadKinds = KindOfBread.values();
                    for (KindOfBread breadKind : breadKinds) {
                        System.out.println(breadKind.index + ") --" + breadKind.breadDesc);
                    }
                    //получение типа по индексу
                    int breadType = sc.nextInt();
                    Bread bread = new Bread(country, findByIndex(breadType));
                    retProduct = bread;
                    break;
                case 3:
                    System.out.println("Enter egg's size :");
                    int size = sc.nextInt();
                    Eggs eggs = new Eggs(size);
                    retProduct = eggs;
                    break;
                case 4:
                    System.out.println("Enter the color of lump sugar ");
                    String sugarColor = sc.next();
                    System.out.println("Enter box size of lump sugar");
                    int sizeBox = sc.nextInt();
                    LumpSugar lumpSugar = new LumpSugar(sugarColor,sizeBox);
                    retProduct = lumpSugar;
                    break;
                default:
                    System.out.println("Wrong number");
                    return null;
            }
            System.out.println("Enter product price");
            retProduct.setPrice(sc.nextDouble());
            System.out.println("Enter product quantity");
            retProduct.setQuantity(sc.nextDouble());
            System.out.println("Enter product name");
            retProduct.setName(sc.next());


        }
        return retProduct;
    }
}
