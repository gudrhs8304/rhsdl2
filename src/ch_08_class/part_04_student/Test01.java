package ch_08_class.part_04_student;

public class Test01 {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "홍길동";

        System.out.println(student.name);
        System.out.println(student.getName());

        /*
        Student 클래스 외부에서 Student 클래스의 변수(필드)에 접근할 수 있는 방법은 2가지.
        Student student = new Student();
        1) 바로 접근하는 방법. student.name
        2) 메서드로 접근하는 방법. student.getName()
        자바에서는 보안문제로 2번을 주로 사용하게 됨.
         */
        student.grade = 1;

        System.out.println(student.grade);
        System.out.println(student.getGrade());
    }
}
