package com.company;

public class employee {
    private int empid;
    private String name;
    private int age;




    public employee(int empid, int age, String name)
{
    this.empid=empid;
    this.age=age;
    this.name=name;
}
    public int getAge() {
        return age;
    }


    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getName() {
        return name;
    }


}
