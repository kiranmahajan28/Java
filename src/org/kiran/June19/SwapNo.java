package org.kiran.June19;

import java.util.Scanner;

public class SwapNo {
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);
        int a =5;
        int b =10;
        System.out.println("a= "+a+  "    b= "+b);
         a = a^b;
         b = a^b;
         a = a^b;

        System.out.println("a= "+a+  "    b= "+b);
    }
}
