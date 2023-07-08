package xmlAndJsonGenerate;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class XmlTagValueChanger {
    public static void main(String[] args) {
        try {
            // Путь к XML-файлу
            String filePath = "C:\\Users\\iaros\\IdeaProjects\\SeleniumPractice1\\data.xml";

            // Создаем фабрику для создания парсера
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            // Загружаем XML-файл в объект Document
            Document document = builder.parse(new File(filePath));

            // Находим все элементы с тегом <categoryId>
            NodeList categoryIdElements = document.getElementsByTagName("categoryId");

            for (int i = 0; i < categoryIdElements.getLength(); i++) {
                Element categoryIdElement = (Element) categoryIdElements.item(i);
                String categoryIdValue = categoryIdElement.getTextContent();

                // Если значение <categoryId> равно 1
                if (categoryIdValue.equals("1")) {
                    // Получаем родительский элемент
                    Element parentElement = (Element) categoryIdElement.getParentNode();

                    // Находим все элементы <picture> внутри родительского элемента
                    NodeList pictureElements = parentElement.getElementsByTagName("picture");

                    // Обрабатываем каждый элемент <picture>
                    for (int j = 0; j < pictureElements.getLength(); j++) {
                        Element pictureElement = (Element) pictureElements.item(j);
                        // Задаем новое значение для <picture>
                        pictureElement.setTextContent("https://raw.githubusercontent.com/titikava/picture/81ce6b3fbba76414188f9c380fb2c668d3980385/Cat_1.jpg");
                    }
                }
                if (categoryIdValue.equals("2")){
                    Element parentElement = (Element) categoryIdElement.getParentNode();
                    NodeList pictureElements = parentElement.getElementsByTagName("picture");
                    for (int j = 0; j < pictureElements.getLength(); j++) {
                        Element pictureElement = (Element) pictureElements.item(j);
                        pictureElement.setTextContent("https://raw.githubusercontent.com/titikava/picture/81ce6b3fbba76414188f9c380fb2c668d3980385/Cat_2.jpg");
                    }
                }
                if (categoryIdValue.equals("3")){
                    Element parentElement = (Element) categoryIdElement.getParentNode();
                    NodeList pictureElements = parentElement.getElementsByTagName("picture");
                    for (int j = 0; j < pictureElements.getLength(); j++) {
                        Element pictureElement = (Element) pictureElements.item(j);
                        pictureElement.setTextContent("https://raw.githubusercontent.com/titikava/picture/81ce6b3fbba76414188f9c380fb2c668d3980385/Cat_3.jpg");
                    }
                }
                if (categoryIdValue.equals("4")){
                    Element parentElement = (Element) categoryIdElement.getParentNode();
                    NodeList pictureElements = parentElement.getElementsByTagName("picture");
                    for (int j = 0; j < pictureElements.getLength(); j++) {
                        Element pictureElement = (Element) pictureElements.item(j);
                        pictureElement.setTextContent("https://raw.githubusercontent.com/titikava/picture/81ce6b3fbba76414188f9c380fb2c668d3980385/Cat_4.jpg");
                    }
                }
                if (categoryIdValue.equals("5")){
                    Element parentElement = (Element) categoryIdElement.getParentNode();
                    NodeList pictureElements = parentElement.getElementsByTagName("picture");
                    for (int j = 0; j < pictureElements.getLength(); j++) {
                        Element pictureElement = (Element) pictureElements.item(j);
                        pictureElement.setTextContent("https://raw.githubusercontent.com/titikava/picture/81ce6b3fbba76414188f9c380fb2c668d3980385/Cat_5.jpg");
                    }
                }
                if (categoryIdValue.equals("6")){
                    Element parentElement = (Element) categoryIdElement.getParentNode();
                    NodeList pictureElements = parentElement.getElementsByTagName("picture");
                    for (int j = 0; j < pictureElements.getLength(); j++) {
                        Element pictureElement = (Element) pictureElements.item(j);
                        pictureElement.setTextContent("https://raw.githubusercontent.com/titikava/picture/81ce6b3fbba76414188f9c380fb2c668d3980385/Cat_6.jpg");
                    }
                }
                if (categoryIdValue.equals("7")){
                    Element parentElement = (Element) categoryIdElement.getParentNode();
                    NodeList pictureElements = parentElement.getElementsByTagName("picture");
                    for (int j = 0; j < pictureElements.getLength(); j++) {
                        Element pictureElement = (Element) pictureElements.item(j);
                        pictureElement.setTextContent("https://raw.githubusercontent.com/titikava/picture/81ce6b3fbba76414188f9c380fb2c668d3980385/Cat_7.jpg");
                    }
                }
                if (categoryIdValue.equals("8")){
                    Element parentElement = (Element) categoryIdElement.getParentNode();
                    NodeList pictureElements = parentElement.getElementsByTagName("picture");
                    for (int j = 0; j < pictureElements.getLength(); j++) {
                        Element pictureElement = (Element) pictureElements.item(j);
                        pictureElement.setTextContent("https://raw.githubusercontent.com/titikava/picture/81ce6b3fbba76414188f9c380fb2c668d3980385/Cat_8.jpg");
                    }
                }
                if (categoryIdValue.equals("9")){
                    Element parentElement = (Element) categoryIdElement.getParentNode();
                    NodeList pictureElements = parentElement.getElementsByTagName("picture");
                    for (int j = 0; j < pictureElements.getLength(); j++) {
                        Element pictureElement = (Element) pictureElements.item(j);
                        pictureElement.setTextContent("https://raw.githubusercontent.com/titikava/picture/81ce6b3fbba76414188f9c380fb2c668d3980385/Cat_9.jpg");
                    }
                }
                if (categoryIdValue.equals("10")){
                    Element parentElement = (Element) categoryIdElement.getParentNode();
                    NodeList pictureElements = parentElement.getElementsByTagName("picture");
                    for (int j = 0; j < pictureElements.getLength(); j++) {
                        Element pictureElement = (Element) pictureElements.item(j);
                        pictureElement.setTextContent("https://raw.githubusercontent.com/titikava/picture/81ce6b3fbba76414188f9c380fb2c668d3980385/Cat_10.jpg");
                    }
                }
                if (categoryIdValue.equals("11")){
                    Element parentElement = (Element) categoryIdElement.getParentNode();
                    NodeList pictureElements = parentElement.getElementsByTagName("picture");
                    for (int j = 0; j < pictureElements.getLength(); j++) {
                        Element pictureElement = (Element) pictureElements.item(j);
                        pictureElement.setTextContent("https://raw.githubusercontent.com/titikava/picture/81ce6b3fbba76414188f9c380fb2c668d3980385/Cat_11.jpg");
                    }
                }
                if (categoryIdValue.equals("12")){
                    Element parentElement = (Element) categoryIdElement.getParentNode();
                    NodeList pictureElements = parentElement.getElementsByTagName("picture");
                    for (int j = 0; j < pictureElements.getLength(); j++) {
                        Element pictureElement = (Element) pictureElements.item(j);
                        pictureElement.setTextContent("https://raw.githubusercontent.com/titikava/picture/81ce6b3fbba76414188f9c380fb2c668d3980385/Cat_12.jpg");
                    }
                }
                if (categoryIdValue.equals("13")){
                    Element parentElement = (Element) categoryIdElement.getParentNode();
                    NodeList pictureElements = parentElement.getElementsByTagName("picture");
                    for (int j = 0; j < pictureElements.getLength(); j++) {
                        Element pictureElement = (Element) pictureElements.item(j);
                        pictureElement.setTextContent("https://raw.githubusercontent.com/titikava/picture/81ce6b3fbba76414188f9c380fb2c668d3980385/Cat_13.jpg");
                    }
                }
                if (categoryIdValue.equals("14")){
                    Element parentElement = (Element) categoryIdElement.getParentNode();
                    NodeList pictureElements = parentElement.getElementsByTagName("picture");
                    for (int j = 0; j < pictureElements.getLength(); j++) {
                        Element pictureElement = (Element) pictureElements.item(j);
                        pictureElement.setTextContent("https://raw.githubusercontent.com/titikava/picture/81ce6b3fbba76414188f9c380fb2c668d3980385/Cat_14.jpg");
                    }
                }
                if (categoryIdValue.equals("15")){
                    Element parentElement = (Element) categoryIdElement.getParentNode();
                    NodeList pictureElements = parentElement.getElementsByTagName("picture");
                    for (int j = 0; j < pictureElements.getLength(); j++) {
                        Element pictureElement = (Element) pictureElements.item(j);
                        pictureElement.setTextContent("https://raw.githubusercontent.com/titikava/picture/81ce6b3fbba76414188f9c380fb2c668d3980385/Cat_15.jpg");
                    }
                }
                if (categoryIdValue.equals("16")){
                    Element parentElement = (Element) categoryIdElement.getParentNode();
                    NodeList pictureElements = parentElement.getElementsByTagName("picture");
                    for (int j = 0; j < pictureElements.getLength(); j++) {
                        Element pictureElement = (Element) pictureElements.item(j);
                        pictureElement.setTextContent("https://raw.githubusercontent.com/titikava/picture/81ce6b3fbba76414188f9c380fb2c668d3980385/Cat_16.jpg");
                    }
                }
                if (categoryIdValue.equals("17")){
                    Element parentElement = (Element) categoryIdElement.getParentNode();
                    NodeList pictureElements = parentElement.getElementsByTagName("picture");
                    for (int j = 0; j < pictureElements.getLength(); j++) {
                        Element pictureElement = (Element) pictureElements.item(j);
                        pictureElement.setTextContent("https://raw.githubusercontent.com/titikava/picture/81ce6b3fbba76414188f9c380fb2c668d3980385/Cat_17.jpg");
                    }
                }
                if (categoryIdValue.equals("18")){
                    Element parentElement = (Element) categoryIdElement.getParentNode();
                    NodeList pictureElements = parentElement.getElementsByTagName("picture");
                    for (int j = 0; j < pictureElements.getLength(); j++) {
                        Element pictureElement = (Element) pictureElements.item(j);
                        pictureElement.setTextContent("https://raw.githubusercontent.com/titikava/picture/81ce6b3fbba76414188f9c380fb2c668d3980385/Cat_18.jpg");
                    }
                }
                if (categoryIdValue.equals("19")){
                    Element parentElement = (Element) categoryIdElement.getParentNode();
                    NodeList pictureElements = parentElement.getElementsByTagName("picture");
                    for (int j = 0; j < pictureElements.getLength(); j++) {
                        Element pictureElement = (Element) pictureElements.item(j);
                        pictureElement.setTextContent("https://raw.githubusercontent.com/titikava/picture/81ce6b3fbba76414188f9c380fb2c668d3980385/Cat_19.jpg");
                    }
                }
                if (categoryIdValue.equals("20")){
                    Element parentElement = (Element) categoryIdElement.getParentNode();
                    NodeList pictureElements = parentElement.getElementsByTagName("picture");
                    for (int j = 0; j < pictureElements.getLength(); j++) {
                        Element pictureElement = (Element) pictureElements.item(j);
                        pictureElement.setTextContent("https://raw.githubusercontent.com/titikava/picture/81ce6b3fbba76414188f9c380fb2c668d3980385/Cat_20.jpg");
                    }
                }
            }

            // Сохраняем изменения в XML-файле
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(document);
            StreamResult result = new StreamResult(new File(filePath));
            transformer.transform(source, result);

            System.out.println("Значения тега <picture> успешно изменены в XML-файле.");
        } catch (Exception e) {
            System.out.println("Ошибка при изменении значений тега <picture>: " + e.getMessage());
        }
    }
}