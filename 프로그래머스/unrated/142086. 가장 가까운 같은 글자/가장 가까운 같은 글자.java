import java.util.ArrayList;
import java.util.List;
class Solution {
    public int[] solution(String s) {
		
		List<String> tmp =new ArrayList<>();//문자 뽑아서 저장
		List<Integer> result=new ArrayList<>();//리턴할 값들 리스트
		
		for(int i=0;i<s.length();i++){
			String ch=Character.toString(s.charAt(i));//문자열에서 문자 뽑아서
			
			
			if(!tmp.contains(ch)){//뽑은문자가 문자열리스트에 없다면
				result.add(-1);//-1을 값 리스트에 넣는다.
			}
			else{//이미 존재하는 문자라면
				result.add(i-tmp.lastIndexOf(ch));//현재인덱스에서-뒤쪽부터검색한인덱스를 값 리스트에 넣는다.
			}
			tmp.add(ch);//뽑은 문자를 문자열 리스트에 넣는다.
		}
		//System.out.println(result);
		
		int[] answer=new int[result.size()];
		for(int i=0;i<result.size();i++){
			answer[i]=result.get(i);
		}
		return answer;
		

	}
}