package ch_08_class_ex.ex07;

public class Person {
    private String name, mobile, office, email;

    public Person(String name, String mobile, String office, String email) {
        this.name = name;
        this.mobile = mobile;
        this.office = office;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", mobile='" + mobile + '\'' +
                ", office='" + office + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
