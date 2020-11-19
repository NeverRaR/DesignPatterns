package composite;

import java.util.List;
import java.util.ArrayList;

public class Employee {
    private String name;
    private String pos;                           //职位
    private String responsibility;                //负责业务（对接complaint处理）
    private int salary;
    private int age;
    private List<Employee> employeeList;

    public Employee(String name, String pos, String res, int salary, int age) {
        this.name = name;
        this.pos = pos;
        this.responsibility = res;
        this.salary = salary;
        this.age = age;
        employeeList = new ArrayList<Employee>();
    }

    public void add(Employee employee) {
        employeeList.add(employee);
    }

    public void remove(Employee employee) {
        employeeList.remove(employee);
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    //以便输出一个实例的所有值
    public String toString() {
        return ("Name: " + name + ", Pos: " + pos + ", Responsibility: " + responsibility +
                ", Salary" + salary + ", Age: " + age);
    }
}
