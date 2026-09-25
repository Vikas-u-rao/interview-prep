class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] result=new int[nums.length];
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]<pivot){
                result[i]=nums[j];
                i++;
            }
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]==pivot){
                result[i]=nums[j];
                i++;
            }
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]>pivot){
                result[i]=nums[j];
                i++;
            }
        }
        return result;
    }
}