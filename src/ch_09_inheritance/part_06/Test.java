package ch_09_inheritance.part_06;

class Base {
    public Base(){
        System.out.println("Base() 생성자");

    }
    public Base(int x){
        System.out.println("Base(int x) 생성자");
    }
}
class Derived extends Base {
    public Derived() {
        super(10);
        System.out.println("Derived() 생성자");
    }
}


public class Test {
    public static void main(String[] args) {
        Derived derived = new Derived();
    }
}
