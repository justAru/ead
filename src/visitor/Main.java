package visitor;

public class Main {
    public static void main(String[] args) {
        System.out.println("***Посетитель скомбинировнный с компоновщиком***\n");

        //директор учебной части
        Employee Principal = new Employee("Dr.Директор (Principal)",
                " Planning-Supervising-Managing", 20, 1000000);
        //в универе два заведующих - IS, MCM.
        Employee IS = new Employee("Заведующий IS", "IS", 2, 140000);
        Employee MCM = new Employee("Заведующий MCM", "MCM", 1, 150000);
        //2 препода в IS department
        Clerk mathTeacher1 = new Clerk("IS Teacher-1", "IS", 14, 140000);
        Clerk mathTeacher2 = new Clerk("IS Teacher-2", "IS", 6, 100000);
        //3 препода в MCM department
        Clerk cseTeacher1 = new Clerk("MCM Teacher-1", "MCM", 10, 150000);
        Clerk cseTeacher2 = new Clerk("MCM Teacher-2", "MCM", 13, 120000);
        Clerk cseTeacher3 = new Clerk("MCM Teacher-3", "MCM", 7, 140000);

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
        SVisitor sVisitor = new Visitor();
        //директор уже некуда повысить, его мы на повышение проверять не будем
        //Principal.Accept(aVisitor);
        for (Staff e : Principal.getControls()
        ) {
            e.Accept(aVisitor);
            e.Accept2(sVisitor);
        }
        //ИСовские преподы
        for (Staff e : IS.getControls()
        ) {
            e.Accept(aVisitor);
            e.Accept2(sVisitor);
        }
        //МКМовские преподы
        for (Staff e : MCM.getControls()
        ) {
            e.Accept(aVisitor);
            e.Accept2(sVisitor);
        }
    }
}
