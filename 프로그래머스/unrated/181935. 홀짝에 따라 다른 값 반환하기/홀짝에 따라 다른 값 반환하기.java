import java.lang.Math; //pow를 사용하기 위한 라이브러리 임포트

class Solution {
    public int solution(int n) {
        int result=0;
        //1. n이홀수라면 n이하의 홀수의 모든 양의 정수의 합 리턴
        if (n%2!=0){
            for (int i=0;i<=n;i++){
                if(i%2!=0){
                    result+=i;
                }
            }
        }
        
        //2. n이 짝수라면 n이하의 짝수인 모든 양의 정수의 제곱의 합을 return
        else{
            for(int i=0;i<=n;i++){
                if(i%2==0){
                    result+=Math.pow(i,2);
                }
            }
        }
        
        //3. 답 리턴
        return result;
    }
}