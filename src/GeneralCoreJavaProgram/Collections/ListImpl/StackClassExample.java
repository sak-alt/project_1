package GeneralCoreJavaProgram.Collections.ListImpl;

import java.util.Stack;

public class StackClassExample {
    public static void main(String[] args) {
        Stack<Object> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.peek());
    }
}
