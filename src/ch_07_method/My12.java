package ch_07_method;

public class My12 {
    /*
    2. 참조에 의한 호출 방식
    매개변수의 타입이 참조형 타입일 때 사용.
    참조에 의한 호출은 메서드 호출 시 참조 데이터의 위치가 매개변수에 전달.
     */
    public static void increase(int[] array) {
        for (int i = 0 ; i < array.length; i++) {
            array[i]++;
        }
    }
    public static void main(String[] args) {
        int[] refArray = {100, 800, 1000}; // 배열 선언 및 초기화. 배열은 참조형 데이터

        System.out.println("메서드 호출 전");
        for(int i = 0; i< refArray.length; i++) {
            System.out.println("refArray[" + i + "] " + refArray[i]);
        }

        increase(refArray); // 리턴이 없음.

        System.out.println("메서드 호출 후");
        // 배열은 참조형이라 메서드 호출 후 값이 변경.
        for(int i = 0; i< refArray.length; i++) {
            System.out.println("refArray[" + i + "] " + refArray[i]);
        }
    }
}
