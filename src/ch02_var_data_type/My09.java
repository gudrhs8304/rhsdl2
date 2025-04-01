package ch02_var_data_type;

public class My09 {
    public static void main(String[] args) {
        /*
         자동 형변환은 프로그램 작성자가 별도의 작업을 하지 않아도
         자바가 알아서 알맞은 타입으로 변환.
         작은 범위에서 큰 범위로 변경되는 경우 -> 값 손실이 없음.
         */
        byte num1 = 127; // byte가 가질 수 있는 최대값
        int num2 = num1; // 자동 형변환 (byte -> int)
        System.out.println(num2); // 127

//        byte num3 = num2; // int 자료형을 byte 변수에 대입하면 자동형변환이 안됨.
//        System.out.println(num3);

        float num4 = num2;
        System.out.println(num4); // 127.0

       // int num5 = num4; // float 자료형을 int 변수에 대입하면 자동형변환이 안됨.

        /*
            명시적 형변환 : 개발자가 변수의 자료형을 강제로 바꾸는 것
            형식 : (변환하고자하는 타입) 변수명
         */
        int num11 = 263;
        byte num12 = (byte)num11;
        System.out.println(num12); // 명시적 형변환 263 - 256 = 7

        float num13 = 3.14F;
        int num14 = (int) num13;
        System.out.println(num14); // 3

        
    }
}
