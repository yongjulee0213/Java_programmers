import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String[] strArr) {
        String str="ad";
        List<String> result=new ArrayList<>();
        
        for(int i=0;i<strArr.length;i++){
            if(!strArr[i].contains(str)){
                result.add(strArr[i]);        
            }
        }
        String[] answer=new String[result.size()];
        for(int i=0;i<result.size();i++){
            answer[i]=result.get(i);
        }
        return answer;
    }
}