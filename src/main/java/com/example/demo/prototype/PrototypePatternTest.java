package com.example.demo.prototype;

import java.util.List;

public class PrototypePatternTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        Employee emps = new Employee();
        emps.loadData();

        Employee empNew = (Employee) emps.clone();

        List<String> list = empNew.getEmployeeList();
        list.add("john");

        Employee empNew1 = (Employee) empNew.clone();
        List<String> list1 = empNew1.getEmployeeList();
        list1.remove("Pankaj");

        System.out.println("emps List: "+emps.getEmployeeList());
        System.out.println("empsNew List: "+list);
        System.out.println("empsNew1 List: "+list1);

    }
}
