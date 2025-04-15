package ch_08_class.access.score.step_02;

public class Score {
    /* 필드의 접근 지정자를 private로 변경하고
    국어 성적을 입력받을 때 정상적인 범위의 값만 입력받도록 작업
     */
    private int kor;
    private int eng;
    private int math;

    public void setKor(int kor) {
        if (kor <= 100 && kor >= 0) {
            this.kor = kor;
        } else {
            System.out.println(kor + "는 올바른 값(범위 0 ~ 100)이 아닙니다.");
        }
    }
}
