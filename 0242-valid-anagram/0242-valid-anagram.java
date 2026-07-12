class Solution {
    public boolean isAnagram(String s, String t) {
        int[] counts = new int[26];

        for (char ele : s.toCharArray()) {
            counts[ele - 'a']++;
        }

        for (char ele : t.toCharArray()) {
            counts[ele - 'a']--;
        }

        for (int ele : counts) {
            if (ele != 0) return false;
        }

        return true;
    }
}