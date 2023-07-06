import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int n) {
		
		List<Integer> collatz=new ArrayList<>();//리턴할 콜라츠 수열
		collatz.add(n);//시작하는 수도 넣어줌
		while (n!=1){
			
			if(n%2==0){//짝수면 2로 나누고
				n/=2;
			}
			else{//홀수면 3*x+1
				n=3*n+1;
			}
			collatz.add(n);
		}
		//일반 리스트로 변경
		int[] answer=new int[collatz.size()];
		for(int i=0;i<collatz.size();i++){
			answer[i]=collatz.get(i);
		}
		
		return answer;

    }
}