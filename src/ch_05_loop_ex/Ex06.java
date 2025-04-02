package ch_05_loop_ex;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        /*
        사용자로부터 임의의 양의 정수를 하나 입력받은뒤
        1부터 입력받은 정수까지 모든 정수의 합계를 출력하는 프로그램을 구현하세요.

        실행 예)
        임의의 양수를 입력하세요 >>> 5
        1부터 5사이의 모든 정수의 합계는 15입니다.
         */

        //사용자에게 숫자를 입력받아야 되니 scanner 변수 선언
        Scanner sc = new Scanner(System.in);

        //사용자에게 입력받을 숫자와 합계를 저장할 변수 선언
        int num ,sum = 0;
        //양수를 입력받음. 입력받은 변수는 for문과 마지막 출력문에 사용을 해야하니 (2번 사용) 변수에 저장.
        System.out.print("임의의 양수를 입력하세요 >>> ");
        num = sc.nextInt();
        //반복문을 이용해 합계를 구함
        for(int i = 1; i <= num; i++) {
            sum += i;
        }
        //합계 관련한 출력문 작성
        System.out.println("1부터 " + num + "사이의 모든정수의 합계는 " + sum + "입니다.");
    }
}
