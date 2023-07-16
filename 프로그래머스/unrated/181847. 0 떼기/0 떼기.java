import java.util.List;
import java.util.ArrayList;
class Solution {
    public String solution(String n_str) {
	   List<String> n_str_list=new ArrayList<>();
	   for(int i=0;i<n_str.length();i++){
		   n_str_list.add(Character.toString(n_str.charAt(i)));
	   }
	   int idx=0;

	   while(n_str_list.get(0).equals("0")){
		   n_str_list.remove(0);

	   } 
	   System.out.println(n_str_list);
	   String answer="";
	   for(int i=0;i<n_str_list.size();i++){
		   answer+=n_str_list.get(i);
	   }
	   return answer;
	}
}