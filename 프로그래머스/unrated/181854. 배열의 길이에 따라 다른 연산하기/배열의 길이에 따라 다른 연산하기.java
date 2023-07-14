class Solution {
    public int[] solution(int[] arr, int n) {
        for(int i=0;i<arr.length;i++){
            if(arr.length%2!=0){//arr의길이가 홀수라면
                if(i%2==0){//짝수인덱스에
                    arr[i]+=n;//n을 더한 배열
                }
            }
            else{//arr의 길이가 홀수라면
                if(i%2!=0){//모든 홀수 인덱스에
                    arr[i]+=n;//n을 더한 배열
                }
            }
        }
        return arr;
        
        
    }
}