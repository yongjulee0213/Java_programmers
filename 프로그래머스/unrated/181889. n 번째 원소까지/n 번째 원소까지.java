import java.util.ArrayList;
import java.util.List;
class Solution {
    public int[] solution(int[] num_list, int n) {
        
        List<Integer> result=new ArrayList<>();
        if(n==1){//0~0이전까지의 수가 안되기에 따로 빼줌
            result.add(num_list[0]);
        }
        else{
            for(int i=0;i<n;i++){
            result.add(num_list[i]);
        }
        }
        int[] answer=new int[result.size()];
        for(int i=0;i<result.size();i++){
            answer[i]=result.get(i);
        }
    
    return answer;
}
}