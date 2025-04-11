package ch_08_class_ex.ex03;

public class Test {
    /* getter, setter 생성 할 것 */
    private String name;
    private int age;
    private short grade;
    private double avg;
    private int[] numArr;

    /*
    setter : 클래스 외부에서 값을 받아서 멤머 변수에 저장
    return type 은 void.
    매개 변수는 수정할 멤머변수와 같은 type 이어야함.

    getter : 클래스 외부에 멤버 변수의 값을 전달(반환)
    return type 은 멤머변수의 자료형과 일치.
    매개 변수는 필요없음.
    이름 앞에 get 을 붙이고 뒤에는 리턴할 멤버 변수의 이름.
     */
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    public void setGrade(short grade){
        this.grade = grade;
    }
    public short getGrade(){
        return grade;
    }

    public void setAvg(double avg){
        this.avg = avg;
    }
    public double getAvg(){
        return avg;
    }

    public void setNumArr(int[] numArr){
        this.numArr = numArr;
    }
    public int[] getNumArr(){
        return numArr;
    }
}
