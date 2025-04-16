package ch_09_inheritance.part_03;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        student.learn();
        student.say();

        Teacher teacher = new Teacher();
        teacher.teach();
        teacher.say();


        Person person = new Person();
        // person.learn(); 자식 클래스의 메서드나 멤버 변수는 사용하지 못함.
    }
}
