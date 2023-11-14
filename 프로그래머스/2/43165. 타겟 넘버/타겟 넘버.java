class Solution {
    int result=0; // target을 만들 수 있는 방법의 수
    
    public void dfs(int sum, int index, int[] numbers, int target){
        if(index==numbers.length && sum==target){//전체 수를 다 쓰고, 합이 target과 같아지면
            result++;//방법의 수 증가
            return ;
        }
        if(index>=numbers.length){ // index outof range를 피하기 위함
            return ;
        }
        dfs(sum+numbers[index], index+1, numbers, target);//합에 현재 인덱스 값을 더하고, 인덱스 증가시켜서 다시 dfs
        dfs(sum-numbers[index], index+1, numbers, target);//부호 다르게해서 다시 dfs
    }
    public int solution(int[] numbers, int target) {
        dfs(0,0,numbers, target);
        return result;
    }
}