package STACK;

import java.util.Stack;

public class TestingSTACKClass {
    public static void main(String[] args) {
        //To implement STACK we have stack class

        Stack<Integer>stack=new Stack<>();

        //2> STACK METHODS()
        //2.1> push()--Add elements to the STACK

        stack.push(1);
        stack.push(2);
        stack.push(3);

        while(!stack.isEmpty()) {
            System.out.println(stack.peek()); // Check element at top
            stack.pop(); // Remove top element
        }

    }
}

//NOTE--->
//1> Whenever we need STACK /implement STACK in java use STACK class..
//2> LIFO
