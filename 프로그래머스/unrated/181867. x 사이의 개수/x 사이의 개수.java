import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(String myString) {
        //1. x 기준으로 분리하기
        String[] tmp=(myString).split("x",-1);//문자열 끝까지
        
        
        System.out.println(Arrays.toString(tmp));
        //2. 문자열의길이를 담은 리스트 만들기
        List<Integer> length=new ArrayList<>();
        for(int i=0;i<tmp.length;i++){
                length.add(tmp[i].length());
        }
        
        //3. list로 변경
        int[] answer=new int[length.size()];
        for(int i=0;i<length.size();i++){
            answer[i]=length.get(i);
        }
        return answer;
        
            
    }
}