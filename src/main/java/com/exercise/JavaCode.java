package com.exercise;

import java.util.Scanner;

public class JavaCode {
public boolean CheckEvenOrOdd(int num){
    //int num;
    //System.out.println("Enter an Integer number:");
    //Scanner input = new Scanner(System.in);
    //num = input.nextInt();
    if ( num % 2 == 0 )
        return true;
    else
        return false;
}

public String ReverseString(String s){
    String[] words = s.split(" ");
    String reversedString = "";
    for (int i = 0; i < words.length; i++)
    {
        String word = words[i];
        String reverseWord = "";
        for (int j = word.length()-1; j >= 0; j--)
        {reverseWord = reverseWord + word.charAt(j);
        }
        reversedString = reversedString + reverseWord + " ";
    }
return reversedString;
}
}
