class Solution {
    public int solution(int n, String control) {
        for(int i=0;i<control.length();i++){//문자열길이를 알때는 length()
            char c=control.charAt(i);//문자받아
            if(c=='w'){//char이기때문에 ''로 받기
                n+=1;
            }
            else if(c=='s'){
                n-=1;
            }
            else if(c=='d'){
                n+=10;
            }
            else if(c=='a'){
               n-=10 ;
            }
        }
        return n;
    }
}