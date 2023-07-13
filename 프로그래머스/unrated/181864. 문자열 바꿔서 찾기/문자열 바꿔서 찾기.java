class Solution {
    public int solution(String myString, String pat){
		 String tmp="";
		 for(int i=0;i<myString.length();i++){
			 if(myString.charAt(i)=='A'){
				 tmp+="B";
			 }
			 else if(myString.charAt(i)=='B'){
				 tmp+="A";
			 }
			 //System.out.println(tmp);
		 }
		 if(tmp.contains(pat)){
			 return 1;
		 }
		 else{
			 return 0;
		 }
        }
}