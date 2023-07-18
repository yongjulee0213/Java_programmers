import java.util.Arrays;
class Solution {
    public int[][] solution(int n){
		
		int[][] outer=new int[n][n];//외부 리스트  선언 만들기
	
		for(int i=0;i<n;i++){
			int[] inner=new int[n];//크기가 n인 내부 리스트 만들기, 외부 인덱스 바뀔때마다 초기화
			Arrays.fill(inner, 0);//0으로 채우기
			inner[i]=1;//인덱스 옮겨다니면서 1로 바꾸기
			//System.out.println(Arrays.toString(inner));
			
			outer[i]=inner;//내부를 외부에 넣기
		}
		
		//System.out.println(Arrays.deepToString(outer));//deeptostring으로 보기
		return outer;

	}
}