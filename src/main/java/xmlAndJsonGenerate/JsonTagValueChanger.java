package xmlAndJsonGenerate;

import java.io.FileReader;
import java.io.FileWriter;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class JsonTagValueChanger {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("C:\\Users\\iaros\\IdeaProjects\\SeleniumPractice1\\data.json")) {
            JsonParser jsonParser = new JsonParser();
            JsonElement rootElement = jsonParser.parse(reader);

            if (rootElement.isJsonArray()) {
                JsonArray jsonArray = rootElement.getAsJsonArray();
                for (JsonElement element : jsonArray) {
                    JsonObject item = element.getAsJsonObject();
                    if (item.get("id").getAsInt() == 1) {
                        item.addProperty("img", "https://raw.githubusercontent.com/titikava/picture/81ce6b3fbba76414188f9c380fb2c668d3980385/Cat_1.jpg");
                    }
                    if (item.get("id").getAsInt() == 2) {
                        item.addProperty("img", "https://raw.githubusercontent.com/titikava/picture/81ce6b3fbba76414188f9c380fb2c668d3980385/Cat_2.jpg");
                    }
                    if (item.get("id").getAsInt() == 3) {
                        item.addProperty("img", "https://raw.githubusercontent.com/titikava/picture/81ce6b3fbba76414188f9c380fb2c668d3980385/Cat_3.jpg");
                    }
                    if (item.get("id").getAsInt() == 4) {
                        item.addProperty("img", "https://raw.githubusercontent.com/titikava/picture/81ce6b3fbba76414188f9c380fb2c668d3980385/Cat_4.jpg");
                    }
                    if (item.get("id").getAsInt() == 5) {
                        item.addProperty("img", "https://raw.githubusercontent.com/titikava/picture/81ce6b3fbba76414188f9c380fb2c668d3980385/Cat_5.jpg");
                    }
                    if (item.get("id").getAsInt() == 6) {
                        item.addProperty("img", "https://raw.githubusercontent.com/titikava/picture/81ce6b3fbba76414188f9c380fb2c668d3980385/Cat_6.jpg");
                    }
                    if (item.get("id").getAsInt() == 7) {
                        item.addProperty("img", "https://raw.githubusercontent.com/titikava/picture/81ce6b3fbba76414188f9c380fb2c668d3980385/Cat_7.jpg");
                    }
                    if (item.get("id").getAsInt() == 8) {
                        item.addProperty("img", "https://raw.githubusercontent.com/titikava/picture/81ce6b3fbba76414188f9c380fb2c668d3980385/Cat_8.jpg");
                    }
                    if (item.get("id").getAsInt() == 9) {
                        item.addProperty("img", "https://raw.githubusercontent.com/titikava/picture/81ce6b3fbba76414188f9c380fb2c668d3980385/Cat_9.jpg");
                    }
                    if (item.get("id").getAsInt() == 10) {
                        item.addProperty("img", "https://raw.githubusercontent.com/titikava/picture/81ce6b3fbba76414188f9c380fb2c668d3980385/Cat_10.jpg");
                    }
                    if (item.get("id").getAsInt() == 11) {
                        item.addProperty("img", "https://raw.githubusercontent.com/titikava/picture/81ce6b3fbba76414188f9c380fb2c668d3980385/Cat_11.jpg");
                    }
                    if (item.get("id").getAsInt() == 12) {
                        item.addProperty("img", "https://raw.githubusercontent.com/titikava/picture/81ce6b3fbba76414188f9c380fb2c668d3980385/Cat_12.jpg");
                    }
                    if (item.get("id").getAsInt() == 13) {
                        item.addProperty("img", "https://raw.githubusercontent.com/titikava/picture/81ce6b3fbba76414188f9c380fb2c668d3980385/Cat_13.jpg");
                    }
                    if (item.get("id").getAsInt() == 14) {
                        item.addProperty("img", "https://raw.githubusercontent.com/titikava/picture/81ce6b3fbba76414188f9c380fb2c668d3980385/Cat_14.jpg");
                    }
                    if (item.get("id").getAsInt() == 15) {
                        item.addProperty("img", "https://raw.githubusercontent.com/titikava/picture/81ce6b3fbba76414188f9c380fb2c668d3980385/Cat_15.jpg");
                    }
                    if (item.get("id").getAsInt() == 16) {
                        item.addProperty("img", "https://raw.githubusercontent.com/titikava/picture/81ce6b3fbba76414188f9c380fb2c668d3980385/Cat_16.jpg");
                    }
                    if (item.get("id").getAsInt() == 17) {
                        item.addProperty("img", "https://raw.githubusercontent.com/titikava/picture/81ce6b3fbba76414188f9c380fb2c668d3980385/Cat_17.jpg");
                    }
                    if (item.get("id").getAsInt() == 18) {
                        item.addProperty("img", "https://raw.githubusercontent.com/titikava/picture/81ce6b3fbba76414188f9c380fb2c668d3980385/Cat_18.jpg");
                    }
                    if (item.get("id").getAsInt() == 19) {
                        item.addProperty("img", "https://raw.githubusercontent.com/titikava/picture/81ce6b3fbba76414188f9c380fb2c668d3980385/Cat_19.jpg");
                    }
                    if (item.get("id").getAsInt() == 20) {
                        item.addProperty("img", "https://raw.githubusercontent.com/titikava/picture/81ce6b3fbba76414188f9c380fb2c668d3980385/Cat_20.jpg");
                    }
                }

                Gson gson = new Gson();
                try (FileWriter writer = new FileWriter("C:\\Users\\iaros\\IdeaProjects\\SeleniumPractice1\\data.json")) {
                    writer.write(gson.toJson(jsonArray));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}