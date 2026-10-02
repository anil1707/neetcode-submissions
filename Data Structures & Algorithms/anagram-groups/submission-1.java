class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        List<List<String>> ans = new ArrayList<>();

        for(int i=0;i<strs.length;i++){
            char[] temp = strs[i].toCharArray();
            Arrays.sort(temp);
        
            String key = new String(temp);
            if(map.containsKey(key)){
                List<String> temp1 = map.get(key);
                temp1.add(strs[i]);
                map.put(key, temp1);
            } else {
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                map.put(key, list);
            }
        }

        for(List val: map.values()){
            ans.add(val);
        }
        return ans;
        
    }
}
