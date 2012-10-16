package ch1.arrays_and_strings;

/**
 * Design an algorithm and write code to remove the duplicate characters in a string without using any additional buffer. 
 * NOTE: One or two additional variables are fine. An extra copy of the array is not.
 * FOLLOW UP
 * Write the test cases for this method.
 * 
 * @author david78k
 *
 */
public class P3Deduplicate {

	public static void main(String[] args) {

	}

	void dedupe(String str) {
		boolean[] checkSet = new boolean[256];
		int len = str.length();
		
		for (int i = 0; i < len; i++) {
			char c = str.charAt(i);
//			if ()
		}
	}
}
