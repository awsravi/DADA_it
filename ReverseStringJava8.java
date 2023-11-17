package com.awsravi.sps;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseStringJava8 {
	public static void main(String[] args) {

		String s1 = "home";

		// 1st way
		List<String> lstr = Arrays.asList(s1.split(" "));

		String output = lstr.stream().map(s -> new StringBuilder(s).reverse()).collect(Collectors.joining(" "));
		System.out.println("StringBuilder use reversed string: "+output);

		// 2nd way

		String s2 = "syed";

		String rev = Arrays.stream(s2.split("")).sorted(Comparator.reverseOrder()).collect(Collectors.joining(""));

		System.out.println(" Sorted use reversed string: "+rev);

		// 3rd way
		String inputString = "ABCD";

		String reversed = inputString.chars().mapToObj(c -> (char) c)
				.reduce("", (s, c) -> c + s, (s11, s22) -> s22 + s11);

		System.out.println("mapToObj use reversed string: " + reversed);

	}
}