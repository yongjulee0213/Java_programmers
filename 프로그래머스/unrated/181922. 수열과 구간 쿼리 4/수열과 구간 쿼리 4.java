import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        //List<Integer> answer=new ArrayList<>();//정답으로 return 할 리스트 생성
        
        //s,e, k 찾기
        for(int i=0;i<queries.length;i++){
            int s= queries[i][0];
            int e= queries[i][1];
            int k= queries[i][2];
            
            //System.out.println(s+" "+e+" "+k);
            
            for(int j=0;j<=e;j++){
            	if(s<=j && j<=e && j%k==0){//i가 k의 배수이면
                    arr[j]+=1;//arr[i]에 1을 더해라
                    //System.out.println(j+" "+Arrays.toString(arr));
                }
            }
            
        }
        
        return arr;

    }
}