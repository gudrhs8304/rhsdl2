package ch_08_class.part_04_student;

public class Student {
    // 메서드는 없는 클래스.
    String name; //이름
    int grade; // 학년
    int kor; // 국어 성적
    int eng; // 영어 성적
    int math; // 수학 성적

    public void printStudent() {
        System.out.println(name + "은 " + grade + "학년이고, 국어 성적은 " + kor + "점 입니다.");
    }

    public String getName() {
        /* name을 반환. */
        return name;
    }

    public void setName(String name) {
        /* name을 저장. */
        this.name = name;
    }

    // getter
    public int getGrade() {
        return this.grade;
    }

    // setter
    public void setGrade(int grade){
        this.grade = grade;
    }

    public int getKor() {
        return this.kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

}
