import java.util.*;
public class CollectionArraylist {
    public static void main(String[] args) {
        ArrayList<Integer> numberarray1 = new ArrayList<Integer>();
        numberarray1.add(5);
        numberarray1.add(7);
        numberarray1.add(3);
        System.out.println("first list");
        for (Integer number : numberarray1) {
            System.out.println("number " + number);
        }
        ArrayList<Integer> numberarray2 = new ArrayList<Integer>();
        numberarray2.add(23);
        numberarray2.add(34);
        numberarray2.add(67);
        System.out.println("2nd list");
        for (Integer number : numberarray2)
        {
           System.out.println("NUmber "+ number);
        }
    /*nums1.addAll(nums2);
    System.out.println("after adding list2 to list 1");
    for(Integer number :nums1)
    {
        System.out.println("Number :" +number);
    }*/
    ArrayList numberarray3=(ArrayList)numberarray1.clone();
    System.out.println("Cloned "+numberarray3);
    ArrayList<Integer> arrayList = new ArrayList<>();
    arrayList.add(67);
    arrayList.add(89);
    arrayList.add(34);
    arrayList.add(5);

    System.out.println(arrayList);
    arrayList.remove(2);
    System.out.println(arrayList);

    Iterator iterator= arrayList.iterator();
    while(iterator.hasNext()){
        int variable = (Integer)iterator.next();
        if(variable<10)
            iterator.remove();
    }System.out.println(arrayList);
    Integer number = arrayList.get(1);
    System.out.println("index 1 :" +number);
    System.out.println("The size: "+arrayList.size());
    arrayList.set(1,56);
    System.out.println(arrayList);
        Collections.sort(arrayList);
    System.out.println(arrayList);
    }
}
