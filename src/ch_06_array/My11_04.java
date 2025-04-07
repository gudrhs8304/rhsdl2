package ch_06_array;

public class My11_04 {
    public static void main(String[] args) {
        /*
        로또 번호 생성기
        * 로또의 특징
        1) 공이 45개이다.
        2) 공에는 1 ~ 45 까지가 적혀있다.
        3) 최종 6개를 고르고. 중복된 번호를 허용하지않는다.
         */
        // 중복값
        int[] lotto = new int[6];

        for (int i = 0; i < lotto.length; i++) {
            lotto[i] = (int) (Math.random() * 45) + 1;

            //중복된 값이 있는지 확인
            for (int  j = 0; j < i; j++) {
                if (lotto[i] == lotto[j]) {
                    System.out.println(lotto[i] + " " + lotto[j]);
                    i--;
                    System.out.println("중복된 값이 있습니다.");
                    break;
                }
            }
        }
        //중복없이 출력
        for (int num : lotto) {
            System.out.print(num + " ");
        }
    }
}
