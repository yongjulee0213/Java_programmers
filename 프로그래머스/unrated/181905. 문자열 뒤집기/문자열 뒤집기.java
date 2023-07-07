class Solution {
    public String solution(String my_string, int s, int e) {
		
		//s이전
		String to_s="";
		for(int i=0;i<s;i++){
			to_s+=Character.toString(my_string.charAt(i));
		}
		//s~e
		String s_to_e="";
		
		for(int i=s;i<=e;i++){
			s_to_e+=Character.toString(my_string.charAt(i));
		}
		StringBuffer sb_se=new StringBuffer(s_to_e);
		String re_se=sb_se.reverse().toString();//reverse(s~e)
		//System.out.println(re_se);
		//e~
		String e_to="";
		for(int i=e+1;i<my_string.length();i++){
			e_to+=Character.toString(my_string.charAt(i));
		}
		
		String answer=to_s+re_se+e_to;
		return answer;
		
				
		
	}
}