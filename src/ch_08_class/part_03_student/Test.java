package ch_08_class.part_03_student;

public class Test {
    public static void main(String[] args) {
        Student student1 = new Student(); // class를 모델로 하는 객체 생성.
        //일반적인 데이터와 타입이 달라서 객체라고 함.
        // 변수 하나로 학생 한명의 여러 정보를 저장할 수 있음.
        student1.name = "김철수";
        student1.grade = 2;
        student1.kor = 100;
        student1.eng = 90;
        student1.math = 88;

        Student student2 = new Student();
        student2.name = "박영수";
        student2.grade = 1;
        student2.kor = 90;
        student2.eng = 70;
        student2.math = 98;

        student1.printStudent();
        student2.printStudent();
    }

}
