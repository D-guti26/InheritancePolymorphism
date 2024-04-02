package InheritancePolymorphism;
import java.util.ArrayList;


public class Inheritance {

  public static void main(String[] args) {

  // Student student = new Student("Daniel", 3.0f);
  // student.gpa = 3.0f;
  // System.out.println(student.getName());

  // Instructor instructor = new Instructor("Adam");
  // instructor.salary = 3000.00;
  // System.out.println(instructor.getName());

  // // User user = new User("Sophia");
  // // user.email = "useremail@gmail.com";
  
  // System.out.println(student instanceof Student);
  // System.out.println(student instanceof User);
  // System.out.println(instructor instanceof User);

  // Triangle triangle = new Triangle(5, 10);
  // System.out.println(triangle.getArea());

  // Rectangle rectangle = new Rectangle(5, 10);
  // System.out.println(rectangle.getArea());

  // Circle circle = new Circle(5);
  // System.out.println(circle.equals(circle));

  ArrayList<Student> students = new ArrayList<Student>();
  students.add(new Student("Daniel", 4.0f));
  students.add(new Student("Adam", 4.0f));
  students.add(new Student("Sophia", 4.0f));
  // student.setName("Ivy");
  // student.setName("Diego");
 
  for (Student student : students){
    System.out.println(student.getName());
  }
  // students.sort(new StudentComparator());
  students.sort(new StudentComparator());
 }

}