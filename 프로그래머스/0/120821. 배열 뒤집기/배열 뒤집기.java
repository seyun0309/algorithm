import java.util.stream.*;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        
        for(int i=num_list.length-1; i>=0; i--) {
            answer[answer.length-i-1] = num_list[i];
        }
        
        return answer;
        // return IntStream.range(0, num_list.length)
        //         .map(i -> num_list[num_list.length - 1 - i])
        //         .toArray();
    }
}