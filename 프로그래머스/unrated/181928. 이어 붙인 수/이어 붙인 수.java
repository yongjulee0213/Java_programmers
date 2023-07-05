class Solution {
    public int solution(int[] num_list) {
        //홀수만 순서대로 이어붙이기
        String odd="";//string 선언시 =""; 도 함께 쓰기
        //짝수만 순서대로 이어붙이기
        String even="";
        
        for(int i=0;i<num_list.length;i++){
            if (num_list[i]%2!=0){
                odd+=Integer.toString(num_list[i]);
            }
            else{
                even+=Integer.toString(num_list[i]);
            }
        }
        //둘의 합
        int answer = 0;
        answer=Integer.parseInt(odd)+Integer.parseInt(even);
        return answer;
    }
}