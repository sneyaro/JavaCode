
import java.io.*;
import java.util.*;
public class LinkedlistDemo {
    public static void main(String[] args){
        LinkedList<Integer> linkedList = new LinkedList<>();

        for(int i=1;i<=5;i++){
            linkedList.add(i);
        }System.out.println(linkedList);
        linkedList.add(7);
        linkedList.remove(3);
        System.out.println(linkedList);

        for(int i=0;i< linkedList.size();i++){
            System.out.println(linkedList.get(i)+"");}
        linkedList.remove(2);
        System.out.println();
        }
    }

