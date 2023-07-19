import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

class Solution {
    public int[] solution(int k, int[] score) {
		
		List<Integer> score_board=new ArrayList<>();//일자별 최하위 순위만 저장하는 어레이
		List<Integer> score_day=new ArrayList<>(k);//내부리스트는 일자별 점수리스트이므로 k크기 할당
		int change_index=0;
		
		for(int i=0;i<score.length;i++){
			if(i<=k-1){//k일 전까지 모든 참가자가 rank
				score_day.add(score[i]);
			}
			else{//k일 이후 scroe[i]와 비교하여 대신 들어감
				
				for(int j=0;j<k;j++){//여러값이 비교되어 바뀌지 않게 하기위해 뒤에서부터-> 내림차순으로 바꾸면서 다시 정방향순서로
					if(score[i]>=score_day.get(j)){
						score_day.add(j,score[i]);//값 채우고 뒤에서 3개만 가져가기
						score_day=score_day.subList(0,k);//내림차순 k개 등수만 가져오기
						break;//for문 탈출
					}
					
				}
	
			}
			Collections.sort(score_day,Collections.reverseOrder());//내림차순으로 정렬
			score_board.add(score_day.get(score_day.size()-1));//일자 기록을 전체 보드에 붙이기
		}
		System.out.println(score_board);
		
		int[] answer=new int[score_board.size()];
		for(int i=0;i<score_board.size();i++){
			answer[i]=score_board.get(i);
		}
		return answer;
	}
}