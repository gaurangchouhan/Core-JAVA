package clg;

import java.util.Stack;
public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(33);
        stack.push(13);
        stack.push(20);

        stack.pop();

        if (stack.contains(20)) {
            System.out.println("yes");
        }

        System.out.println(stack.peek());

        System.out.println(stack.search(23));

        System.out.println(stack);
    }
}
