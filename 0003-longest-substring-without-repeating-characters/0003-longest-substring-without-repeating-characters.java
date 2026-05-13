class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0;
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);

            while (set.contains(curr)) {
                max = Math.max(max, set.size());
                set.remove(s.charAt(left++));
            }

            set.add(curr);
        }

        max = Math.max(max, set.size());

        return max;
    }
}