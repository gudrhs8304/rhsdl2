package ch_08_class_ex.ex03;

public class Test02 {
    public static void main(String[] args) {
        Test test = new Test();
        test.setName("홍길동");
        test.setAge(20);
        test.setGrade((short) 1);
        test.setAvg(79.2);
        test.setNumArr(new int[]{1,2,3});


        System.out.println(test.getName());
        System.out.println(test.getAge());
        System.out.println(test.getGrade());
        System.out.println(test.getAvg());
        System.out.println(test.getNumArr());
    }
}
