import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

class Solution {
    public int[] solution(int n, int k) {
		List<Integer> nums=new ArrayList<>();
		
		for(int i=1;i<=n;i++){
			if(i%k==0){
				nums.add(i);
			}
		}
		Collections.sort(nums);//정렬

		
		int[] answer=new int[nums.size()];
		for(int i=0;i<nums.size();i++){
			answer[i]=nums.get(i);
		}
		//System.out.println(Arrays.toString(answer));
		return answer;
		
	}
}