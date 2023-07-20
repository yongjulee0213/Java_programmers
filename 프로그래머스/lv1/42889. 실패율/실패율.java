import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Collections;
import java.util.Map.Entry;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
class Solution {
    public int[] solution(int N, int[] stages) {
		
		int wholeplayers=stages.length;//전체 플레이어의 수 초기화
		int stayedplayers=0;//해당 스테이지에 머물러있는 플레이어의 수 초기화
		double failrate=0;//실패율
		
		//매개변수를 변경하지말고 복사해서 가져오기
		List<Integer> stages_arr=new ArrayList<>();
		for(int s : stages){
			stages_arr.add(s);
		}
		
		Collections.sort(stages_arr);//오름차순 정렬
		//System.out.println("오름차순 확인"+stages_arr);
		
		HashMap<Integer, Double> result=new HashMap<>();//{스테이지번호, 실패율} 저장
		
		
		for(int i=1;i<=N;i++){
			
			wholeplayers=stages_arr.size();//stages가 변경될때마다 전체 길이 가져옴
			int current_stage=i;//현재 스테이지 저장
			
			
			//스테이지 삭제하면서 진행
			List<Integer> remove=new ArrayList<>();//삭제할 스테이지 저장 공간
			remove.add(current_stage);//삭제할 스테이지 넣기
			stages_arr.removeAll(remove);//기존 어레이에서 특정 스테이지 지우기
			
			stayedplayers=wholeplayers-stages_arr.size();//이전 스테이지 길이-변경된 스테이지 길이 = 삭제된 스테이지 길이
			
			if(wholeplayers!=0){
				failrate=(double)stayedplayers/wholeplayers;//실패율구하기
			}
			else{
				failrate=0;
			}
			
			//System.out.println(current_stage+" "+stages_arr+" "+stayedplayers+" "+wholeplayers+" "+(double)stayedplayers/wholeplayers);
			result.put(current_stage,failrate);//현재스테이지와 실패율을 해시맵에 넣기
			
		}
		
		
		//System.out.println("실패율계산 완료: "+result);
		//엔트리에 넣을때 실패율을 계산을 하고 넣어야 빈 리스트를 안본다
		List<Entry<Integer, Double>> result_ent=new LinkedList<>(result.entrySet());//해시맵을 sort하기위해 entry set을 list형태로 저장
		
		//실패율기준으로 내림차순하기
		Collections.sort(result_ent,new Comparator<Entry<Integer,Double>>() {
			public int compare(Entry<Integer, Double> obj1,Entry<Integer, Double> obj2 ){
				return obj2.getValue().compareTo(obj1.getValue());
			}
		});
		
		//결과 출력
		//System.out.println("내림차순 정렬 완료"+ result_ent);
		
		List<Integer> keys_arr=new ArrayList<>();
		for(Entry<Integer, Double> entry: result_ent){
			keys_arr.add(entry.getKey());
			//System.out.println(entry.getKey()+" - "+entry.getValue());
		}
		
		//키값만 넣어서 리턴
		int[] keys=new int[result_ent.size()];
		for(int i=0;i<keys_arr.size();i++){
			keys[i]=keys_arr.get(i);
		}

		return keys;
		
		
		
    }
}