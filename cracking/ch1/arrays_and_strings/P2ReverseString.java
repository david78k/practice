package ch1.arrays_and_strings;

/**
 * Write code to reverse a C-Style String. (C-String means that "abcd" is represented as five characters, 
 * including the null character.)
 * @author david78k
 *
 */
public class P2ReverseString {

	public static void main(String[] args) {
		System.out.println(test("abcd"));
	}

	public static String test(String str) {
		System.out.println(str);
		StringBuffer sb = new StringBuffer();
		int len = str.length();
		for(int i = 0; i < str.length(); i ++) {
			System.out.println(str.charAt(len-i-1));
			sb.append(str.charAt(len-i-1));
		}
		/*for(int i = str.length() - 1; i == 0; i --) {
			System.out.println(i + str.charAt(i));
			sb.append(str.charAt(i));
		}*/
		return sb.toString();
	}
}
