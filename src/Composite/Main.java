package Composite;

public class Main {
    public static void main(String[] args) {

        //create employee
        Employee firstEmployee = new Employee("Aruzhan", 370000);
        Employee secondEmployee = new Employee("Yerasyl", 340000);
        Employee thirdEmployee = new Employee("Magzhan", 234000);
        Employee forthEmployee = new Employee("Adilet", 120000);
        Employee fifthEmployee = new Employee("Assel", 495000);
        Employee sixthEmployee = new Employee("Nargiz", 350000);
        Employee seventhEmployee = new Employee("Anel", 320000);

        //create departments
        ConcreteDepartment DEP1 = new ConcreteDepartment();
        ConcreteDepartment DEP2 = new ConcreteDepartment();

        //add employee to DEP1
        DEP1.add(firstEmployee);
        DEP1.add(secondEmployee);
        DEP1.add(thirdEmployee);

        //add employee to DEP2
        DEP2.add(forthEmployee);
        DEP2.add(fifthEmployee);
        DEP2.add(sixthEmployee);
        DEP2.add(seventhEmployee);

        System.out.println("Total number of employees for DEP1: " + DEP1.getNumOfEmployee());
        System.out.println("Total number of employees for DEP2: " + DEP2.getNumOfEmployee());
        System.out.println("Total wage for the department 1: " + DEP1.getWage());
        System.out.println("Total wage for the department 2: " + DEP2.getWage() + "\n");

        ConcreteDepartment DEP3 = new ConcreteDepartment();
        DEP3.add(DEP1);
        DEP3.add(DEP2);

        System.out.println("Total number of employees for DEP3: " + DEP3.getNumOfEmployee());
        System.out.println("Total wage for the department 3: " + DEP3.getWage() + "\n");
    }
}
