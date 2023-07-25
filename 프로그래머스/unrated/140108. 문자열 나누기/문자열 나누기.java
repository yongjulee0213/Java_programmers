class Solution {
   public int solution(String s) {
		
		
		int cnt=0;//문자열 나누는 횟수
		if(s.length()==1){
			return 1;
		}
		
		while(true){
			
			char x=s.charAt(0);//맨 앞자리가 기준인 x문자
			System.out.println("기준문자: "+x);
			int idx=1;//인덱스용 변수: 
			int cnt_x=1;//x인것의 개수(첫글자는 미리 넣어뒀다고 생각)
			int cnt_notx=0;//x가 아닌 다른 문자들의 개수
			
			//런타임을 해결해줄 아이->해결안해줌
			if(s.replace(Character.toString(x),"").length()==0){//같은 문자로만 이루어져있으면 cnt_notx가 오르지 않겠지??
				cnt++;
				break;
			}
			
			while(true){//개수가 같아지면 멈춰
                
				if(s.charAt(idx)==x){
					cnt_x++;//x의 개수 증가
				}
				else{
					cnt_notx++;//x가 아닌 다른 문자 개수 증가
				}
				if(cnt_x==cnt_notx || idx==s.length()-1){//문자열이 끝날때까지도 둘이 같지 않는다면 강제종료
					//System.out.println(cnt_x+" "+cnt_notx);//첫번째 while문
					break;
				}
				
				
				idx++;//인덱스증가
				
			}
			
			cnt++;//문자열 나누는 횟수 증가
			
			s=s.substring(idx+1,s.length());//다음부터 비교할 문자열 할당
			
			//System.out.println(s+" "+cnt);
			
			if(s.length()==0){//남은문자열의 개수가 0이면 -> 실패 전부 해결
				break;//cnt 증가 없이 그대로 
			}
			else if(s.length()<=2){//최종 문자열이 남아있으면 
				cnt++;//cnt하나 올려주고 
				break;
			}
		}
		return cnt;
    }
}