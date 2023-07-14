import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
class Solution {
    public int solution(String[] str) {
		
	List<Integer> cnt=new ArrayList<>(31);//문자열 길이를 인덱스로해서 문자열 등장횟수 저장공간
	for(int i=0;i<31;i++){
		cnt.add(0);//0으로 채우기
	}
	for(int i=0;i<str.length;i++){
		int index=str[i].length();
		//System.out.println(index);
		cnt.set(index, cnt.get(index)+1);//문자열을 인덱스로해서 그곳에 있는 값을 가져와 +1
	}
	//System.out.println(cnt);
	int result=Collections.max(cnt);
	return result;
        
    }
}