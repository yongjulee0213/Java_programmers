class Solution {
    public int solution(int a, int b, int n) {
    int r = 0; // Remainder of cola bottles
    int sum = 0; // Total number of cola bottles received

    while (n >= a) {
        r = n % a; // Calculate the remainder
        
        sum += (n/a)*b; // Add the received bottles to the sum
        n = (n/a)*b+r; // Calculate the new number of cola bottles received
        //n += r; // Add the remaining bottles to the new count
        r = 0; // Reset the remainder
        
    }

    return sum;
}

}