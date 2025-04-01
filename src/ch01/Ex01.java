package ch01;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 다음 조건을 만족하는 프로그램을 작성하세요.
		 
		 조건:
		 1. 이름(name), 나이(age), 취미(hobby)를 저장하는 문자열 변수를 각각 선언하고 값을 저장하세요.
		 
		 2. 아래와 같은 형식으로 출력하세요:
		 안녕하세요. 제 이름은 홍길동 입니다.
		 제 나이는 20살입니다.
		 제 취미는 독서 입니다.
		 */
		
		String name = "김형곤";
		String age = "31";
		String hobby = "드라이브";
		
		System.out.print("안녕하세요 제 이름은 ");
		System.out.print(name);
		System.out.println("입니다.");
		System.out.print("제 나이는 ");
		System.out.print(age);
		System.out.println("입니다");
		System.out.print("제 취미는 ");
		System.out.print(hobby);
		System.out.println("입니다");
		
	
	}

}
