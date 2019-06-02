package com.chapter5.predicate_Interface.examples;

import java.util.stream.Stream;

public class PredicateExampleII {

	public static void main(String[] args) {

		Stream.of("hello", "World").filter(s -> s.startsWith("h")).forEach(System.out::println);

	}

}
