package ch_07_method;

public class My13_01 {
    /*
    3. 문자열에 의한 호출 방식
    값에 의한 호출이기 때문에 값을 변경할려면 변경된 문자열을 리턴하고
    호출한 쪽에서 값을 저장하면 됨.
     */
    public static String setAddress(String addr){
        addr = "경기도 수원시 장안구";
        return addr;
    }

    public static void main(String[] args) {
        String address = "서울시 강남구 논현동";

        System.out.println("메서드 호출 전");
        System.out.println("address: " + address); //서울시 강남구 논현동

       address = setAddress(address);


        System.out.println("메서드 호출 후");
        System.out.println("address: " + address); // 서울시 강남구 논현동
    }
}
