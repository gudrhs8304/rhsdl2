package ch_06_array;

public class My03 {
    public static void main(String[] args) {
        int[] scores; // 배열의 주소가 저장될 변수 생성.
        scores = new int[3]; // 길이가 3인 배열 생성(연속된 주소를 가짐)하고 주소를 반환.
        // int[] scores = new int[3];

        System.out.println(scores); //[I@4eec7777

        // 정수 배열이 생성이 되고, 초기화를 하지 않으면 자동으로 0으로 초기화.
        System.out.println("현재 자동으로 초기화 된 값: " + scores[0]); // 0

        // 인덱스를 이용하여서 개별 요소의 값을 변경.
        scores[0] = 30; // 배열의 첫 번째 요소에 30을 저장
        scores[1] = 20; // 배열의 두 번째 요소에 20을 저장
        scores[2] = 10; // 배열의 세 번째 요소에 10을 저장
        System.out.println("현재 첫 번째 요소의 값: " + scores[0]); //30


    }
}
