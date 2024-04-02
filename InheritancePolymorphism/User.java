package InheritancePolymorphism;

import java.time.LocalDate;

enum Class {PROGRAMMING, ALGORITHMS, GAME_DESIGN, CALCULUS}

public class User {

  static int globalId;
  String name;
  LocalDate dob;
  int id;
  float gpa;
  Class[] classes;
  String email;


public User(String name) {
  System.out.println("Called the user Constructor");
  this.name = name;
}

public String getName(){
  return this.name;
}

}
