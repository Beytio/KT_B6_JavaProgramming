package day55_Week11_Review;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class C05_QueueObjects {
    public static void main(String[] args) {
          /*
        Queue (I): duplicates are allowed, does not have index number. FIFO , does not accept null
                        PriorityQueue (C): random/natural order
						ArrayDequeue (C): insertion order

						LinkedList (C):  insertion order


           */

        Queue<Integer> queue=new PriorityQueue<>();// random order
        queue.add(2);
        queue.add(10);
        queue.add(3);
        queue.add(8);
        queue.add(2);
       // queue.add(null);    --- null kabul etmez

        System.out.println("queue = " + queue);

        System.out.println("queue.peek() = " + queue.peek());// gives the first element
        queue.poll();//
        System.out.println("queue = " + queue);

        System.out.println("---------------");

        Queue<Integer> queue1=new ArrayDeque<>(); // insertion order
        queue1.add(2);
        queue1.add(10);
        queue1.add(3);
        queue1.add(8);
        queue1.add(2);

        System.out.println("queue1 = " + queue1);


        System.out.println("------------------------------");
         /*
        add() will throw an IllegalStateException if no space is currently available in the Queue, otherwise add method will return true.
        offer() method will return false if the element cannot be inserted due to capacity restrictions.
         */


        ArrayDeque<String> deque=new ArrayDeque<>();
        deque.offer("java");
        deque.offer("javaScript");
        deque.offer("ruby");

        System.out.println("deque = " + deque);

        System.out.println("deque.peek() = " + deque.peek());
        deque.poll();
        System.out.println("deque = " + deque);

        deque.offerFirst("C#");
        System.out.println("deque = " + deque);

        deque.offerLast("C++");
        System.out.println("deque = " + deque);


        deque.pollFirst();
        System.out.println("deque = " + deque);

        deque.pollLast();
        System.out.println("deque = " + deque);

        deque.poll();
        System.out.println("deque = " + deque);

        deque.remove();
        System.out.println("deque = " + deque);

      //  deque.remove();  NoSuchElementException
        System.out.println("deque.poll() = " + deque.poll());// deque.poll() = null
    }
}
