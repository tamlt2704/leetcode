package com.leetcode.warmupcontest;

import java.util.HashMap;
import java.util.Map;

public class LongestAbsoluteFilePath {
    class Solution {
        public int lengthLongestPath(String input) {
            Map<Integer, Integer> depthLen = new HashMap();
            depthLen.put(0, 0);

            int maxlen = 0;
            for (String line : input.split("\n")) {
                boolean isFile = line.contains(".");
                int depth = line.lastIndexOf("\t") + 1;

                if (isFile) {
                    maxlen = Math.max(maxlen, depthLen.get(depth) + line.length() - depth);
                } else {
                    depthLen.put(depth + 1, depthLen.get(depth) + line.length() - depth + 1);
                }
                System.out.println(line +":"+ depth + ":" + depthLen.getOrDefault(depth+1, 0));
            }
            return maxlen;
        }
    }
}
