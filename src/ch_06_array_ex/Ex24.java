package ch_06_array_ex;

public class Ex24 {
    public static void main(String[] args) {
        /*
        아래 문자열 배열에서 길이가 5 이상인 문자열만 출력하는 프로그램을 작성하세요.
        String[] words = {"apple", "cat", banana", "dog", "elephant"};
        예)
        apple
        banana
        elephant
         */
        String[] words = {"apple", "cat", "banana", "dog", "elephant"};
        System.out.println(words[3]); // 0 ~ 4

        for(int i = 0; i < words.length; i++) { // i : 0 ~ 4
            if (words[i].length() >= 5) {
                System.out.println(words[i]);
            }
        }

        System.out.println();

        for (String word : words){
            if(word.length() >= 5){
                System.out.println(word);
            }
        }
    }
}
