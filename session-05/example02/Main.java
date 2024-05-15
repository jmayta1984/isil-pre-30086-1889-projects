package example02;

import example02.modelos.Employee;

public class Main {
    public static void main(String[] args){
     
        Employee employee1 = new Employee(1, "Julio", "Campos" ,1200, false);
        employee1.setSalary(1500);
        System.out.println(Employee.getMinSalary());

        employee1.hasBonus();
    }
}
