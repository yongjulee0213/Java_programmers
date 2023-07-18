import java.lang.Math;
class Solution {
    public int solution(int a, int b) {
		
		int result=0;
		if(a%2!=0 && b%2!=0){
			result=(int) (Math.pow(a,2)+Math.pow(b, 2));
		}
		else if((a%2!=0 && b%2==0)||(a%2==0 && b%2!=0)){
			result=2*(a+b);
		}
		else{
			result=Math.abs(a-b);
		}
		return result;
		
	}
}