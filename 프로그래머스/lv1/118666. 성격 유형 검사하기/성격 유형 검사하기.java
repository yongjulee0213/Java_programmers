class Solution {
   public String solution(String[] survey, int[] choices) {

		int a=0, n=0, c=0, f=0, m=0, j=0, r=0, t=0;
		System.out.println("a:"+a+" c: "+c+" f: "+f+" m: "+m+" j: "+j+" r: "+r+" t: "+t+" n: "+n);
		
		for(int i=0;i<choices.length;i++){
			System.out.println("a:"+a+" c: "+c+" f: "+f+" m: "+m+" j: "+j+" r: "+r+" t: "+t+" n: "+n);
			if(choices[i]<4){//비동의라면
				int score=-choices[i]+4;//점수 3,2,1
				System.out.println("비동의 score"+score);
				switch(survey[i].charAt(0)){
					case 'A':
						a+=score; break;
					case 'C':
						c+=score; break;
					case 'F':
						f+=score; break;
					case 'M':
						m+=score; break;
					case 'J':
						j+=score; break;
					case 'R':
						r+=score; break;
					case 'T':
						t+=score; break;
					case 'N':
						n+=score; break;
					default:
						break;
				}
			}
			else if(choices[i]>4){//비동의라면
				int score=choices[i]-4;//점수 1,2,3
				System.out.println("동의 score"+score);
				switch(survey[i].charAt(1)){
					case 'A':
						a+=score; break;
					case 'C':
						c+=score; break;
					case 'F':
						f+=score; break;
					case 'M':
						m+=score; break;
					case 'J':
						j+=score; break;
					case 'R':
						r+=score; break;
					case 'T':
						t+=score; break;
					case 'N':
						n+=score; break;
					default:
						break;
				}
			}
		}//for문 종료
		System.out.println("a:"+a+" c: "+c+" f: "+f+" m: "+m+" j: "+j+" r: "+r+" t: "+t+" n: "+n);
		StringBuffer result=new StringBuffer();
		if(r>=t){
			result.append('R');
		}
		else{ result.append('T');}
		
		if(c>=f){
			result.append('C');
		}
		else{ result.append('F');}
		if(j>=m){
			result.append('J');
		}
		else{ result.append('M');}
		if(a>=n){
			result.append('A');
		}
		else{ result.append('N');}
		
		return result.toString();
		
    }
}