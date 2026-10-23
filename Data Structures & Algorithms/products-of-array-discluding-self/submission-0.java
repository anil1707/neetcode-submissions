class Solution {
    public int[] productExceptSelf(int[] nums) {
        int zeroCount = 0;
        int product= 1;
        for(int a : nums){
            if(a != 0)
                product = product * a;
            else 
                zeroCount++;

        }

        
        for(int i=0;i<nums.length;i++){
            if(zeroCount > 1){
                nums[i] = 0;
            } else if(zeroCount == 1){
                if(nums[i] == 0){
                    nums[i] = product;
                } else {
                    nums[i] = 0;
                }
                
            } else {
                nums[i] = product/nums[i];
            }
        }

        
        return nums;
    }
}  
