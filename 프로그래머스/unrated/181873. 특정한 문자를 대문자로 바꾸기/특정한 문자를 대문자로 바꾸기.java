class Solution {
    public String solution(String my_string, String alp) {
        String answer = my_string.replace(alp,alp.toUpperCase());//기존문자, 바꿀문자
        return answer;
    }
}