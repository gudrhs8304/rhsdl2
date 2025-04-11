package ch_08_class_ex.ex01;

public class Member {
     /*
        현실 세계의 회원을 Member 클래스를 모델링 하려고 한다.
        회원의 데이터로는 이름, 아이디, 패스워드, 나이가 있다.
        이 데이터를 가지고 Member 클래스를 선언하라.

        이름 : name : 문자열
        아이디 : id : 문자열
        패스워드 : password : 문자열
        나이 : age : 정수
     */
    String name;
    String id;
    String password;
    int age;

    public String setName(){
        return name;
    }

    public void getName(String name){
        this.name = name;
    }

    public String setId(){
        return id;
    }

    public void getId(String id){
        this.id = id;
    }

    public String setPassword(){
        return password;
    }

    public void getPassword(String password){
        this.password = password;
    }
}
