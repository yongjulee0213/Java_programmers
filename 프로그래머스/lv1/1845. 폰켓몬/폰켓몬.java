import java.util.HashSet;
class Solution {
    public int solution(int[] nums) {
		
		//포켓몬 종류수 구하기
		//해쉬셋으로 중복없는 포켓몬 리스트 구하기
		HashSet<Integer> hashSet = new HashSet<>();
	    for(int item : nums){
	            hashSet.add(item);
	    }
	    
	    if(hashSet.size()>nums.length/2){//포켓몬의 종류수가 가지고 갈수있는 포켓몬 수보다 많으면
	    	return nums.length/2;
	    }
	    else{
	    	return hashSet.size();
	    }

		
    }
}