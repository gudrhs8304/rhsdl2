package ch03_operator;

public class My02 {
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 5;

        System.out.println(num2); // 5
        num2 = num1; // copy
        System.out.println(num2); // 3
        System.out.println(num1); // 3


        ++num1; //num1 += 1; // num1 = num1 + 1;
        System.out.println(num1); // 4

        num1 /= 2; // num1 = num1 / 2;
        System.out.println(num1); // 2

        num1 *= num1; //num1 = num1 * num1;
        System.out.println(num1); // 4

    }
}
