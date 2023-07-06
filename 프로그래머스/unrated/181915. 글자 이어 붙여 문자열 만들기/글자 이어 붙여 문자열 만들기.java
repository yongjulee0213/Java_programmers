class Solution {
    public String solution(String my_string, int[] index_list) {
		
		//my_string에서 index_list에 해당하는 문자만 뽑아서 문자열 만들어서 리턴하기
		
		String answer="";//문자열 저장공간
		for(int i=0;i<index_list.length;i++){
			char char_ms=my_string.charAt(index_list[i]);
			String st_ms=String.valueOf(char_ms);
			//System.out.println(st_ms);
			
			//answer에 붙여 넣기
			answer=answer.concat(st_ms);
		}
		
       return answer;
    }
}