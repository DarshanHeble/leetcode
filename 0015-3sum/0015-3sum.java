class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;

        Arrays.sort(nums);
        for (int i = 0; i < n - 2; i++) {
            int curr = nums[i];
            if (curr > 0) break;

            int left = i + 1;
            int right = n - 1;

            if (i > 0 && nums[i] == nums[i - 1]) continue;

            while (left < right) {
                int sum = curr + nums[left] + nums[right];
                
                if (sum == 0) {
                    res.add(Arrays.asList(curr, nums[left], nums[right]));

                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;
                
                    right--;
                    left++;
                } else if (sum > 0) {
                    right--;
                } else {
                    left++;
                }
            }
        }

        return res;
    }
}