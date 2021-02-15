package Composite;

import java.util.ArrayList;
import java.util.List;

public class ConcreteDepartment implements Department{

        List<Department> departments = new ArrayList<>();

        @Override
        public int getWage() {
            int i = 0;
            for (Department department: departments
            ) {
                i = i + department.getWage();
            }
            return i;
        }

        @Override
        public int getNumOfEmployee() {
            int i = 0;
            for (Department department: departments
            ) {
                i = i + department.getNumOfEmployee();
            }
            return i;
        }

        @Override
        public void add(Department department) {
            departments.add(department);
        }

        @Override
        public void delete(Department department) {
            departments.remove(department);
        }
    }
