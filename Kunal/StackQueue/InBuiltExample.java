package Kunal.StackQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class InBuiltExample {
    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//        stack.push(19);
//        stack.push(10);
//        stack.push(99);
//        System.out.println(stack.pop());
//        System.out.println(stack.empty());
//        System.out.println(stack.peek());


        Queue<Integer> queue = new LinkedList<>();

        queue.add(3);
        queue.add(2);
        queue.add(5);
        queue.add(4);
        System.out.println(queue.peek());

    }
}
