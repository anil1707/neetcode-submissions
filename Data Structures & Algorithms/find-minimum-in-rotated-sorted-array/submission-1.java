class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        // if(nums[0] < nums[n-1]){
        //     return nums[0];
        // }

        int ans = Integer.MAX_VALUE;

        int l = 0;
        int r = n-1;
        while(l<=r){
            int mid = (l + r) / 2;
            if(nums[mid] >= nums[l]){
                ans = Math.min(ans, nums[l]);
                l = mid+1;
            } else {
                ans = Math.min(ans, nums[mid]);
                r = mid-1;
            }
        }
        return ans;
    }
}
