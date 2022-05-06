package leetcode;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Test t = new Test();

        System.out.println(t.longestPalindrome("abcdd"));
    }

    public String longestPalindrome(String s) {
        if (s.length() <= 1) {
            return s;
        }

        char[] chars = s.toCharArray();

        int arrLength = chars.length;

        int maxLenght = 0;
        String maxStr = "";

        for (int i = 0; i < arrLength; i++) {
            if (i == 0 && chars[0] == chars[1] && maxLenght < 2) {
                maxLenght = 2;
                maxStr = s.substring(0, 2);
                continue;
            }

            if (i == arrLength - 1 && chars[arrLength - 1] == chars[arrLength - 2] && maxLenght < 2) {
                maxLenght = 2;
                maxStr = s.substring(arrLength - 2, arrLength);
                continue;
            }

            
        }

        return maxStr;
    }
}
