package org.kiran.Array;

import java.util.Scanner;
public class ArrayMaxMin {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int[] a = new int[size];

        for (int i = 0; i < size; i++) {

            System.out.println("enter the " + i + " element in Array");
            a[i] = sc.nextInt();
        }

        int max = findmax(a);
        System.out.println("Max element is " + max);
    }

    public static int findmax(int[] a) {

        int max = a[0];
        for (int i=1; i<a.length;i++)
            if (max < a[i])
            {
                max = a[i];
            }

        return max;
    }
}
