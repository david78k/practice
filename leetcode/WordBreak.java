/* Given a string s and a dictionary of words dict, determine if s can be segmented into a space-separated sequence of one or more dictionary words.

For example, given
s = "leetcode",
dict = ["leet", "code"].

Return true because "leetcode" can be segmented as "leet code"
*/

import java.util.*;

public class WordBreak {
	public boolean wordBreak(String s, Set<String> dict) {
		String tmp;
			
		return true;
	}

	public static void main (String args[]) {
		String s = "leetcode";
		Set<String> dict = new HashSet<String>();
		String[] words = {"leet", "code"};
		
		for (String word: words) {
			System.out.println(word);	
			dict.add(word);	
		}
		System.out.println(dict);
		
		WordBreak wb = new WordBreak();
		wb.wordBreak(s, dict);
	} 
}
