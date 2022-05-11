package com.day25.etc;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ReduceTest {

	public static void main(String[] args) {
		Stream<String> stream1 = Stream.of("넷", "둘", "셋", "하나");
		Stream<String> stream2 = Stream.of("넷", "둘", "셋", "하나");
		
		//Optional<T> reduce(BinaryOperator<T> accumulator)
		//
		Optional<String> result1
		= stream1.reduce((s1, s2) -> s1 + "++" + s2);
		result1.ifPresent(System.out::println);
		
		String result2 
		= stream2.reduce("시작", (s1, s2) -> s1 + "++" + s2);
		System.out.println(result2);
		
		//
		IntStream stream3 = IntStream.of(4,2,7,3,5,1,6);
		IntStream stream4 = IntStream.of(4,2,7,3,5,1,6);
		OptionalInt result3 = stream3.sorted().findFirst();
		System.out.println(result3.getAsInt());
		OptionalInt result4 = stream4.sorted().findAny();
		System.out.println(result4.getAsInt());
	}

}
