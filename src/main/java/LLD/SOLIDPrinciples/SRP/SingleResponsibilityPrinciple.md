# Single Responsibility Principle (SRP)

The **Single Responsibility Principle (SRP)** is the first of the five SOLID design principles. It states that **a class should have one, and only one, reason to change**.

In other words, a class should do just one thing and do it well. When a class handles multiple responsibilities, it becomes tightly coupled, difficult to maintain, and prone to breaking when unrelated features are modified.

---

## The Problem (Violating SRP)

In the bad example below, the `Employee` class handles three entirely different responsibilities:
1. Managing employee data (Core business logic).
2. Printing the performance report of an employee (Presentation logic).
3. Calculation of the salary of an employee (Persistence logic).

If you change your database technology (e.g., switching from MySQL to MongoDB) or alter your print layout, this single class must be modified. It has too many reasons to change.

```java
// BAD: Violating SRP
public class Employee {
    private int id;

    public Employee(int id){
        this.id = id;
    }

    public void printPerformanceReport(){
        System.out.println("Performance report of employee : "+name);
    }

    public double computeSalary(){
        return 10000.0;
    }

    public void updateEmployeeData(){
        System.out.println("Employee data updated successfully");
    }

    public void fetchEmployeeData(){
        System.out.println("Employee data fetched correctly");
    }
}
```