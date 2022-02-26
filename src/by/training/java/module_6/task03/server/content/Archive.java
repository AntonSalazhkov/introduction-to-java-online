package by.training.java.module_6.task03.server.content;

import by.training.java.module_6.task03.server.logic.XmlReader;
import by.training.java.module_6.task03.server.logic.XmlWriter;

import java.util.ArrayList;


public class Archive {

    private ArrayList<Person> deals = new ArrayList<>();

    public Archive() {
    }

    public ArrayList<Person> getDeals() {
        return deals;
    }

    public void setDeals(Person person) {
        if (person != null) {
            this.deals.add(person);
        }
    }

    public String showDeals(int i) {
        XmlReader xmlReader = new XmlReader();
        Person person = xmlReader.findRecord(i);

        if (person.getFirstName() != null) {
            return "Дело № " + i + ": " + person.toString();
        } else {
            return null;
        }
    }

    public String searchDeals(int i, String lastName) {
        XmlReader xmlReader = new XmlReader();
        Person person = xmlReader.findRecord(i);

        if (person.getFirstName() != null) {
            if (person.getLastName().compareToIgnoreCase(lastName) == 0) {
                return "Дело № " + i + ": " + person.toString();

            } else {
                return "0";
            }
        } else {
            return null;
        }
    }

    public int choiceDeal(String userChoiceNumber) {      // выбор дела, проверка на число, наличие дела и преобразование в число

        if (userChoiceNumber.matches("^[-+]?\\d+$")) {
            int i = Integer.parseInt(userChoiceNumber);

            XmlReader xmlReader = new XmlReader();
            Person person = xmlReader.findRecord(i);

            if (person.getFirstName() != null) {
                return i;

            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }

    public String changeDeal(String userChoice, int numberDeal, String newValue) {      // изменить дело
        boolean correctInput = false;
        deals = new ArrayList<>();
        readDeals();

        if (userChoice.compareTo("1") == 0) {
            getDeals().get(numberDeal - 1).setFirstName(newValue);
            correctInput = true;
        } else if (userChoice.compareTo("2") == 0) {
            getDeals().get(numberDeal - 1).setLastName(newValue);
            correctInput = true;
        } else if (userChoice.compareTo("3") == 0) {
            getDeals().get(numberDeal - 1).setPlaceOfResidence(newValue);
            correctInput = true;
        } else if (userChoice.compareTo("4") == 0) {
            if (newValue.matches("^(0[1-9]|[1-2][0-9]|3[0-1]):(0[1-9]|1[0-2]):(19[0-9]{2}|20[0-9]{2})$")) {
                getDeals().get(numberDeal - 1).setBirthday(newValue);
                correctInput = true;
            }
        }

        if (correctInput) {

            XmlWriter xmlWriter = new XmlWriter();
            if (xmlWriter.recordXml(getDeals())) {
                return "Дело успешно изменено";
            } else {
                return "Ошибка изменения записи";
            }
        } else {
            return "Ошибка изменения записи";
        }
    }

    public String newDeal(String newFirstName, String newLastName, String newPlaceOfResidence, String newBirthday) {
        boolean correctInput = true;
        deals = new ArrayList<>();
        NewPerson newPerson = new NewPerson();
        readDeals();

        if (!newBirthday.matches("^(0[1-9]|[1-2][0-9]|3[0-1]):(0[1-9]|1[0-2]):(19[0-9]{2}|20[0-9]{2})$")) {
            correctInput = false;
        }

        if (correctInput) {
            newPerson.setNewPerson(newFirstName, newLastName, newPlaceOfResidence, newBirthday);
            setDeals(newPerson);

            XmlWriter xmlWriter = new XmlWriter();
            if (xmlWriter.recordXml(getDeals())) {
                return "Дело успешно создано";
            } else {
                return "Ошибка создания дела";
            }
        } else {
            return "Ошибка создания дела";
        }
    }

    public void readDeals() {
        int i = 1;
        XmlReader xmlReader = new XmlReader();
        boolean cycle = true;

        while (cycle) {
            Person person = xmlReader.findRecord(i);
            if (person.getFirstName() != null) {
                setDeals(person);
                i++;
            } else {
                cycle = false;
            }
        }
    }
}
