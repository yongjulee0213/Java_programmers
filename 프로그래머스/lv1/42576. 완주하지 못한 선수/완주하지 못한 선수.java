import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import java.util.Arrays;

class Solution {
public String solution(String[] participant, String[] completion) {
		Arrays.sort(participant);
		Arrays.sort(completion);
		LinkedList<String> participant_arr = new LinkedList<>(Arrays.asList(participant));
	
		for(int i=0;i<completion.length;i++){
				participant_arr.remove(participant_arr.indexOf(completion[i]));
		}
		
		StringBuffer answer=new StringBuffer();
		for(String s: participant_arr){
			answer.append(s);
		}
		
		return answer.toString();
	
    }
}