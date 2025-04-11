package ch_08_class_ex.ex02;

public class HighSchoolStudent {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;
    int total;
    double avg;


    public String setName(){
        return name;
    }
    public int getTotal(){
        return kor + eng + math;
    }

    public double getAverage() {
        return (double) getTotal() / 3;
    }

}
