package ch_07_method;

import java.util.Scanner;

public class My03 {
    /*
    입력받은 세 정수값의 최댓값 구하기
     */

    /*
    메서드는 1) 어떤 입력을 받아 2) 특정 연산을 수행한 뒤 3) 결과를 반환하는 기능

    메서드 용어 정리
    1. 메서드 정의 : 메서드를 새로 만드는 것을 의미
    2. 메서드 호출 : 메서드를 실제로 사용하는 것을 의미
    3. 인수 : 메서드에 전달할 입력(input)을 의미. argument
    4. 매개변수 : 인수를 받아서 저장하는 변수를 의미. parameter
    5. 반환값 : 메서드의 출력(output)을 의미. return
     */
    static int getMax(int a, int b, int c) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        return max;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, num3;

        System.out.print("첫번째 정수: ");
        num1 = scanner.nextInt();
        System.out.print("두번째 정수: ");
        num2 = scanner.nextInt();
        System.out.print("세번째 정수: ");
        num3 = scanner.nextInt();

        int max = getMax(num1, num2, num3);

        System.out.println("세 정수값의 최댓값: " + max);
    }
}
