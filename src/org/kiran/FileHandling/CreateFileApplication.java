package org.kiran.FileHandling;

import java.io.File;
import java.io.IOException;

public class CreateFileApplication {
    public static void main(String []args) throws IOException {

        File f = new File("D:\\Jayesh\\resume.text");
        boolean b = f.createNewFile();
        if(b){
            System.out.println("File is created");
        }else{
            System.out.println("Some Problem is there");
        }

        System.out.println(new File("D:\\Jayesh\\resume.text").createNewFile()?"File is created":"Some problem is There");
    }
}
