package branch;

import java.util.Arrays;
// 사용자로부터 숫자를 입력 받아서
// 홀수일때만 "홀수입니다" 라고 출력되는 프로그램을 작성하시오.
// 단 짝수일때는 아무런 반응이 없습니다. (25분까지)
import java.util.Scanner;

public class If02 {
    public static void main(String[] args) {

        Arrays.asList(1, 3, 2).stream().forEach(i -> {
            System.out.println((i.intValue() % 2 == 1) ? "true" : "false");
        });

    }
}
