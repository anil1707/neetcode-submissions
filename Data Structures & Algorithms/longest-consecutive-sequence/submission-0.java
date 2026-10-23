class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int ans = 1;
        int temp = 1;
        if(nums.length<2) return nums.length;
        for(int i=1;i<nums.length;i++){
            if(nums[i] - nums[i-1] == 1){
                temp++;
            } else if(nums[i] == nums[i-1]) {
                continue;
            } else {
                ans = Math.max(temp, ans);
                temp = 1;
            }
        }
        return Math.max(ans, temp);

    }
}
