class Solution {
    	
		public int solution(String str1, String str2) {
		
		//찾으려는 문자열의 길이를 받아 substring을 이용하여 자른 후 대조하기
		int result=0;//일부 문자가 아닌 경우 0이 나가도록
		//어디까지 반복을 돌려야하는걸까
		//str2의문자열길이가 1인 경우나 두 문자열의 길이가 같을때 서로 같다면
		if((str2.length()==1 || str2.length()==str1.length()) && str2.equals(str1)){
			result=1;
		}
		else{
			for(int i=0;i<=str2.length()-str1.length();i++){
				String compare = str2.substring(i, i + str1.length());
				System.out.println(i+" "+compare);
				if(compare.equals(str1)){
					result=1;
				}
			}
		}
		
		return result;
	}
}