abstract  class Shape{
    public abstract double getArea();
}
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return 3.14 * radius * radius;
    }
}
class Rectangle extends Shape{
        private double width;
        private double height;
        public Rectangle(double height, double width){
            this.width=width;
            this.height=height;
        }
        public double getArea()
        {
            return width*height;
        }
}


public class Abstraction {
    public static void main(String[] args){

        Circle circle = new Circle(6);
        Rectangle rectangle= new Rectangle(7,8);
        System.out.println("Area of Circle : "+circle.getArea());
        System.out.println("Rectangle Area: "+rectangle.getArea());

    }
}
