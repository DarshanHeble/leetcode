class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int maxLen = 0, left = 0, right = 0;

        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);

            while (set.contains(curr)) {
                maxLen = Math.max(maxLen, set.size());
                set.remove(s.charAt(left));
                left++;
            }

            set.add(curr);
            // right++;
        }

        maxLen = Math.max(maxLen, set.size());

        return maxLen;
    }
}