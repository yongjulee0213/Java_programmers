import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int[][] intervals){
		
		List<Integer> result=new ArrayList<>();
		
		for(int i=0;i<intervals.length;i++){
			int a=intervals[i][0];
			int b=intervals[i][1];
			
			for(int j=a;j<=b;j++){
				result.add(arr[j]);
			}
		}
		int[] answer=new int[result.size()];
		for(int i=0;i<result.size();i++){
			answer[i]=result.get(i);
		}
		return answer;
	}
}