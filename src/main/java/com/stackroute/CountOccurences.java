/*Write a java program to count the total number of occurrences of a given character in a string
without using any loop?*/
package com.stackroute;

public class CountOccurences {
    public static void main(String[] args) {
            String str = "Count Number of occurences in string count";
            System.out.println("Length Of String:" + str.length());
            System.out.println("Length Of String Without o :" + str.replace("o", "").length());
            int charactercount = str.length() - str.replaceAll("o", "").length();
        System.out.printf("Occurrence Of O Char In String: %d%n", charactercount);
        }
}
