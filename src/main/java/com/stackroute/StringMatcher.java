/*Write a program to find out the multiple occurrences of the given word in a string using Matcher
methods.*/
package com.stackroute;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringMatcher {
    public static void main(String[] args) {
        String text = "She sells seashells by the seashore";   //String input

        String patternString = "se";        //pattern string to match with input

        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(text);

        int count = 0;
        while (matcher.find()) {             //function to check patternString is in input string or not
            count++;
            System.out.println("found: " + count + " : "
                    + matcher.start() + " - " + matcher.end());
        }
    }


}
