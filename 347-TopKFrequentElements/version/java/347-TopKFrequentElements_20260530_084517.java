// Last updated: 30/05/2026, 08:45:17
1class Solution {
2    public int[] topKFrequent(int[] nums, int k) {
3      List<Integer>[] buckets = new List[nums.length+1];
4
5	  Map<Integer,Integer> frequencyMap = new HashMap<>();
6
7	  for(int i : nums){
8		frequencyMap.put(i,frequencyMap.getOrDefault(i,0)+1);
9	  }
10
11	  for(Map.Entry<Integer,Integer> entry: frequencyMap.entrySet())
12	  {
13		int frequency = entry.getValue();
14		if(buckets[frequency]==null) {
15			buckets[frequency]=new ArrayList<>();
16		}
17		buckets[frequency].add(entry.getKey());
18	  }
19
20	  int[] res = new int[k];
21	  int count=0;
22	  for(int index = buckets.length-1;index>0&&count<k;index--){
23			if(buckets[index]!=null){
24				for(Integer integer: buckets[index]){
25					res[count++]=integer;
26				}
27			}
28			
29		}
30		return res;
31    }
32}