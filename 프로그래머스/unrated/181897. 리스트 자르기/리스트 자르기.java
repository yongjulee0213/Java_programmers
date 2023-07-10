import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
		
		List<Integer> result=new ArrayList<>();
		
		int a=slicer[0];
		int b=slicer[1];
		int c=slicer[2];
		
		int i;
		int start=0;
		int end=0;
		int iter=1;//기본값
		
		switch(n){
			case 1:
				start=0;
				end=b+1;
				break;
			
			case 2:
				start=a;
				end=num_list.length;
				break;
			
			case 3:
				start=a;
				end=b+1;
				break;
			
			case 4:
				start=a;
				end=b+1;
				iter=c;
				break;
				
		}
		//System.out.println(n+" "+start+" "+end+" "+iter);
		for(i=start;i<end;i+=iter){
			result.add(num_list[i]);
		}
		System.out.println(result);
		
		int[] answer=new int[result.size()];
		for(int j=0;j<result.size();j++){
			answer[j]=result.get(j);
		}
		return answer;
		
	}
}