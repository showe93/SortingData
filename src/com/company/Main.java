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
		// Declare other variables as needed.
		for (int i = 0; i < n-1; i++) {
			// At each pass through outer loop, storeSpot moves right to left. (Position 0 is automatic.)
			 // Confirm storeSpot for debugging purposes.
			// Initialize any other variables as needed.

			int idx = i; //Declaring the int idx
			for (int k = i + 1; k < n; k++) {
				if (data[k] < data[idx]){ //Check if the value at a certain place in the array is less then the value currently stored inside data[idx]
						idx= k;
				}

			}


			int temp = data[idx]; //declare temp so that the new can be sorted appropriately into the list
			data[idx]=data[i];
			data[i]=temp;

		}
		System.out.println(Arrays.toString(data));
		// Print the sorted array data.
	}
}
