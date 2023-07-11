class Solution {
    public int solution(int[] num_list) {
        //0번째를 1번째라 간주하므로 원래 홀짝을 반대로 변수만 써주면 됨
        int sum_even=0;
        int sum_odd=0;
        
        for(int i=0;i<num_list.length;i++){
            if(i%2==0){
                sum_odd+=num_list[i];//홀수로 간주
            }
            else{
                sum_even+=num_list[i];//짝수로 간주
            }
        }
        if(sum_odd>=sum_even){
            return sum_odd;
        }
        else{
            return sum_even;
        }
    }
}