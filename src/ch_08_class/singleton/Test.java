package ch_08_class.singleton;

public class Test {
    public static void main(String[] args) {
//        Singleton singleton1 = new Singleton();
//        Singleton singleton2 = new Singleton();

        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton1);
        System.out.println(singleton2);

        if (singleton1 == singleton2) {
            System.out.println("같은 Singleton 객체입니다.");
        } else {
            System.out.println("다른 Singleton 객체입니다.");
        }
    }
}
