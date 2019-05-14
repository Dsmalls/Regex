package com.section16;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexChallenge {

    public static void main(String[] args) {
        // using the string to match the regular expression...which will equal true
        String challenge1 = "I want a car.";
        System.out.println(challenge1.matches("I want a car."));

        // string.matcher example
        String regEXp = "I want a \\w+.";
        System.out.println(challenge1.matches(regEXp));
        String challenge2 = "I want a fast Car.";
        System.out.println(challenge2.matches(regEXp));

        // matcher.matches method example
        // compiling a pattern
        String regExp3 = "I want a \\w+.";
        Pattern pattern = Pattern.compile(regExp3);
        Matcher matcher = pattern.matcher(challenge1);
        System.out.println(matcher.matches());

        matcher = pattern.matcher(challenge2);
        System.out.println(matcher.matches());

        // replacing all spaces with underscore using replaceAll method
        String challenge4 = "Replace all blanks with underscores";
        System.out.println(challenge4.replaceAll(" ", "_"));
        System.out.println(challenge4.replaceAll("\\s", "_"));

        String challenge5 = "aaabcccccccccdddefffg";
        System.out.println(challenge5.matches("[a-g]+"));

        System.out.println(challenge5.matches("^a{3}bc{9}d{3}ef{3}g$"));

        // another example of matches method
        String challenge7 = "abcd.135";
        System.out.println(challenge7.matches("^[A-z][a-z]+\\.\\d+$"));

    }
}
