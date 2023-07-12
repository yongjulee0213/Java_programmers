import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int solution(int[] arr) {

        int[] tmp={};//연산 이전 임시 저장공간
        int x=0;//연산 카운트
        int result;//반환할 결과
        
        while(!Arrays.equals(tmp, arr)){
        	
        	tmp=arr.clone();//연산 전 리스트- 어레이를 통채로 넣어라는 안되네요해서 복사
        	
        	for(int i=0;i<arr.length;i++){//arr 원소 다 돌아서 연산
            	
            	
                
                if(arr[i]>=50 && arr[i]%2==0){//50보다 크거나 같은 짝수
                    arr[i]/=2;
                }
                else if(arr[i]<50 && arr[i]%2!=0){//50보다 작은 홀수
                    arr[i]=arr[i]*2+1;
                }
                
        	}   
        	
            //System.out.println(x+"이전 :"+Arrays.toString(tmp)+" 이후 :"+Arrays.toString(arr));//연산 이후 결과
            x++;//연산 카운트 증가
          //- arr과 arraylist의 연산비교가 가능할까? -> equals

        }
        
        return x-1;
    }
}