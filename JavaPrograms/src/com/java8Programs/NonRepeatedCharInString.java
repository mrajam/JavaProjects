package com.java8Programs;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeatedCharInString {
	public static void main(String[] args) {
		String str = "my name is maharaja";
		Character[] res = str.replace(" ", "").chars().mapToObj(c -> (char)c).toArray(Character[]::new);
		Arrays.stream(res).map(String::valueOf).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet().stream().filter(n -> n.getValue()==1).skip(2).forEach(System.out::println);
		
	}
}	
