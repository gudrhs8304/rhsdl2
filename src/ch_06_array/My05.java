package ch_06_array;

public class My05 {
    public static void main(String[] args) {
        /* 최댓값, 최솟값 구하기 */
        int[] scores = {79, 88, 91, 33, 100, 55, 95};

        // int max = -1; // 최댓값
        // int min = 1000; // 최솟값
        int max = scores[0]; // 최댓값
        int min = scores[0]; // 최솟값

        // max: -1 -> 79 -> 88 -> 91 -> 100
        // min: 1000 -> 79 -> 33
        for (int i = 1; i < scores.length; i++) {
            //System.out.println(scores[i]);
            if (max < scores[i]) { // 최댓값
                max = scores[i];
            }
            if (min > scores[i]) { // 최솟값
                min = scores[i];
            }
        }


        System.out.println("최댓값 : " + max); // 100
        System.out.println("최솟값 : " + min); // 33
    }
}
