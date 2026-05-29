// Last updated: 29/05/2026, 11:19:24
1class Solution {
2public boolean isAnagram(String s, String t) {
3
4	Map<Character,Integer> anagramsMap = new HashMap<>();		
5
6	for(char character : s.toCharArray()){
7		anagramsMap.put(character, anagramsMap.getOrDefault(character, 0)+1);
8	}
9
10	for(char targetChar : t.toCharArray()){
11        if(!anagramsMap.containsKey(targetChar)) return false;
12
13		
14		anagramsMap.put(targetChar,anagramsMap.get(targetChar)-1);
15		
16		if(anagramsMap.get(targetChar) == 0){
17		     anagramsMap.remove(targetChar);
18		}
19	}
20
21    return anagramsMap.size() == 0;
22}
23}