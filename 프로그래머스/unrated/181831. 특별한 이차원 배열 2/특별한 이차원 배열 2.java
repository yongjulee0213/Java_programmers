class Solution {
   public int solution(int[][] arr){
		
		int result=0;
		loop: //이중 루프를 한번에 탈출하기 위한 loop 지정
			for(int i=0;i<arr.length;i++){
				
				for(int j=0;j<arr[i].length;j++){
					
					System.out.println(i+" "+arr[i][j]+" "+arr[j][i]+" "+result);
					if(arr[i][j]==arr[j][i]){
						result=1;
					}
					else{
						result=0;
						break loop;//이중 루프 한번에 탈출하기
					}
				}
			
			}
		return result;
		

	}
}