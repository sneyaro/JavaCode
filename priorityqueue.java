import java.util.*;
import java.io.*;
public class priorityqueue {
    public static void main(String[] args)
    {
        PriorityQueue<Integer> priorityqueue = new PriorityQueue<>();

        priorityqueue.add(10);
        priorityqueue.add(67);
        priorityqueue.add(23);

        System.out.println(priorityqueue.peek());

        System.out.println(priorityqueue.poll());

        System.out.println(priorityqueue.peek());
    }
}
