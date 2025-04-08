package ch_07_method;

import java.util.Scanner;

public class My02 {
    /*
    메서드 사용의 장점
    1. 코드반복을 줄일 수 있음
    대부분의 프로그램은 어떤 코드를 반복해서 사용.
    반복되는 코드를 방치하면 유지보수하는 사람은 코드로 불편을 느끼게 되고,
    코드가 반복되면 기억하기에 불편을 느끼게됨.
    또 코드를 개선하거나 유지보수할 때 여러 부분을 수정해야 하는 문제가 발생.
    Don't repeat yourself (Dry, 반복하지 마라) 원칙을 지키는 대표적인 방법이 바로 '메서드를 활용하는 것'

    2. 더 높은 추상화를 할 수 있다.
    내가 만들거나 남이 만든 프로그램을 읽을 때
    내부에 있는 코드를 하나하나 읽을 경우 프로그램을 빨리, 제대로 파악하기 어려움.
    메서드를 활용하면 세부 코드를 하나하나 신경 쓰지 않아도, '메서드 이름' 만으로 해당 부분의 기능을 파악할 수 있음.

    3명의 신장, 체중, 나이의 최댓값을 구해서 표시(메서드 이용)
    메서드를 만들 면 1) 코드가 줄어들어서 main 메서드의 기본 로직을 읽기 쉽고 2) 재사용을 할 수 있다.
     */
    static Scanner scanner = new Scanner(System.in);

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
            int maxHeight = getMax(height[0], height[1], height[2]);

            int maxWeight = getMax(weight[0], weight[1], weight[2]);

            int maxAge = getMax(age[0], age[1], age[2]);

            System.out.println("신장의 최댓값은 " + maxHeight + "입니다.");
            System.out.println("체중의 최댓값은 " + maxWeight + "입니다.");
            System.out.println("나이의 최댓값은 " + maxAge + "입니다.");
    }
}
