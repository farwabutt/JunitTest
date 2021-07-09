package com.exercise;

public class JavaCode {
public boolean CheckEvenOrOdd(int num){
    return num % 2 == 0;
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
