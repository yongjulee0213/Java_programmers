import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Solution {
    public int[] solution(String my_string) {
		int[] arr=new int[52];
		Arrays.fill(arr, 0); 
		
		//0으로 채워진 list를 arraylist로 변환
		ArrayList<Integer> count = new ArrayList<Integer>();
		for (int i : arr) {
			count.add(i);
		}
		//System.out.println(count);
		
		for(int i=0;i<my_string.length();i++){
			char ch=my_string.charAt(i);
			int index;
			if(Character.isUpperCase(ch)){
				index=(int)ch-65;//한글자씩 가져와서 아스키코드 10진수로 변환 후 배열의 인덱스로 변환
			}
			else{
				index=(int)ch-71;
				
			}
			System.out.println(index+" "+ch);
			count.set(index,count.get(index)+1); // set(인덱스, 뭐를) : 인덱스에 기존 값을 가져와 +1하고 다시 넣어줌. get을 하면 자리가 뒤로 밀림. set을해서 밀리지않도록
			System.out.println(count);

		}
		//System.out.println(count);
		
		//[]로 바꾸기
		int[] result=new int[count.size()];
		for(int i=0;i<count.size();i++){
			result[i]=count.get(i);
		}
		return result;
	}
}