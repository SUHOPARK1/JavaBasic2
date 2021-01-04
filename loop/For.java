package loop;
// 반복문

// 반복문이란 특정 조건이 true가 나오는 동안
// 코드 블락을 반복시키는 코드를 반복문이라고 한다.

import java.util.Arrays;

// 반복문에는 for 반복문과 while 반복문 2가지가 있다.
// for 반복문:   비교적 횟수가 명확하게 나옴.
// while 반복문: 조건식이 true인동안 계속 돌아감.

// for 반복문은
// 제어변수가 특정 조건식을 만족하는 동안 코드를 반복하고
// 제어변수의 값을 변화시켜서 다시 조건식을 체크해서 true면 반복, false면
// 반복종료가 된다.
public class For {
    public static void main(String[] args) {

        Arrays.asList(2).stream().forEach(i -> {
            for (; i < 4; i++) {
                System.out.println("i의 현재값: " + i.intValue());
            }
        });

        Arrays.asList(10).stream().forEach(i -> {
            for (; i < 0; i++) {
                System.out.println("실행될까?");
            }
        });

        Arrays.asList(0).stream().forEach(i -> {
            for (; i < 4; i++) {
                System.out.println("몇번 반복될까?");
            }
        });
        Arrays.asList(0).stream().forEach(i -> {
            for (; i < 4; i++) {
                System.out.println(i);
            }
        });
        int i = 0;
        for (; i < 4; i++) {
            System.out.println(i);
        }

    }
}
