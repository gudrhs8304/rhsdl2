package ch_09_inheritance.part_09.step04;

public class Manager extends Employee{
    @Override
    public int getSalary() {
        return baseSalary + 2000000;
    }
}
