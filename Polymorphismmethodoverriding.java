class Parent {
    public void method() {
        System.out.println("Parent class");
    }
}
class Child extends Parent{
  public void method()
    {
       System.out.println("Child class");
    }
}
public class Polymorphismmethodoverriding {
    public static void main(String[] args){
        Parent parent = new Child();
        parent.method();
    }

}
