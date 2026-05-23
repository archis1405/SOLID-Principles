package LLD.SOLIDPrinciples.SRP.Example1.ProblemCode;

public class Employee {
    private int id;
    private String name;
    private String address;

    public Employee(int id, String name, String address){
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public void printPerformanceReport(){
        //Code logic for printing performance report of an employee
        System.out.println("Performance report of employee : "+name);
    }

    public double computeSalary(){
        //Code logic for calculating the salary of an employee
        return 10000.0;
    }

    public void updateEmployeeData(){
        //Code logic to update the employee data
        System.out.println("Employee data updated successfully");
    }

    public void fetchEmployeeData(){
        //Code logic to update the employee data
        System.out.println("Employee data fetched correctly");
    }
}

