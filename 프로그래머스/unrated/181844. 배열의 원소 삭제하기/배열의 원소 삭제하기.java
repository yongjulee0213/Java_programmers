import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> resultList = new ArrayList<>();//결과저장공간

        // removeall쓰기 위해서 arraylist로 변경
        List<Integer> deleteList = new ArrayList<>();
        for (int num : delete_list) {
            deleteList.add(num);
        }

        // Iterate through arr and add elements not present in deleteList to the resultList
        for (int num : arr) {
            if (!deleteList.contains(num)) {//지우려고하는거에 해당되지 않는 원소를
                resultList.add(num);//결과 저장공간에 넣어라
            }
        }

        // Convert resultList back to an array
        int[] answer = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            answer[i] = resultList.get(i);
        }

        return answer;
    }
}
