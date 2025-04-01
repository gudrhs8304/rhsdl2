package ch03_operator;

public class My04 {
    public static void main(String[] args) {
        /*
        증감 연산자
        '단독으로 사용하지 않는 경우'에는 전위, 후위에 따라 결과 값이 다름
         */
        int i = 5, j = 5;

        System.out.println(++i); //6 증가 후 출력
        // i = i + 1; print i

        System.out.println(j++); //5 출력 후 증가
        // print j; j = j + 1

        System.out.println("i = " + i + ", j = " + j); // 6, 6
    }
}
