package stack;

public class StackOverflowException extends Error{

	public StackOverflowException() {
		System.out.println("Cannot insert. Stack has exceeded it's limit.");
	}
}
