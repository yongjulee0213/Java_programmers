import java.lang.Math;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(String dartResult) {
		
		//크기 지정해도 0으로 채워지지 않아
		List<Integer> scores=new ArrayList<>();
		
		for(int i=0;i<dartResult.length();i++){
			
			//점수
			//아스키코드로 변환하면 두자리수를 파악할 수 없음
			if((int)dartResult.charAt(i)>=48 && (int)dartResult.charAt(i)<=57){//아스키로 변환했을때 숫자인 경우
				if(dartResult.charAt(i)=='1'&& dartResult.charAt(i+1)=='0'){//최대 점수가 10인 경우 처리
					scores.add(10);//10넣기
					i++;//i증가시켜서 다음 0을 패스
				}
				else{//한자리수의 경우
					scores.add(Integer.parseInt(Character.toString(dartResult.charAt(i))));//int로 바꿔서 저장
				}
				
			}
			
			//보너스
			else if(dartResult.charAt(i)=='D'){
				
				scores.set(scores.size()-1,(int)Math.pow(scores.get(scores.size()-1),2));//현재 점수==가장 최근 점수에 ^2
			}
			else if(dartResult.charAt(i)=='T'){
				scores.set(scores.size()-1,(int)Math.pow(scores.get(scores.size()-1),3));//현재 점수==가장 최근 점수에 ^3
			}
			
			//옵션
			else if(dartResult.charAt(i)=='*'){//스타상인 경우
				
				if(scores.size()>1){//점수 길이가 1초과라 현재와 이전 점수들에 접근이 가능하면
					scores.set(scores.size()-1,scores.get(scores.size()-1)*2);//현재 점수들에 *2
					scores.set(scores.size()-2,scores.get(scores.size()-2)*2);//이전의 점수들에 *2
				}
				else{//현재 점수만 접근이 가능하면
					scores.set(scores.size()-1,scores.get(scores.size()-1)*2);//현재와 이전의 점수들에 *2
					
				}
				
			}
			
			else if(dartResult.charAt(i)=='#'){//아차상인 경우
				scores.set(scores.size()-1,-scores.get(scores.size()-1));//가장 최근 점수를 -로 변경
			}
			//System.out.println(scores);//점수 저장 확인
			
		}
		
		
		int answer=0;
		for(int num: scores){
			answer+=num;
		}
		return answer;
    }
	
}