package ch_09_inheritance.part_09.step04;

public class Programmer extends Employee{
    @Override
    public int getSalary() {
        return baseSalary += 3000000;
    }


}
