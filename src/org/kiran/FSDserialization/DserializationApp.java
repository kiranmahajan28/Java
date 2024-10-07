package org.kiran.FSDserialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DserializationApp {
    public static void main(String []args) throws IOException, ClassNotFoundException {

        FileInputStream fint = new FileInputStream("D:\\jayesh\\emp.text");
        ObjectInputStream Oint = new ObjectInputStream(fint);

        Object obj = Oint.readObject();
        if(obj != null){
            Employee e = (Employee)obj;
            System.out.println(e.getId()+"\n"+e.getName()+"\n"+e.getSalary());
        }
    }

}
