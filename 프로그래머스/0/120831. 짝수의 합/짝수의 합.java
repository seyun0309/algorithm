import java.util.stream.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        return IntStream.range(1, n+1)
            .filter(i -> i%2==0)
            .sum();
        
    }
}