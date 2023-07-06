import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        
		List<Integer> st_nums=new ArrayList<>();//리턴할 정답 리스트
        
		for(int j=0;j<intStrs.length;j++){
			String st_num="";//인덱스가 바뀔때마다 st_num초기화
			for(int i=s;i<s+l;i++){
				st_num+=Character.toString(intStrs[j].charAt(i));//s부터 l만큼의 문자열
				
				//System.out.println(i+" " +st_num);
			}
			int num=Integer.parseInt(st_num);
			if(num>k){//k보다 st_num이 커야 가져오기
				st_nums.add(num);
			}
			
		}
		
		//일반 배열로 바꾸기
		int[] answer=new int[st_nums.size()];//복사할 배열의 크기만한 빈 배열 만들기
		for(int i=0;i<st_nums.size();i++){
			answer[i]=st_nums.get(i);
		}
		return answer;
        
    }
}