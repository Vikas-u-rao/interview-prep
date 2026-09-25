class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> unique_ele=new HashSet<>();
        for(int number:nums){
            if(!unique_ele.add(number)){
                return true;
            }
        }
        return false;
    }
}