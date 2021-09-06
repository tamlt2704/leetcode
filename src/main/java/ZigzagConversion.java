public class ZigzagConversion {
    class Solution {
        public String convert(String s, int numRows) {
            if (numRows == 1) {
                return s;
            }

            StringBuilder rs = new StringBuilder();
            int cycle = 2 * numRows - 2; // if numrows = 1 -> cycle = 0
            int n = s.length();
            int j;
            for (int row = 0; row < numRows; row++) {
                j = 0;
                while (j + row < n) {
                    rs.append(s.charAt(row + j));
                    // if is middle row, add one extra item at mirror position
                    if ((row != 0) && (row != numRows - 1) && (j + cycle - row < n)) {
                        rs.append(s.charAt(j + cycle - row));
                    }
                    j += cycle;
                }
            }
            return rs.toString();
        }
    }
}
