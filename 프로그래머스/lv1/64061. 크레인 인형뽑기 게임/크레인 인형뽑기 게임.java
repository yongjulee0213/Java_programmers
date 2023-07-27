import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
class Solution {
    		public int solution(int[][] board, int[] moves) {
		
		//1. target만들기
		List<Integer> tower=new ArrayList<>();//탑쌓은 결과를 저장할 거 리턴
		for(int m: moves){//해당 열로 가서 하나씩 뽑을꺼야
			for(int i=0;i<board.length;i++){
				if(board[i][m-1]!=0){//이때 1부터 움직이는게 시작돼서 -1해줌
					tower.add(board[i][m-1]);//쌓은 결과 더해주고
					board[i][m-1]=0;//뺴왔으니까 빼온부분을 0으로 치환
					break;//멈춰서 움직임 한번당 한번만 빼오도록 루프 탈출
				}
			}
		}
		//System.out.println("tower:"+tower);
		
		int cnt=0;//같아서 사라진 것 개수
		int i=1;//인덱스 접근할거. 현재보다 하나 작은 인덱스와 비교할 것이므로 1로 초기화
		
		List<Integer> copytower=new ArrayList<>();//array면 메모리 초과, linedlist면 시간초과
		
		
		while(true){//tower가 계속 변할때동안
			
			for(i=1;i<tower.size();i++){//수가 같은지 확인하기 위한 루프
				
				if(tower.get(i)==tower.get(i-1)){//현재 인덱스에 해당하는 값과 이전 인덱스에 해당하는 값이 같으면 같은 부분을 제외한 나머지 부분을 가져와서 연결하는 작업을 할예정
					
					//removeall(lst)에서 lst는 순서가 달라도 원소가 들어가만 있으면 지워진다
					//sublist로 슬라이싱하면 중간애들이 삭제되는걸 고려해야함.
					List<Integer> front=tower.subList(0,i-1);//뺼 부분의 앞쪽
					List<Integer> remain=tower.subList(i+1,tower.size());//뺄 부분의 뒤쪽
					
					//System.out.println(front+" "+remain);
					List<Integer> all=new ArrayList<>();//새로운 리스트 만들기
					all.addAll(front);//어레이에있는값 붙여넣어주기
					all.addAll(remain);
					tower=all;//다시 리스트 할당

					cnt+=2;//한번에 2개씩 없어지므로 2씩 증가
					//System.out.println("sublist이후: "+tower);
					//System.out.println("tower_size: "+tower_size);
					break;//업데이트한 TOWER가지고 다시 처음부터 위 작업 반복
					
				}
			}//for문이 끝났다 ==i가 tower길이만큼 갔다== 더이상 같은게 없다는게 아니라 break하고 나왔다
			//System.out.println("break: "+tower);
			//System.out.println(tower_size.size());
			if(tower.size()==0){
				break;
			}
			/*
			if(tower_size.size()>=2&&(tower_size.get(tower_size.size()-1)==tower_size.get(tower_size.size()-2))){
				//System.out.println("break전 cnt: "+cnt);
				break;
			}
			*/
			if(tower==copytower){
				break;
			}
			else{
				copytower=tower;
			}
			
		}
		return cnt;

		
    }
}