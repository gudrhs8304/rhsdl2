package ch02_var_data_type;

public class My13 {
    public static void main(String[] args) {
        int num = 3;
        System.out.println(num); // 3
        num = 4;
        System.out.println(num); // 4

        /*
            상수 : 프로그램 실행 중에 변경할 수 없는 고정된 값. 변수와는 다르게 대문자로 선언.
            형식 : final 데이터 타입 상수명 = 값;
         */
        final double PI = 3/14;
        // PI = 3.15; // 에러발생
        System.out.println(PI);
    }
}
