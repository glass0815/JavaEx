package com.$06Stream;

import java.util.Arrays;
import java.util.Comparator;

public class Sample {
    // 짝수만 뽑아서 중복제거하고 역순으로 정렬하는 프로그램
    public static void main(String[] args) {
        int[] data = {5, 6, 4, 2, 3, 1, 1, 2, 2, 4, 8};

        int[] result = Arrays.stream(data)      // IntStream을 생성한다.
                        .boxed()                                // IntStream을 Stream<Integer>로 변경한다.
                        .filter((a) -> a % 2 == 0)               // 짝수만 뽑아낸다.
                        .distinct()                             // 중복을 제거한다.
                        .sorted(Comparator.reverseOrder())      // 역순으로 정렬
                        .mapToInt(Integer::intValue)            // Stream<Integer>를 IntStream으로 변경한다.
                        .toArray()                              // int[] 배열로 반환한다.
                        ;
        System.out.println(Arrays.toString(result));
    }
}