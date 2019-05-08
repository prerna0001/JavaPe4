/*Write a java program to count the total number of occurrences of a given character in a string
without using any loop?*/

package com.stackroute;

import java.util.Scanner;

public class Occurrences
{
    public void count()
    {
        Scanner str=new Scanner(System.in);
        System.out.println("Enter a String:");
        String InputString=str.nextLine();

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the character to count in the  string:");
        String InputCharacter= reader.nextLine();

        System.out.println("Length Of String:" + InputString.length());

        int charcount = InputString.length() - InputString.replaceAll(InputCharacter, "").length();
        System.out.println("Occurrence of character in String is: " + charcount);
    }

    public static void main(String[] args)
    {
        Occurrences o=new Occurrences();
        o.count();
    }
}