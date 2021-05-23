package listInterface;

import java.util.Stack;

// Stack - LIFO
public class StackClass {

	public static void main(String[] args) {
		
		// Initialization of a stack using Generics
		Stack<Integer> stack = new Stack<>();
		
		// Adding an elements
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		
		System.out.println(stack);
		
		// Accessing an element of a stack
		// It will return a top of the stack
		System.out.println(stack.peek());
		
		// pop() remove the top of the element
		System.out.println(stack.pop());
		System.out.println(stack);
		
		System.out.println(stack.isEmpty());
		
		System.out.println(stack.search(50));
	}
}
