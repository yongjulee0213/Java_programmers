import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String[] str_list) {
        List<String> str_list_ = new ArrayList<>();
        for (int i = 0; i < str_list.length; i++) {
            str_list_.add(str_list[i]);
        }
        List<String> result = new ArrayList<>();

        int idx_l=-1;
        if(str_list_.indexOf("l")!=-1){
        	idx_l=str_list_.indexOf("l");
        }
        int idx_r=-1;
        if(str_list_.indexOf("r")!=-1){
        	idx_r=str_list_.indexOf("r");
        }
        int n;
        if(idx_l!=-1&& idx_r!=-1){
	        if (idx_l < idx_r) {
	            n = idx_l;
	            System.out.println(n);
	            result.addAll(str_list_.subList(0, n));
	        } 
	        else {
	            n = idx_r;
	            result.addAll(str_list_.subList(n + 1, str_list_.size()));
	        }
        }
        else if(idx_l!=-1){
        	n = idx_l;
            System.out.println(n);
            result.addAll(str_list_.subList(0, n));
        }
        else if(idx_r!=-1){//l과 r이 둘다 없을수도 있으므로
        	n = idx_r;
        	System.out.println("오른"+n);
            result.addAll(str_list_.subList(n + 1, str_list_.size()));
        }
        

        if (result.isEmpty()) {
            String[] answer = new String[0];//빈리스트 할당시 크기를 0으로 설정하면 된다.
            return answer;
        } else {
            String[] answer = new String[result.size()];
            for (int i = 0; i < result.size(); i++) {
                answer[i] = result.get(i);
            }
            return answer;
        }
    }
}
