// Last updated: 29/05/2026, 11:13:42
1class Solution {
2    public boolean isAnagram(String s, String t) {
3        Map<Character,Integer> anagram = new HashMap<>();
4
5        for(char c: s.toCharArray())
6        {
7            anagram.put(c, anagram.getOrDefault(c,0)+1);
8        }
9
10        for(char j: t.toCharArray()){
11            if(!anagram.containsKey(j)) return false;
12
13            anagram.put(j, anagram.get(j)-1);
14
15            if(anagram.get(j) == 0){
16                anagram.remove(j);
17            }
18        }
19
20        return anagram.size()==0;
21    }
22}