import java.util.*;

class Solution {
    public long solution(long n) {
        String[] array = String.valueOf(n).split("");
        Arrays.sort(array, Collections.reverseOrder());
        
        String num = "";
        for(String s : array) {
            num += s;
        }
        
        long answer = Long.parseLong(num);
        return answer;
    }
}