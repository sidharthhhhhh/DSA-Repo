class Solution {

    public int[] productExceptSelf(int[] nums) {

        int[] ans  = new int[nums.length];
        int mul = 1;
        int mul0 = 1;
        int f = 0;
        
        for(int i = 0;i<nums.length;i++){
            
            mul *= nums[i];
            if(nums[i]==0){
                f++;
            }


        }
        if(f==1){
            for(int i = 0;i<nums.length;i++){

                if(nums[i] != 0){
                    mul0 *= nums[i];
                }
            
                
            }

        }
        else{
            mul0 = 0;
        }
        for(int i = 0;i<nums.length;i++){

            if(mul == 0 && nums[i] == 0){
                ans[i] = mul0;
            }
            else{
                int t = mul/nums[i];
                ans[i] = t;


            }

            
        }

        return ans;

    }
}