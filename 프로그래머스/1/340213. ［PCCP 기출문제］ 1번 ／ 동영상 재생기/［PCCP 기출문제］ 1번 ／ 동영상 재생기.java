class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        // 각종 시간들 초로 바꾸기
        String[] videoLenArray = video_len.split(":");
        int videoSecond = Integer.parseInt(videoLenArray[0]) * 60 + Integer.parseInt(videoLenArray[1]);

        String[] posArray = pos.split(":");
        int posSecond = Integer.parseInt(posArray[0]) * 60 + Integer.parseInt(posArray[1]);

        String[] opStartArray = op_start.split(":");
        int opStart = Integer.parseInt(opStartArray[0]) * 60 + Integer.parseInt(opStartArray[1]);

        String[] opEndArray = op_end.split(":");
        int opEnd = Integer.parseInt(opEndArray[0]) * 60 + Integer.parseInt(opEndArray[1]);

        if(posSecond >= opStart && posSecond <= opEnd) {
            posSecond = opEnd;
        }

        // commands 수행
        for(String c : commands) {
            if(c.equals("next")) {
                if(videoSecond - posSecond < 10) {
                    posSecond = videoSecond;

                } else {
                    posSecond += 10;
                }
            } else{
                // 현재 위치가 10보다 작으면
                if(posSecond < 10) {
                    posSecond = 0;
                } else {
                    posSecond -= 10;
                }
            }
            if(posSecond >= opStart && posSecond <= opEnd) {
                posSecond = opEnd;
            }
            System.out.println("posSecond = " + posSecond);
        }
        String minute = String.valueOf(posSecond / 60);
        if((int)(Math.log10(Double.parseDouble(minute)) + 1) == 1) {
            minute = "0" + minute;
        }

        String second = String.valueOf(posSecond % 60);
        if((int)(Math.log10(Double.parseDouble(second)) + 1) == 1) {
            second = "0" + second;
        }
        
        if(minute.equals("0")) {
            minute = "00";
        }


        if(second.equals("0")) {
            second = "00";
        }

        String answer = minute + ":" + second;
        System.out.println("answer = " + answer);
        return answer;
    }
}