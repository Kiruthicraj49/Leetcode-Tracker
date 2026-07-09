// Last updated: 09/07/2026, 15:07:29
class Solution {
    public boolean isAnagram(String s, String t) {
        // if(s.length() != t.length()){
        //     return false;
        // }
        // char[] a = s.toCharArray();
        // char[] b = t.toCharArray();
        // Arrays.sort(a);
        // Arrays.sort(b);
        // return Arrays.equals(a,b);



        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(char ch : t.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)-1);
        }
        for(int x : map.values()){
            if(x!=0) return false;
        }
        return true;
    }
}