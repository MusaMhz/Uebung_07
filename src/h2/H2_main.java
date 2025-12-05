package h2;

import java.util.Arrays;

public class H2_main {
	public static void main ( String [] args) {
		// Beispiel 1
        int[] a1 = {2, 7, 1, 9};
        int[] b1 = {5, 6, 7};
        int[] result1 = change(a1, b1, 2, 4);
        System.out.println("change([2,7,1,9], [5,6,7], 2, 4) = " + Arrays.toString(result1));
        
        // Beispiel 2  
        int[] a2 = {2, 7, 1, 9};
        int[] b2 = {2, 7, 1, 9};
        int[] result2 = change(a2, b2, 2, 4);
        System.out.println("change([2,7,1,9], [2,7,1,9], 2, 4) = " + Arrays.toString(result2));
        
        // Beispiel 3
        int[] a3 = {2, 7, 1, 9};
        int[] b3 = {2, 7, 1, 9};
        int[] result3 = change(a3, b3, 3, 2);
        System.out.println("change([2,7,1,9], [2,7,1,9], 3, 2) = " + Arrays.toString(result3));
    }
    
    public static int[] change(int[] a, int[] b, int start, int end) {
        if (end <= start) {
            return new int[0];
        }
        
        if (Arrays.compare(a, b) != 0) {
            return Arrays.copyOfRange(a, 0, a.length);
        } else {
            int[] sorted = Arrays.copyOf(a, a.length);
            Arrays.sort(sorted);
            return Arrays.copyOfRange(sorted, start, end);
        }
    }
}