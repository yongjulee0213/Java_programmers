import java.util.ArrayList;
import java.util.List;
class Solution {
   public int solution(int n, int[] lost, int[] reserve) {
		
		
		//학생번호로 이루어진 어레이
		List<Integer> students=new ArrayList<>();
		for(int i=1;i<=n;i++){
			students.add(i);
		}
		System.out.println(students);
		
		List<Integer> reserve_arr=new ArrayList<>();
		for(int i=0;i<reserve.length;i++){
			reserve_arr.add(reserve[i]);
		}
		System.out.println(reserve_arr);
		
		List<Integer> lost_arr=new ArrayList<>();
		for(int i=0;i<lost.length;i++){
			lost_arr.add(lost[i]);
		}
		System.out.println(lost_arr);
		
		for(int l:lost){//어레이로 두면 본인을 계속 참조해서 오류남
			if(reserve_arr.contains(l)){
				lost_arr.remove(Integer.valueOf(l));
				reserve_arr.remove(Integer.valueOf(l));
			}
		}
		System.out.println("reserve:" +reserve_arr);
		System.out.println("lost: "+lost_arr);
		int have=n-lost_arr.size();//하나씩 체육복을 가지고 있는 학생 수(전체-중복제거한 lost_arr개수 제외)
		
		//lost에도 있고 reserve에도 있어서 결국 자기가 입을 체육복만 가지고 있는 학생수
		System.out.println("초기 체육복가진애들수 : "+have);
		
		
		while(true){
			
			int start_num=0;//시작인덱스
			int end_num=students.size()-1;//마지막 인덱스(전체 학생길이-1)
			
			//맨 앞 학생이 여분이 있고 바로 뒤가 도난당했을때
			System.out.println(students.get(1)+" "+reserve_arr.contains(students.get(1))+" "+students.get(0)+" "+lost_arr.contains(students.get(0)));
			System.out.println(students.get(1)+" "+reserve_arr.contains(students.get(0))+" "+students.get(1)+" "+lost_arr.contains(students.get(1)));


			if((reserve_arr.contains(students.get(1)) && lost_arr.contains(students.get(0)))
					||(reserve_arr.contains(students.get(0)) && lost_arr.contains(students.get(1)))){//맨 앞은 바로 뒤 학생한테만 받아올 수 있음.
				System.out.println("앞에서 받거나 첫번째까 받았다구용");
				have++;
				System.out.println("체육복 가진 학생 수 업데이트: "+have);
				start_num=2;
			}
		
			else{//맨 앞 학생이 여분이 없거나 뒤에 학생이 도난당한 경우가 아니 경우에
				start_num++;//시작인덱스 하나 증가
			}
			System.out.println(start_num+"부터 자를거예요");
			students=students.subList(start_num, students.size());//0~end_num까지의 어레이 잘라서 다시 넣기
			System.out.println("잘랐어요:"+students);
			
			if(students.size()>1){
				//앞에서 못받았고 맨 뒤 학생이 여분이 있고 바로 앞이 도난당했을때 //맨 뒤에애는 바로 앞애한테만 받을 수 있음
				System.out.println("반대로"+reserve_arr.contains(students.get(students.size()-1))+" "+lost_arr.contains(students.get(students.size()-2)));
				System.out.println("뒤에서"+(reserve_arr.contains(students.get(0)) && lost_arr.contains(students.get(1))));
				
				if((reserve_arr.contains(students.get(students.size()-1)) && lost_arr.contains(students.get(students.size()-2)))
						||(reserve_arr.contains(students.get(students.size()-2)) && lost_arr.contains(students.get(students.size()-1)))){
					System.out.println("맨 뒤 학생이 여분이 있고 바로 앞이 도난당했을때");
					have++;//가지고 있는 학생수 증가
					System.out.println("체육복 가진 학생 수 업데이트: "+have);
					end_num=students.size()-3;//뒤에서 앞으로 2개인덱스 이동
				}
			
				else{//앞에서 받았거나 맨 뒤학생이 여분이 없거나 바로 앞이 도난당한 경우가 아닌 경우
					end_num=students.size()-2;//종료 인덱스 하나만 감소
				}
				
				System.out.println(end_num+"까지자를거예요");
				start_num=0;//시작종료인덱스 비교하기전에 시작점을 앞으로 돌려놓기
				if(end_num<start_num){
					break;
				}
				
				students=students.subList(0, end_num+1);//0~end_num까지의 어레이 잘라서 다시 넣기
				System.out.println("뒤 자른어레이 확인:"+students);
			}
			
			if(students.size()<2 || students.size()==0 || have==n ){
				System.out.println("break");
				break;
			}
			
		}
		
		System.out.println("have: "+have);
		
		return have;

		
    }
	
	
}