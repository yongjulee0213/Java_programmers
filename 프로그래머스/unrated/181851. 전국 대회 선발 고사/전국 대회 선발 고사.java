import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
class Solution {

    public int solution(int[] rank, boolean[] attendance) {
		
		 //System.out.println(rank.length);
		 int[] result=new int[rank.length+1];//참여할사람만 거르는 리스트 생성
		 Arrays.fill(result,100);//fill은 일반리스트만 쓸 수 있음
		 //System.out.println(Arrays.toString(result));
		 
		//참여할사람만 거르는 리스트를 어레이 리스트로 변경
		 List<Integer> result_=new ArrayList<>();
		 for(int i=0;i<result.length;i++){
			 result_.add(result[i]);
		 }
		 System.out.println(result_);
	     //참여할 수 있는 학생들을 랭킹을 인덱스로 학생번호를 채우기
		 for(int i=0;i<rank.length;i++){
			 if(attendance[i]){
				 //System.out.println(rank[i]+" "+i+" "+attendance[i]);
				 result_.set(rank[i],i);//어디에 뭐를 채우기
				 //System.out.println(result_);
			 }
		}

		//학생번호가 없는 랭크 제외하고 최종 랭크 만들기
		 List<Integer> delete=new ArrayList<>();//지울 것 넣어두기
		 delete.add(100);
		 result_.removeAll(delete);
		 //System.out.println(result_);
		
		
		return result_.get(0)*10000+result_.get(1)*100+result_.get(2);

	}

}