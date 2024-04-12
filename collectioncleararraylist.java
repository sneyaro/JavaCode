import java.util.ArrayList;

public class collectioncleararraylist{
    public static void main(String[] args){
        ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
        arrayList1.add(4);
        arrayList1.add(3);
        arrayList1.add(6);
        System.out.println("the first list");

        for( Integer number : arrayList1){
            System.out.println( number);

        }
        System.out.println(arrayList1);
        arrayList1.clear();
        System.out.println("array1 " +arrayList1);
    }
}
