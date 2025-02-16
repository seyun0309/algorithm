import java.util.stream.IntStream;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        return IntStream.range(1, n+1)
            .filter(i -> i%2==1)
            .toArray();
    }
}