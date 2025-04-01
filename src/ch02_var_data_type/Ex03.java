package ch02_var_data_type;

public class Ex03 {
    public static void main(String[] args) {
        /*
        int result = 에 1) 변수 4개를 모두 사용하고 2) 사칙연산중 + 연산만 사용해서
        9가 나오도록 코드를 완성.
         */

        long var1 = 2L;
        float var2 = 1.8f;
        double var3 = 2.5;
        String var4 = "3.9";
        int result = 0; // 이 부분만 수정. 0 대신 코드입력

        // 1) 결과값이 9 정수로 나와야 한다면 정수 연산으로 해야함.
        result = ((int)var1 + (int)var2 + (int)(var3 + Double.parseDouble(var4)));
        //result = (int) var1 + (int) var2 + (int) var3 + (int) Double.parseDouble(var4); // 8
        //result = (int) var1 + (int) var2 + (int) (var3 + Double.parseDouble(var4)); //
        System.out.println(result); // 9
//        System.out.println((int)var1); // 2
//        System.out.println((int)var2); // 1
//        System.out.println((int)(var3 + Double.parseDouble(var4))); // 6
    }
}
