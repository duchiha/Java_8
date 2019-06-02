package com.chapter5.supplier_Interface.example;

import java.util.stream.Stream;
import java.util.Random;

class SupplierExample {
	public static void main(String[] args) {
		Random random = new Random();
		Stream.generate(random::nextBoolean).limit(2).forEach(System.out::println);
	}
}
