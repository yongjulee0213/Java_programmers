class Solution {
    public int solution(int a, int b, int c) {
        int result = 0; // Result variable to store the final result
        // All three numbers are equal
        if (a == b && b == c && a == c) {
            result = (a + b + c) * (a * a + b * b + c * c) * (a * a * a + b * b * b + c * c * c);
        }
        // Three numbers are all different
        else if (a != b && b != c && a != c) {
            result = a + b + c;
        }
        // Two numbers are equal
        else if (a == b || b == c || a == c) {
            result = (a + b + c) * (a * a + b * b + c * c);
        }
        
        
        return result;
    }
}
