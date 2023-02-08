package by.academy.homework7.Task2;

import java.time.LocalDate;

public class User extends Person {


    String login;
    String password;
    String email;

    User(String firstName, String lastName, LocalDate age, String dateOfBirth, String login, String password, String email) {
        super(firstName, lastName, age, dateOfBirth);
        this.login = login;
        this.password = password;
        this.email = email;
    }

    @Override
    public String toString() {
        return "User [login=" + login + ", password=" + password + ", email=" + email + "]";
    }

    public void printUserInfo() {
        System.out.println("Login:" + getLogin() + ", password: " + getPassword() + ", email: " + getEmail());
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
