import java.io.*;
import java.util.*;
public class VectorDemo {
    public static void main(String[] args){
        Vector<Integer> vector = new Vector<>();
        for(int i=1; i<=5; i++){
            vector.add(i);
        }
        System.out.println(vector);

        vector.remove(4);

        System.out.println(vector);

        for(int i=0;i<vector.size();i++){
            System.out.println(vector.get(i)+"");
        }
    }
}
