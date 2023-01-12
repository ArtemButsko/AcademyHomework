package by.academy.homework3;

import java.time.LocalDate;

public class Person {

    private String name;
    private double money;
    private String phoneNumber;
    private String email;
    private LocalDate dateOfBirth;

    public Person() {
        super();
    }

    public Person(String name, double money, String phoneNumber, String email, LocalDate dateOfBirth) {
        this.name = name;
        this.money = money;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public double getMoney() {
        return money;
    }
}
