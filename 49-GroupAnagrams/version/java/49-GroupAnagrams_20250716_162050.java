// Last updated: 16/07/2025, 16:20:50
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, ArrayList<String>> map = new HashMap<>();

            for(String s: strs) {
                
                char[] c = s.toCharArray();
                Arrays.sort(c);
                String s2 = new String(c);

                map.putIfAbsent(s2,new ArrayList<>());
                map.get(s2).add(s);

            }

            return new ArrayList<>(map.values());
    }
}