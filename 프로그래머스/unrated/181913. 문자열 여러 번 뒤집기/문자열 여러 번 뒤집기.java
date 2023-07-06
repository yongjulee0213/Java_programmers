class Solution {
    public String solution(String my_string, int[][] queries) {
		
		
        for(int i=0;i<queries.length;i++){
        	//System.out.println("my_string : "+my_string);
            int s=queries[i][0];
            int e=queries[i][1];
            //System.out.println("s : "+s+", e: "+e);
            
            String st_bf_s=my_string.substring(0,s);//처음부터 s전까지의 문자
            String st_s2e=my_string.substring(s,e+1);//s부터 e까지의 문자
            StringBuffer st_s2e_bf=new StringBuffer(st_s2e);//e~s문자로 뒤집기
            String st_e2s=st_s2e_bf.reverse().toString();
            String st_af_e=my_string.substring(e+1);//e부터 끝까지의 문자
            //System.out.println(st_bf_s+" "+st_s2e+" "+st_af_e);
            
            //연결
            my_string=st_bf_s+st_e2s+st_af_e;
            //공백제거
            my_string=my_string.replace(" ","");
            
            //StringBuffer st_s2e_bf = new StringBuffer(st_s2e);//replace로 하면 abab{{2,3}}에서 오류
            //String st_e2s = st_s2e_bf.reverse().toString();//replace로 하면 abab{{2,3}}에서 오류
            
            //System.out.println(st_s2e);
            //System.out.println(st_e2s);
            
            //s2e <-> e2s 바꾸기
            //my_string=my_string.replace(st_s2e, st_e2s);//replace로 하면 abab{{2,3}}에서 오류
            //my_string=my_string.

    
             
        }

        
        return my_string;
       
    }
}