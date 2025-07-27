// Last updated: 27/07/2025, 15:46:08
class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        if(nums.length==1) return nums;

        Map<Integer,Integer> map = new HashMap<>();

        for(int i:nums){
            
            map.put(i,map.getOrDefault(i,0)+1);            
        }
        
        List<Integer>[] counts  = new List[nums.length+1];
	for(int ctr=0; ctr<counts.length;ctr++){
		counts[ctr]= new ArrayList<>();
	}

       
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            counts[entry.getValue()].add(entry.getKey());
        }
        int [] results = new int[k]; //1
        int n = 0;
        for(int m=counts.length-1;m>0&&n<k;m--){
            for(int index:counts[m]){  
                results[n] = index;
                n++;
	     if( n == k ) return results;
		
            }
            
        }

        return results;
    }
}