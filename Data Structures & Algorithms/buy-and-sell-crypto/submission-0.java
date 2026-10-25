class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int max = prices[n-1];
        int ans = 0;
        for(int i=n-2;i>=0;i--){
            if(prices[i] >= max){
                max = prices[i];
            } else {
                ans = Math.max((max - prices[i]), ans);
            }
        }
        return ans;
    }
}
