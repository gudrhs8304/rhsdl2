package ch_08_class_ex.ex09;

public class Test {
    public static void main(String[] args) {
         /*
        강아지를 나타내는 Dog 클래스를 작성한다.

        # 필드
        name : 강아지의 이름. 인스턴스 멤버
        breed : 강아지의 종류. 예를 들면 "요크셔테리어", 인스턴스 멤버
        age : 강아지의 나이. 인스턴스 멤버

        # 메서드
        Dog(name, age) : 강아지의 이름과 나이를 초기화
        Dog(name, breed, age) : 강아지의 이름과 종류, 나이를 초기화
        braking() : 짖음
        setName(), getName()... : 각 속성에 대한 접근자와 설정자 메서드
        toString() : 강아지의 정보를 문자열로 반환
        */

        Dog dog1 = new Dog("york", "치와와", 2);
        System.out.println(dog1); // Dog{name='york', breed='치와와', age=2}
        dog1.braking(); //멍멍!!

        Dog dog2 = new Dog("york", 2);
        System.out.println(dog2); // Dog{name='york', breed='치와와', age=2}
        dog2.braking(); //멍멍!!
    }
}
