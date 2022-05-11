package com.day25.etc;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FilterTest {

	public static void main(String[] args) {
		IntStream stream1 = IntStream.of(7,5,5,2,1,2,3,5,4,6);
		IntStream stream2 = IntStream.of(7,5,5,2,1,2,3,5,4,6);
		// 스트림에서 중복된 요소를 제거함.
		//Stream<T> distinct()
		stream1.distinct().forEach(e->System.out.print(e+" "));
		System.out.println();
		// 스트림에서 홀수만을 골라냄.
		//Stream<T> filter(Predicate<? super T> predicate)
		//IntStream filter(IntPredicate predicate)
		stream2.filter(n->n%2!=0).forEach(e->System.out.print(e+" "));
		
		System.out.println("\n================");
		//<R> Stream<R> map(Function<? super T,? extends R> mapper)
		Stream<String> stream3=Stream.of("HTML","CSS","JAVA","JAVASCRIPT");
		stream3.map(s -> s.length()).forEach(System.out::println);

	}

}
