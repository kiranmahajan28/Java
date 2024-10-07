package org.kiran.FileHReadWrite;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SaveDataUsingBufferedWriterApp {
    public static void main(String []args)throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Data in file");
        String data = sc.nextLine();
        FileWriter fw = new FileWriter("D:\\Jayesh\\resume1.text" ,true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(data);
        bw.newLine();
        fw.close();

        System.out.println("Record save Sucessful....");
    }
}
