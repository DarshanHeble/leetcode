class Solution {
    public double myPow(double x, int n) {
        double result = 1.0;
        long power = n;

        // If power is negative:
        // x^-n = (1/x)^n
        if (power < 0) {
            x = 1/x;
            power = -power;
        }

        while (power > 0) {
            // Check odd
            if ((power & 1) == 1) {
                result *= x;
            }

            x *= x;
            // Divide power by 2
            power = power >> 1;
        }

        return result;
    }
}