class Solution {
    public static boolean checkValidity(int avg, int[] piles, int h){
        int hours = 0;
        long ans = 0;
        for(int i=0;i<piles.length;i++){
            int pile = piles[i];
            int rem = pile % avg;
            int tempAns = (pile/avg);
            if(rem > 0){
                ans += 1;
            }
            ans += tempAns;

        }

        return ans > h ? false : true;
    }

    public static int[] minMax(int[] piles){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++){
            max = Math.max(max, piles[i]);
            min = Math.min(min, piles[i]);
        }
        return new int[]{max, min};
    }
    public int minEatingSpeed(int[] piles, int h) {
        int[] minMaxAns = minMax(piles);
        int min = 1;
        int max = minMaxAns[0];
        int ans = 0;
        while(min<=max){
            int mid = (min + max)/2;
            boolean isValid = checkValidity(mid, piles, h);
            if(isValid){
                ans = mid;
                max = mid-1;
            } else {
                min = mid + 1;
            }
        }
        return ans;
    }
}
