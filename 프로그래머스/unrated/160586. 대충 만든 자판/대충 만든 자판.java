import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
		
		//1. {알파벳, 키 누르는 최소횟수} map 만들기
		Map<Character, Integer> cnt_map=new HashMap<>();
		
		for(String s: keymap){
			for(int i=0;i<s.length();i++){
				if(!cnt_map.containsKey(s.charAt(i))){//맴에 키값으로 문자가 없다면
					cnt_map.put(s.charAt(i),i+1);//(알파벳,횟수)넣기 인덱스가 0부터 시작하므로 인덱스+1이 횟수가 됨
				}
				else{//있다면
					if(cnt_map.get(s.charAt(i))>i+1){//get으로 키에 해당하는 값 가지고 나와서 지금 위치에서의 횟수랑 비교
						cnt_map.put(s.charAt(i),i+1);//지금횟수가 더 작다면 업데이트
					}
				}
			}
		}
		System.out.println(cnt_map);
		
		//2. target돌면서 버튼 누른횟수 누적시키기
		List<Integer> result=new ArrayList<>();
		for(String s: targets){
			int sum=0;
			
			for(int i=0;i<s.length();i++){
				if(cnt_map.containsKey(s.charAt(i))){//키맵에 있는 문자가 들어오면
					sum+=cnt_map.get(s.charAt(i));//키갑에 해당하는 값인 횟수를 가져와서 누적
				}
				else{
					sum=-1;
                    break;
				}
			}
			
			result.add(sum);
		}

		int[] answer=new int[result.size()];
		for(int i=0;i<result.size();i++){
			answer[i]=result.get(i);
		}
		return answer;
		
    }
}