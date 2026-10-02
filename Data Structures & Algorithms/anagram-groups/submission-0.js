class Solution {
    /**
     * @param {string[]} strs
     * @return {string[][]}
     */
    groupAnagrams(strs) {
        let map = new Map();
        let ans = [];
        for(let i=0;i<strs.length;i++){
            let key = strs[i].split("").sort().join("");
            if(map.has(key)){
                let list = map.get(key);
                list.push(strs[i]);
                map.set(key, list);
            } else {
                map.set(key, [strs[i]]);
            }
        }
        console.log([...map.values()])
        return [...map.values()];
    }
}
