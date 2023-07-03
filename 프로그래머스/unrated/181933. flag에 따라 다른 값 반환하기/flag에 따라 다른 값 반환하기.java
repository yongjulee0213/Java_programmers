class Solution {
    public int solution(int a, int b, boolean flag) {
        //flag==true -> a+b
        if (flag){//true인지 false인지 안쓰고 변수만 쓰면 알아서 값이 판단됨
            return a+b;
        }
        //flag==fale ->a-b
        else{
            return a-b;
        }
        
    }
}