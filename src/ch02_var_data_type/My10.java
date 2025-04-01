package ch02_var_data_type;

public class My10 {
    public static void main(String[] args) {
        /*
            계산시 형변환
            -> 정수와 정수의 연산의 결과 값은 정수. 정수와 실수 연산의 결과값은 실수
            */
    // 국영수 점수의 평균을 구함.
    int kor, math, eng;
    kor = 55;
    math = 99;
    eng = 87;
    // 평균 = 총점 / 과목의 수
    // 총점 : 241
    // 평균 : 80.33333
    //System.out.println("총점: " + (kor + math + eng));
    int sum = kor + math + eng; // 총점
    System.out.println("총점: " + sum);

    int avg_01 = sum / 3;
    System.out.println("평균: " + avg_01); // 80

    double avg_02 = sum / 3;
    System.out.println("평균: " + avg_02); // 80.0 -> 정수 연산으로 정수 값이 나온 후에 실수에 저장.

    double avg_03 = (double)sum / 3; // 실수 / 정수
    System.out.println("평균: " + avg_03); //80.33333333333333

    double avg_04 = sum / 3.0; // 정수 / 실수
    System.out.println("평균: " + avg_04); //80.33333333333333

    double avg_05 = (double)sum / 3.0; // 실수 / 실수
    System.out.println("평균: " + avg_05); //80.33333333333333
    }
            }