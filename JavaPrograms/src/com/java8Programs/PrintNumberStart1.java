package com.java8Programs;

import java.util.List;

public class PrintNumberStart1 {
	public static void main(String[] args) {
		List<Integer> list = List.of(1,18,31,42,51,113,42);
		list.stream().map(n -> String.valueOf(n)).filter(n -> n.startsWith("1")).forEach(System.out::println);
	}
}
