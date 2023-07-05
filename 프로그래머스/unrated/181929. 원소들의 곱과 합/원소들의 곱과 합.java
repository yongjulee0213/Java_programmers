class Solution {
    public int solution(int[] num_list) {
        //모든원소들의 곱
        int res_mul=1;
        for(int i=0;i<num_list.length;i++){
            res_mul*=num_list[i];
        }
        //모든원소들의 합의 제곱
        int res_sum=0;
        for(int i=0;i<num_list.length;i++){
            res_sum+=num_list[i];
        }
        
        //둘이 비교
        int result;
        if(res_mul<=res_sum*res_sum){
            result=1;
        }
        else{
            result=0;
        }
        return result;
    }
}