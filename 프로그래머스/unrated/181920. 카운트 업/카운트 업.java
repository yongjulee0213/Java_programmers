import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int start, int end) {
        List<Integer> list = new ArrayList<>();
        
        for (int i = start; i <= end; i++) {
            list.add(i);
        }
        
        int[] result = new int[list.size()];//만든 숫자 리스트 가져와서 결과 저장
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);//만든 숫자 리스트에 있는걸 result에 저장
        }
        return result;
}
}