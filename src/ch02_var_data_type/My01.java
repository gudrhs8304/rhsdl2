package ch02_var_data_type;

public class My01 {

	public static void main(String[] args) {
		System.out.println("Hello");		
		System.out.println("Hi");
		//코드는 위에서부터 아래로 실행
		
		//변수에 데이터를 저장하는 이유 -> 데이터를 블록(스코프)안에서 재사용
		
		
		//변수에 데이터 저장하는 방법
		
		//데이터타입 변수이름 = 저장할 데이터;
		String msg = "hi"; // 문자열(String)을 저장할수 있는 변수(msg)에 "hi"라는 데이터를 저장
		//여기서 부터는 변수이름만 있으면 저장된 "hi"를 사용할 수 있음
		System.out.println(msg);
		
		//"Hello"도 변수에 저장.
		String msg1 = "Hello";
		System.out.println(msg1);
		
		String msg2; //변수선언
		msg2 = "hello"; //초기화
		
		msg = "hi!"; //변수에 저장된 값은 변경이 가능
		System.out.println(msg);
		
		
		
	}

}
