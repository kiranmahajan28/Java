package org.kiran.June19;

import java.util.Scanner;

public class ElementAtPosition {
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of Array");
        int size = sc.nextInt();
        int []a = new int[size];

        for(int i =0; i< size-1; i++){
            System.out.println("Enter the element in array");
            a[i]=sc.nextInt();
        }

        System.out.println("enter the location where you want to add new element");
        int location = sc.nextInt();
        System.out.println("Enter the element you want to add");
        int ele = sc.nextInt();


        for(int i =size-1 ; i>=location; i--) {
            if(i == location) {
                a[i] = ele;
            }
            else {
                a[i] = a[i - 1];
            }
        }

        System.out.println("Display the Array");
        for (int i=0 ; i<size;i++)
        {
            System.out.println(a[i]);
        }
    }
}
