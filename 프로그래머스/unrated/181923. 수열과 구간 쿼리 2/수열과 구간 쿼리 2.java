import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
		List<Integer> answer = new ArrayList<>(); // 임시 리스트

		// s<=i<=e를 위한 s,e 찾기
		for (int i = 0; i < queries.length; i++) {
			int s = queries[i][0];
			int e = queries[i][1];
			int k = queries[i][2];

			// s~e 만들기 : 쪼개져 있는 리스트마다
			List<Integer> tmp=new ArrayList<>();
			for (int j = s; j <= e; j++) {
				if (arr[j] > k) { // k보다 큰 것만
					tmp.add(arr[j]);
				}
			}
			
			//비었다면 -1 추가
			if(!tmp.isEmpty()){
				answer.add(Collections.min(tmp));
			}
			else{
				answer.add(-1);
			}
		}
		int [] result=new int[answer.size()];//리턴하기 위해 answer을 []로 만듦
		for(int i=0;i<answer.size();i++){
			result[i]=answer.get(i);
		}
		return result;
	}
}