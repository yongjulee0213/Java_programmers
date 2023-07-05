class Solution {
    public String solution(int[] numLog) {
        //현재수와 이전수를 비교
        //현재수-이전수==
        //1 : w
        //-1 : s
        //10 : d
        //-10 : a
        String result="";
        for(int i=1;i<numLog.length;i++){
            int res=numLog[i]-numLog[i-1];
            if(res==1){
                result+="w";
            }
            else if(res==-1){
                result+="s";
            }
            else if(res==10){
                result+="d";
            }
            else if(res==-10){
                result+="a";
            }
        }
        return result;
    }
}