package src;

public class Visitor implements IVisitor {
    @Override
    public void VisitCompositeElement(CompositeEmployee employees) {
        //Повышение только если стаж больше 15 лет
        boolean eligibleForPromotion = employees.getYearsOfExperience() > 15 ? true : false;
        System.out.println("\t\t" + employees.getName() + "from"
                + employees.getDept() + "is eligible for promotion?" + eligibleForPromotion);
    }

    @Override
    public void VisitLeafNode(Employee employee) {
        //Повышение только если стаж больше 12 лет
        boolean eligibleForPromotion = employee.getYearsOfExperience() > 12 ? true : false;
        System.out.println("\t\t" + employee.getName() + "from" + employee.getDept()
                + "is eligible for promotion?" + eligibleForPromotion);

    }
}
