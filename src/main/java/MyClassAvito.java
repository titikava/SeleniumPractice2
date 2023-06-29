import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/*
* В эллементе можно открыть его атрибуты. Для этого кликаем по элементу и далее, ниже(где консоль) открываем
* вкалдку Properties */

public class MyClassAvito {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();//создаем, что бы обращаться к браузеру

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //задаем неявное ожидание в 10 секунд

        driver.get("https://www.avito.ru/moskva/transport");//открываем ссылку

        WebElement elementAvto = driver.findElement(By.xpath("//a[@title=\"Автомобили\"]"));

        String papametr1 = elementAvto.getAttribute("offsetWidth");//берем пропертю атрибута который взяли в elementAvto
        System.out.println(papametr1);

        WebElement elementText = driver.findElement(By.cssSelector(".page-title-count-wQ7pG"));//ищем элемент по классу
        String parametrText = elementText.getText();//берем оттуда текст
        System.out.println(parametrText);
        driver.quit();
    }
}
