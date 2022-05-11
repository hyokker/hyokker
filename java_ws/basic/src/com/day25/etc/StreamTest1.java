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
      
      // �÷��ǿ��� ��Ʈ�� ����
      Stream<Integer> stream = list.stream();
      
      // forEach() �޼ҵ带 �̿��� ��Ʈ�� ����� ���� ����
      stream.forEach(System.out::println);
      
      //
      String[] arr = new String[]{"�ڹ�", "����Ŭ", "������", "���̽�"};
      
      // �迭���� ��Ʈ�� ����
      //void forEach(Consumer<? super T> action)
      Stream<String> stream1 = Arrays.stream(arr);
      stream1.forEach(e -> System.out.print(e + " "));
      System.out.println();
      
      // �迭�� Ư�� �κи��� �̿��� ��Ʈ�� ����
      Stream<String> stream2 = Arrays.stream(arr, 1, 3);
      stream2.forEach(e -> System.out.print(e + " "));
      
      System.out.println("\n\n=======================");
      //static <T> Stream<T> of(T... values)
      // ���� �Ű��������� ��Ʈ�� ����
      Stream<Double> stream3 = Stream.of(4.2, 2.5, 3.1, 1.9);
      stream3.forEach(System.out::println);
      
      System.out.println("\n\n=======================");
      // ������ ������ ���ӵ� �������� ��Ʈ�� ����
      //static IntStream range(int startInclusive, int endExclusive)
      IntStream stream4 = IntStream.range(1, 4);
      stream4.forEach(e -> System.out.print(e + " "));
      System.out.println();
      
      //static IntStream rangeClosed(int startInclusive, int endInclusive)
      IntStream stream5 = IntStream.rangeClosed(1, 4);
      stream5.forEach(e -> System.out.print(e + " "));

      // �� ��Ʈ�� ����
      //<Object> Stream<Object> empty()
      Stream<Object> stream6 = Stream.empty();
      System.out.println(stream6.count()); // ��Ʈ���� ����� �� ������ �����.
   }

}