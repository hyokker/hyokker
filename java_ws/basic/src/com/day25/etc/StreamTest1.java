package com.day25.etc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest1 {

   public static void main(String[] args) {
      ArrayList<Integer> list = new ArrayList<Integer>();
      
      list.add(1);
      list.add(2);
      list.add(3);
      list.add(4);
      
      // 컬렉션에서 스트림 생성
      Stream<Integer> stream = list.stream();
      
      // forEach() 메소드를 이용한 스트림 요소의 순차 접근
      stream.forEach(System.out::println);
      
      //
      String[] arr = new String[]{"자바", "오라클", "스프링", "파이썬"};
      
      // 배열에서 스트림 생성
      //void forEach(Consumer<? super T> action)
      Stream<String> stream1 = Arrays.stream(arr);
      stream1.forEach(e -> System.out.print(e + " "));
      System.out.println();
      
      // 배열의 특정 부분만을 이용한 스트림 생성
      Stream<String> stream2 = Arrays.stream(arr, 1, 3);
      stream2.forEach(e -> System.out.print(e + " "));
      
      System.out.println("\n\n=======================");
      //static <T> Stream<T> of(T... values)
      // 가변 매개변수에서 스트림 생성
      Stream<Double> stream3 = Stream.of(4.2, 2.5, 3.1, 1.9);
      stream3.forEach(System.out::println);
      
      System.out.println("\n\n=======================");
      // 지정된 범위의 연속된 정수에서 스트림 생성
      //static IntStream range(int startInclusive, int endExclusive)
      IntStream stream4 = IntStream.range(1, 4);
      stream4.forEach(e -> System.out.print(e + " "));
      System.out.println();
      
      //static IntStream rangeClosed(int startInclusive, int endInclusive)
      IntStream stream5 = IntStream.rangeClosed(1, 4);
      stream5.forEach(e -> System.out.print(e + " "));

      // 빈 스트림 생성
      //<Object> Stream<Object> empty()
      Stream<Object> stream6 = Stream.empty();
      System.out.println(stream6.count()); // 스트림의 요소의 총 개수를 출력함.
   }

}