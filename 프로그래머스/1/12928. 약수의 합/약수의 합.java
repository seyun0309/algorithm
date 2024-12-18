class Solution {
    public int solution(int n) {
        int m = 1;
        int answer = 0;
        while(m <= n) {
            if(n % m == 0) {
                answer += m;
            }
            m++;
        }
        return answer;
    }
}