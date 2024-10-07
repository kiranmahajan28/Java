package org.kiran.June19;

import java.util.Scanner;

public class pojaclassEx {
    private int id;
    private String name;

    public pojaclassEx() {
    }

    public pojaclassEx(int id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return  "id= " + id + ", name= " + name;
    }
}
    class PojoApp{
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the id and name");
        int id = sc.nextInt();
        String name= sc.next();

        pojaclassEx pj = new pojaclassEx(id,name);
        String pjString = pj.toString();
        System.out.println(pjString);
    }
}