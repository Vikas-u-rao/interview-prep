class Solution {
    public int maxProduct(int[] nums) {
        int maxproduct=nums[0];
        int minproduct=nums[0];
        int result=nums[0];
        for(int i=1;i<nums.length;i++){
            int current=nums[i];
            int a=current;
            int b=current *maxproduct;
            int c=current*minproduct;
            int newmax=Math.max(a,Math.max(b,c));
            int newmin=Math.min(a,Math.min(b,c));
            maxproduct=newmax;
            minproduct=newmin;
            result=Math.max(result,maxproduct);
            }
            return result;
        }

}