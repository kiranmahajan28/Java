package org.kiran.June19;

import java.util.Scanner;

public class PalindromeString2 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String");
        String Str = sc.next();
        int length = Str.length();

        StringBuilder sb = new StringBuilder();
        for (int i=length-1; i>=0; --i){
            sb.append(Str.charAt(i));
        }

        if(Str.equalsIgnoreCase(sb.toString()))
        {
            System.out.println("String is palindrome");
        }
        else{
            System.out.println("String is not palindrome");
        }

    }
}
