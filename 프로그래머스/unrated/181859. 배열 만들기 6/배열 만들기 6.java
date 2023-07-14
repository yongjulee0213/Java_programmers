import java.util.Stack;
class Solution {
    public int[] solution(int[] arr) {
        
        Stack<Integer> stk=new Stack<>();
        
        for(int i=0;i<arr.length;i++){
        	if(stk.size()==0){//빈 배열이라면
        		stk.add(arr[i]);//arr[i]을 추가
        	}
        	else{//stk에 원소가 있고
        		if(stk.get(stk.size()-1)==arr[i]){//stk의 마지막 원소가 arr[i]와 같다면
        			stk.pop();//stk의 마지막 원소를 제거
        		}
        		else{//마지막 원소가 다르면
        			stk.add(arr[i]);//stk 맨 마지막에 추가
        		}
        	}
        		
        }
        if(stk.size()>0){
        	int[] answer=new int[stk.size()];
            for(int i=0;i<stk.size();i++){
            	answer[i]=stk.get(i);
            }
            
            return answer;
        }
        else{
        	int[] answer={-1};
        	return answer;
        }
        
    }
}