package test01;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class Ex01 {

    @Test
    void test1() {
        int[] arr = {1, 2, 3, 4, 5, 6};  // 5, 4, 3, 2, 1
       // int[] arr2 = { 1, 2, 3, 4, 5, 6 };
        // 5 -> 1, 4 -> 2
        // 1 -> 5, 2 -> 4
        // 0 : 1  -> 4 : 5
        // 1 : 2  -> 3 : 5

        // 규칙이 있네요? 즉 배열 갯수 - 현재 인덱스번호 - 1  //  5 - 0  - 1-> 4
        //  5 - 1 - 1
        for (int i = 0; i < arr.length / 2; i++) {
            int j = arr.length - i - 1;
            System.out.printf("i=%d, j=%d%n", i, j);
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
