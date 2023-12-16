package com.leetcode.weekly2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PerfectRectangle {
    class Solution {
        public boolean isRectangleCover(int[][] rectangles) {
            Set<String> corners = new HashSet<>();
            long unionArea = 0;
            for (int[] rectangle : rectangles) {
                unionArea += (rectangle[2] - rectangle[0]) * (rectangle[3] - rectangle[1]);

                String c1 = String.format("%s#%s", rectangle[0], rectangle[1]);
                String c2 = String.format("%s#%s", rectangle[0], rectangle[3]);
                String c3 = String.format("%s#%s", rectangle[2], rectangle[3]);
                String c4 = String.format("%s#%s", rectangle[2], rectangle[1]);

                if (!corners.add(c1)) corners.remove(c1);
                if (!corners.add(c2)) corners.remove(c2);
                if (!corners.add(c3)) corners.remove(c3);
                if (!corners.add(c4)) corners.remove(c4);
            }

            //System.out.println(corners + ":" + unionArea);
            if (corners.size() != 4) {
                return false;
            }

            int x1 = Integer.MAX_VALUE;
            int y1 = Integer.MAX_VALUE;
            int x2 = -Integer.MAX_VALUE;
            int y2 = -Integer.MAX_VALUE;
            for (String corner : corners) {
                //System.out.println(corner);
                String[] split = corner.split("#"); // exception with corner = -1, format = '1--1'
                int x = Integer.parseInt(split[0]);
                int y = Integer.parseInt(split[1]);
                x1 = Math.min(x1, x);
                x2 = Math.max(x2, x);

                y1 = Math.min(y1, y);
                y2 = Math.max(y2, y);
            }

            return unionArea == (x2 - x1) * (y2 - y1);
        }
    }
}
