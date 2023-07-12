class Solution {
    public int solution(int[] num_list) {
        int result;//결과 저장 공간
        
        if(num_list.length>10){//리스트 길이가 11이상이면
            result=0;//덧셈을 할것이므로 결과변수 0으로 초기화
            for(int i=0;i<num_list.length;i++){
                result+=num_list[i];
            }
            
        }
        else{
            result=1;
            for(int i=0;i<num_list.length;i++){
                result*=num_list[i];
            }
            
        }
        return result;
    }
}