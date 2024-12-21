class Solution {
    public int solution(int n) {
        int answer = n;
        
        for(int i=2; i<=n; i++) {
            if(n % i == 1) {
                if(answer > i) {
                    answer = i;
                }
            }
        }
        
        return answer;
    }
}