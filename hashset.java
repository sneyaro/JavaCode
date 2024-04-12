import java.util.HashSet;
import java.util.Iterator;

public class hashset {
    public static void main(String[] args){
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Sneya");
        hashSet.add("is");
        hashSet.add("coding");

        Iterator<String> iterator = hashSet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
