package ch_08_class.part_04_student;

public class Test02 {
    public static void main(String[] args) {
        /*
        멤버 변수로 접근하는 방법은 1) 바로 접근 2) 메서드를 통한 접근이 가능.
        일반적으로는 메서드를 통한 접근을 사용
         */
        Student student1 = new Student();
        student1.setName("홍길동");
        System.out.println(student1.getName());

        Student student2 = new Student();
        student2.setName("김철수");
        System.out.println(student2.getName());


    }
}
