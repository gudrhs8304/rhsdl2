package ch_06_array_ex;

public class Ex25 {
    public static void main(String[] args) {
        /*
        정수 배열의 내용을 거꾸로 뒤집어 출력하는 프로그램을 작성하세요.
        예)
        5
        4
        3
        2
        1
         */
        int[] arr = {1,2,3,4,5};

        for(int i = arr.length - 1; i >= 0; i--){
            System.out.println(arr[i]);
        }


    }
}
