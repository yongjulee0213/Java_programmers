import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
class Solution {
    public int solution(int p, int m, int[] score) {
        int price=p*m;//사과 한상자의 가격=최저사과점수*한상자에 담긴사과개수
        
        //가장 많은 사과를 팔았을때 얻을수 있는 최대이익.
        //한상자에 들어가는 사과의 개수 m
        //내림차순정렬
        
        List<Integer> score_arr=new ArrayList<>();
        for(int s: score){
        	score_arr.add(s);
        }
        Collections.sort(score_arr,Collections.reverseOrder());//높은 점수가 앞에 있음//[3,3,2,2,1,1,1]
        //System.out.println("내림차순 정렬후 어레이: "+score_arr);
        
        
        int max_score=0;
        for(int i=0;i<score_arr.size()/m;i++){//완전한 상자가 만들어질 수있을때까지
        	List<Integer> onebox=new ArrayList<>();//한 상자에 들어갈 사과
        	for(int j=m*i;j<m*i+m;j++){//한 상자에 m개가 찰때까지
            	onebox.add(score_arr.get(j));
            }
        	//System.out.println("한 상자에 들어감: "+onebox);
        	
        	max_score+=onebox.get(onebox.size()-1)*m;
        	//System.out.println(max_score);
        }
        
        
        return max_score;
        
    }
}