package by.academy.homework4;

import by.academy.homework3.Validator.Validator;
import by.academy.homework3.Validator.DateOfBirthValidator;


import java.time.LocalDate;

public class CustomDate {
    Days weekday;
    private Year year;
    private Month month;
    private int day;
    private boolean isValidate = false;


    public CustomDate(String myDate) {

        Validator newDateValidator = new DateOfBirthValidator();
        if (newDateValidator.validate(myDate)) {

            isValidate = true;

            int year = Integer.parseInt(myDate.substring(6, 10));
            int month = Integer.parseInt(myDate.substring(3, 5));
            this.day = Integer.parseInt(myDate.substring(0, 2));

            this.year = new Year(year);
            this.month = new Month(month);

            LocalDate date = LocalDate.of(year, month, day);

            switch (date.getDayOfWeek()) {
                case MONDAY:
                    weekday = Days.MONDAY;
                    break;
                case TUESDAY:
                    weekday = Days.TUESDAY;
                    break;
                case WEDNESDAY:
                    weekday = Days.WEDNESDAY;
                    break;
                case THURSDAY:
                    weekday = Days.THURSDAY;
                    break;
                case FRIDAY:
                    weekday = Days.FRIDAY;
                    break;
                case SATURDAY:
                    weekday = Days.SATURDAY;
                case SUNDAY:
                    weekday = Days.SUNDAY;
                default:
                    break;

            }
        } else {
            return;
        }

    }

    static class Year {
        int year;

        public Year() {
            super();
        }

        public Year(int year) {
            this.year = year;
        }

        public int getYear() {
            return year;
        }

        @Override
        public String toString() {
            return "Year = " + year;
        }

    }

    static class Month {
        int month;

        public Month() {
            super();
        }

        public Month(int month) {
            this.month = month;
        }

        public int getMonth() {
            return month;
        }

        @Override
        public String toString() {
            return "Month = " + month;
        }


    }

    public String leapYear() {
        if (isValidate) {
            LocalDate leapYear = LocalDate.of(year.year, month.month, day);
            if (leapYear.isLeapYear()) {
                return "Год високосный ";

            } else {
                return "Год невисокосный";
            }
        }
        return "Неверный формат даты";
    }

    @Override
    public String toString() {
        return "CustomDate: " +
                year.toString() + ","+ month.toString() +
                ", day: " + day +" "+ weekday.getNameDay() + " " + day + "-" + month.getMonth() + "-" + year.getYear();
    }

}
