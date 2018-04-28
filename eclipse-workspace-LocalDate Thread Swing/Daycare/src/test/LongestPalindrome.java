package test;

public class LongestPalindrome {
	public int longestPalindrome(String s) {
        int[] count = new int[128];
        for (char c: s.toCharArray())   
            count[c]++;
        


        System.out.println( count['a']);
        System.out.println( count['c']);
        System.out.println( count['b']);
        int ans = 0;
        for (int v: count) {
            ans += v / 2 * 2;
            if (ans % 2 == 0 && v % 2 == 1)
                ans++;
        }
        return ans;
    }
	public static void demo() {
		System.out.println("\n LongestPalindrome");
		LongestPalindrome lp = new LongestPalindrome();
		System.out.println(lp.longestPalindrome("abccccdd"));	
	}
}
