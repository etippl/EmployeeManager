package emp;

import java.util.ArrayList;

public class DemoEmpManager {

    public static void main(String[] args) {

        EmployeeManager em = new EmployeeManager();

        Employee e = em.findByEmpNumber(1234);
        System.out.println("e = " + e);

        em.addEmployee(new Employee(1234,"Hans-Peter",1500.00,"CAMPUS02-IWI"));

        e = em.findByEmpNumber(1234);
        System.out.println("e = " + e);

        em.addEmployee(new Employee(5431,"Stephan",4500.00,"CAMPUS02-IWI"));
        em.addEmployee(new Employee(8567,"Max",4800.00,"CAMPUS02-INNO"));

        ArrayList<Employee> found = em.findByDepartment("CAMPUS02-IWI");
        System.out.println("found = " + found);

        Employee superPartie = em.findByMaxSalary();
        System.out.println("superPartie = " + superPartie);



    }

}
