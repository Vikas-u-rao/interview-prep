class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int mostfreqnum=nums[0];
        int maxcount=1;
        int currcount=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                currcount++;
            }
            else{
                currcount=1;
            }
            if(currcount>maxcount){
                maxcount=currcount;
                mostfreqnum=nums[i];
            }
            
        }
        return mostfreqnum;
    }
}