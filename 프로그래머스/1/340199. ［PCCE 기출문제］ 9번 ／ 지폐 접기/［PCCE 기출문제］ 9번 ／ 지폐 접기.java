class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        // 반복문(크기가 맞을 때까지)
        while(Math.min(bill[0], bill[1]) > Math.min(wallet[0], wallet[1]) || Math.max(bill[0], bill[1]) > Math.max(wallet[0], wallet[1])) {
            if(bill[0] > bill[1]) {
                bill = new int[]{bill[0] / 2, bill[1]};
            } else {
                bill = new int[]{bill[0], bill[1]/2};
            }
            answer += 1;
        }
        System.out.println("answer = " + answer);
        return answer;
    }
}