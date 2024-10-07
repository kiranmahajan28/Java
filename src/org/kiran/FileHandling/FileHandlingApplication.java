package org.kiran.FileHandling;

import java.io.File;

public class FileHandlingApplication {
    public static void main(String []args){
        File []f = File.listRoots();
        for (int i=0; i<f.length;i++){
            long totalSpace=f[i].getTotalSpace();
            long freeSpace= f[i].getFreeSpace();
            System.out.println(f[i]+"  "+(totalSpace/1073741824)+"GB Space");
            System.out.println(f[i]+"  "+(freeSpace/1073741824)+"GB free Space");
        }
    }
}
