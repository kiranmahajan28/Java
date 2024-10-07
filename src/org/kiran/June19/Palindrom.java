package org.kiran.June19;

import java.util.Scanner;

class Palindrom {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check its palindrome or not");
        int No = sc.nextInt();

        int temp = No;

        int rem= 0;
        int res= 0;

        while(No!=0)
        {
            rem=No%10;
            res=res*10+rem;
            No=No/10;
        }

        System.out.println(temp+ (temp!=res?"  its Not palindrome number":"  Its Palindrome Number"));

    }
}
