import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class Solution {
    
    public String[] solution(String[] picture, int k){
		
		List<String> result=new ArrayList<>();//k배로늘린 사진 저장 공간
		
		//for(int i=0;i<picture.length;i++){
			//String tmp="";//배열 주소 이동할때마다 비도록하기
		
		for(String str: picture){//배열 picture에 원소가 하나씩 str에 전달됨.
			StringBuilder sb=new StringBuilder();//stringbuilder 객체 생성
			
			for(char ch: str.toCharArray()){//배열의 각 문자열을 문자 단위로 끊어서 각 문자를 st에 넣기
				//char ch=picture[i].charAt(j);
				
				for(int z=0;z<k;z++){
					sb.append(ch);//k번 문자열 저장하기
				}
				
			}
			for(int z=0;z<k;z++){
				result.add(sb.toString());//스트링 버퍼를 스트링으로 바꿔서 문자열을 어레이 리스트에 저장
			}
		
		}
		String[] answer=new String[result.size()];
		for(int i=0;i<result.size();i++){
			answer[i]=result.get(i);
		}
		return answer;
		

	}
}