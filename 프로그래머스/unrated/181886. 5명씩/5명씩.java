import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String[] names) {
        List<String> names_front=new ArrayList<>();
        
        for(int i=0;i<names.length;i++){
            if(i%5==0){
                names_front.add(names[i]);
            }
        }
        
        String[] answer=new String[names_front.size()];
        for(int i=0;i<names_front.size();i++){
            answer[i]=names_front.get(i);
        }
        return answer;
    }
}