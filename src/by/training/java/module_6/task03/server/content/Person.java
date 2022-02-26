package by.training.java.module_6.task03.server.content;

public class Person {

    private String firstName;
    private String lastName;
    private String placeOfResidence;       // место проживания
    private String birthday;

    public Person() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPlaceOfResidence() {
        return placeOfResidence;
    }

    public void setPlaceOfResidence(String placeOfResidence) {
        this.placeOfResidence = placeOfResidence;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Имя: " + firstName + ", фамилия: " + lastName + ", место жительства: " + placeOfResidence
                + ", день рождения: " + birthday;
    }
}
