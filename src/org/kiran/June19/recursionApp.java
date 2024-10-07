package org.kiran.June19;

import java.util.Scanner;

public class recursionApp {
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);

         System.out.println("enter the no");
         int no = sc.nextInt();

         int square = Square(no);
            System.out.println(square);
    }
    static int Square(int no){

        return no*no;
    }
}
