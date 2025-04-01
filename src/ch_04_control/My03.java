package ch_04_control;

public class My03 {
    public static void main(String[] args) {
        /*
        2. if ~ else
         if (조건식( {
            // 조건식이 참일때 실행할 코드
         } else {
            // 조건식이 거짓일때 실행할 코드
         }
         */
        int age = 15;

        if (age >= 19) {
        // 19세 이상이면 실행
            System.out.println("성인입니다");
            System.out.println("성인요금이 적용됩니다");
        } else {
            System.out.println("청소년입니다");
            System.out.println("청소년요금이 적용됩니다");
        }
        System.out.println("결제를 진행해 주세요");
    }
}
