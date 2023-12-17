package com.leetcode.week3;

import java.util.Collections;
import java.util.Stack;

public class DecodeString {
    class Solution {
        private boolean isDigit(char c) {
            return '0' <= c && c <= '9';
        }

        public String decodeString(String s) {
            Stack<Character> stack = new Stack<>();
            Stack<Integer> number = new Stack<>();
            StringBuilder sb = new StringBuilder();

            int count = 0;
            char[] charArr = s.toCharArray();

            for (int i = 0; i < charArr.length; i++) {
                char c = charArr[i];
                if (c == '[') {
                    number.push(count);
                    count = 0;
                    sb.append(c);
                } else if (c == ']') {
                    String str = sb.substring(sb.lastIndexOf("[")+1, sb.length());
                    sb.replace(sb.lastIndexOf("["), sb.length(), String.join("", Collections.nCopies(number.pop(), str)));
                } else if (isDigit(c)) {
                    count = count * 10 + (c - '0');
                } else {
                    sb.append(c);
                }
            }

            return sb.toString();
        }
    }
}
