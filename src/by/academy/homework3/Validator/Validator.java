package by.academy.homework3.Validator;

import java.util.regex.Pattern;

public interface Validator {

   Pattern getPattern();

    default boolean validate(String str) {
        return getPattern().matcher(str).matches();
    }


}
