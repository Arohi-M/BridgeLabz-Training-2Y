// Employee Management System
class Employee {
    String name;
    int id;
    double salary;

    void displayDetails() {
        System.out.println("Name: " + name + ", ID: " + id + ", Salary: " + salary);
    }
}

class Manager extends Employee {
    int teamSize;

    void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}

class Developer extends Employee {
    String programmingLanguage;

    void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

class Intern extends Employee {
    String duration;

    void displayDetails() {
        super.displayDetails();
        System.out.println("Internship Duration: " + duration);
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.name = "Alice";
        m.id = 1;
        m.salary = 90000;
        m.teamSize = 5;
        m.displayDetails();
    }
}
