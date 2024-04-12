 class Multiply {

    public  int multiply(int number1, int number2) {
        int result;

        result = number1 * number2;
        return result;

    }

    public   double multiply(double number1, double number2) {
        double result;
        result = number1 * number2;
        return result;

    }

    public  int multiply(int number1, int number2, int number3) {
        int result;
        result = number1 * number2 * number3;
        return result;
    }
}
public class Polymorphism {
    public  static void main(String[] args){
        Multiply m = new Multiply();
        System.out.println(m.multiply(2,3,4));
        System.out.println(m.multiply(2,3));
        System.out.println(m.multiply(2.3,4.5));

    }
}
