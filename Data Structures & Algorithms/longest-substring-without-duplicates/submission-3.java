class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int i=0;
        int j=0;
        if(s.length() == 0) return 0;
        int ans = 1;
        while(i<s.length()){
            if(map.containsKey(s.charAt(i))){
                if(j <= map.get(s.charAt(i))){
                    ans = Math.max(ans, (i - j));
                    j = map.get(s.charAt(i))+1;
                }
                
                map.put(s.charAt(i), i);
                
            } else {
                map.put(s.charAt(i), i);
            }
            i++;
        }

        return Math.max(ans, i - j);
    }
}
