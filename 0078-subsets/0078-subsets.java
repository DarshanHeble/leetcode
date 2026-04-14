class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        // start from index 0 with empty subset
        backTrack(0, nums, new ArrayList<>(), result);
        return result;
    }

    public static void backTrack(int index, int[] nums, List<Integer> curr, List<List<Integer>> result) {
        
        // add current subset (important: copy, not reference)
        result.add(new ArrayList<>(curr));

        // try picking each element starting from 'index'
        for (int i = index; i < nums.length; i++) {

            curr.add(nums[i]); // choose current element

            // move forward: i + 1 ensures we don't reuse same element
            // and only explore elements AFTER current index
            backTrack(i + 1, nums, curr, result);

            curr.remove(curr.size() - 1); // undo choice (backtrack)
        }
    }
}