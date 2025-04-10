package ch_07_method;

public class My13 {
    /*
    3. 문자열에 의한 호출 방식
    예외적으로 문자열을 전달하면 참조형 데이터라도 값에 의한 호출을 함.
     */
    public static void setAddress(String addr){
        addr = "경기도 수원시 장안구";
    }

    public static void main(String[] args) {
        String address = "서울시 강남구 논현동";

        System.out.println("메서드 호출 전");
        System.out.println("address: " + address); //서울시 강남구 논현동

        setAddress(address);

        System.out.println("메서드 호출 후");
        System.out.println("address: " + address); // 서울시 강남구 논현동
    }
}
