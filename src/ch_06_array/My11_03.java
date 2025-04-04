package ch_06_array;

import java.util.Random;

public class My11_03 {
    public static void main(String[] args) {
        String[] students = {
                "김민경", "권기쁨", "이상현", "이병민", "김형곤",
                "엄주호", "남동하", "설현오", "이재욱", "박성원",
                "김동환", "김소영", "김나은", "윤남웅", "윤서정"};

        for (int i = 0; i < students.length; i++) {
            Random random = new Random();
           int idx = random.nextInt(15 - 1);
           String temp = students[0];
           students[0] = students[idx];
           students[idx] = temp;
        }
        for (int i = 0; i <= 5; i++) {
            System.out.print(students[i] + "/");
            System.out.print(students[i + 1] + "/");
            System.out.print(students[i + 2] + "\n");
        }
    }
}
