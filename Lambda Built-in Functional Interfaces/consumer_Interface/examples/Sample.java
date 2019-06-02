package com.chapter5.consumer_Interface.examples;

import java.util.stream.Stream;

public class Sample {

	public static void main(String[] args) {

		Stream.of("Java 8 ", "is Cool").forEach(System.out::println);

	}

}
