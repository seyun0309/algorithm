class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        StringBuffer sb = new StringBuffer(my_string);
        answer = sb.reverse().toString();
        
        // for(int i=my_string.length()-1; i>=0; i--) {
        //     answer += my_string.charAt(i);
        // }
        
        return answer;
    }
}