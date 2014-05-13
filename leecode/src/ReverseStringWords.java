package Leetcode;

public class ReverseStringWords {
	public String reverseWords(String s) {
		if (s == null) return null;
		if (s.trim().equals("")) return "";
		
		StringBuilder rev = new StringBuilder();
		String t = reverse(s).toString();
 		for (String word : t.split("\\s+")) 
			rev.append(reverse(word)).append(" ");
		return rev.toString().trim();
	}

	private StringBuilder reverse(String s) {
		StringBuilder rev = new StringBuilder();
		for (int i = s.length() - 1; i >= 0; i--)
			rev.append(s.charAt(i));
		return rev;
	}
}
