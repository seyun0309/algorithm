import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        Map<Integer, Integer> map = new HashMap<>();
        
        int[] sortedArr = emergency.clone();
        
        Arrays.sort(sortedArr);
        for (int i = 0; i < sortedArr.length / 2; i++) {
            int temp = sortedArr[i];
            sortedArr[i] = sortedArr[sortedArr.length - i - 1];
            sortedArr[sortedArr.length - i - 1] = temp;
        }
        
        int i = 1;
        for (int e : sortedArr) {
            map.put(e, i++);
        }

        for (int j = 0; j < emergency.length; j++) {
            answer[j] = map.get(emergency[j]);
        }
        
        return answer;
    }
    
    public static void reverseSort(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }
}