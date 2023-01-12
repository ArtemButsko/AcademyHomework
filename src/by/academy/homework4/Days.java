package by.academy.homework4;

public enum Days {

    MONDAY("Понедельник"),TUESDAY("Вторник"),WEDNESDAY("Среда"),

    THURSDAY("Четверг"),FRIDAY("Пятница"),SATURDAY("Суббота"),SUNDAY("Воскресенье");
    private String nameDay;
    Days(String weekday) {
        this.nameDay = weekday;
    }

    public String getNameDay() {
        return nameDay;
    }

    @Override
    public String toString(){
        return "Day: "+ nameDay;
    }







}
