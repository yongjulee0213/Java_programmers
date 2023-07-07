import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;


class Solution {
    public int solution(String my_string, String is_prefix) {
		
		List<String> ans_tmp=new ArrayList<>();
		
		
        for(int j=0;j<my_string.length();j++){
        	String tmp="";
        	//문자열을 어디까지보냐
        	for(int i=0;i<=j;i++){
    			tmp+=Character.toString(my_string.charAt(i));
    		}
        	
        	//StringBuffer sb_tmp=new StringBuffer(tmp);
        	//String reversed_tmp=sb_tmp.reverse().toString();//접미사용 리벌스
        	//System.out.println(reversed_tmp);
        	//ans_tmp.add(reversed_tmp);
        	ans_tmp.add(tmp);
        }
		
        //사전순 : 오름차순으로 정렬하기
        Collections.sort(ans_tmp);
        int result=0;
        //System.out.println(ans_tmp);
        if(ans_tmp.contains(is_prefix)){
        	
        	result=1;
        }
        
        
		return result;
	}
}