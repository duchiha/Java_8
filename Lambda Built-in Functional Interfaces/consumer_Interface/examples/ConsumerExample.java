package com.chapter5.consumer_Interface.examples;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class ConsumerExample {
	
	public static void main(String[] args) {

		Stream<String> superGreeting = Stream.of("Hello", "World" , "using Consumer !");
		Consumer<String> consumer = System.out::println;

		superGreeting.forEach(consumer);

	}
	
	
	

}
