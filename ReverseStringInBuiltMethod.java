package com.awsravi.sps;

public class ReverseStringInBuiltMethod {
	public static void main(String[] args) {
		String s = "peeran";
		String rev = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			rev += s.charAt(i);
		}
		System.out.println("ReverseStringInBuiltMethod : "+rev);

		String str = "syed";
		StringBuilder sb = new StringBuilder(str);
		str = sb.reverse().toString();
		System.out.println("StringBuilder : "+str);
	}

}
