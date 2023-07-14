import java.lang.Math;
import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr) {
        
        //arr의 길이보다 크거나 같은 2의 제곱을 구하기
        int n=0;
        int size=(int)Math.pow(2,n);//pow는 float이므로 형변환해줘야함.
        while(arr.length>size){
            size=(int)Math.pow(2,n);//size 업데이트
            n++;
        }
        
        int[] answer=new int[size];
        Arrays.fill(answer, 0);
        for(int i=0;i<arr.length;i++){
            answer[i]=arr[i];
        }
        return answer;
    }
}