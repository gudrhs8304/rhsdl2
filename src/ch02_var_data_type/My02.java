package ch02_var_data_type;

public class My02 {

	public static void main(String[] args) {
		/*
		 자바의 정수형(정수 타입) 데이터 종류
		 byte  1바이트 -128 ~ 127
		 short 2바이트 -32,768 ~ 32767
		 int   4바이트 -2,147,483,648 ~ 2,147,483,647
		 long  8바이트 -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
		 
		 * 대부분의 일반적인 정수 값은 int를사용.
		 * long은 매우 큰 수를 다룰때 사용하며, 값 뒤에 L 또는 l을 붙여야 함.
		 * byte와 short는 메모리를 아껴야 할때 사용하지만 잘 쓰이지는 않음.
		 
		 */
		byte a = 100;
		short b = 30000;
		int c = 1000000000;
		long d = 100000000000L; // long은 숫자 뒤에 L,l을 붙여야 함.
		
		int var1 = 10;	//10진수로 저장
		int var2 = 012; //8진수로 저장
		int var3 = 0xA;	//16진수로 저장
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		
		/* long형을 사용할 경우, int의 범위를 벗어난 경우에는 접미사 L을 사용 */
		long var4 = 10L;
		long var5 = 20L;
		long var6 = 1000000000000L;
		
		System.out.println(var4);
		System.out.println(var5);
		System.out.println(var6);

		
	}

}
