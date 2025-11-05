import java.util.*;
abstract class CourseType { String name; CourseType(String n){name=n;} public String toString(){return name;} }
class ExamCourse extends CourseType { ExamCourse(String n){super(n);} }
class AssignmentCourse extends CourseType { AssignmentCourse(String n){super(n);} }
class ResearchCourse extends CourseType { ResearchCourse(String n){super(n);} }
class Course<T extends CourseType> {
    List<T> courses = new ArrayList<>();
    void addCourse(T c){courses.add(c);}
}
public class UniversityCourseManagement {
    public static void displayCourses(List<? extends CourseType> list){for(CourseType c:list)System.out.println(c);}
    public static void main(String[] args){
        List<ExamCourse> examCourses = Arrays.asList(new ExamCourse("Math"), new ExamCourse("Physics"));
        displayCourses(examCourses);
    }
}