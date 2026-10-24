class Solution {
    public int maxArea(int[] heights) {
        int i=0;
        int j=heights.length-1;
        int ans = 0;
        while(i<=j){
            int tempAns = 0;
            if(heights[i] > heights[j]){
                tempAns = Math.min(heights[i], heights[j]) * (j-i);
                j--;
            } else if(heights[i] == heights[j]){

                tempAns = heights[i] * (j-i);
                i++;

            } else {
                tempAns = Math.min(heights[j], heights[i]) * (j - i);
                i++;
            }
            ans = Math.max(ans, tempAns);
        }

        return ans;
    }
}
