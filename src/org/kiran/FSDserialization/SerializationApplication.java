package org.kiran.FSDserialization;

import java.io.*;

class Employee implements Serializable{
    private int id;
    private String name;
    private int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

public class SerializationApplication {
    public static void main(String []args) throws IOException {
        FileOutputStream fout = new FileOutputStream("D:\\jayesh\\emp.text");
        ObjectOutputStream Oout = new ObjectOutputStream(fout);

        Employee emp = new Employee();
        emp.setId(1);
        emp.setName("kiran");
        emp.setSalary(24000);

        Oout.writeObject(emp);
        fout.close();
        System.out.println("Sucess");

    }
}
