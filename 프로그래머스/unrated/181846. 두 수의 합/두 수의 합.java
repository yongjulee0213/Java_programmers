import java.math.BigInteger;//범위가 큰 숫자 처리하기

class Solution {
    public String solution(String a, String b) {
        //bigInteger a,b 만들고 add함수 이용하여 a+b를 더하기
        BigInteger numA = new BigInteger(a);
        BigInteger numB = new BigInteger(b);
        BigInteger sum = numA.add(numB);

        return sum.toString();//tostring으로 반환 자료형 맞추기
    }
}
