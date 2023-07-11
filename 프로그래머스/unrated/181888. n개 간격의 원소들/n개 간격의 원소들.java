import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] num_list, int n) {
        //반복문을 넘어가도될까? 넹! 알아서 자름
        List<Integer> result=new ArrayList<>();
        for(int i=0;i<num_list.length;i+=n){
            result.add(num_list[i]);
        }
        
        int[] answer=new int[result.size()];
        for(int i=0;i<result.size();i++){
            answer[i]=result.get(i);
        }
        return answer;
    }
}