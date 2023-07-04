public class Solution {
	
	public String solution(String code){
		
		int mode=0;//초기 mode==0
		String ret="";//return하려는 빈 문자열
		
		//code를 읽다가 문자가 1이면 mode를 바꿈
		for(int i=0;i<code.length();i++){
			char code_char = code.charAt(i);
			
			if (mode==0){//mode가 0일때
				if (code_char!='1' && i%2==0){//code_char이 1이 아니고 idx가 짝수일때만
					ret+=code_char;//문자열 이어붙일때 조인말고 +연산자 사용하기
				}
				else if(code_char=='1'){//code_char이 1이면
					mode=1;//mode바꾸기
					System.out.println("mode"+mode);
				}
			}
			
			else if(mode==1){//mode가 1일때
				if(code_char!='1' && i%2!=0){
					ret+=code_char;
				}
				else if(code_char=='1'){
					mode=0;//mode바꾸기
				}
			}
			
		}
		
		//RET이 빈 문자열이면 EMPTY리턴
		if(ret.length()==0){
			ret="EMPTY";
		}
		return ret;
		
	}
}
