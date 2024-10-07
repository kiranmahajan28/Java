package org.kiran.June19;

import java.util.Scanner;

class Armstrong {
public static void main(String []args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number to check its Armstrong Or Not ");
    int No = sc.nextInt();

    int OrignalNumber = No;
    int Count = 0;
    while(OrignalNumber != 0)
    {
        ++Count;
        OrignalNumber = OrignalNumber/10;
    }

    int rem, result=0;
    for(int i = No; i!=0; i/=10){
        rem = i%10;
        result += Math.pow(rem,Count);
    }

    System.out.println(No +(No!=result?" Not Armstrong Number":" Armstrong Number"));

 }
}
