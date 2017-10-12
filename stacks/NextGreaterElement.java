package stack;

public class NextGreaterElement {

	static int[] findNextGreaterElement(int[] elementArray, int length) {
		
		IntegerStack integerStack = new IntegerStack(length);
		int[] greaterElementsArray = new int[length];
		
		for(int index = length-1; index >= 0 ; index--) {
			
			int number = elementArray[index];
		
			if(integerStack.isEmpty()) {
				greaterElementsArray[index] = -1;
			}
			else {
				while(number > integerStack.peek() && !integerStack.isEmpty()) 
					integerStack.pop();
				greaterElementsArray[index] = integerStack.peek();
			}
			integerStack.push(number);
		}
		return greaterElementsArray;
	}
	
	public static void main(String[] args) {
		int array[] = {4, 5, 2, 25};
		array = findNextGreaterElement(array, 4);
		
		for(int a : array)
			System.out.print(a+" ");
	}
}

class IntegerStack {
	
	int stack[];
	int top, size, min, max;
	
	public IntegerStack(int size) {
		this.size = size;
		stack = new int[size];
		top = -1;
	}
	
	void push(int number) {
		if(top == size-1) 	
			System.out.println("cannot push. Stack full");
		else 
			stack[++top] = number;
	}
	
	int pop() {
		return (top == -1) ? -1 : stack[top--];
	}
	
	int peek() {
		return (top > -1) ? stack[top] : -1;
	}
	
	boolean isEmpty() {
		return (top == -1) ? true : false;
	}
	
	boolean isFull() {
		return (top == size) ? true : false;
	}
}
