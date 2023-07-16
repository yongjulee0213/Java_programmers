import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] num_list) {
        //1. 오름차순으로 정렬하기
        Arrays.sort(num_list);
        
        List<Integer> result=new ArrayList<>();
        for(int i=5;i<num_list.length;i++){
            result.add(num_list[i]);
        }
        int[] answer=new int[result.size()];
        for(int i=0;i<result.size();i++){
            answer[i]=result.get(i);
        }
        return answer;
    }
}