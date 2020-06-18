package introductionToJava.baitapstackvaqueue.tochucdulieuhoply;

public class Employee {
    private String name;
    private String birthDay;
    private String gender;

    public Employee(String name, String birthDay, String gender) {
        this.name = name;
        this.birthDay = birthDay;
        this.gender = gender;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Employee name is" +this.getName()+" Gender"+this.getGender()+" Birthday"+this.getBirthDay();
    }
}
