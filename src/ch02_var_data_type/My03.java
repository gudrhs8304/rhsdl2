package ch02_var_data_type;

public class My03 {

	public static void main(String[] args) {
		/*
		 
		 *자바에서 기분 실수 타입은 double, 실수 값을 아무 접미사 없이 쓰면 자동으로 double로 인식.
		 *float을 사용할 경우 꼭 숫자 뒤에 f 또는 F를 붙여야 함.
		 *float보다 double이 더 정밀하고 자주 사용.
		 
		 */
		
		float f = 1.2345678901234567890F;
		System.out.println(f); // 1.2345679 -> 소숫점 8자리에서 반올림

		float f2 = 0.100000001f;
		System.out.println(f2); // 0.1
		
		double d = 0.100000001;
		System.out.println(d); // 0.100000001
	}

}
