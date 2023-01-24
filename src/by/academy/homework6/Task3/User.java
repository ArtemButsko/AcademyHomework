package by.academy.homework6.Task3;

public class User {
    private String name;
    private String secondName;
    private int age;

    public User(){}
    public User(String name,String secondName,int age){
        super();
        this.name =name;
        this.secondName = secondName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
