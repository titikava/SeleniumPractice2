package lessonSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;

public class SendkaysPractice {
    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();//создаем, что бы обращаться к браузеру

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //задаем неявное ожидание в 10 секунд

        driver.get("https://www.google.com");//открываем ссылку

        WebElement element = driver.findElement(By.name("q"));//обращаемся к элементу

        // Путь к файлу, который нужно скопировать
        String filePath = "C:\\Users\\iaros\\OneDrive\\Рабочий стол\\111.txt";

        // Прочитайте текст из файла
        String fileText = new String(Files.readAllBytes(Paths.get(filePath)));

        //element.sendKeys("Java", Keys.ENTER);//пишет текст Java в инпут на сайте и нажимает Enter на клавиатуре

        copyTextToClipboard(fileText);//добавить его в буфер обмена

        // Нахождение поля ввода на веб-странице и вставка скопированного текста
        driver.findElement(By.name("q")).sendKeys(Keys.CONTROL + "v");

        element.sendKeys(Keys.ENTER);
/*
* Кнопок множество, все что есть на клавиатуре можно юзать
* Что бы удалить уже написанное в инпуте можно использовать кнопки Delete и т.д.
* sendKeys можно использовать для передачи файла на ресурс и т.д*/

        //element.sendKeys("C:\\Users\\iaros\\OneDrive\\Рабочий стол", Keys.ENTER);//таким образом можно загрузить файл

        //driver.quit();
    }
//метод добавляет текст в буфер обмена
    private static void copyTextToClipboard(String text) throws AWTException {
        StringSelection stringSelection = new StringSelection(text);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
    }

}
