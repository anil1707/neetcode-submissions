class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<List<Integer>> st = new Stack<>();
        int n = temperatures.length;
        st.push(List.of(temperatures[n-1], n-1));
        int[] ans = new int[n];
        int count = 0;
        ans[n-1] = 0;
        for(int i=n-2;i>=0;i--){

            while(!st.isEmpty() && temperatures[i] >= st.peek().get(0)){
                st.pop();
            }
            if(!st.isEmpty()){
                ans[i] =  st.peek().get(1) - i;
            } else {
                ans[i] = 0;
            }
            st.push(List.of(temperatures[i], i));

        }

        return ans;
    }
}
