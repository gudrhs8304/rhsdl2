package ch02_var_data_type;

public class My06 {

	public static void main(String[] args) {
		/*
		 결합 연산
		 
		 + 연산에서의 문자열 자동 변환
		 + 연산자는 두 가지 기능
		 1) 피연산자가 숫자일 경우에는 덧셈 연산
		 2) 피연산자 중 하나라도 문자열이면 나머지 피연산자도 문자열로 자동 변환되어서
		 	문자열 결합 연산을 수행
		 */
		// 숫자 결합 연산
		int value = 10 + 2 + 8;
		System.out.println("value : " + value); // value : 20
		
		// 문자열 결합 연산
		String str1 = 10 + 2 + "8";
		System.out.println("str1 : " + str1);  // str1 : 128
		// 연산자는 왼쪽에서 오른쪽으로 순서대로 실행이 되기 때문에
		// 12 + "8" 이 됨

		String str2 = 10 + "2" + 8;
		System.out.println("str2 : " + str2);  // str2 : 1028

		String str3 = "10" + 2 + 8;
		System.out.println("str3 : " + str3);  // str3 : 1028

		String str4 = "10" + (2 + 8);
		System.out.println("str4 : " + str4);  // str4 : 1010

	}

}
