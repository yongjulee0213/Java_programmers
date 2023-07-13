class Solution {
    public int solution(String binomial) {
        //1. 공백기준으로 자르기
        String[] equation=binomial.split(" ");
        
        int a=Integer.parseInt(equation[0]);
        String op=equation[1];
        int b=Integer.parseInt(equation[2]);

        int result=0;
        
        switch(op){
            case "+":
                result= a+b;
                break;
            case "-":
                result= a-b;
                break;
            case "*":
                result=a*b;
                break;
                
            default:
                break;
        }
        return result;
    }
}