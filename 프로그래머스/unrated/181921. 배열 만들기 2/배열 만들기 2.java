import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int l, int r) {
		List<Integer> answer=new ArrayList<>();//저장할 공간
        
		
		for(int i=l;i<=r;i++){ //l<=n<=r의 정수
			String st_i=Integer.toString(i);//모든 정수
			int count=0;//수가바뀔때마다 count가 0으로 초기화되어야함. 0또는 5로 이뤄진 수의 개수
			for(int j=0;j<st_i.length();j++){
				
				char ch_i=st_i.charAt(j);
				
				
				if ((ch_i=='5') || (ch_i=='0')){
					count+=1;
				}
				
				//System.out.println("j : "+j+ " st_i : "+st_i+" ch_i : "+ch_i+" count : "+count);
				//count가 숫자의 길이와 같으면 해당 수는 0과 5로만 이루어진 수
				if(count==st_i.length()){
					answer.add(Integer.parseInt(st_i));

				}
			}

		}
		if(answer.isEmpty()){
			answer.add(-1);
		}
            
		//answer []으로 이동
		int[] answer_=new int[answer.size()];
		for(int i=0;i<answer.size();i++){
			answer_[i]=answer.get(i);
		}
       
    
		return answer_;
    }
}