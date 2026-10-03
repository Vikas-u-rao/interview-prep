class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int maxlength = 1;
        int currentlength = 1;
        if (nums == null || nums.length == 0) {
            return 0;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                continue;
            }
            if (nums[i + 1] - nums[i] == 1) {
                currentlength++;
            } else {
                maxlength = Math.max(maxlength, currentlength);
                currentlength = 1;
            }
        }
        return Math.max(maxlength, currentlength);
    }
}