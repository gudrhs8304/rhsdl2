package ch_08_class.access.score.step_04;

public class Score {
    /*
    1) 수학 성적을 입력받는 setter 를생성하고,
    2) setKor()과 중복되는 코드를 메서드화
     */
    private int kor;
    private int eng;
    private int math;

    public Score(int kor, int eng, int math) {
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public void setKor(int kor) {
        if (isCurrentScore(kor)) {
        } else {
            printError(kor);
        }
    }


    public void setMath(int math) {
        if (isCurrentScore(math)) {
        } else {
            printError(math);
        }
    }

    public void display() {
        System.out.println("{kor:" + kor + ", eng:" + eng + ", math:" + math + "}");
    }

    private void printError(int score) {
        System.out.println(kor + "는 올바른 값(범위 0 ~ 100)이 아닙니다.");
    }

    private boolean isCurrentScore(int score) {
        return score <= 100 && score >= 0;
    }
}


