package by.training.java.module_6.task03.server.content;

public class NewPerson extends Person {

    public NewPerson() {
        super();
    }

    public void setNewPerson(String newFirstName, String newLastName, String newPlaceOfResidence, String newBirthday) {
        super.setFirstName(newFirstName);
        super.setLastName(newLastName);
        super.setPlaceOfResidence(newPlaceOfResidence);
        super.setBirthday(newBirthday);
    }
}
