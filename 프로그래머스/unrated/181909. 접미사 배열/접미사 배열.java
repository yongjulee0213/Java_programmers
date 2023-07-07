import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
class Solution {
    public String[] solution(String my_string) {
		
		List<String> ans_tmp=new ArrayList<>();
		
		
        for(int j=0;j<my_string.length();j++){
        	String tmp="";
        	//문자열을 어디까지보냐
        	for(int i=my_string.length()-1;i>=j;i--){
    			tmp+=Character.toString(my_string.charAt(i));
    		}
        	
        	StringBuffer sb_tmp=new StringBuffer(tmp);
        	String reversed_tmp=sb_tmp.reverse().toString();
        	//System.out.println(reversed_tmp);
        	ans_tmp.add(reversed_tmp);
        }
		
        //사전순 : 오름차순으로 정렬하기
        Collections.sort(ans_tmp);
        
        //일반 리스트로 바꾸기
        String[] answer= new String[ans_tmp.size()];
        for(int i=0;i<ans_tmp.size();i++){
        	answer[i]=ans_tmp.get(i);
        }
		return answer;
	}
}