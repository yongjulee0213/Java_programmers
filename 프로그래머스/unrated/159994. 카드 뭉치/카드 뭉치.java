import java.util.ArrayList;
import java.util.List;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
		
		String answer="Yes";
		
		List<String> cards1_arr=new ArrayList<>();
		List<String> cards2_arr=new ArrayList<>();
		for(String st : cards1){
			cards1_arr.add(st);
		}
		for(String st : cards2){
			cards2_arr.add(st);
		}
		
		System.out.println(cards1_arr+" "+cards2_arr);
		
		//0번째씩 뽑아서 비교하고 지우고
		for(int i=0;i<goal.length;i++){
			
			if(cards1_arr.contains(goal[i])){//goal의 단어가 cards1에 있다면
				
				if(cards1_arr.get(0).equals(goal[i])){//cards의 맨 앞과 찾으려는 goal의 단어가 같다면
					cards1_arr.remove(0);
					
				}
				else{
					answer="No";
					break;
				}
			}
			
			else{//goal의 단어가 cards2에 있다면
				if(cards2_arr.get(0).equals(goal[i])){//cards의 맨 앞과 찾으려는 goal의 단어가 같다면
					cards2_arr.remove(0);
					
				}
				else{
					answer="No";
					break;
				}
			}
			
		}
		
		return answer;
        
    }
}