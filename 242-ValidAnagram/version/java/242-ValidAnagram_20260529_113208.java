// Last updated: 29/05/2026, 11:32:08
1class Solution {
2public boolean isAnagram(String s, String t) {
3
4    if (s.length() != t.length()) return false;
5	Map<Character,Integer> anagramsMap = new HashMap<>();		
6
7	for(char character : s.toCharArray()){
8		anagramsMap.put(character, anagramsMap.getOrDefault(character, 0)+1);
9	}
10
11	for(char targetChar : t.toCharArray()){
12        
13        int count = anagramsMap.getOrDefault(targetChar,0);
14        if (count == 0) return false;
15
16        anagramsMap.put(targetChar, count - 1);
17	}
18
19    return true;
20}
21}