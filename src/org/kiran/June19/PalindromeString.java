package org.kiran.June19;

import java.util.Scanner;

class PalindromeString
{
    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String");
        String Str = sc.nextLine();

        int length = Str.length();
        Str.toLowerCase();
        char Str2[] = Str.toCharArray();
        boolean flag = false;
        for(int i=0; i<=(Str2.length-1); i++){

            if(Str2[i] == Str2[length-1])
            {
                flag=true;
                --length;
            }

        }
        System.out.println(flag?"is palindrome":"Not Palindrom");
    }
}