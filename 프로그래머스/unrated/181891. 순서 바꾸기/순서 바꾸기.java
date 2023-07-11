import java.util.ArrayList;
import java.util.List;
class Solution {
    public int[] solution(int[] num_list, int n) {
        
        //num_list -> arrlst
        List<Integer> nums=new ArrayList<>();
        for(int i=0;i<num_list.length;i++){
            nums.add(num_list[i]);
        }
        
        //중간 나눠서
        List<Integer>answer=new ArrayList<>();
        answer.addAll(nums.subList(n,nums.size()));
        answer.addAll(nums.subList(0,n));
        
        int[] result=new int[answer.size()];
        for(int i=0;i<answer.size();i++){
            result[i]=answer.get(i);
        }
        return result;
    }
}