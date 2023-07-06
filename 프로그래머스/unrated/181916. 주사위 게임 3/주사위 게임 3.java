import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Arrays;
import java.util.Set;

class Solution {
    public int solution(int a, int b, int c, int d) {
		
		int score=0;//점수 초기화
		List<Integer> lst=new ArrayList<>(Arrays.asList(a,b,c,d));//조건가져와 리스트 만들기
		Set<Integer> set_lst=new HashSet<>(lst);//조건 중복제거
		List<Integer> newlst=new ArrayList<>(set_lst);//중복제거한 조건 최종 리스트
		
		//System.out.println(newlst);
		
		//모두 다를 경우
		if(newlst.size()==4){
			score=Collections.min(lst);
		}
		//모두 같을 경우 newlst에 1개만 남음
		else if(newlst.size()==1){
			score=1111*a;
		}
		
		//두개 같고 하나 다를때는 3개 남음
		else if(newlst.size()==3){
			//뭐가 중복되었는지를 확인해야한다. 리스트끼리의 뺼셈불가->frequency
			int score_=1;
			int count_0=Collections.frequency(lst,newlst.get(0));
			int count_1=Collections.frequency(lst, newlst.get(1));
			int count_2=Collections.frequency(lst, newlst.get(2));
			
			if(count_0==1){
				score_*=newlst.get(0);
			}
			if(count_1==1){
				score_*=newlst.get(1);
			}
			if(count_2==1){
				score_*=newlst.get(2);
			}
			score=score_;
		}
		//세개가 같거나 2개씩 같을때  newlst에 2개 남음
		else if(newlst.size()==2){
			
			//뭐가 중복되었는지를 확인해야한다. 리스트끼리의 뺼셈불가->frequency
			int count_0=Collections.frequency(lst,newlst.get(0));//갯수
			int count_1=Collections.frequency(lst, newlst.get(1));
			
			if(count_0==3 || count_1==3){//세개가 같을때
				if (count_0>count_1){
					score=(int) Math.pow(newlst.get(0)*10+newlst.get(1),2);
				}
				else{
					score=(int) Math.pow(newlst.get(1)*10+newlst.get(0),2);
				}
			}
			
			else{

				System.out.println(count_0 +" "+count_1);
				score=(newlst.get(0)+newlst.get(1))*Math.abs(newlst.get(0)-newlst.get(1));
			}
			
		}
		
		//2개씩 같을때
		return score;
    }
}