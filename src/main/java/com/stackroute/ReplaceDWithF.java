/*rite a java program to replace all d with f and all i with t in the given string*/

package com.stackroute;

public class ReplaceDWithF
{
    public static void main(String[] args)
    {
        String str = "demo program for use of replace function";
        String input="Hiii";

        // Replace all the 'd' characters with 'f' characters.
        String new_str = str.replace('d', 'f');

        // Display the strings for comparison.
        System.out.println("Original string: " + str);
        System.out.println("New String: " + new_str);


        String output = input.replace('i', 't');
        System.out.println("Original string: " + input);
        System.out.println("New String: " + output);

    }
}
