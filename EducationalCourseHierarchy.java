// Multilevel Inheritance: Educational Course Hierarchy
class Course {
    String courseName;
    int duration; // in weeks
}

class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;
}

class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount;

    void displayDetails() {
        System.out.println("Course: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Platform: " + platform + ", Recorded: " + isRecorded);
        System.out.println("Fee: " + fee + ", Discount: " + discount + "%");
    }
}

public class EducationalCourseHierarchy {
    public static void main(String[] args) {
        PaidOnlineCourse poc = new PaidOnlineCourse();
        poc.courseName = "Java Programming";
        poc.duration = 6;
        poc.platform = "Udemy";
        poc.isRecorded = true;
        poc.fee = 4999;
        poc.discount = 20;
        poc.displayDetails();
    }
}
