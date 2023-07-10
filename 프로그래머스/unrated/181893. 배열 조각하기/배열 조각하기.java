import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int[] query) {
		
        for(int i =0; i<query.length; i++) {
            if(i % 2 == 0) {//짝수이면
                arr = Arrays.copyOfRange(arr, 0, query[i]+1);//앞에 살려
            }else {
                arr = Arrays.copyOfRange(arr, query[i], arr.length);//뒤에 살려
            }
        }
        return arr;
    }

}
