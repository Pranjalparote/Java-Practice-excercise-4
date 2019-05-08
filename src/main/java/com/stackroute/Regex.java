/*Write a program with the implementation of Regular Expression to find the presence of the name
Harry in a string.*/
package com.stackroute;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

    public class Regex {
        public String presentword(String str, String word) {
            Pattern pattern = Pattern.compile(word);
            Matcher matcher = pattern.matcher(str);
            if (matcher.find())
                System.out.println("Is " + word + " here? true");
            else
                System.out.println("Is " + word + " here? false");
            return null;
        }


        public static void main(String args[])
        {
            Regex obj = new Regex();
            Scanner scn=new Scanner(System.in);
            obj.presentword("httry","harry");
        }

    }
