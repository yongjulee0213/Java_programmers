class Solution {
    public int solution(int n, int m, int[] section) {
        int start = section[0];//칠하기 시작하는 위치
        int end = section[0] + m-1;//1에서 시작하므로 마지막도착지점에서는 빼줘야함
        int cnt = 1;//칠한횟수
            
        for(int i : section){//칠해야하는 곳의 벽번호를 가져와
            if(start<=i && i<=end){//start<=i<=end 범위에 칠해야하는 인덱스가 있을때
            	//System.out.println("if "+i+" "+start+" "+end);
            	continue;
            }
                
            else{//칠하고 도착한 지점

            	cnt++;//칠하고
                start = i;//도착한 지점을 시작지점으로 변경
                end = i + (m-1);//도착한 지점에서 다시 한번 칠한 경우를 마지막 도착시점으로 변경
                
            }
            
        }
        return cnt;
    }

}