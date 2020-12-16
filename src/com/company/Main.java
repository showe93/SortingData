package com.company;

/* Laura K. Gross
 * Bridgewater State University
 * December, 2020
 */

/* Modified by YOU
 * BSU
 * Date
 */
public class Main {

	public static void main(String[] args) {
		int[] data = {71, 39, 38, 68};
		int n = data.length;
		int storeSpot; // index at which to store the sorted element
		int swapSpot; // index of the element to swap into the storeSpot
		// Declare other variables as needed.
		for (int i = 1; i < n; i++) {
			storeSpot = n - i; // At each pass through outer loop, storeSpot moves right to left. (Position 0 is automatic.)
			System.out.println(storeSpot); // Confirm storeSpot for debugging purposes.
			// Initialize any other variables as needed.

			// Do an inner loop:
				// {Find both the *max* value between index 0 and storeSpot, inclusive, and the corresponding index *swapSpot*.}

			//  Swap max with data[storeSpot].
		}
		// Print the sorted array data.
	}
}
