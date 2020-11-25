package composite;

import java.util.List;
import java.util.ArrayList;

/**
 * define Employee class, including different kinds of info about employee and some operation about employee
 * @author 1853615邓斯语
 */
public class Employee {
    private String name;
    private String pos;                           //position
    private String responsibility;                //what kind of work an employee is responsible for
    private int salary;
    private int age;
    private List<Employee> employeeList;

    /**
     * constructor
     * @param name
     * @param pos
     * @param res
     * @param salary
     * @param age
     */
    public Employee(String name, String pos, String res, int salary, int age) {
        this.name = name;
        this.pos = pos;
        this.responsibility = res;
        this.salary = salary;
        this.age = age;
        employeeList = new ArrayList<Employee>();
    }

    /**
     * add sb to sb's subordinate list
     * @param employee
     */
    public void add(Employee employee) {
        employeeList.add(employee);
    }

    /**
     * remove sb from sb's subordinate list
     * @param employee
     */
    public void remove(Employee employee) {
        employeeList.remove(employee);
    }

    /**
     * @return employee list
     */
    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    /**
     * @return all properties of one object
     */
    public String toString() {
        return ("Name: " + name + ", Pos: " + pos + ", Responsibility: " + responsibility +
                ", Salary: " + salary + ", Age: " + age);
    }
}
