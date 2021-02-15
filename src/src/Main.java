package src;

public class Main {
    public static void main(String args[]) {

        System.out.println("***Посетитель скомбинировнный с компоновщиком***\n");

        //директор учебной части
        CompositeEmployee Principal = new CompositeEmployee("Dr.Директор (Principal)",
                "Planning-Supervising-Managing",20);
        //в универе два заведующих - IS, MCM.
        CompositeEmployee IS = new CompositeEmployee("Заведующий IS", "IS",14);
        CompositeEmployee MCM = new CompositeEmployee("Заведующий MCM", "MCM",16);
        //2 препода в IS department
        Employee mathTeacher1 = new Employee("IS Teacher-1",  "IS", 14);
        Employee mathTeacher2 = new Employee("IS Teacher-2",  "IS", 6);
        //3 препода в MCM department
        Employee cseTeacher1 = new Employee("MCM Teacher-1",  "MCM", 10);
        Employee cseTeacher2 = new Employee("MCM Teacher-2",  "MCM", 13);
        Employee cseTeacher3 = new Employee("MCM Teacher-3",  "MCM", 7);

        //добавляем математиков в контейнер
        IS.Add(mathTeacher1);
        IS.Add(mathTeacher2);
        //добавляем информатиков в контейнер
        MCM.Add(cseTeacher1);
        MCM.Add(cseTeacher2);
        MCM.Add(cseTeacher3);
        //добавляем департаменты в учебную часть
        Principal.Add(IS);
        Principal.Add(MCM);
        System.out.println("\n Тестируем вывод");
        //выводим все с помощью компоновки
        Principal.PrintStructures();

        System.out.println("\n***запускаем посетителя***\n");
        IVisitor aVisitor = new Visitor();
        //директор уже некуда повысить, его мы на повышение проверять не будем
        //Principal.Accept(aVisitor);
        for (IEmployee e:Principal.getControls()
             ) {
            e.Accept(aVisitor);
        }
        //ИСовские преподы
        for (IEmployee e:IS.getControls()
             ) {
            e.Accept(aVisitor);
        }
        //МКМовские преподы
        for (IEmployee e:MCM.getControls()
        ) {
            e.Accept(aVisitor);
        }

    }
}
