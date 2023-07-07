import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        
		String answer="";
		//첫번째 문자열에서 {0,4}까지가져오기
		for(int i=0;i<my_strings.length;i++){
			List<String> tmp=new ArrayList<>();//문자열 저장공간
			int s=parts[i][0];
			int l=parts[i][1];
			
			for(int j=s;j<=l;j++){
				answer+=Character.toString(my_strings[i].charAt(j));//만든 문자열 저장
			}
			//System.out.println(answer);
		}
		return answer;
    }
}