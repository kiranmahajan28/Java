/*
Palindrome Check:
Write a function to check if a given string is a palindrome (reads the same forwards and backwards).
*/
package org.kiran.Array;
import java.util.Scanner;

public class Palindrome
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int no = sc.nextInt();


        int temp = no;
        int reverseno = 0;
        int rem;

        while(no!=0)
        {
            rem = no%10;
            reverseno=reverseno*10+rem;
            no /= 10;
        }
        if (temp==reverseno)
        {
            System.out.println(temp+"  no is palindrom");
        } else {
            System.out.println(temp+"  no is not palindrom");

        }
    }
}
