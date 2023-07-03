class Solution {
    public int solution(int a, int b) {
        // 1. Convert integers to strings
        String st_a = String.valueOf(a);
        String st_b = String.valueOf(b);
        
        //2. ab vs ba 연결 후 int로 변경
        int answer1, answer2;
        answer1 = Integer.parseInt(st_a.concat(st_b));
        answer2 = Integer.parseInt(st_b.concat(st_a));
        
        // 2. 더 큰 거 찾아서 조건에 맞게 연결
        if (answer1>=answer2){
            return answer1;
        }
        else{
            return answer2;
        }
    }
}
