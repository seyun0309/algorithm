import java.util.*;

class Solution {
    public int solution(int[] array) {
        int count = 0;
        int answer = 0;
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int a : array) {
            map.put(a, map.getOrDefault(a, 0) +1);
        }
        
        int max = Collections.max(map.values());
        
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() == max) {
                count++;
                answer = entry.getKey();
            }
        }
        
        return count > 1 ? -1 : answer;
    }
}