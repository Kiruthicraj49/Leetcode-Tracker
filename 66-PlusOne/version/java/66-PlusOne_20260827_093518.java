// Last updated: 27/08/2026, 09:35:18
1class Solution {
2    public boolean uniqueOccurrences(int[] arr) {
3        Map<Integer,Integer> freqMap = new HashMap<>();
4        for(int num:arr){
5            freqMap.put(num,freqMap.getOrDefault(num,0)+1);
6        }
7        Set<Integer> freqset = new HashSet<>(freqMap.values());
8        return freqMap.size() == freqset.size();
9    }
10}