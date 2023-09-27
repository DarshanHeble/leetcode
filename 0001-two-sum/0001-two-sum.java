import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer,Integer> hp = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int a = target - nums[i];

            if(hp.containsKey(a)){
                return new int[]{hp.get(a) , i};
            }
            hp.put(nums[i] , i);
        }

        throw new IllegalArgumentException("No two numbers add up to the target.");    }
}