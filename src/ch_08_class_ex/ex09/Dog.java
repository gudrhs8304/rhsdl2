package ch_08_class_ex.ex09;

public class Dog {

    private String name, breed;
    private int age;

    public void braking(){
        System.out.println("멍멍!!");
    }
    public Dog (String name, String breed, int age){
        this.name = name;
        this.breed = breed;
        this.age = age;

    }
    public Dog (String name, int age){
        this.name = name;
        this.age = age;

    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setBreed(String breed){
        this.breed = breed;
    }
    public String getBreed(){
        return breed;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }



    public String toString(){
        return "Dog{name='" + name + "', breed='" + breed + "', age=" + age + "}";
    }
}
