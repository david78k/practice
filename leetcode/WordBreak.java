/* Given a string s and a dictionary of words dict, determine if s can be segmented into a space-separated sequence of one or more dictionary words.

For example, given
s = "leetcode",
dict = ["leet", "code"].

Return true because "leetcode" can be segmented as "leet code"

(Wrong)
Input:	"aaaaaaa", ["aaaa","aaa"]
Output:	false
Expected: true

*/

import java.util.*;

public class WordBreak {
	public boolean wordBreak(String s, Set<String> dict) {
		String tmp = "";
		char c;
		int remaining = s.length();
			
		for(int i = 0; i < s.length(); i ++) {
			c = s.charAt(i);
			//System.out.println(c);
			tmp += c;
			//System.out.println(tmp);
			if (dict.contains(tmp)) {
				// number of characters remaining
				remaining -= tmp.length();		
				tmp = "";
			}	
		}
		
		return (remaining == 0)?true:false;
	}

	public static void main (String args[]) {
		String s = "leetcode";
		Set<String> dict = new HashSet<String>();
		String[] words = {"aaaa", "aaa"};
		//String[] words = {"leet", "code"};
		//String[] words = {"leet", "code", "s"};
		String[] strings = {"leetcode", "sleetcodes", "sleetscodes", "aaaaaaa"};
		
		for (String word: words) {
			//System.out.println(word);	
			dict.add(word);	
		}
		System.out.println(dict);
		
		WordBreak wb = new WordBreak();
		for (String str: strings)
			System.out.println(str + ": " + wb.wordBreak(str, dict));
	} 
}
