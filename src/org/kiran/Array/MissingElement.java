/*
Given an array arr[] of size N-1 with integers in the range of [1, N],
the task is to find the missing number from the first N integers.
Note: There are no duplicates in the list.
Examples:
Input: arr[] = {1, 2, 4, 6, 3, 7, 8}, N = 8
Output: 5
Explanation: The missing number between 1 to 8 is 5
*/

package org.kiran.Array;

import java.util.Arrays;
import java.util.Scanner;

public class MissingElement {
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array");
        int size = sc.nextInt();

        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the element in Array");
            a[i] = sc.nextInt();
        }

        System.out.print("Disply the Arry\n");
        for (int i = 0; i < size; i++) {
            System.out.println(a[i]);
        }

        System.out.println("sorted Array");
        Arrays.sort(a);
        for (int ele : a) {
            System.out.println(ele);
        }

        System.out.println("Missing Elememts");
        for (int i =0 ; i<size; i++)
        {
            for (int j=a[i];j<a[i+1]-1;)
            {
                System.out.println(++j);
            }
        }

        }

}
