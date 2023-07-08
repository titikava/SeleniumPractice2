package xmlAndJsonGenerate;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class XmlGenerator {
    public static void main(String[] args) {
        int numberOfOffers = 300; // Количество объектов, которые вы хотите сгенерировать

        List<String> xmlStrings = generateXmlStrings(numberOfOffers);
        for (String xmlString : xmlStrings) {
            System.out.println(xmlString);
        }

        writeXmlToFile(xmlStrings, "data.xml");

        List<String> jsonStrings = generateJsonStrings(xmlStrings);
        for (String jsonString : jsonStrings) {
            System.out.println(jsonString);
        }

        writeJsonToFile(jsonStrings, "data.json");
    }

    public static List<String> generateXmlStrings(int numberOfOffers) {
        List<String> xmlStrings = new ArrayList<>();
        Random random = new Random();

        for (int i = 1; i <= numberOfOffers; i++) {
            String name = "Product " + i; // Уникальное имя продукта
            int price = random.nextInt(50000) + 1; // Случайная цена от 1 до 1000
            int categoryId = random.nextInt(20) + 1; // id и categoryId совпадают в этом примере

            String xmlString = "<offer id=\"" + i + "\" available=\"true\">\n" +
                    "    <url>http://${URL_HOST()}:3456/castlemock/mock/rest/project/doc9TU/application/vVr2SX/item.html?aid=${QUERY_STRING(query=\"aid\")}&amp;itemid=" + i + "</url>\n" +
                    "    <currencyId>RUB</currencyId>\n" +
                    "    <name>" + name + "</name>\n" +
                    "    <categoryId>" + categoryId + "</categoryId>\n" +
                    "    <picture>https://raw.githubusercontent.com/titikava/picture/81ce6b3fbba76414188f9c380fb2c668d3980385/Cat_3.jpg</picture>\n" +
                    "    <vendor>ManQ Solid Single Breasted Wedding, Formal Men's Blazer (Black)</vendor>\n" +
                    "    <description>Lorem ipsum dolor sit amet consectetur adipisicing.</description>\n" +
                    "    <price>" + price + "</price>\n" +
                    "    <count>123</count>\n" +
                    "    <param name=\"label\">customerAlias3</param>\n" +
                    "</offer>";
            xmlStrings.add(xmlString);
        }

        return xmlStrings;
    }

    public static List<String> generateJsonStrings(List<String> xmlStrings) {
        List<String> jsonStrings = new ArrayList<>();

        for (String xmlString : xmlStrings) {
            String id = extractValueFromXmlString(xmlString, "categoryId");
            String name = extractValueFromXmlString(xmlString, "name");
            String price = extractValueFromXmlString(xmlString, "price");
            String desc = extractValueFromXmlString(xmlString, "description");
            String img = extractValueFromXmlString(xmlString, "picture");

            String jsonString = "{\n" +
                    "    \"id\": \"" + id + "\",\n" +
                    "    \"name\": \"" + name + "\",\n" +
                    "    \"price\": " + price + ",\n" +
                    "    \"desc\": \"" + desc + "\",\n" +
                    "    \"img\": \"" + img + "\"\n" +
                    "}";
            jsonStrings.add(jsonString);
        }

        return jsonStrings;
    }

    public static String extractValueFromXmlString(String xmlString, String tagName) {
        int startIndex = xmlString.indexOf("<" + tagName + ">");
        if (startIndex == -1) {
            return ""; // Возвращаем пустую строку, если тег не найден
        }
        startIndex += tagName.length() + 2; // Увеличиваем начальный индекс на длину тега и символы '<' и '>'

        int endIndex = xmlString.indexOf("</" + tagName + ">", startIndex);
        if (endIndex == -1) {
            return ""; // Возвращаем пустую строку, если закрывающий тег не найден
        }

        return xmlString.substring(startIndex, endIndex);
    }

    public static void writeXmlToFile(List<String> xmlStrings, String filename) {
        try {
            FileWriter fileWriter = new FileWriter(filename);
            for (String xmlString : xmlStrings) {
                fileWriter.write(xmlString + "\n");
            }
            fileWriter.close();
            System.out.println("XML файл успешно записан.");
        } catch (IOException e) {
            System.out.println("Ошибка при записи XML файла: " + e.getMessage());
        }
    }

    public static void writeJsonToFile(List<String> jsonStrings, String filename) {
        try {
            Files.write(Paths.get(filename), jsonStrings);
            System.out.println("JSON файл успешно записан.");
        } catch (IOException e) {
            System.out.println("Ошибка при записи JSON файла: " + e.getMessage());
        }
    }
}