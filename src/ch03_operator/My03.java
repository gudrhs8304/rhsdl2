package ch03_operator;

public class My03 {
    public static void main(String[] args) {
        /*
        증감연산자
        '단독으로 사용을 할 때'는 전위(++a)나 후위(a++)나 값이 동일.
         */
        int i = 5;
        i++; // i += 1; i = i + 1;
        System.out.println(i); // 6

        i = 5; // 결과를 비교하기 위해 i값을 다시 5로 변경.
        ++i; // i += 1; i = i + 1;
        System.out.println(i); // 6


    }
}
