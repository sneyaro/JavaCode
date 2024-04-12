import java.util.*;
public class HashtableDemo {
    public static void main(String[] args) {
        int array1[] = new int[]{1, 2, 3, 4};
        Vector<Integer> vector = new Vector();
        Hashtable<Integer, String> hashtable = new Hashtable<Integer, String>();

        vector.add(1);
        vector.add(2);

        hashtable.put(1, "Sneya");
        hashtable.put(2, "John");
        System.out.println(array1[0]);
        System.out.println(vector.elementAt(1));
        System.out.println(hashtable.get(2));
    }
}

