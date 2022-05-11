package com.day25.etc;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class OptionalTest {

	public static void main(String[] args) {
		Optional<String> opt = Optional.ofNullable("자바 Optional 객체");
		System.out.println(opt.get());

		Optional<String> opt2 = Optional.ofNullable(null);
		if (opt2.isPresent())
			System.out.println(opt2.get());
		else
			System.out.println("null 값임!!");
		
		
		IntStream stream = IntStream.of(4, 2, 1, 3);
		OptionalInt result = stream.findFirst();
		
		System.out.println("\n\n"+result.getAsInt());

	}

}
