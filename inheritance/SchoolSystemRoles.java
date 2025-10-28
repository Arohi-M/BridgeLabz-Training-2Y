// Hierarchical Inheritance: School System Roles
class Person {
    String name;
    int age;
}

class Teacher extends Person {
    String subject;
    void displayRole() {
        System.out.println(name + " teaches " + subject);
    }
}

class Student extends Person {
    String grade;
    void displayRole() {
        System.out.println(name + " is a student in grade " + grade);
    }
}

class Staff extends Person {
    String position;
    void displayRole() {
        System.out.println(name + " works as " + position);
    }
}

public class SchoolSystemRoles {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.name = "Mr. Sharma";
        t.subject = "Mathematics";
        t.displayRole();
    }
}
