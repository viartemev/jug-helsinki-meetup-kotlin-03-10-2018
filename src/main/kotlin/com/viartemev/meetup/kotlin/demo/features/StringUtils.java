package com.viartemev.meetup.kotlin.demo.features;

public class StringUtils {

    public static String unquote(String input) {
        if (input == null) {
            return null;
        } else if (input.length() > 2
                && input.charAt(0) == '"'
                && input.charAt(1) == '"') {
            return input.substring(1, input.length() - 1);
        } else {
            return input;
        }
    }
}
