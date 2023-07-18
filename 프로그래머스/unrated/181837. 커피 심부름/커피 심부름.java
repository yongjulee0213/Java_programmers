class Solution {
    public int solution(String[] order) {
		
		/*
		 * "iceamericano", "americanoice"	차가운 아메리카노
		 * "hotamericano", "americanohot"	따뜻한 아메리카노
			"icecafelatte", "cafelatteice"	차가운 카페 라테
			"hotcafelatte", "cafelattehot"	따뜻한 카페 라테
			"americano"	아메리카노
			"cafelatte"	카페 라테
			"anything"	아무거나
		*/
		int cnt_americano=0;//아메리카노 횟수
		int cnt_latte=0;//카페라뗴 횟수

		for(int i=0;i<order.length;i++){
			if(order[i].equals("iceamericano") || order[i].equals("americanoice") ||
				order[i].equals("hotamericano") || order[i].equals("americanohot")||
				order[i].equals("americano") || order[i].equals("anything")){
				cnt_americano++;//아메리카노 주문 횟수 증가
			}
			else if(order[i].equals("hotcafelatte") || order[i].equals("cafelattehot") ||
					order[i].equals("icecafelatte") || order[i].equals("cafelatteice") ||
					order[i].equals("cafelatte")){
					cnt_latte++;//카페라떼 주문 횟수 증가
				}
		}
		return cnt_americano*4500+cnt_latte*5000;

	}
}