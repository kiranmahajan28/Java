package org.kiran.String;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramStringApp {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first String ");
        String Str = sc.nextLine();
        System.out.println("Enter the Seconf string");
        String Str2 = sc.nextLine();

        if(Str.length()==Str2.length()){

            char []ch1=Str.toCharArray();
            char []ch2= Str2.toCharArray();

            Arrays.sort(ch1);
            Arrays.sort(ch2);
            System.out.println(Arrays.equals(ch1,ch2)?"String is Anagram":"String is not Anagram");
        }

        }
    }

