/*
Write a program to check String is Palindrome or Not
*/
package org.kiran.Array;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String []args)
//    {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the String");
//        String str = sc.nextLine();
//
//        StringBuilder reverseStr = new StringBuilder();
//
//        int strLength = str.length();
//
//        for (int i = (strLength - 1); i >=0; --i) {
//            reverseStr.append(str.charAt(i));
//        }
//
//        if (str.equalsIgnoreCase(reverseStr.toString())) {
//            System.out.println(str + " is a Palindrome String.");
//        }
//        else {
//            System.out.println(str + " is not a Palindrome String.");
//        }
//    }
//}
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();

        String str2 = str.toLowerCase();
        char str3[] = str2.toCharArray();
        int strlen = str2.length();

        boolean flage = false;
        for (int i = 0; i < str3.length / 2; i++) {

            if (str3[i] == str3[strlen - 1]) {
                strlen--;
                flage = true;
            }
        }
        if (flage) {
            System.out.print("String is palindrome");
        }else {
            System.out.println("String is not palindrome");
        }

    }
}