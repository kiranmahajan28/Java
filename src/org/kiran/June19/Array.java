package org.kiran.June19;

import java.util.Scanner;

public class Array {
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array");
        int Size = sc.nextInt();
        int []Array = new int[Size];
        System.out.println("Enter the Element in array");
        for(int i=0; i<Size; i++){
            Array[i]=sc.nextInt();
        }

        int Max = findMax(Array);
        System.out.println("the max element is "+Max);

        int min = findMin(Array);
        System.out.println("the minimum element is "+min);
    }

    private static int findMax(int[] array) {
        int max = array[0];
        for(int i=0; i<array.length;i++)
        {
            if(array[i] > max){
                max= array[i];
            }
        }
        return max;
    }

    public static int findMin(int[] a) {

        int min = a[0];
        for(int i =0 ; i<a.length; i++)
        {
            if(a[i]<min){
                min=a[i];
            }
        }

    return min;
    }
}

