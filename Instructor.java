package InheritancePolymorphism;

import java.time.LocalDate;

public class Instructor extends User {
    double salary;

  public Instructor(String name) {
    super(name);
    System.out.println("Called the Instructor Constructor");

}
  @Override
  public String toString() {
  // TODO Auto-generated method stub
  return super.getName();
  }
}
