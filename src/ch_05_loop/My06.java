package ch_05_loop;

public class My06 {
    public static void main(String[] args) {
        // 삼중 for문의 경우 변수명을 i,j,k 순서로 사용
        for (int i = 1; i <= 3; i++) { // 3번 반복
            System.out.println("---");
            System.out.println("i: " + i); // 3번
            for (int j = 1; j <= 3; j++) { // 3* 3
                System.out.println();
                System.out.println("j: " + j); // 3 * 3 = 9
                for (int k = 1; k <= 3; k++) {
                    System.out.println("k: " + k); // 3 * 3 * 3 = 27 반복
                }
            }
        }
    }
}
