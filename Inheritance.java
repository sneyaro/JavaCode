import java.util.Scanner;

class Calculation{
    int result;
    public int add(int number1, int number2){
        result = number1+number2;
        return result;
    }
    public int subtract(int number1,int number2){
        result= number1-number2;
        return result;
    }
}
class calculation1 extends Calculation{
    public int multiply(int number1,int number2){
        result = number1*number2;
        return result;
    }
}
public class Inheritance {
public static void main(String[] args){
    Scanner object = new Scanner(System.in);
    System.out.println("Enter first number");
    int number1 = object.nextInt();
    System.out.println("Enter second number");
    int number2 = object.nextInt();

    calculation1 c = new calculation1();
    int addresult=c.add(number1,number2);
    int subtractresult=c.subtract(number1,number2);
    int multiplyresult=c.multiply(number1,number2);

    System.out.println("Added result :"+addresult);
    System.out.println("Subtracted result :"+subtractresult);
    System.out.println("multiplied result :"+multiplyresult);
}
}
