package ch_06_array_ex;

import java.util.Scanner;

public class Ex26 {
    public static void main(String[] args) {
        /*
        사용자가 입력한 숫자와 일치하는 요소가 배열에 존재하는지 여부를 검사하는 프로그램을 작성하세요.
        int[] arr = {5, 10, 15, 20, 25};

        ex)
        검색할 숫자 입력: 15
        배열에 존재합니다.

        검색할 숫자 입력: 7
        배열에 존재하지 않습니다.
         */
        int[] arr = {5, 10, 15, 20, 25};
        Scanner scanner = new Scanner(System.in);
        int num;
        boolean isFlag = false;
        System.out.print("검색할 숫자 입력: ");
        num = scanner.nextInt();

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == num){
                System.out.println("배열에 존재합니다.");
                isFlag = true; // for문이 끝나더라도 결과값을 알수있도록 값을 변경
                break; // 같은 값이 있는지 확인을했으면 더이상 반복을 하더라도 결과에는 영향이 없음.
            }
        }

        // isFlag가 true이면 for문안의 if (arr[i] == num) 참이었다는 추론이 가능
        // isFlag가 false이면 for문안의 if문안의 명령문이 실행이 안되었음. 그러니 반복문을 빠져 나옴.

        if (!isFlag) {
            System.out.println("배열에 존재하지 않습니다.");
        }




    }
}
