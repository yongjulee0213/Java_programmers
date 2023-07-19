
class Solution {
    public String solution(int[] food)  {
		
		//물 기준 앞에 만들기
		String contest="";
		for(int i=0;i<food.length;i++){
			
			int numberoffood=food[i]/2*2;
			
			for(int j=0;j<numberoffood/2;j++){
				contest+=i;
			}
			//System.out.println(contest);
		}
		
		//문자열 뒤집어서 뒷순서 만들기
		StringBuffer sb=new StringBuffer(contest);
		String contest_b=sb.reverse().toString();
		
		contest+=0;
		contest+=contest_b;
		
		return contest;
		
	}
	
}