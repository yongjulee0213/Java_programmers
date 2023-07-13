import java.util.Stack;
class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        
        Stack<Integer> x=new Stack<>();
        
        for(int i=0;i<flag.length;i++){
        	if(flag[i]){
        		for(int j=0;j<arr[i]*2;j++){//arr[i]*2번 arr[i]를 스택에 넣기
        			x.push(arr[i]);
        			//System.out.println(x);
        		}
        	}
        	else{
        		for(int j=0;j<arr[i];j++){
        			x.pop();
        		}
        	}
        }
        
        
        int[] answer=new int[x.size()];
        
        for(int i=0;i<x.size();i++){
        	answer[i]=x.get(i);
        }
        return answer;
        
    }
}