package org.kiran.String;

import java.util.Scanner;

public class ReverseEachWord {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the sentences" );
        String Str = sc.nextLine();

        String []Word = Str.split("\\s");
        String ReverseWord ="";

        for (String w: Word) {
            StringBuilder sb = new StringBuilder(w);
            sb.reverse();
            ReverseWord = ReverseWord + sb.toString() + " ";
        }

        System.out.println(ReverseWord);
    }
}
