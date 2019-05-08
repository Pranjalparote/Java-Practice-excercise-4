package com.stackroute;

import java.util.StringTokenizer;

public class Alphabetical {
    public static void main(String[] args) {
        SortAndAlphabetical obj = new SortAndAlphabetical();
        obj.getToken();
        obj.sort();
    }
}


class SortAndAlphabetical {

    static String in = "Zeqr is About to start";
    static String[] arr = new String[30];
    static int count = 0;
//function to assign tokens to each word in string
    void getToken() {
        StringTokenizer st = new StringTokenizer(in, " ");

        while (st.hasMoreTokens()) {
            arr[count] = st.nextToken();
            count++;
        }
        System.out.println("The original string is:" + in);
        System.out.println("-------The Tokens of the strings--------");
        for (int i = 0; i < count; i++) {
            System.out.println(arr[i]);
        }
    }
//function to sort tokenized words in alphabetical order
    void sort() {
        for (int i = 0; i < count; i++) {
            for (int j = i + 1; j < count; j++) {
                if (arr[j].compareToIgnoreCase(arr[i]) < 0) {
                    String t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
        System.out.println("--------The sorted array of strings---------");
        for (int k = 0; k < count; k++) {     //print sored words
            System.out.println(arr[k]);
        }
    }
}
