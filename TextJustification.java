package interviewPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TextJustification {

	public static void main(String[] args) {
		TextJustification t = new TextJustification();
		String[] words = {"This", "is", "an", "example", "of", "text", "justification."};
		List<String> newstring = new ArrayList<>();
		int length = 0, index = 0;
		for(String s : words) {
			length += s.length()+1;
			if(length <= 16) {
				newstring.add(s);
				index++;
			}
			else {
				length = length-s.length()-1;
				t.getSpaces(newstring, length);				
				
				length = 0;
				length += s.length()+1;
				index = 0;
				newstring.clear();
				newstring.add(s);
			}
		}
		
	}
	
	void getSpaces(List<String> s, int length) {
		int spaces = length/s.size();
		String space = "";
		while(spaces-- > 0) {
			space += " ";
		}
		for(String x : s) {
			System.out.print(x+space);
		}
		System.out.println(",");
	}
}
