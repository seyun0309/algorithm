class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        
        // 최소공배수 찾기
        int lcm = (denom1 * denom2) / gcd(denom1, denom2);
        
        // 분자 계산
        int newNumer = (numer1 * (lcm / denom1)) + (numer2 * (lcm / denom2));

        // 기약분수
        int gcdValue = gcd(newNumer, lcm);

        return new int[]{newNumer / gcdValue, lcm / gcdValue};
    }
    
    // 최대공약수 : 유클리드 호제법
    public int gcd(int a, int b) {
        if(b == 0) return a;
        
        return gcd(b, a%b);
    }
}