package ch_06_array;

public class My11_01 {
    public static void main(String[] args) {
        // swap : 자리바꿈
        int num1 = 10;
        int num2 = 20;

        num1 = num2;
        num2 = num1;
        System.out.println("num1 = " + num1 + " num2 = " + num2); // num1: 20, num2: 20

        // 2개의 수를 교환 할려면 제 3의 공간이 필요.
        num1 = 10;
        num2 = 20;
        int temp;
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("num1 = " + num1 + " num2 = " + num2); // num1: 20, num2: 10
    }
}
