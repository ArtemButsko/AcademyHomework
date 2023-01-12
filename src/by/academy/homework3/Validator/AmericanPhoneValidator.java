package by.academy.homework3.Validator;

import java.util.regex.Pattern;

public class AmericanPhoneValidator implements Validator {

    private final String PHONE_USA ="\\+1(\\d{9})";
    @Override
    public Pattern getPattern() {
        return Pattern.compile(PHONE_USA);
    }
}
