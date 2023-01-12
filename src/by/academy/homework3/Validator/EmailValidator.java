package by.academy.homework3.Validator;

import java.util.regex.Pattern;

public class EmailValidator implements Validator {

    private final String EMAIL ="\\w+@\\w+\\.\\w{2,}";

    @Override
    public Pattern getPattern() {
        return Pattern.compile(EMAIL);
    }
}
