class Solution {
    public int solution(int[] number)  {
		int answer=0;//삼총사 구하는 방법 경우의 수 카운트 저장
		
		for(int i=0;i<number.length;i++){
			for(int j=0;j<number.length;j++){
				for(int k=0;k<number.length;k++){
					if(i!=j && j!=k && k!=i){//세 수의 인덱스가 모두 다르면(자기 자신이 아니면)
						if(number[i]+number[j]+number[k]==0){//세 수의 합이 0이면
							//System.out.println(number[i]+" "+number[j]+" "+number[k]);
							answer++;//경우의 수 증가
						}
					}
				}
			}
		}
		return answer/6;//6으로 나눠주는 것은 중복을 방지하기 위해 3을뽑을때의 전체 경우의 수인 3*2=6으로 나눠줌


		
	}
}