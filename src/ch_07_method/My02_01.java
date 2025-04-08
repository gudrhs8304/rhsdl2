package ch_07_method;

import java.util.Scanner;

public class My02_01 {
    static Scanner scanner = new Scanner(System.in);

    static int getMin(int a, int b, int c) {
        int min = a;
        if (b < min) min = b;
        if (c < min) min = c;
        return min;
    }

    static int getMax(int a, int b, int c) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        return max;
    }

    static void inputData(int[] height, int[] weight, int[] age) {
        for (int i = 0; i < height.length; i++) {    //입력
            System.out.println("[" + (i + 1) + "]");
            System.out.print("신장: ");
            height[i] = scanner.nextInt();
            System.out.print("체중: ");
            weight[i] = scanner.nextInt();
            System.out.print("나이: ");
            age[i] = scanner.nextInt();
        }
    }
    public static void main(String[] args){
        /*
        메서드는 왜 필요한가?
         */
            // 입력 받은 3명의 신장, 체중, 나이의 최댓값을 구해서 출력


            int cnt = 3;
            int[] height = new int[cnt];  //신장
            int[] weight = new int[cnt];  //체중
            int[] age = new int[cnt];     //나이

            inputData(height, weight, age);


            // 신장의 최댓값을 구한다
            int minHeight = getMin(height[0], height[1], height[2]);

            int minWeight = getMin(weight[0], weight[1], weight[2]);

            int minAge = getMin(age[0], age[1], age[2]);

            System.out.println("신장의 최솟값은 " + minHeight + "입니다.");
            System.out.println("체중의 최솟값은 " + minWeight + "입니다.");
            System.out.println("나이의 최솟값은 " + minAge + "입니다.");
    }
}
