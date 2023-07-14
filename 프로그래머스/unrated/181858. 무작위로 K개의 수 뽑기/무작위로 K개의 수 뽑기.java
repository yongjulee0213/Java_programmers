import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr, int k) {
        
        List<Integer> result=new ArrayList<>(k);
        
        for(int i=0;i<arr.length;i++){
        	if(!result.contains(arr[i])){//배열에 없다면
        		result.add(arr[i]);
        	}
        	if(result.size()>=k) break;//이미 k개의 겹치지 않는 수를 뽑았으면 멈춰
        }
        //System.out.println(result);
        
        int[] answer=new int[k];//k크기의 배열 만들기
        Arrays.fill(answer, -1);//-1로 채우기
        for(int i=0;i<result.size();i++){
        	answer[i]=result.get(i);//result에 있는값만 대체
        }
        return answer;
        
        
        
    }
}