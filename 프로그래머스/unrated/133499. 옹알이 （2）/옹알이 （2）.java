class Solution {
    public boolean continuous(String babbling){
		
		//연속으로 2번 나오면 안된다! 연속이 아니면 여러번 나와도 되는거야
		String[] canttalk={"ayaaya", "yeye", "woowoo", "mama"};
		boolean is_continuous=false;
		for(String ct: canttalk){
			if(babbling.contains(ct)){
				//System.out.println(babbling+"는 "+ct+"로 연속됨");
				is_continuous=true;
			}
		}
		return is_continuous;
	}
	
	
	public int solution(String[] babbling) {
		
		int cnt=0;//말할 수 있는개수
		//System.out.println(Arrays.toString(babbling));
		
		for(String b:babbling){
			
			if(!continuous(b)){

				b=b.replaceAll("aya|ye|woo|ma", ""); //애초에 발음이 가능해야 한번에 제거가능
				if(b.length()==0){
					cnt++;
				}
			}
		}
		
		return cnt;
    }
	
	
}