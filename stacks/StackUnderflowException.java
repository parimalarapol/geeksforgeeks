package stack;

public class StackUnderflowException extends Error{

	public StackUnderflowException() {
		System.out.println("Cannot pop. Stack is empty");
	}
}
