class Solution {
    public int solution(int a, int b) {
        
        //1. ab, 2*a*b 만들기
        int res_ab=Integer.parseInt(String.valueOf(a).concat(String.valueOf(b)));
        int res_2ab=2*a*b;
        
        //2. ab vs 2ab
        if (res_ab>=res_2ab){
            return res_ab;
        }
        else{
            return res_2ab;
        }
    }
}