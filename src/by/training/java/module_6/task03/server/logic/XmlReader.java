package by.training.java.module_6.task03.server.logic;

import by.training.java.module_6.task03.server.content.Person;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class XmlReader {

    // создаем из узла документа объект Person
    private static Person getPerson(Node node) {
        Person person = new Person();
        if (node != null && node.getNodeType() == Node.ELEMENT_NODE) {
            Element element = (Element) node;
            person.setFirstName(getTagValue("firstName", element));
            person.setLastName(getTagValue("lastName", element));
            person.setPlaceOfResidence(getTagValue("placeOfResidence", element));
            person.setBirthday(getTagValue("birthday", element));
        }
        return person;
    }

    // получаем значение элемента по указанному тегу
    private static String getTagValue(String tag, Element element) {
        NodeList nodeList = element.getElementsByTagName(tag).item(0).getChildNodes();
        Node node = (Node) nodeList.item(0);
        return node.getNodeValue();
    }

    public Person findRecord(int numberPerson) {
        File xmlFile = new File("src\\by\\training\\java\\module_6\\task03\\server\\logic\\Deals.xml");
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder;
        Person person = null;

        try {
            builder = factory.newDocumentBuilder();
            Document document = builder.parse(xmlFile);
            document.getDocumentElement().normalize();

            // получаем узлы с именем Person_ теперь XML полностью загружен в память
            // в виде объекта Document
            NodeList nodeList = document.getElementsByTagName("Person_" + numberPerson);

            person = getPerson(nodeList.item(0));

        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return person;
    }
}