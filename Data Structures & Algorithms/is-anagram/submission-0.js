class Solution {
    /**
     * @param {string} s
     * @param {string} t
     * @return {boolean}
     */
    isAnagram(s, t) {
        if(s.length != t.length) return false;
        let map = new Array(26).fill(0);
        for(let i=0;i<s.length;i++){
            let inx1 = s.charCodeAt(i) - "a".charCodeAt(0);
            let inx2 = t.charCodeAt(i) - "a".charCodeAt(0);
            map[inx1]++;
            map[inx2]--;
        }
        for(let i=0;i<26;i++){
            if(map[i] != 0) return false;
        }
        return true;
    }
}
