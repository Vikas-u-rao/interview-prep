class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        Arrays.sort(nums);
        int count = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                count++;
            } else {
                if (count > nums.length / 3) {
                    result.add(nums[i]);
                }
                count = 1;
            }

        }
        if (count > nums.length / 3) {
            result.add(nums[nums.length - 1]);
        }
        return result;
    }
}