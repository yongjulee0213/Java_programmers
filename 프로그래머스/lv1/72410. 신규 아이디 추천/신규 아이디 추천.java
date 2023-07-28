import java.util.regex.Pattern;
class Solution {
    public String solution(String new_id) {
		
		while(true){
			
			//1.소문자로 치환
			new_id=new_id.toLowerCase();//소문자로 바꾸고 다시 넣어줘야함
			System.out.println("1: "+new_id);
			
			StringBuffer remain=new StringBuffer();
			//2. 알파벳 소문자(얘는 당연하지) 숫자, 빼기, 밑줄, 마침표를 제외한 모든 문제 제거
			for(int i=0;i<new_id.length();i++){
				//알파벳 소문자, 숫자, 빼기, 밑줄, 마침표만 가져온다
				if (String.valueOf(new_id.charAt(i)).matches("[-|_.0-9a-z]")) {
				    remain.append(Character.toString(new_id.charAt(i)));
				}
			}//2종료
			System.out.println("2: "+remain);
			String tmp=remain.toString();
			
			//3. 마침표가 2번이상 연속된 부분을 하나의 마침표로 치환
			tmp=tmp.replaceAll("\\.{2,}",".");//{n,}최소 몇개,\\. . 이 있는가
			System.out.println("3: "+tmp);
			
			//4. 마침표가 맨 앞이나 끝에 있다면 제거
			tmp=tmp.replaceAll("^\\.","");//그냥 .만 하면 아무문자라는 뜻
			tmp=tmp.replaceAll("\\.$","");
			System.out.println("4: "+tmp);
			
			StringBuffer result=new StringBuffer(tmp);
			//5. 빈문자열이라면 a를넣어
			if(result.length()==0){
				result.append("a");
			}
			System.out.println("5: "+result);
			
			//6. 길이가 16이상이라면 첫 15개만 취한다
			if(result.length()>=16){
				String tmp_=result.substring(0,15);
				result=new StringBuffer(tmp_);
			
			}
			System.out.println("6: "+result);
			
			//7.길이가2자 이하라면, 마지막 문자를 전체길이가 3이될때까지 반복해서 뒤에 붙인다
			if(result.length()<=2){
				while(result.length()<3){
					result.append(result.charAt(result.length()-1));
				}
			}
			System.out.println("7: "+result);
			new_id= result.toString();
			System.out.println("new_id: "+new_id);
			System.out.println("첫번째조건: "+(new_id.length()>=3 && new_id.length()<=15));
			System.out.println("두번째조건: "+(Pattern.matches("^[a-z0-9\\-_.]+$",new_id)));
			System.out.println("세번째조건: "+(new_id.charAt(0)!='.' && new_id.charAt(new_id.length()-1)!='.'));
			if((new_id.length()>=3 && new_id.length()<=15)
					&& (Pattern.matches("^[a-z0-9\\-_.]+$",new_id))
					&& (new_id.charAt(0)!='.' && new_id.charAt(new_id.length()-1)!='.')){
				System.out.println("조건 다 맞아!");
				break;
			}
		}
		return new_id;
		
		
    }
}