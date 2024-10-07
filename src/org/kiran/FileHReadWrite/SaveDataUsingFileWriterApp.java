package org.kiran.FileHReadWrite;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SaveDataUsingFileWriterApp {
    public static void main(String []args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Data in File");
        String str = sc.nextLine();

        FileWriter fw = new FileWriter("D:\\Jayesh\\resume.text",true);
        fw.write(str);
        fw.close();
        System.out.println("Record Save Sucess....");
    }
}
