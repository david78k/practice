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
		boolean negative = (x < 0);
		int result = 0;

		x = Math.abs(x);

		while (x > 0) {
			result = result * 10 + x % 10;
			x /= 10;	
		}

		if (result < 0) return -1;
		if (negative) result *= -1;
	
		return result;	
	}

	public int reverse2(int x) {
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

		char c;
		int i = 0;
		while ((c = newstr.charAt(i)) == '0') 
			i ++;
		newstr = newstr.substring(i);
		
		/*for (char c: newstr.toCharArray()) {
			if (c == '0') newstr = newstr.substring(1);
		}
		*/
	
		if (isNegative) newstr = '-' + newstr;

		System.out.println(newstr);

		return Integer.parseInt(newstr);
	}

	public static void main (String [] args) {
		ReverseInteger ri = new ReverseInteger();
		
		int[] numbers = {123, 1000, 1003, 1000000003};

		for (int n: numbers) {
			//System.out.println(ri.reverse(n)); 
			//System.out.println(ri.reverse(-1*n)); 
			System.out.println(ri.reverse(n) + "\n"); 
			System.out.println(ri.reverse(-1*n) + "\n"); 
		}
/*
		System.out.println(ri.reverse(123)); 
		System.out.println(ri.reverse(-123)); 
		System.out.println(ri.reverse(1000)); 
		System.out.println(ri.reverse(-1000)); 
		System.out.println(ri.reverse(1003)); 
		System.out.println(ri.reverse(-1003)); 
		System.out.println(ri.reverse(1000000003));	
		System.out.println(ri.reverse(-1000000003));	
*/
	}
}
