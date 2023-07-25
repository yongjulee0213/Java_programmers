import java.util.ArrayList;
import java.util.List;

class Solution {
  public String solution(String s, String skip, int index) {
		
		//넘길 문자열 저장
		List<Integer> skip_ascii=new ArrayList<>();
		for(int i=0;i<skip.length();i++){
			skip_ascii.add((int)skip.charAt(i)-97);
		}
		//System.out.println("넘겨문자: "+skip_ascii);
		
		StringBuffer result=new StringBuffer();//리턴할 최종 문자열 저장
		
		for(int i=0;i<s.length();i++){
			
			int ch_ascii=((int)s.charAt(i)-97)%26;//문자 정수형(0~25)으로 바꾸기
			//System.out.println("시작 "+ch_ascii+s.charAt(i));
			int cnt=0;//이동횟수 저장
			
			while(cnt<index){
				
				
				ch_ascii++;//인덱스증가 어차피 스킵하든안하든 증가는 시켜야함
				//System.out.println("인덱스 증가시켰어"+ch_ascii);
				
				//아스키값을 조절한 다음에 스킵해도 되는지 여부를 확인해야함 순서 중요
				
				if(ch_ascii>=25){//25(z)외로 넘어가게 된다면
					ch_ascii%=26;//나머지 값을 갖도록 자동 조절
				}
				
				if(!skip_ascii.contains(ch_ascii)){//스킵하지 않아도 된다면
					cnt++;//이동한 횟수 증가
				}
				//System.out.println("while마지막결과:"+ch_ascii+" "+cnt);
				
			}
			//System.out.println((char)(ch_ascii+97)+" "+(ch_ascii+97));
			result.append((char)(ch_ascii+97));//원래대로 복구
		}
		return result.toString();
    }

}