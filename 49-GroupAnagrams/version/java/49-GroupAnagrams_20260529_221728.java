// Last updated: 29/05/2026, 22:17:28
1class Solution {
2    public List<List<String>> groupAnagrams(String[] strs) {
3        
4        if(strs == null || strs.length == 0) return new ArrayList<>();
5
6		Map<String,List<String>> anagramMap = new HashMap<>();
7
8		for(String s : strs){
9            
10			char [] sortedCharArray = s.toCharArray();
11            Arrays.sort(sortedCharArray);
12            String sortedString = new String(sortedCharArray);
13            anagramMap.putIfAbsent(sortedString,new ArrayList<>());
14            anagramMap.get(sortedString).add(s);
15		}
16
17		return new ArrayList<>(anagramMap.values());
18    }
19}
20