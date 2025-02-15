import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int[] sortedArray = Arrays.stream(array)
            .sorted()
            .toArray();
        
        return sortedArray[sortedArray.length/2];
    }
}