class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        long b = Math.abs((long) divisor);
        long a = Math.abs((long) dividend);

        int result = 0;

        while (a >= b) {
            long tempDividend = b;
            long multiple = 1;

            while (a >= (tempDividend << 1)) { // Double untill it exceeds
                tempDividend *= 2;
                multiple *= 2;
            }

            a -= tempDividend;
            result += multiple;
        }

        if ((dividend < 0) ^ (divisor < 0)) {
            result = -result;
        }

        return result;
    }
} 