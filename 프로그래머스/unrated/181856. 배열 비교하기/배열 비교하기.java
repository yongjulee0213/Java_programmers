class Solution {
    public int solution(int[] arr1, int[] arr2) {
		int result=0;//두 배열이 같다고 초기화
        //두 배열의 길이가 다르다면 배열의 길이가 긴쪽이 더 크다
		if(arr1.length!=arr2.length){
			if(arr1.length>arr2.length){//arr1이 더 크다면
				result=1;
			}
			else{//arr2가 더 크다면
				result=-1;
			}
		}
		else{//배열의 길이가 같다면
			int sum1=0;//원소의 합 저장 공간
			int sum2=0;
			
			for(int i=0;i<arr1.length;i++){
				sum1+=arr1[i];
				sum2+=arr2[i];
			}
			System.out.println(sum1+" "+sum2);
			if(sum1>sum2){//arr1이 더 크다면
				result=1;
			}
			else if(sum1==sum2){//두 배열이 같다면
				result=0;
			}
			else{//arr2가 더 크다면
				result=-1;
			}
			
		}
		return result;
        
    }
}