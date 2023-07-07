class Solution {
    public String solution(String my_string, int n) {
        //끝부터 n까지 문자열 가져오기
		String answer="";
		for(int i=my_string.length()-1;i>=my_string.length()-n;i--){
			answer+=Character.toString(my_string.charAt(i));
		}
		
		//반대로 뒤집기
		StringBuffer sb_answer=new StringBuffer(answer);
		String re_answer=sb_answer.reverse().toString();
		
		return re_answer;
    }
}