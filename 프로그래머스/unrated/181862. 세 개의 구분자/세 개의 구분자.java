import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public String[] solution(String myStr) {
		
		myStr=myStr.replace("a", " ");
		myStr=myStr.replace("b", " ");
		myStr=myStr.replace("c", " ");
		
		//System.out.println(myStr);
		
		String[] tmp=myStr.split(" ");
		//System.out.println(Arrays.toString(tmp));
		List<String> tmp_=new ArrayList<>();
		for(int i=0;i<tmp.length;i++){
			tmp_.add(tmp[i]);
		}
		
		List<String> remove=new ArrayList<>();//지울 것 넣어두기
		remove.add("");
		//System.out.println(remove);
		tmp_.removeAll(remove);
		
		
		if(tmp_.size()>0){
			String[] answer=new String[tmp_.size()];
			for(int i=0;i<tmp_.size();i++){
				answer[i]=tmp_.get(i);
			}
			return answer;
		}
		else{
			String[] answer={"EMPTY"};
			return answer;
		}
	
		
		
	}
}