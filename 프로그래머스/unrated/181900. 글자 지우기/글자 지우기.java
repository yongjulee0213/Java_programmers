import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
class Solution {
    public String solution(String my_string, int[] indices) {
		String answer="";
		
		//contains를 쓰기위해 indices를 arraylist로 변경
		List<Integer> indices_=new ArrayList<>();
		for(int i=0;i<indices.length;i++){
			indices_.add(indices[i]);
		}
		Collections.sort(indices_);
		
		for(int i=0;i<my_string.length();i++){
			if(!indices_.contains(i)){
				answer+=Character.toString(my_string.charAt(i));
			}
		}
		return answer;
		
	}
}