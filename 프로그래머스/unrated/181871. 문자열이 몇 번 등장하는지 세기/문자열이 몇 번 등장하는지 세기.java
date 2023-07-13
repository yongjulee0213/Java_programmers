class Solution {
    public int solution(String myString, String pat) {
		
		//기준 문자열이 시작되는 인덱스부터 문자열 길이 끝까지 슬라이싱하고
		//기존 문자열에서 pat의 시작점까지 없애고 나머지를 문자열로 업데이트
		//이 과정을 반복하면서 cnt를 증가시키면 반복횟수를 구할 수 있음.
		//문자열이 pat보다 짧을때 indexof는 -1을 내보냄. 이걸로 while을 나감 
		
		
		int count=0;//반복횟수 저장할 변수
		
		if(myString.contains(pat)){
			int index=myString.indexOf(pat);//1. 기준 문자열이 시작되는 인덱스
			String sliced_myString=myString.substring(index, myString.length());//2. 문자열 시작부터 끝까지 새로운 문자열만들기
			while(true){
	            index = myString.indexOf(pat);//계속 업데이트 되는 문자열에서 pat의 시작 인덱스 찾아서 그걸 기준으로 문자열 재업
	            //System.out.println(count+" "+(index)+" "+myString);
	            
	            if(index == -1) break;//여기서 왜 인덱스가 -1이 되고 있는거지 -> mystring의 길이가 pat보다 짧아졌기 때문!
	            
	            myString = myString.substring(index+1, myString.length());//문자열 업데이트
	            
	            count++;//반복횟수 증가
	        }
		}
		
		
		return count;
	}
}