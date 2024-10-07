package org.kiran.FileHandling;

import java.io.File;

public class FindDirectoryApp {
    public static void main(String []args){
        File f = new File("D:\\Jayesh");
        boolean b =f.isDirectory();
        if(b){
            System.out.println("Path is Folder");
        }else {
            System.out.println("path is not lead to Folder");
        }

        System.out.println(new File("D:\\Jayesh").isDirectory()?"Path is Folder":"Path is not lead to Directory");
    }
}
