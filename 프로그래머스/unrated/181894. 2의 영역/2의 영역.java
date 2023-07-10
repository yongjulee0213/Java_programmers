import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] arr){
		
		List<Integer> result=new ArrayList<>();
		List<Integer> lst_2=new ArrayList<>();
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]==2){
				lst_2.add(i);//2를 가진 인덱스 넣기
			}

		}
		if(lst_2.size()==0){
			int[] answer={-1};
			return answer;
		}
		else{
			int start=lst_2.get(0);
			int end=lst_2.get(lst_2.size()-1);
			
			for(int i=start;i<=end;i++){
				result.add(arr[i]);
			}

			int[] answer=new int[result.size()];
			
			for(int i=0;i<result.size();i++){
				answer[i]=result.get(i);
			}
			return answer;
		}
		
		
	}
}