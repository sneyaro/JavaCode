import java.io.*;
import java.util.*;
public class StackDemo {
    public static void main(String[] main){
        Stack<String> stack = new Stack<String>();
        stack.push("Sneya");
        stack.push("is");
        stack.push("coding");

        Iterator<String> iterator = stack.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println();

        stack.pop();

        iterator = stack.iterator();

        while(iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }


    }
}
