package com.chapter5.predicate_Interface.examples;

import java.util.ArrayList;
import java.util.List;

public class RemoveIfMethod {

	// The removeIf() method of ArrayList is used to remove all
	// of the elements of this ArrayList that satisfies a given
	// predicate filter which is passed as a parameter to the method.

	public static void main(String[] args) {

		List<String> greeting = new ArrayList<>();
		greeting.add("hello");
		greeting.add("world");

		greeting.removeIf(s -> s.startsWith("h"));

		System.out.println(greeting);

	}

}
