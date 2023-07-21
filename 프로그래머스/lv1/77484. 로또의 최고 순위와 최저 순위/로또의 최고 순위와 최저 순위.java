import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
		
		//미지수의 수 세기 + contain 함수 사용을 위해 어레이로 변환
		int cnt_unknown=0;
		List<Integer> lottos_arr=new ArrayList<>();
		for(int l: lottos){
			lottos_arr.add(l);//어레이에저장
			if(l==0){
				cnt_unknown++;
			}
			
		}
		
		//최저등수 구하기
		//일반 리스트는 contains가 안된다!
		int cnt_same=0;
		
		for(int i=0;i<win_nums.length;i++){
			if(lottos_arr.contains(win_nums[i])){
				cnt_same++;
			}
		}
		System.out.println(cnt_unknown+ " "+cnt_same);
		int rank_min=find_rank(cnt_same);
		int rank_max=find_rank(cnt_same+cnt_unknown);
		
		int[] answer={rank_max,rank_min };//최고 등수, 최저등수
		return answer;
		
    }
	
	public int find_rank(int cnt_correct){
		switch(cnt_correct){
			case 6:
				return 1;
			case 5:
				return 2;
			case 4:
				return 3;
			case 3:
				return 4;
			case 2:
				return 5;
			default:
				return 6;
		}
	}
}