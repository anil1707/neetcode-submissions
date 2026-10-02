class Solution {
    /**
     * @param {number[]} nums
     * @param {number} k
     * @return {number[]}
     */
    topKFrequent(nums, k) {
        let map = new Map();
        for(let i=0;i<nums.length;i++){
            map.set(nums[i], (map.get(nums[i]) || 0) + 1);
        }
        let temp = [...map.entries()];
        temp.sort((a, b) => b[1] - a[1]);
        console.log("temp: ", temp)
        let ans = [];
        for(let i=0;i<k;i++){
            ans.push(temp[i][0]);
        }
        return ans;
    }
}
