package InheritancePolymorphism;

public class Rectangle extends Shape {
  double lenght;
  double width;

  public Rectangle(double lenght, double width) {
    super();
    this.lenght = lenght;
    this.width = width;
  }
  public double getArea(){
    return width * lenght;
  }
  
}
