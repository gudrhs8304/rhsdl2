package ch03_operator_ex;

public class Ex02 {
    public static void main(String[] args) {
        /*
        다음은 십의 자리 이하는 버리는 코드.
        변수 value의 값이 356이라면 300이 나올수 있도록 코드 작성. 산술 연산자만 사용.
        코드 작성 후 value의 값을 다른 세자리 이상의 숫자로 변경하고 맞게 나오는지 확인.
         */
        int value = 356;
        System.out.println(value / 100 * 100);
        System.out.println(value - (value % 100));




    }
}
