package stack;

public class TwoStacksInAnArray {

	int[] stack;
	int top1, top2;
	int size1, size2, length;
	
	public TwoStacksInAnArray(int size1, int size2) {
		stack = new int[size1+size2];
		top1 = -1;
		top2 = stack.length;
		this.size1 = size1;
		this.size2 = size2;
		length = stack.length;
	}
	
	void push1(int number) {
		System.out.println(top1);
		if(top1 == size1-1) 
			throw new StackOverflowException();
		else 
			stack[++top1] = number;
	}
	
	void push2(int number) {
		System.out.println(top2);
		if(top2 == size1) 
			throw new StackOverflowException();
		else 
			stack[--top2] = number;
	}
	
	void pop1() {
		System.out.println(top1);
		if(top1 == -1) 
			throw new StackUnderflowException();
		else
			top1--;
	}
	
	void pop2() {
		System.out.println(top2);
		if(top2 == length)
			throw new StackUnderflowException();
		else
			top2++;
	}
	
	int peek1() {
		System.out.println(top1);
		return (top1 > -1) ? stack[top1] : -1 ;
	}
	
	int peek2() {
		System.out.println(top2);
		return (top2 < length) ? stack[top2] : -1;
	}
}
