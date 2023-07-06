import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> stk=new ArrayList<>();//list to return
		int i=0;//i를 만들어 초기값으로 0으로 설정

		while(i<arr.length){
			if(stk.isEmpty()){//stk가 빈 배열이라면
				
				stk.add(arr[i]);//arr[i]를 stk i위치에 추가하고
				//System.out.println(stk);
				i+=1;//i에 1을 더합니다
			}
			else{
				if(stk.get(stk.size()-1)<arr[i]){
					stk.add(arr[i]);//stk의 뒤에 추가
					i+=1;//1더하기
				}
				else{
					stk.remove(stk.size()-1);//마지막 원소 삭제
				}
			}
		}
		
		int[] answer=new int[stk.size()];
		for(int j=0;j<stk.size();j++){
			answer[j]=stk.get(j);
		}
		return answer;
    }
}