class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        int[] count = new int[26];
        int[] window = new int[26];

        for (char ele : s1.toCharArray()) {
            count[ele - 'a']++;
        }

        int k = s1.length();
        for (int i = 0; i < s2.length(); i++) {
            // increment/add the current element in the window 
            window[s2.charAt(i) - 'a']++;

            // decrement/remove the left element in the window
            if (i >= k) {
                window[s2.charAt(i - k) - 'a']--;
            }

            // return true if array matches
            if(Arrays.equals(count, window)) {
                return true;
            }
        }

        return false;
    }
}