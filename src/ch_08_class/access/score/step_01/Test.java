package ch_08_class.access.score.step_01;

public class Test {
    public static void main(String[] args) {
        Score score = new Score();
        score.kor = -50; // 점수를 저장하는데 잘못된 값(마이너스)가 입력됨.
    }
}
