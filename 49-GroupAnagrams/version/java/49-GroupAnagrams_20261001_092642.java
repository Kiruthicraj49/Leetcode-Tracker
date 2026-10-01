// Last updated: 01/10/2026, 09:26:42
1class Solution {
2    public List<List<String>> groupAnagrams(String[] strs) {
3        Map<String,List<String>> map = new HashMap<>();
4        for(String word : strs){
5            char[] chars = word.toCharArray();
6            Arrays.sort(chars);
7            String sorted = new String(chars);
8            if(!map.containsKey(sorted)){
9                map.put(sorted,new ArrayList<>());
10            }
11            map.get(sorted).add(word);
12        }
13        return new ArrayList<>(map.values());
14    }
15}