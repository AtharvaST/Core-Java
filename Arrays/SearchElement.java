package com.jsp.Arrays;


// Correction to be done....


public class SearchElement {

	public static void searchInt() {
		int a[] = { 15, 34, 56, 98, 33, 17, 1, 84 };
		int element = 33;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == element) {
				System.out.println("Element Found ");
			} else {
				System.out.println("Element not found");
			}
		}
	}

	public static void main(String[] args) {

		searchInt();
	}

}
