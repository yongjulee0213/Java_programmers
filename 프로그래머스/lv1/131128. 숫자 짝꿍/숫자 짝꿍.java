import java.util.Arrays;
class Solution {
        public String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();//리턴할 문자열 저장 : 시간 초과를 방지하기 위해 스트링버퍼 사용
        
        int[] x = {0,0,0,0,0,0,0,0,0,0};
        int[] y = {0,0,0,0,0,0,0,0,0,0};
        
        //인덱스를 수로 받고 밸류를 해당 수가 얼마만큼 나왔는지를 보여줌
        //0의 아스키코드가 48인데 character값에서 48을 빼면 해당 맞는 int값으로 변환
        for(int i=0; i<X.length();i++){
           x[X.charAt(i)-48] += 1;
           
        }
        for(int i=0; i<Y.length();i++){
           y[Y.charAt(i)-48] += 1;
           
        }
        //가장 큰 수가 맨뒤에있으므로 --로 내림차순으로 정렬
        //x와 y의 길이에 따라 총 길이가 달라지는데 이때 Math.min(a,b)를 사용하면된다.
        for(int i=9; i >= 0; i--){
            for(int j=0; j<Math.min(x[i],y[i]); j++){
                answer.append(i);
            }
        }
        
        if("".equals(answer.toString())){//아무것도 없다면
           return "-1";
        }
        else if(answer.toString().charAt(0)==48){//첫글자가 0이라면
           return "0";
        }
        else {
            return answer.toString();
        }
    }
}