import java.util.ArrayList;
import java.util.List;

class Solution {
     public String solution(int[] numbers, String hand) {
		 
		 //키패드 이중배열
		 int[][] keypad={{1,2,3},{4,5,6},{7,8,9},{-1,0,-1}};
		 //오른손과 왼손의 현 위치를 기억해야한다
		 int c_n_left=-1;
		 int c_n_right=-1;
		 
		 //1,4,7 왼손
		 int[] numbers_left={1,4,7};
		 List<Integer> numbers_left_arr=new ArrayList<>();
		 for(int n: numbers_left){
			 numbers_left_arr.add(n);
		 }
		 
		 
		//3,6,9 오른손
		 int[] numbers_right={3,6,9};
		 List<Integer> numbers_right_arr=new ArrayList<>();
		 for(int n: numbers_right){
			 numbers_right_arr.add(n);
		 }
		 
		 //2,4,6,8
		 int[] numbers_mid={2,4,6,8,0};
		 List<Integer> numbers_mid_arr=new ArrayList<>();
		 for(int n: numbers_mid){
			 numbers_mid_arr.add(n);
		 }
		 
		//현위치 초기값
		 int[] c_n_right_={0,0};
		 int[] c_n_left_={0,0};
		 int[] c_n_mid_={0,0};
		 
		 //2,4,8,0 -> 현재 오른손과 왼손의 위치를 보고 어디로 뭐가 더 가까운지
		 StringBuffer result=new StringBuffer();
		 for(int n: numbers){
			 
			 if(numbers_right_arr.contains(n)){//오른손으로 꼭 눌러야하는 경우
				 result.append("R");
				 c_n_right=n;
			 }
			 
			 else if(numbers_left_arr.contains(n)){//왼손으로 꼭 눌러야하는 경우
				 result.append("L");
				 c_n_left=n;
			 }
			 
			
			 else{//오른손과 왼손의 위치를 보고 해야하는 경우 2,4,6,8,0
				 
				//오른손, 왼손, 가운데 거리 구하기위한 좌표값찾고 x+y를 하면 대각선 이동이 가능함.... ->폐기
				 for(int x=0;x<keypad.length;x++){
					 for(int y=0;y<keypad[x].length;y++){
						 if(keypad[x][y]==c_n_right){
							 c_n_right_[0]=x;
							 c_n_right_[1]=y;
						 }
						 if(keypad[x][y]==c_n_left){
							 c_n_left_[0]=x;
							 c_n_left_[1]=y;
						 }
						 if(keypad[x][y]==n){
							 c_n_mid_[0]=x;
							 c_n_mid_[1]=y;
						 }
					 }
				 }
				 //오른손에서 현재까지의 거리
				 
				 int dist_right=Math.abs(c_n_right_[0]-c_n_mid_[0])+Math.abs(c_n_right_[1]-c_n_mid_[1]);
				 int dist_left=Math.abs(c_n_left_[0]-c_n_mid_[0])+Math.abs(c_n_left_[1]-c_n_mid_[1]);
				 
				 //왼손에서 현재까지의 거리
				 if(dist_right == dist_left){//왼손과 오른손의까지의 거리가 같을때 : 엄지손가락은 상하좌우 4가지 방향으로만 이동할 수 있으며 키패드 이동 한 칸은 거리로 1에 해당합니다.
					
					 if(hand.equals("left")){//왼손잡이인 경우
						 result.append("L");
						 c_n_left=n;
					 }
					 else if(hand.equals("right")){//오른손 잡이인 경우
						 
						 result.append("R");
						 c_n_right=n;
					 }
				 }
				
				 else{//왼손과 오른손까지의 거리가 다른 경우
					//왼손이 더 가까우면
					 System.out.println("거리가 달라:"+dist_left+" "+dist_right);
					 if(dist_right> dist_left){
						 result.append("L");
						 c_n_left=n;
					 }
					 else if(dist_right< dist_left){
						 System.out.println("d"+n);
						 result.append("R");
						 c_n_right=n;
					 }
					 //오른손이 더 가까우면
				 }
			 		
			 	
			 }
			 
			
			 	
		 }
		 return result.toString();
		 
		
    }
}