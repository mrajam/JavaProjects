package com.java8Programs;

import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfCharInString {

	public static void main(String[] args) {
		String str = "My name is maharaja";
		String res = str.replace(" ", "").toLowerCase();
		res.chars().mapToObj(c -> String.valueOf((char) c)).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
		.entrySet().forEach(n -> System.out.println(n.getKey()+" : "+n.getValue()));
	}
}
