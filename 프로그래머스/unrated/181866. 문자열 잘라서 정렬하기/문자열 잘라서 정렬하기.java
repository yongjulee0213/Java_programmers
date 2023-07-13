import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

class Solution {
    public String[] solution(String myString){
        
		String[] tmp=myString.split("x");
		List<String> tmp_=new ArrayList<>();
		for(int i=0;i<tmp.length;i++){
			tmp_.add(tmp[i]);
		}
		System.out.println(Arrays.toString(tmp));
		
		
		List<String> remove=new ArrayList<>();//지울 것 넣어두기
		remove.add("");
		System.out.println(remove);

		List<String> result=new ArrayList<>(tmp_);//최종리스트
		result.removeAll(remove);//x제외한 리스트에공백이 생기는 경우 문제가 원하는 답이 아님
		Collections.sort(result);//사전식 정렬
		System.out.println(result);
		
		String[] answer=new String[result.size()];
		for(int i=0;i<result.size();i++){
			answer[i]=result.get(i);
		}
        
	    return answer;
        }
}