package Stack;

import java.util.*;

public class Main_Stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);

        System.out.println(stack.pop());

        System.out.println(stack.peek());

        System.out.println(stack.isEmpty());


        Queue<Integer> queue = new LinkedList<>();

        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);

        System.out.println(queue.poll());
        System.out.println(queue.isEmpty());
        System.out.println(queue.peek());


        Deque<Integer> deque = new ArrayDeque<>();

        deque.push(1);
        deque.push(2);
        deque.push(3);

        deque.pop();
        deque.pop();

        System.out.println(deque.peek());

    }
}
