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
		System.out.println();
		
		System.out.println(P1UniqueCharacters.testBitVector("asbcb")); 
		System.out.println(P1UniqueCharacters.testBitVector("asbc")); 
		System.out.println();
		
		System.out.println(P1UniqueCharacters.testOn2("asbcb")); 
		System.out.println(P1UniqueCharacters.testOn2("asbc")); 
	}

	/**
	 * Time complexity is O(n)
	 * @param str
	 * @return
	 */
	public static boolean test(String str) {
		boolean[] checkSet = new boolean[256]; // assume a set of 256 ASCII characters
		
		int len = str.length();

		for(int i = 0; i < len; i ++) {
			int val = str.charAt(i);
			System.out.println(str.charAt(i) + " = " + val);
			if(checkSet[val]) 
				return false;
			checkSet[val] = true;
		}	
		return true;
	}
	
	/**
	 * Time complexity is O(n) plus less space by using a bit vector 
	 * assuming that there are only 'a-z' alphabet characters.
	 * @param str
	 * @return
	 */
	public static boolean testBitVector(String str) {
		int checker = 0;
		int len = str.length();
		
		for(int i = 0; i < len; i ++) {
			int val = str.charAt(i) - 'a';
			System.out.print(str.charAt(i) + " = " + val);
			System.out.print(", " + (1 << val));
			System.out.println(", " + (checker & 1 << val));
			if((checker & (1 << val)) > 0) 
				return false;
			checker |= (1 << val);
		}	
		return true;
	}
	
	/**
	 * Time complexity is O(n^2)
	 * @param str
	 * @return
	 */
	public static boolean testOn2(String str) {
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
