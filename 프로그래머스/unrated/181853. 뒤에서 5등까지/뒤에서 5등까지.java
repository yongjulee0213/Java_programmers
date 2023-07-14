import java.util.Arrays;
class Solution {
    public int[] solution(int[] num_list) {
	    Arrays.sort(num_list);//collection사용하지 않고 arrays를 사용하여 리스트를 정렬할 수 있음
	    
	    int[] answer = Arrays.copyOfRange(num_list, 0, Math.min(5, num_list.length));//여기서 5개만 복사하기
	    return answer;
	}
}