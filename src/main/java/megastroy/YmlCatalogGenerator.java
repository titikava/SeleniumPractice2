package megastroy;
//"C:\\Users\\iaros\\OneDrive\\Рабочий стол\\kazan.xml"
//"C:\\Users\\iaros\\OneDrive\\Рабочий стол\\kazan_new.xml"
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.List;

public class YmlCatalogGenerator {
    public static void main(String[] args) throws DocumentException, IOException {
        // Открываем файл catalog.xml и создаем Document
        SAXReader reader = new SAXReader();
        Document document = reader.read(new File("C:\\Users\\iaros\\OneDrive\\Рабочий стол\\kazan.xml"));
        // Получаем корневой элемент каталога
        Element catalog = document.getRootElement();

// Выбираем нужные элементы с помощью XPath запросов
        List<Element> items = catalog.selectNodes("//yml_catalog/shop/offers/offer[position() <= 1000]");
        // Создаем новый Document
        Document newDocument = DocumentHelper.createDocument();

// Создаем корневой элемент каталога и добавляем его в Document
        Element newCatalog = newDocument.addElement("yml_catalog");
        newCatalog.addAttribute("date", new Date().toString());

// Создаем подэлементы каталога и добавляем их в новый каталог
        Element newShop = newCatalog.addElement("shop");
        Element newOffers = newShop.addElement("offers");

        for(Element item : items) {
            newOffers.add((Element) item.clone());
        }

// Записываем новый файл
        XMLWriter writer = new XMLWriter(new FileWriter(new File("C:\\Users\\iaros\\OneDrive\\Рабочий стол\\kazan_new.xml")));
        writer.write(newDocument);
        writer.close();
    }
}