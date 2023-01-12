package by.academy.homework3.Validator;

import java.util.regex.Pattern;

public class DateOfBirthValidator implements Validator{

    private final String DATE_PATTERN = "(0?[1-9]|[12][0-9]|3[01])(\\-|/)(0?[1-9]|1[012])(\\-|/)((19|20)\\d\\d)";

    @Override
    public  Pattern getPattern() {
        return Pattern.compile(DATE_PATTERN);
    }
}
