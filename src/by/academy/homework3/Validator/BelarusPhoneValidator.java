package by.academy.homework3.Validator;

import java.util.regex.Pattern;

public class BelarusPhoneValidator implements Validator{

    private final String MOB_NUM_BY ="\\+375(29|33|44|25)(\\d{7})";
    @Override
    public Pattern getPattern() {
        return Pattern.compile(MOB_NUM_BY);
    }
}

