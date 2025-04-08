package ch_07_method;

public class My07_01 {
    double add(double num1, double num2) {
        double sum = num1 + num2;
        return sum;
    }
    public static void main(String[] args) {
        double num1 = 10.27;
        double num2 = 20.62;
        double result;

        My07_01 my07 = new My07_01();
        result = my07.add(num1, num2);
        System.out.println("두수의 합은 " + result); // 메서드의 반환 값을 저장해서 출력
        System.out.println("두수의 합은 " + my07.add(num1, num2)); // 메서드의 반환 값을 바로출력
    }
}
