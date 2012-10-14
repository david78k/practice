package ch1.arrays_and_strings;

/**
 * Implement an algorithm to determine if a string has all unique characters. What if you can not use additional data structures?
 * 
 * @author david78k
 *
 */
public class P1UniqueCharacters {

	public static void main(String[] args) {
		P1UniqueCharacters p1 = new P1UniqueCharacters();
		System.out.println(P1UniqueCharacters.test("asbcb")); 
		System.out.println(P1UniqueCharacters.test("asbc")); 
	}

	public static boolean test(String str) {
		int len = str.length();

		for(int i = 0; i < len - 1; i ++) {
			for (int j = i + 1; j < len; j ++) {
				if(str.charAt(i) == str.charAt(j))
					return false;
			}
		}	
		return true;
	}
}
