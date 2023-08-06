class Solution {
    public int pivotIndex(int[] nums) {

        int rb = 0;
        for(int i = 0;i<nums.length;i++){
            rb += nums[i];
        }
        int lb = 0;

        for(int i = 0;i<nums.length;i++){

            if(lb == rb - nums[i]){
                return i;
            }
            lb += nums[i];
            rb -= nums[i];

        }
        return -1;
        
    }
}