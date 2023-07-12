class Solution {
    public int[] solution(int[] arr) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=50 && arr[i]%2==0){//50보다 크거나 같은 짝수
                arr[i]/=2;
            }
            else if(arr[i]<50 && arr[i]%2!=0){//50보다 작은 홀수
                arr[i]*=2;
            }
        }
        return arr;
    }
}