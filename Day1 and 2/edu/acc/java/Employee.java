package edu.acc.java;
public class Employee{

    int  salary;
    String name;

    public Employee(int salary,String name){
        this.salary = salary;
        this.name = name;
        //System.out.println("Employee " + name + " has been created and " + name + " makes $" + salary);
}

    public String getName(){
        return name;
    }

    public int getSalary(){
        return salary;
    }

}
