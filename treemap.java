import java.util.Map;
import java.util.TreeMap;

public class treemap {
    public static void main(String[] args){
        TreeMap<Integer,String> treeMap = new TreeMap<>();
        treeMap.put(100,"Sne");
        treeMap.put(102,"is");
        treeMap.put(101,"coding");
        for(Map.Entry<Integer,String> entry : treeMap.entrySet()){
            System.out.println(entry.getKey()+ " "+entry.getValue());
        }
    }
}
