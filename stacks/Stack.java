package stack;

public class Stack {

	int stack[];
	int top, size, min, max;
	
	public Stack(int size) {
		this.size = size;
		stack = new int[size];
		top = -1;
		min = 1000;
		max = -1;
	}
	
	void push(int number) {
		if(top == size-1) 	
			System.out.println("Cannot insert. Stack full");
		else 
			stack[++top] = number;
	}
	
	int peek() {
		return (top > -1) ? stack[top] : -1;
	}
	
	void pop() {
		if(top == -1) 
			System.out.println("Cannot pop. Stack empty")
		else 
			top--;
	}
	
	boolean isEmpty() {
		return (top == -1) ? true : false;
	}
	
	boolean isFull() {
		return (top == size-1) ? true : false;
	}
}
