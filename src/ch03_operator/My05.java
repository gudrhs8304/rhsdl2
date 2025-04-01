package ch03_operator;

public class My05 {
    public static void main(String[] args) {
        int num = 1;
        System.out.println(num); //1

        num++;
        System.out.println(num); //2

        System.out.println(++num); //3

        System.out.println(num++); //3

        System.out.println(num); //4

        //num = 4
        int num2 = 0;
        num2 = ++num; // num = num + 1 ; num2 = num;
        System.out.println(num); //5
        System.out.println(num2); //5

        num2 = num++; // num2 = num; num = num + 1;
        System.out.println(num); //6
        System.out.println(num2); //5
    }
}
