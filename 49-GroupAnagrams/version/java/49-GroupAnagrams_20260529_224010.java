// Last updated: 29/05/2026, 22:40:10
1class Solution {
2
3    public List<List<String>> groupAnagrams(String[] strs) {
4
5		if(strs == null || strs.length == 0 ) return new ArrayList<>();
6
7		Map<String,List<String>> anagramMap = new HashMap<>();
8
9		for(String str : strs){
10			String frequencyString = getFrequencyString(str);
11
12			anagramMap.putIfAbsent(frequencyString, new ArrayList<>());
13			anagramMap.get(frequencyString).add(str);
14
15		}
16
17		return new ArrayList<>(anagramMap.values());
18		
19    }
20
21
22	private String getFrequencyString(String str){
23
24		int[] frequencyArray= new int[26];
25
26		char [] charArray = str.toCharArray();
27
28		for(char c : charArray){
29			int charIndex = c - 'a';
30			frequencyArray[charIndex]++;
31		}
32
33		StringBuilder strBuilder = new StringBuilder();
34
35		for(int freqIndex=0; freqIndex < frequencyArray.length ;freqIndex++){
36			if(frequencyArray[freqIndex] == 0){ continue; }
37
38			char ch = (char) ('a' + freqIndex);
39
40			strBuilder.append(ch);
41			strBuilder.append(frequencyArray[freqIndex]);
42		}
43
44		return strBuilder.toString();
45	}
46}