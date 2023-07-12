class Solution {
   public String[] solution(String my_string) {
		my_string=my_string.trim().replaceAll("\\s+", " ");//양쪽 공백 제거+정규식을 사용하여 여러 공백을 하나의 공백으로 변환

		System.out.println(my_string);
        return my_string.split(" ");
    }
}