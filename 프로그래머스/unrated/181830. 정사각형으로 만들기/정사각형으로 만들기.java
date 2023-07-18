import java.util.Arrays;
class Solution {
    public int[][] solution(int[][] arr) {
		
		//1. 행과 열길이 파악하기
		int hor_length=arr.length;
		int ver_length=arr[0].length;
		System.out.println(hor_length+" "+ver_length);
		int[][]result=null;
		//가로의 길이가 더 길면 행길이-열길이 만큼의 0으로 채워진 세로줄(열) 추가
		if(hor_length>ver_length){
			
			result=new int[hor_length][hor_length];//가장 긴 길이를 가진 걸로 리턴할 이중배열 만들기
			//기존 값들 가져오기
			for(int i=0;i<hor_length;i++){
				result[i]=Arrays.copyOfRange(arr[i],0,hor_length);
			}
			System.out.println("원소마다 0붙이기"+Arrays.deepToString(result));
			
		}
		else if(hor_length<ver_length){
			
			result=new int[ver_length][ver_length];//가장 긴 길이를 가진 걸로 리턴할 이중배열 만들기
			//기존 값들 가져오기
			for(int i=0;i<hor_length;i++){//있는 가로행을 다 가져와야하므로 가로행의 길이만큼만 반복한다
				System.out.println(Arrays.toString(arr[i]));
				result[i]=Arrays.copyOfRange(arr[i],0,ver_length);
			}
			System.out.println("0으로 채워진 리스트 추가하기"+Arrays.deepToString(result));
		}
		else{
			return arr;
		}
		
		return result;

	}
}