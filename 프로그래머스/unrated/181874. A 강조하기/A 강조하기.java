class Solution {
    public String solution(String myString) {
        //1. 전부 lower로 바꾸고
		myString=myString.toLowerCase();
		//2. a만 A로 REPLACE
        //replace할때는 결과를 다른 변수에 넣어줘야함
		String result=myString.replace('a','A');
		
		return result;
    }
}