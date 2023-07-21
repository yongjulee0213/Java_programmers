import java.util.ArrayList;
import java.util.List;
import java.lang.Math;

class Solution {
    public int solution(int number, int limit, int power) {
    List<Integer> cnt = new ArrayList<>(); // Attack power-filled list

    for (int num = 1; num <= number; num++) {
        int cnt_div = countDivisors(num);

        if (cnt_div > limit) {
            cnt.add(power);
        } else {
            cnt.add(cnt_div);
        }
    }

    int attack = 0;
    for (int n : cnt) {
        attack += n;
    }
    return attack;
}

private int countDivisors(int num) {
    int cnt_div = 0;
    int sqrtNum = (int) Math.sqrt(num);

    for (int i = 1; i <= sqrtNum; i++) {
        if (num % i == 0) {
            cnt_div++;

            // If both divisors are different, count twice
            if (num / i != i) {
                cnt_div++;
            }
        }
    }

    return cnt_div;
}

}