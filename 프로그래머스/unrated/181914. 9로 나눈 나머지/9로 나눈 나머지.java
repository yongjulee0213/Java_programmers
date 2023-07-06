class Solution {
    public int get_result(String number){
		int result=0;//각 자릿수 더하는 결과 공간
		
		for(int i=0;i<number.length();i++){
			int int_num=Character.getNumericValue(number.charAt(i));//각 자리수를 숫자로 받아오기
			result+=int_num;//각 자릿수 더해
		}
		return result;
	}
	public int solution(String number) {
		
		int result=get_result(number);
		while(result>=9){
			number=Integer.toString(result);
			result=get_result(number);
			
			if (result==9){//9로 나누어떨어지면 0이 되므로 각자리 합과 무관함
				result=0;
				break;
			}
			
		}
		return result;
       
    }
}