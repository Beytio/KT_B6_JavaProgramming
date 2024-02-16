package day39_ConstructorOverloading;

import java.security.spec.ECParameterSpec;

public class C05_EmployeeObject {
    public static void main(String[] args) {
        Employee employee=new Employee("Ahmet", 'm',35,46000);

        System.out.println(employee.getName());
        System.out.println(employee.getGender());
        System.out.println(employee.getAge());
        System.out.println(employee.getSalary());


        System.out.println(employee);

    }
}
