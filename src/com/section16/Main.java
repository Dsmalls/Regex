package com.section16;

public class Main {

    public static void main(String[] args) {
        // regular expression example
        // string literal
        String string = "This is a String. Regex example";
        System.out.println(string);

        // replace all method
        String myString = string.replaceAll("This", "Maybe");
        System.out.println(myString);

        // character class example, matches any character
        String alphanumeric = "abcDeeeF12Ghhiiiijkl991";
        System.out.println(alphanumeric.replaceAll(".", "Y"));

        // karat boundary matcher example
        System.out.println(alphanumeric.replaceAll("^abcDee", "YYY"));

        // String.matches method
        System.out.println(alphanumeric.matches("^hello"));

        System.out.println("harry".replaceAll("[Hh]arry", "Harry"));

        // another example of a character class not a boundary matcher
        String newAlphanumeric = "abcDeeeF12Ghhiiiijkl991";
        System.out.println(newAlphanumeric.replaceAll("[^ej]", "X"));


    }
}
