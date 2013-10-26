/*
Reverse digits of an integer.

Example1: x = 123, return 321
Example2: x = -123, return -321

click to show spoilers.

Have you thought about this?
Here are some good questions to ask before coding. Bonus points for you if you have already thought through this!

If the integer's last digit is 0, what should the output be? ie, cases such as 10, 100.

Did you notice that the reversed integer might overflow? Assume the input is a 32-bit integer, then the reverse of 1000000003 overflows. How should you handle such cases?

Throw an exception? Good, but what if throwing an exception is not an option? You would then have to re-design the function (ie, add an extra parameter).
*/

public class ReverseInteger {
	public int reverse(int x) {
		System.out.println(x);	
		String str = "" + x;
		String newstr = "";
		char[] chars = str.toCharArray();
		boolean isNegative = false;
		
		for (char c: chars) {
			System.out.println(c);
			if (c == '-') isNegative = true;
			else
				newstr = c + newstr;
		}

		for (char c: newstr.toCharArray()) {
			if (c == '0') newstr = newstr.substring(1);
		}
	
		if (isNegative) newstr = '-' + newstr;

		System.out.println(newstr);

		return Integer.parseInt(newstr);
	}

	public static void main (String [] args) {
		ReverseInteger ri = new ReverseInteger();
		
		ri.reverse(123);	
		ri.reverse(-123);	
		ri.reverse(100);	
		ri.reverse(-100);	
	}
}
