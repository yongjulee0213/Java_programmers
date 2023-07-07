class Solution {
    public String solution(String my_string, int m, int c) {
		
		
		String answer="";
		for(int i=0;i<my_string.length()/m;i++){
			answer+=Character.toString(my_string.charAt(m*i+(c-1)));//규칙찾아서 인덱스로 할당
		}
		//System.out.println(answer);
		return answer;
		
	}
}