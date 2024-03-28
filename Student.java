package InheritancePolymorphism;

import java.time.LocalDate;

public class Student extends User {
  float gpa;
  Class[] classes;


  public Student(String name, float gpa){
    super(name);
    this.gpa = 3.0f;
    System.out.println("Called the Student Constructor");
  }

  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return super.getName() + " is a Student";
  }
  

  public void setName(String name){
    this.name = name;  
}

}
