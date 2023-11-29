package Exrc1;

import Erxc1.DepartmentOperator;

import java.util.Scanner;

public class Department implements DepartmentOperator {
    String departmentName;



    String[] employees;
    String newEmployee = new Exrc1.Employee;
    int currentSize;

    int maxSize;

    @Override
    public void addEmployee(Exrc1.Employee emloyee) {
        for (int i = 0; i < maxSize; i++) {
            if (employees[i]==newEmployee){
                System.out.println("already work");
            }
            else{
                if (employees[i] != null){
                    employees[i]=newEmployee;
                }
            }
        }
    }

    @Override
    public void removeEmployee(String name) {
        Scanner scr = new Scanner(System.in);
        String remove = scr.toString();
        for (int i = 0; i < maxSize; i++) {
            if (employees[i]==remove){
                employees[i] == " ";//не понимаю в чем ошибка и зачем мне придлогают обьявить boolean
            }
        }
    }
}
