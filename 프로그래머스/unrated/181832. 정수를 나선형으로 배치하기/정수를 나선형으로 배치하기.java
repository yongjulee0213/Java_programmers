import java.util.Arrays;
class Solution {
    public int[][] solution(int n) {
		
		int[][]result=new int[n][n];//정답 배열 리스트 크기 할당
		int i=0;//행
		int j=0;//열
		String direction="right";//기본시작방향은 오른쪽
		
		
		for(int num=1;num<=n*n;num++){//원소값 1부터 시작

			result[i][j]=num;//원소값 할당

			if(direction.equals("right")){//방향이 오른쪽이라면
				System.out.println("오른쪽 시작");
				j++;//j값 증가
				//System.out.println(i+" "+j);
				if(j>=n-1 || result[i][j+1]!=0){//오른쪽 끝까지 와서 또는 이미 채워져 있어서 더이상 갈 수 없다면다음위치의 값을 생각해야하므로 마이너스 해줄 위치의 값을 가져옴
					direction="down";
				}
				//System.out.println(direction);
				//System.out.println("오른쪽"+Arrays.deepToString(result));
			}
			
			
			else if(direction.equals("down")){//방향이 아래쪽이라면
				//System.out.println("아래 시작");
				i++;//i값 증가
				System.out.println(i+" "+j);
				if(i>=n-1|| result[i+1][j]!=0){//밑 끝까지 와서 더이상 갈 수 없다면다음위치의 값을 생각해야하므로 마이너스 해줄 위치의 값을 가져옴
					direction="left";
				}
				//System.out.println(direction);
				//System.out.println("아래쪽"+Arrays.deepToString(result));
			}
			
			else if(direction.equals("left")){//방향이 왼쪽이라면
				j--;//j값 감소
				System.out.println(i+" "+j);
				if(j<=0|| result[i][j-1]!=0){//왼쪽 끝까지 와서 더이상 갈 수 없다면다음위치의 값을 생각해야하므로 마이너스 해줄 위치의 값을 가져옴
					direction="up";
				}
				//System.out.println(direction);
				//System.out.println("왼쪽"+Arrays.deepToString(result));
			}

			else if(direction.equals("up")){//방향이 위쪽이라면
				i--;//i값 감소
				System.out.println(i+" "+j+" "+result[i][j]);
				if(i<=0|| result[i-1][j]!=0){//위쪽 끝까지 와서 더이상 갈 수 없다면 다음위치의 값을 생각해야하므로 마이너스 해줄 위치의 값을 가져옴
					direction="right";//오른쪽으로 가랏
				}
				//System.out.println(direction);
				//System.out.println("위쪽"+Arrays.deepToString(result));
			}
			
		}
		System.out.println("어레이"+Arrays.deepToString(result));
		
		
		return result;
		

	}
}