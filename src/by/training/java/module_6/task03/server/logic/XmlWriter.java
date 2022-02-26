package by.training.java.module_6.task03.server.logic;

import by.training.java.module_6.task03.server.content.Person;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.ArrayList;

public class XmlWriter {

    public XmlWriter() {
    }

    // метод для создания нового узла XML-файла
    private static Node getNode(Document doc, int number, String value1, String value2, String value3, String value4) {
        Element element = doc.createElement("Person_" + number);

        // создаем элементы "firstName", "lastName", "placeOfResidence", "birthday"
        element.appendChild(getNodeElements(doc, element, "firstName", value1));
        element.appendChild(getNodeElements(doc, element, "lastName", value2));
        element.appendChild(getNodeElements(doc, element, "placeOfResidence", value3));
        element.appendChild(getNodeElements(doc, element, "birthday", value4));

        return element;
    }

    // утилитный метод для создания нового узла XML-файла
    private static Node getNodeElements(Document doc, Element element, String name, String value) {
        Element node = doc.createElement(name);
        node.appendChild(doc.createTextNode(value));
        return node;
    }

    public boolean recordXml(ArrayList<Person> deals) {
        boolean successfulRecording = false;         // успешная запись

        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            factory.setNamespaceAware(true);
            Document doc = factory.newDocumentBuilder().newDocument();

            Element persons = doc.createElement("Deals");
            doc.appendChild(persons);

            for (int i = 0; i < deals.size(); i++) {
                persons.appendChild(getNode(doc, i + 1, deals.get(i).getFirstName(), deals.get(i).getLastName(),
                        deals.get(i).getPlaceOfResidence(), deals.get(i).getBirthday()));
                // i + 1 , т.к. номера дел начинаются с 1
            }

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            // для красивого вывода
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            DOMSource source = new DOMSource(doc);

            //печатаем в файл
            File file = new File("src\\by\\training\\java\\module_6\\task03\\server\\logic\\Deals.xml");
            StreamResult streamResult = new StreamResult(file);

            //записываем данные
            transformer.transform(source, streamResult);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        successfulRecording = true;
        return successfulRecording;
    }
}
