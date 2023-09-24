package com.jsp.Arrays;

public class BubbleSort {

	public static int[] sortedArray(int arr[]) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++)

				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
		}

		return arr;
	}

	public static void main(String[] args) {

		int arr[] = { 12, 23, 56, 88, 90, 1, 33, 28, 95, 66, 7, 3 };
		int res[] = sortedArray(arr);

		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i] + " ");
		}
	}

}
