class Solution {
    public String solution(String myString, String pat) {
	
	
		StringBuffer sb=new StringBuffer(myString);
		String reversed=sb.reverse().toString();
		//System.out.println(reversed);
		
		int index=reversed.indexOf(Character.toString(pat.charAt(pat.length()-1)));
		//System.out.println(index);
		
		String result=reversed.substring(index,myString.length());
		//System.out.println(result);
		
		StringBuffer sb_result=new StringBuffer(result);
		String answer=sb_result.reverse().toString();
		
		return answer;
		
		
    }
}