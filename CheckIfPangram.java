import java.util.Map.Entry;
class Solution {
    public boolean checkIfPangram(String sentence) {
        Map<Character, Integer> map = new HashMap<>();
        for(var i = 'a'; i <= 'z'; i++) {
            map.put(i, 0);
        }
        for(char c : sentence.toCharArray()) {
            if(map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            }
        }

        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            if(entry.getValue() == 0) {
                return false;
            }
        }
        return true;
    }
}
