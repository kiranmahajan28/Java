package org.kiran.Numbers;

import java.util.Scanner;

public class Palindrome {
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number To Check is Palindrome or Not");
        int number = sc.nextInt();
        int orignalnumber = number;

        int rem=0;
        int rev=0;

        while(number!=0){

           rem= number%10;
            number=number/10;
            rev= rev*10+rem;
        }

        if(rev == orignalnumber) {
            System.out.println("The given Number is Palindrome");
        }else {
            System.out.println("THe given Number is not Palindrome");
        }
    }
}
