package org.kiran.String;

import java.util.Scanner;

public class ReverseStringApp {
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String Str = sc.nextLine();

        String Str2="";
        for (int i=Str.length()-1;i>=0;i--){
            Str2 = Str2 + Str.charAt(i);
        }
        System.out.println("Reverse Word "+Str2);

        System.out.println((Str.equalsIgnoreCase(Str2)?" its palindrom String":"  its not palindrome String"));

        StringBuilder sb = new StringBuilder();
        sb.append(Str);
        sb.reverse();
    }
}
