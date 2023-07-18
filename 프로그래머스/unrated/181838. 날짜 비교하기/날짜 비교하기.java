class Solution {
    public int solution(int[] date1, int[] date2) {
		
		int result=0;
		
		int year1, month1, day1, year2, month2, day2;
		year1=date1[0];
		month1=date1[1];
		day1=date1[2];
		
		year2=date2[0];
		month2=date2[1];
		day2=date2[2];
		
		if(year1<year2){//연도가 이전인지 확인
			result=1;
		}
		else if(year1==year2){//연도가 같다면
			if(month1<month2){//월이 이전인지 확인
				result=1;
			}
			else if(month1==month2){//월이 같다면
				if(day1<day2){//일이 이전인지 확인
					result=1;
				}
			}
		}
		
		return result;
	}
}