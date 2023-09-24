package com.jsp.Arrays;

public class CheckPalindrome {
	public static boolean checkPalindrome(String s) {
		
		int low = 0;
		int high = s.length()-1;
		
		while(low<high) {
			if(s.charAt(low)!=s.charAt(high)) {
				return false;
			}
			else {
				low++;
				high--;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		String s1="RADAR";
		System.out.println(checkPalindrome(s1));
	}

}
