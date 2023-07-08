package xmlAndJsonGenerate;
//"C:\\Users\\iaros\\OneDrive\\Рабочий стол\\data.json"
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JsonIdSorter {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        File jsonFile = new File("C:\\Users\\iaros\\OneDrive\\Рабочий стол\\data.json");

        try {
            // Чтение JSON-файла в виде дерева объектов JsonNode
            JsonNode rootNode = objectMapper.readTree(jsonFile);

            // Перебор каждого элемента массива JSON
            for (JsonNode node : rootNode) {
                // Получение значения поля "name"
                String name = node.get("name").asText();

                // Извлечение числа из значения поля "name"
                String idValue = name.replaceAll("\\D+", "");

                // Установка значения поля "id"
                ((com.fasterxml.jackson.databind.node.ObjectNode) node).put("id", idValue);
            }

            // Запись обновленных данных обратно в JSON-файл
            objectMapper.writeValue(jsonFile, rootNode);

            System.out.println("Обновление завершено.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }

