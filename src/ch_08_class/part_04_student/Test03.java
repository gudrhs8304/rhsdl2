package ch_08_class.part_04_student;

public class Test03 {
    public static void main(String[] args) {
        /*
        참조 변수 복사
         */
        Student student1 = new Student();
        student1.setName("홍길동");

        Student student2 = new Student();
        student2.setName("김철수");

        System.out.println(student1); // @3b07d329
        System.out.println(student2); // @41629346
        System.out.println(student1.getName());
        System.out.println(student2.getName());
        // 두 객체가 저장된 주소가 다르니, 물리적으로 다른 주소에 저장이 된 걸 알 수 있음.
        // 패키지명, 클래스이름@메모리에저장된주소

        student1 = student2;
        System.out.println(student1);  //@41629346
        System.out.println(student2);  //@41629346
        System.out.println(student1.getName());
        System.out.println(student2.getName());
    }
}
