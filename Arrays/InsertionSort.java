package com.jsp.Arrays;

public class InsertionSort {
	
	public static int[] sortedArray(int[]arr) {
		for(int i=0;i<arr.length;i++) {
			int current = arr[i];
			int j=i-1;
		
			while(j>=0 && current <arr[j]) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = current;		
		}	
		
		return arr;
	}
	
	public static void main(String[] args) {
		int arr[]= {9,12,22,17,20,25,3,5,7};
		int res[]=sortedArray(arr);
		for(int i=0; i<arr.length;i++) {
			System.out.print(res[i]+" ");
		}
	}
}
