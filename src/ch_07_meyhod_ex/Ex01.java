package ch_07_meyhod_ex;

public class Ex01 {
    /* 정수를 전달받아 짝수인지 홀수인지 판단하여 문자열로 반환하는 메서드를 작성하세요. */

    static String checkEvenodd(int num) {
        if(num % 2 ==0) {
            return "짝수";
        } else {
            return "홀수";
        }
//    return num % 2 == 0 ? "짝수" : "홀수";
    }

    public static void main(String[] args) {
        System.out.println(checkEvenodd(4));
        System.out.println(checkEvenodd(7));
    }
}
