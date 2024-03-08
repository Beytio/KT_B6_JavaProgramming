package day53_Collections2;

import java.util.*;

public class C02_QueuePractice {
    public static void main(String[] args) {
        Queue<Integer> priorityQue=new PriorityQueue<>();// random order
        priorityQue.addAll(Arrays.asList(52,1,13,6,753,6,7,900,0));
        System.out.println("priorityQue = " + priorityQue);
        priorityQue.add(18);
        priorityQue.add(5);
        System.out.println("priorityQue = " + priorityQue);


        System.out.println("-----------------------");

        Queue<Integer> arrayDeque=new ArrayDeque<>();// preserve insertion order
        arrayDeque.addAll(Arrays.asList(52,1,13,6,753,6,7,900,0));
        System.out.println("arrayDeque = " + arrayDeque);
        arrayDeque.add(18);
        arrayDeque.add(5);
        System.out.println("arrayDeque = " + arrayDeque);

        System.out.println("-------------------");

        Queue<Integer> linkedList=new LinkedList<>();
        linkedList.addAll(Arrays.asList(52,1,13,6,753,6,7,900,0));
        System.out.println("linkedList = " + linkedList);
        linkedList.add(18);
        linkedList.add(5);
        System.out.println("linkedList = " + linkedList);


        System.out.println("-----------------------");

        //priorityQue.get(0);
       // arrayDeque.get(1);     QUEUE  de index yok

        System.out.println("((List)(linkedList)).get(2) = " + ((List) (linkedList)).get(2));
        System.out.println("priorityQue = " + priorityQue);
        System.out.println("priorityQue.peek() = " + priorityQue.peek());
        System.out.println("priorityQue = " + priorityQue);
        System.out.println("priorityQue.poll() = " + priorityQue.poll());
        System.out.println("priorityQue = " + priorityQue);


        System.out.println("*--------------------");

        System.out.println("arrayDeque = " + arrayDeque);
        System.out.println("arrayDeque.peek() = " + arrayDeque.peek());
        System.out.println("arrayDeque = " + arrayDeque);
        System.out.println("arrayDeque.poll() = " + arrayDeque.poll());
        System.out.println("arrayDeque = " + arrayDeque);


        System.out.println("------------------");
        System.out.println("linkedList = " + linkedList);
        System.out.println("linkedList.poll() = " + linkedList.poll());
        System.out.println("linkedList = " + linkedList);
    }
}
