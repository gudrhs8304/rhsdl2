package ch_08_class.access.score.step_03;

public class Score {
   /*
   1) 생성자를 통해 3과목의 성적을 입력받도록 하고,
   Score score = new Score(100, 80, 95);
   2) 3과목의 성적을 한번에 출력 가능한 display() 메서드 작성
    */
    private int kor;
    private int eng;
    private int math;

    public Score (int kor, int eng, int math){
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public void display() {
        System.out.println("{kor:" + kor + ", eng:" + eng + ", math:" + math + "}");
    }

    public void setKor(int kor) {
        if (kor <= 100 && kor >= 0) {
            this.kor = kor;
        } else {
            System.out.println(kor + "는 올바른 값(범위 0 ~ 100)이 아닙니다.");
        }
    }
}
