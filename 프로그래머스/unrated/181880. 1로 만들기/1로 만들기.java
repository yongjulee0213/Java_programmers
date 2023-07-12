import java.util.Arrays;

class Solution {
    public int solution(int[] num_list) {
        int count=0;//나누기 연산의 횟수 저장변수
        
        //결과가 되어야하는 리스트
        int[] should_lst=new int[num_list.length];
        Arrays.fill(should_lst, 1);//1로 채우기

        while(!Arrays.equals(should_lst, num_list)){
        	
            for(int i=0;i<num_list.length;i++){
            	
            	if(num_list[i]!=1){//1이면 0이 되지 않도록 멈춰
            		count++;//1일때는 연산패스이므로 count를 하지 않음
            		if(num_list[i]%2==0){
                        num_list[i]/=2;
                    }
                    else{
                        num_list[i]=(num_list[i]-1)/2;
                    }
            	}
            	//System.out.println(count+" "+Arrays.toString(num_list));
            }
            
            
        }
        return count;
    }
}