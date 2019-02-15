package by.epam.task2.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class MusicValidator {

    private static final Pattern LINE_PATTERN = Pattern.compile("^([\\w-\\s\\p{L}]+;\\s*){3}([\\d]+;\\s*)(true|false)$");

    public static boolean validate(String line) {
        Matcher matcher = LINE_PATTERN.matcher(line);
        return matcher.matches();
    }
}