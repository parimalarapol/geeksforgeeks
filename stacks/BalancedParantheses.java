package stack;

public class BalancedParantheses {

	static boolean checkBalancedParantheses(String expression) {
		
		CharStack charStack = new CharStack(expression.length());
		
		for(char character : expression.toCharArray()) {
			if(character == '[' || character == '{' || character == '(') 
				charStack.push(character);
			
			else if (character == ']' || character == '}' || character == ')') {
				int searchIndex = getIndexNumber(character)-1;
				int flag = 0;
				if(!charStack.isEmpty()) {
					while(flag == 0) {
						if(getIndexNumber(charStack.pop()) == searchIndex)
							break;
					}
				}
				else
					charStack.push(character);
			}
		}
		return (charStack.isEmpty()) ? true : false;
	}
	
	static int getIndexNumber(char character) {
		
		int index = 0;
		switch(character) {
			case '}':
				index = 6;
				break;
			case '{':
				index = 5;
				break;
			case ']':
				index = 4;
				break;
			case '[':
				index = 3;
				break;
			case ')':
				index = 2;
				break;
			case '(':
				index = 1;
				break;
			default:
				index = 0;
				break;
		}
		return index;
	}
	
	public static void main(String[] args) {
		System.out.println(checkBalancedParantheses("[()]{}{[()()]()}"));
		System.out.println(checkBalancedParantheses("[(])"));
	}
}

class CharStack {
	
	char stack[];
	int top, size, min, max;
	
	public CharStack(int size) {
		this.size = size;
		stack = new char[size];
		top = -1;
	}
	
	void push(char character) {
		if(top == size-1) 	
			System.out.println("cannot push. Stack full");
		else 
			stack[++top] = character;
	}
	
	char pop() {
		return (top == -1) ? '`' : stack[top--];
	}
	
	char peek() {
		return (top >= 0) ? stack[top--] : '`';
	}
	
	boolean isEmpty() {
		return (top == -1) ? true : false;
	}
	
	boolean isFull() {
		return (top == size) ? true : false;
	}
}
