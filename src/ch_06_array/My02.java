package ch_06_array;

public class My02 {
    public static void main(String[] args) {
        /*
        학생 5명의 성적을 가지고 총점과 평균을 구함
         */
        // 1. 배열을 사용하지 않는 경우
        int score_001 = 95;
        int score_002 = 76;
        int score_003 = 67;
        int score_004 = 56;
        int score_005 = 87;

        int total = score_001 + score_002 + score_003 + score_004 + score_005;
        double avg = (total / 5.0);
        System.out.println("총점은 " + total + "점이고, 평균은 " + avg + "입니다.");

        // 2. 배열을 사용하는 경우
        int[] scores = {95, 76, 67, 56, 87}; // 배열 생성
        System.out.println(scores.length); // scores.length -> 배열의 갯수

        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        System.out.println("총점은 " + sum + "입니다.");
        System.out.println(scores.length - 1);

    }
}
