import java.util.*;

class Solution {
    public long[] solution(int x, int n) {
        List<Long> list = new ArrayList<>();
        long num = x;
        for(int i=0; i<n; i++) {
            list.add(num);
            num += x;
        }
        long[] answer = list.stream().mapToLong(Long::longValue).toArray();
        return answer;
    }
}