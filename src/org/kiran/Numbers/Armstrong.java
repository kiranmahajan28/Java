package org.kiran.Numbers;

import java.util.Scanner;

public class Armstrong {
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Check No is Armstrong Or Not");
        System.out.println("Entert the the number");

        int number = sc.nextInt();

        int orignalnumber = number;
        int rem, res =0;
        int no=0;

        while(orignalnumber != 0)
        {
            orignalnumber/=10;
            ++no;

        }

            //int i = number;             i!=0;          i/=10
        for(orignalnumber = number;orignalnumber != 0; orignalnumber/=10){
            rem=orignalnumber % 10;
            res += Math.pow(rem, no);
        }


        if(res == number){
            System.out.println(number+ "  is Armstrong number ");
        }
        else {
            System.out.println(number+ "  is Not Armstrong number ");
        }

    }
}
