package leetcode;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Test t = new Test();

        System.out.println(t.longestPalindrome("abbbbbsadjkzncmzxcvbbjhbbbbbbbbb"));
    }

    public String longestPalindrome(String s) {
        StringBuilder rel = new StringBuilder();
        String test = "";
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                test = s.substring(i, j);
                if (checkSame(test) && test.length() > max) {
                    max = test.length();
                    rel.setLength(0);
                    rel.append(test);
                }
            }
        }

        return rel.toString();
    }

    public boolean checkSame(String s) {
        int len = s.length();
        for (int i = 0; i < len / 2; i++) {
            if (!s.substring(i, i + 1).equals(s.substring(len - i - 1, len - i))) {
                return false;
            }
        }

        return true;
    }
}
