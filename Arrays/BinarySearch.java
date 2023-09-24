package com.jsp.Arrays;

import java.util.Arrays;

public class BinarySearch { // ERROR !!!!

	public static void binarySearch(int arr[], int key) {
		int low = 0;
		int high = arr.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;

			if (arr[mid] == key) {
				System.out.println("Element found at" + mid);
				break;
			} else if (arr[mid] < key) {
				low = mid + 1;
			} else if (arr[mid] < key) {
				high = mid - 1;
			} else {
				System.out.println("Element not found");
			}
		}

	}

	public static void main(String[] args) {

		int arr[] = { 2, 13, 18, 66, 20, 24, 33, 18, 66, 10 };
		Arrays.sort(arr);
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();

		binarySearch(arr, 66);
	}
}
