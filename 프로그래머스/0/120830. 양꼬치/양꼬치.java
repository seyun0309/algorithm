class Solution {
    public int solution(int n, int k) {
        int service = n/10;
        
        int answer = n*12000 - service*2000 + k*2000;
        
        return answer;
    }
}