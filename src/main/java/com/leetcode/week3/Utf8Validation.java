package com.leetcode.week3;

public class Utf8Validation {
    class Solution {
        public boolean validUtf8(int[] data) {
            String[] str = new String[data.length];

            for (int i = 0; i < data.length; i++) {
                String byteStr = String.format("%8s", Integer.toBinaryString(data[i])).replace(' ', '0');
                str[i] = byteStr;
            }

            boolean valid = true;
            int size = data.length;
            for (int i = 0; i < size; i++) {
                int bitCount = str[i].indexOf('0');
                bitCount = bitCount < 0 ? str[i].length() : bitCount;

                if (bitCount > 4) {
                    return false;
                }

                if ((bitCount == 1) && (str[i].charAt(0) != '0')) {
                    return false;
                }

                for (int subIndex = 1; subIndex < bitCount; subIndex++) {
                    i++;
                    valid &= i < size && str[i].substring(0, 2).equals("10");
                }
            }

            return valid;
        }
    }
}
