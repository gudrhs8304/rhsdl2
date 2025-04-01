package ch03_operator;

public class My09 {
    public static void main(String[] args) {
        double num1 = 3.14;
        double num2 = 3.15;
        System.out.println(num1 == num2); // false
        System.out.println(num1 != num2); // true

        /* 문자열의 경우 equals() 메서드를 이용해서 값을 비교 */
        String str1 = "Hello JAVA!";
        System.out.println(str1.equals("Hello JAVA!")); // true
        System.out.println(str1.equals("Hello Java!")); // false

        // String 에 비교연산자를 사용하면 메모리 주소를 비교 (나중에 객체에서 배움)
        System.out.println(str1 == "Hello JAVA!"); // true
        System.out.println(str1 == "Hello Java!"); // false
    }
}
