class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int sCount = 0;
        int yCount = 0;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == 'p' || s.charAt(i) == 'P') {
                sCount++;
            }
            if(s.charAt(i) == 'y' || s.charAt(i) == 'Y') {
                yCount++;
            }
        }
        if(sCount == 0 && yCount == 0) {
            return answer;
        } else if (sCount != yCount) {
            answer = false;
        }
        
        return answer;
    }
}