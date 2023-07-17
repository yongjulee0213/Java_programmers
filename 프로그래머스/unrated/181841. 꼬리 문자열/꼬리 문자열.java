class Solution {
    public String solution(String[] str_list, String ex) {
		
		String answer="";//정답인 문자열 객체 넣어두기
		for(int i=0;i<str_list.length;i++){
			if(!str_list[i].contains(ex)){//문자열을 포함하지 않는다면
				answer+=str_list[i];//문자열 붙여넣기
			}
		}
		return answer;
		
	}
}