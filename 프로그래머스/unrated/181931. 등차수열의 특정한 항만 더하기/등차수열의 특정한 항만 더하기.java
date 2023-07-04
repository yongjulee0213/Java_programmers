import java.util.ArrayList;
import java.util.List;
class Solution {
    public int solution(int a, int d, boolean[] included) {
        List<Integer> numbers = new ArrayList<>(); // List to store the arithmetic sequence
		
		// Generate the arithmetic sequence
		for (int i = 0; i < included.length; i++) {
			int tmp = a + d * i;
			numbers.add(tmp); // Add the number to the list
		}
		
		int result = 0; // Variable to store the sum
		
		// Sum the numbers where included is true
		for (int i = 0; i < included.length; i++) {
			if (included[i]) {
				result += numbers.get(i); // Add the number to the sum
			}
		}
		
		return result;
    }
}