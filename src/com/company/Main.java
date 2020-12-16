package com.company;

/* Laura K. Gross
 * Bridgewater State University
 * December, 2020
 */

import java.util.Arrays;

/* Modified by Sean K. Howe
 * Bridgewater State University
 * December, 2020
 */
public class Main {

	public static void main(String[] args) {
		int[] data = {71, 39, 38, 68};
		int n = data.length;
		int storeSpot;// index at which to store the sorted element
		int swapSpot;//index of the element to swap into the storeSpot
		// Declare other variables as needed.
		for (int i = 0; i < n-1; i++) {
			// At each pass through outer loop, storeSpot moves right to left. (Position 0 is automatic.)
			 // Confirm storeSpot for debugging purposes.
			// Initialize any other variables as needed.

			storeSpot = i; //giving storeSpot a value
			for (swapSpot = i + 1; swapSpot < n; swapSpot++) {
				if (data[swapSpot] < data[storeSpot]){ //Check if the value at a certain place in the array is less then the value currently stored inside data[swapSpot]
						storeSpot = swapSpot;
				}

			}


			int temp = data[storeSpot]; //declare temp so that the new can be sorted appropriately into the list
			data[storeSpot]=data[i];
			data[i]=temp;

		}
		System.out.println(Arrays.toString(data));
		// Print the sorted array data.
	}
}
