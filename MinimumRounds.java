import java.util.Map.Entry;

class Solution {
    public int minimumRounds(int[] tasks) {
        int round = 0;
        Map<Integer, Integer> map = new HashMap();
        for(int i : tasks) {
            if(map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            }
            else {
                map.put(i,1);
            }
        }
        for(Entry<Integer, Integer> set : map.entrySet()) {
        	if(set.getValue() == 1) { 
        		return -1;
        	}
            else {
                if(set.getValue() % 3 == 0) {
                    round = round + (set.getValue()/3);
                } else {
                    round = round + (set.getValue()/3) + 1;
                }
            } 
        }
        return round;
    }
}
