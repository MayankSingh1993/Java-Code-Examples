package FindMaxAndMinInArray;

import java.util.Arrays;
import java.util.List;

public class FindMaxAndMinInArray {

	public static void main(String[] args) {
		List<Integer> arr = Arrays.asList( 2, 3, 17, 1, 8, -3, 5, 0 );
		int min = findMin(arr);
		int max = findMax(arr);
		System.out.println("The minimum value in this array is : " + min);
		System.out.println("The maximum value in this array is : " + max);
	}
	
	public static int findMin( List<Integer> array ) {
		int min = Integer.MAX_VALUE;
		for( Integer a : array ) {
			if( a < min ) {
				min = a;
			}
		}
		return min;
	}
	
	public static int findMax( List<Integer> array ) {
		int max = Integer.MIN_VALUE;
		for( Integer a : array ) {
			if( a > max ) {
				max = a;
			}
		}
		return max;
	}
}
