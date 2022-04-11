package leetcode;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Test t = new Test();

        System.out.println(t.longestPalindrome("abbbbbbbbbbbbbba"));
    }

    public String longestPalindrome(String s) {
        int max = 0;
        boolean isEqual = true;
        StringBuffer rel = new StringBuffer();

        int type = (s.length() & 1);

        type = (type == 1) ? 0 : 1;

        for (int i = 0; i < s.length() - 1; i++) {
            int start = i;
            int last = s.lastIndexOf(s.substring(i, i + 1));
            int end = last;

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
                    rel.append(s.substring(i, max));
                }
            }
        }

        return rel.toString();
    }

    public boolean checkSame(String s, int firstIndex, int secondIndex) {
        if (s.substring(firstIndex, firstIndex + 1).equals(s.substring(secondIndex, secondIndex + 1))) {
            return true;
        }

        return false;
    }
}
