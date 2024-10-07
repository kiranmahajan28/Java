package org.kiran.FileHandling;

import java.io.File;

public class MakedirApplication {
    public static void main(String []args){

        File f = new File("D:\\Jayesh");
            if (f.exists()){
                System.out.println("Folder Alreay Exist");
            }
            else {
                boolean b =f.mkdir();
                if(b){
                    System.out.println("Folder is Crated");
                }
                else{
                    System.out.println("Some problem is there....");
                }
        }

//        System.out.println( new File("D:\\Jayesh").exists()?"file is Already Exist": new File("D:\\July\\Java\\resume").mkdir()?"Folder is created": "there is some problem");
    }
}
