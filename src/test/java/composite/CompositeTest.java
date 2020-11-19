package composite;

import org.junit.Test;

public class CompositeTest {
    @Test
    public void main() {
        System.out.println("Test composite:");
        //新建员工信息
        Employee CEO = new Employee("Dri","CEO","Run", 110, 20);
        Employee manager1 = new Employee("Lhc","Manager","Manage", 10, 20);
        Employee manager2 = new Employee("Zyy","Manager","Manage", 10, 20);
        Employee staff1 = new Employee("Lsq","Staff","Facility", 1, 20);
        Employee staff2 = new Employee("Wyj","Staff","Environment", 1, 20);
        //添加关系
        CEO.add(manager1);
        CEO.add(manager2);
        manager1.add(staff1);
        manager2.add(staff2);
        CEO.remove(manager1);                    //只为了对比测试，可注释
        //只有三个层级，两个for循环
        System.out.println(CEO);
        for (Employee emp : CEO.getEmployeeList()) {
            System.out.println(emp);
            for (Employee employee : emp.getEmployeeList()) {
                System.out.println(employee);
            }
        }
    }
}
