package interviewQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String name ="Kous12345halya";
	
	List<Character> charList = new ArrayList<>();
	List<Character> digit = new ArrayList<>();
	List<Character> prefix = new ArrayList<>();
	List<Character> suffix = new ArrayList<>();
	List<Character> result = new ArrayList<>();

    for (char c : name.toCharArray()){
        charList.add(c);
    }
    
    boolean digitStarted = false;
    for (char c : charList) {
        if (Character.isDigit(c)) {
            digit.add(c);
            digitStarted = true;
        } else {
            if (!digitStarted) {
                prefix.add(c);
            } else {
                suffix.add(c);
            }
        }
    }
    System.out.println(prefix);
    System.out.println(suffix);
    System.out.println(digit);
     
    Collections.reverse(prefix);
    Collections.reverse(suffix);
    
    result.addAll(prefix);
    result.addAll(digit);
    result.addAll(suffix);
    System.out.println(result);
    // Step 5: Convert back to String
    StringBuilder output = new StringBuilder();
    for (char c : result) {
        output.append(c);
    }
    System.out.println(output);

}
}
   
