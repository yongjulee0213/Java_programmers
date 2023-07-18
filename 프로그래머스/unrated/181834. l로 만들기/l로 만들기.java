class Solution {

       public String solution(String myString) {
            StringBuilder result = new StringBuilder();//입력받은걸수정하는 습관은 좋지 않은 것이라 따로 만들어줌


        for (int i = 0; i < myString.length(); i++) {
            int compare = (int) myString.charAt(i);
            if (compare < 108) { // 'l'의 아스키 코드보다 작으면
                result.append('l');//l을 넣고
            } else {//l다음의 알파벳들에는 
                result.append(myString.charAt(i));//기존의 알파벳을 넣어줌
            }
        }

        return result.toString();
    }

    
}