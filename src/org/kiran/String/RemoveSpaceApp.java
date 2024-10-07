package org.kiran.String;

import java.util.Scanner;

public class RemoveSpaceApp {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String ");
        String Str = sc.nextLine();
        Str = Str.replaceAll(" ","");
        System.out.println(Str);

    }
}
