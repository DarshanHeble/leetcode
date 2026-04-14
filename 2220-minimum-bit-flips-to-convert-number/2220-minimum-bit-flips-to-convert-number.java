class Solution {
    public int minBitFlips(int start, int goal) {
        int xor = start ^ goal; // Get the xor bits to flip
        int count = 0; // Count var to track the flips

        while (xor != 0) {
            xor = xor & (xor - 1); // Remove the last set bit(Brian Kernighan Algorithm)
            count++; // Update the counter
        }

        return count;
    }
}