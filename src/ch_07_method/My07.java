package ch_07_method;

public class My07 {
    /* 매개변수, 변환 값 모두 있는 경우 */

    /* 두 개의 정수를 전달받아 두 수의 합을 반환하는 메서드 */
    int add(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
        // return 다음에 위치하는 데이터는 반드시 메서드의 리턴 타입과 일치해야 함.
        // return 3.5;  // 리턴 타입과 다른 데이터형을 반환하면 오류가 발생. (자동 형변환은 가능)
    }
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int result = 0;

        My07 my07 = new My07();

        // 반환 값이 있는 경우, 반환 값을 사용하는 2가지 형태
        // 1. 메서드의 반환 값을 변수에 저장해서 사용
        result = my07.add(num1, num2);
        System.out.println("두수의 합은 " + result);

        // 메서드의 반환 값을 바로 사용
        System.out.println("두수의 합은 " + my07.add(num1, num2));
    }
}
