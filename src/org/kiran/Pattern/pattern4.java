package org.kiran.Pattern;

public class pattern4 {
    public static void main(String []args){
        pattern1(5);
    }

    static void pattern1(int n){
        int count;
        for (int row = 1; row<=n; row++){
            count = row;
            for(int col = 1 ; col<=n; col++){
                System.out.print(count++ +" ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n){

    }
}
