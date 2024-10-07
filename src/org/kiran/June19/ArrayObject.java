package org.kiran.June19;

import java.util.Scanner;

public class ArrayObject {
    private int id;
    private String name;
    private int Salary;

    public ArrayObject(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        Salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }
}

class ArrayaObjectApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the No of Employee");
        int Size = sc.nextInt();
        ArrayObject AB[] = new ArrayObject[Size];

        System.out.println("Enter the Employee Data");
        for (int i = 0; i < Size; i++) {
            System.out.println(" Enter the " + i + " Employee id And name And Salary");
            int id = sc.nextInt();
            String name = sc.next();
            int Salary = sc.nextInt();
            AB[i] = new ArrayObject(id, name, Salary);
        }

        System.out.println("Display the Employee Data");
        for (int i = 0 ; i<Size; i++) {

            System.out.println(AB[i].getId() + " " + AB[i].getName() + " " + AB[i].getSalary());
        }
    }
}