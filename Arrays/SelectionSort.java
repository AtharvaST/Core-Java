package com.jsp.Arrays;

public class SelectionSort {

	public static int[] sortedArray(int arr[]) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i+1; j < arr.length; j++)
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
		}
		return arr;
	}

	public static void main(String[] args) {

		int arr[] = { 7, 6, 9, 1, 8, 3 };
		int res[] = sortedArray(arr);

		for (int i = 0; i < res.length; i++) {

			System.out.print(res[i] + " ");
		}

	}

}
