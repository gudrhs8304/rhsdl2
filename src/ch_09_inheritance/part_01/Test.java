package ch_09_inheritance.part_01;

public class Test {
    public static void main(String[] args) {
        FireEngine fireEngine = new FireEngine();
        fireEngine.drive();
        fireEngine.water();
        fireEngine.stop();
        fireEngine.door = 8;
    }
}
