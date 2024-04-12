import java.util.HashMap;
import java.util.Map;

public class hashmap {
    public static void main(String[] args){
        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1,"sneya");
        hashMap.put(2,"is");
        hashMap.put(3,"coding");

        System.out.println("1 : "+hashMap.get(1));

        for(Map.Entry<Integer,String> element : hashMap.entrySet()){

            System.out.println(element.getKey()+ " "+ element.getValue());
        }
    }
}
