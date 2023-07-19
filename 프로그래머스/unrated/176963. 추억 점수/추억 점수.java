import java.util.HashMap;
import java.util.Map;

class Solution {
    
public int[] solution(String[] name, int[] yearning, String[][] photo)  {
		
		Map<String, Integer> scoresMap = new HashMap<>();//이름당 점수를 저장할 해쉬맵
	    int[] scores = new int[photo.length];//리턴할 계산된 점수 저장하는 리스트
	    
	    //1. 해시맵 만들기 : (이름, 점수)
	    for (int i = 0; i < name.length; i++) {
	        scoresMap.put(name[i], yearning[i]);
	    }

	    for (int i = 0; i < photo.length; i++) {
	        int score = 0;//각 사진(배열하나)마다 점수를 계산하기 위해 여기서 초기화

	        for (int j = 0; j < photo[i].length; j++) {
	            if (scoresMap.containsKey(photo[i][j])) {//해시맵의 키값이 사진에 있는 인물의 이름을 포함하면
	                score += scoresMap.get(photo[i][j]);//해시맵에서 키값(이름)에 해당하는 값을 가져와 저장함.
	            }
	        }

	        scores[i] = score;//리턴할 리스트에 점수 저장
	    }

	    return scores;

	}

}