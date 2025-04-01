package test;

public class Test02 {

	public static void main(String[] args) {
		  /*다음 조건에 맞게 변수들을 선언하고 값을 저장한 뒤, System.out.println()을 사용하여 출력하세요.

	        조건:
	            •	이름은 “홍길동” (문자열)
	            •	나이는 25 (정수)
	            •	키는 175.5 (실수)
	            •	성별은 ‘남’ (문자)
	            •	학생 여부는 true (불리언)

	        출력 예시:
	        이름: 홍길동
	        나이: 25
	        키: 175.5
	        성별: 남
	        학생 여부: true
			*/
		
		String name = "홍길동";
		int age = 25;
		double tall = 175.5;
		char male = '남';
		boolean student = true;
		
		System.out.println("이름은 " + name);
		System.out.println("나이는 " + age);
		System.out.println("키는 " + tall);
		System.out.println("성별은 " + male);
		System.out.println("학생 여부는 " + student);
		
		
	}

}
