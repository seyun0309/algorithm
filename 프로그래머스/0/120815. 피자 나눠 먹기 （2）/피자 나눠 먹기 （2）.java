class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i=6; i<=300; i+=6) {
            if(i%n==0) return i/6;
        }
        return answer;
    }
}