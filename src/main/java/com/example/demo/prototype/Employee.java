package com.example.demo.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Cloneable {

    private List<String> employeeList;

    public Employee() {
        employeeList = new ArrayList<>();
    }

    public Employee(List<String> list) {
        this.employeeList = list;
    }

    public void loadData(){
        employeeList.add("Pankaj");
        employeeList.add("Raj");
        employeeList.add("David");
        employeeList.add("Lisa");
    }

    public List<String> getEmployeeList() {
        return employeeList;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        List<String> temp = new ArrayList<>();

        for (String s: this.getEmployeeList()) {
            temp.add(s);
        }
        return new Employee(temp);
    }

}
