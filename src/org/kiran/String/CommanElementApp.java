package org.kiran.String;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CommanElementApp {
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array 1 ");
        int size1 = sc.nextInt();

        int []Array1 = new int[size1];
        System.out.println("Enter the elemenet in Array 1");
        for (int i=0; i<size1;i++) {
            Array1[i] = sc.nextInt();
        }
        System.out.println("Enter the size of Array 2");
        int size2 = sc.nextInt();
        int []Array2 = new int[size2];

        System.out.println("Enter the element in Array");
        for (int i=0; i<size2;i++){
                Array2[i]=sc.nextInt();
        }

        List<Integer> commanElement = new ArrayList<>();

        for(int i=0; i<Array1.length;i++){
            for (int j=0; j<Array2.length;j++){
                if (Array1[i]==Array2[j]){
                    commanElement.add(Array1[i]);
                }
            }
        }
        System.out.println("Display the comman Element in Array  "+commanElement);

    }
}
