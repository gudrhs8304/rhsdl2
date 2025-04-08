package ch_07_method;

import java.util.Scanner;

public class My01 {
    public static void main(String[] args) {
        /*
        메서드는 왜 필요한가?
         */
        // 입력 받은 3명의 신장, 체중, 나이의 최댓값을 구해서 출력

        Scanner scanner = new Scanner(System.in);
        int cnt = 3;
        int[] height = new int[cnt];  //신장
        int[] weight = new int[cnt];  //체중
        int[] age = new int[cnt];     //나이

        for (int i = 0; i < cnt; i++) {    //입력
            System.out.println("[" + (i + 1) + "]");
            System.out.println("신장: ");
            height[i] = scanner.nextInt();
            System.out.println("체중: ");
            weight[i] = scanner.nextInt();
            System.out.println("나이: ");
            age[i] = scanner.nextInt();

        }

        // 신장의 최댓값을 구한다
        int maxHeight = height[0];
        if (height[1] > maxHeight) maxHeight = height[1];
        if (height[2] > maxHeight) maxHeight = height[2];

        int maxWeight = weight[0];
        if (weight[1] > maxWeight) maxWeight = weight[1];
        if (weight[2] > maxWeight) maxWeight = weight[2];

        int maxAge = age[0];
        if (age[1] > maxAge) maxAge = age[1];
        if (age[2] > maxAge) maxAge = age[2];

        System.out.println("신장의 최댓값은 " + maxHeight + "입니다.");
        System.out.println("체중의 최댓값은 " + maxWeight + "입니다.");
        System.out.println("나이의 최댓값은 " + maxAge + "입니다.");
    }
}
