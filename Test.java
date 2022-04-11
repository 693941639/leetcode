package leetcode;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Test t = new Test();

        System.out.println(t.longestPalindrome("abbbbbsadjkzncmzxcvbbjhbbbbbbbbb"));
    }

    public String longestPalindrome(String s) {
        int max = 0;
        int type = 0;

        boolean isEqual = true;
        StringBuffer rel = new StringBuffer();

        for (int i = 0; i < s.length() - 1; i++) {
            int last = s.lastIndexOf(s.substring(i, i + 1));
            if (last == i) {
                continue;
            }
            int start = i;
            int end = last;

            type = (last - start) & 1;

            if (end > start) {
                while (end - start != type) {
                    if (!this.checkSame(s, start++, end--)) {
                        isEqual = false;
                        break;
                    }
                }

                if (isEqual && (last - i + 1) > max) {
                    max = last - i + 1;
                    rel.setLength(0);
                    rel.append(s.substring(i, last + 1));
                }
            }
        }

        return rel.toString();
    }

    public boolean checkSame(String s, int firstIndex, int secondIndex) {
        return s.substring(firstIndex, firstIndex + 1).equals(s.substring(secondIndex, secondIndex + 1));
    }
}
