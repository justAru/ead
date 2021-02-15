package visitor;

import java.util.ArrayList;
import java.util.Comparator;

public class Visitor implements IVisitor, SVisitor {
    @Override
    public void increaseSalary(Employee employees) {
            //Повышение только если стаж больше 15 лет
        if (employees.getYearsOfExperience() > 2) {
            System.out.println("\t\t" + employees.getName() + " from "
                    + employees.getDept());
            System.out.println("Before(days): " + employees.getYearsOfExperience() * 365 + " days.");
            int year = employees.getYearsOfExperience();
            employees.setYearsOfExperience(year * 365 + 4);
            System.out.println("After: " + employees.getYearsOfExperience() + " days");

            System.out.println("Before(salary): " + employees.getSalary() + " tg.");
            double salary = employees.getSalary();
            employees.setSalary(salary * 0.15 + salary);
            System.out.println("After: " + employees.getSalary() + " tg.");
        } else
            System.out.println("\t\t" + employees.getName() + " from "
                    + employees.getDept());
            System.out.println("User experience is less than 2. ");
    }

    @Override
    public void increaseSalary(Clerk clerk) {
        if (clerk.getYearsOfExperience() > 2 ){
        System.out.println("\t\t" + clerk.getName() + " from " + clerk.getDept());
        System.out.println("Before(days): " + clerk.getYearsOfExperience() * 365 + " days.");
        int year = clerk.getYearsOfExperience();
        clerk.setYearsOfExperience(year * 365 + 2);
        System.out.println("After: " + clerk.getYearsOfExperience() + " days");

        System.out.println("Before(salary): " + clerk.getSalary() + " tg.");
        double salary = clerk.getSalary();
        clerk.setSalary(salary * 0.10 + salary);
        System.out.println("After: " + clerk.getSalary() + " tg.");
    }else {
            System.out.println("\t\t" + clerk.getName() + " from " + clerk.getDept());
            System.out.println("User experience is less than 2.");
        }
    }
    
// агай, здесь должен быть компоратор, но я забыла его применение...
    @Override
    public void presentEmployees(Employee employees) {
        ArrayList<Employee> empl = new ArrayList<>();
        empl.add(employees);
        Comparator<Employee> comparator = Comparator.comparing(obj -> obj.getYearsOfExperience());
        empl.sort(comparator);
        System.out.println(empl.toString());
    }

    @Override
    public void presentEmployees(Clerk clerk) {
        ArrayList<Clerk> clerks = new ArrayList<>();
        clerks.add(clerk);
        Comparator<Clerk> comparator = Comparator.comparing(obj -> obj.getYearsOfExperience());
        clerks.sort(comparator);
        System.out.println(clerks.toString());
    }
}
