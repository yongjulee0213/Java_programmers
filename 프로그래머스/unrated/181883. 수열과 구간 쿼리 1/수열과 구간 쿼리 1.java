import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        //기존 배열 arrlist로 만들기
        List<Integer> result=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            result.add(arr[i]);
        }
        
        //s,e구해서 +1
        for(int i=0;i<queries.length;i++){
            int s=queries[i][0];
            int e=queries[i][1];
            
            for(int j=s;j<=e;j++){
                result.set(j,result.get(j)+1);
            }
        }
        int[] answer=new int[result.size()];
        for(int i=0;i<result.size();i++){
            answer[i]=result.get(i);
        }
        return answer;
    }
}