package collectionframework;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeueDemo {

    public static void main(String[] args) {

        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(10);
        deque.offer(20);
        deque.addFirst(30);
        deque.addLast(40);

//        System.out.println(deque);
//        System.out.println(deque.peek());
        System.out.println(deque.pop());// it remove head or peek
        System.out.println(deque.poll());//it return null when dequeue is empty
        System.out.println(deque.pollFirst());
//        System.out.println(deque.pollLast());
        System.out.println(deque.remove());//it returns exception when dequeue is empty
        System.out.println(deque.removeFirst());
    }
}
