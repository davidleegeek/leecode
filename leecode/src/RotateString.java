package prog;

/***
 * 796. Rotate String
 * 
 * We are given two strings, A and B.
 * 
 * A shift on A consists of taking string A and moving the leftmost character to the rightmost position. 
 * For example, if A = 'abcde', then it will be 'bcdea' after one shift on A.
 * Return True if and only if A can become B after some number of shifts on A.
 * 
 * Example 1:
 * Input: A = 'abcde', B = 'cdeab'
 * Output: true
 * 
 * Example 2:
 * Input: A = 'abcde', B = 'abced'
 * Output: false
 * 
 * Note:
 * A and B will have length at most 100.
 *
 */

public class RotateString {
	public boolean rotateString(String A, String B) {
		
		return B.length() == A.length() && (A + A).contains(B);
		
//		for (int i = 0; i < A.length() -1; i++) {
//			String x = A.substring(i) + A.substring(0, i);
//			if (B.equals(x)) return true;
//		}
//		
//		return false;
    }
	
	
	public static void main(String[] args) {
		RotateString rs = new RotateString();
		System.out.println(rs.rotateString("bqqutquvbtgouklsayfvzewpnrbwfcdmwctusunasdbpbmhnvy", "wpnrbwfcdmwctusunasdbpbmhnvybqqutquvbtgouklsayfvze"));
	}
}
