package ch03_operator_ex;

public class Ex01 {
    public static void main(String[] args) {
        /*
        연필 534자루가 있고, 학생 30명이 있음.
        학생들에게 연필을 똑같은 개수로 나누어 줄 때 1) 학생당 몇개를 가질수 있고,
        2) 최종적으로 몇개가 남는지 구하시오.
         */
        int pencils = 534;
        int student = 38;

        //학생 한명이 가지는 연필 수
        int pencilsPerStudent = (pencils / student);
        System.out.println(pencilsPerStudent);

        //남은 연필 수
        int pencilsLeft = (pencils % student);
        System.out.println(pencilsLeft);
    }
}
