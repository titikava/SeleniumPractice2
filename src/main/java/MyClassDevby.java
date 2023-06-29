import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/*
* click() - метод для клика по элементу
* Но как кликнуть по элементу, который не видно?
* */


public class MyClassDevby {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();//создаем, что бы обращаться к браузеру

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //задаем неявное ожидание в 10 секунд

        driver.get("https://devby.io/");//открываем ссылку

        WebElement element = driver.findElement(By.xpath("//a[@href=\"https://id.devby.io/@/hello\"]"));//обращаемся к элементу

        String papametr1 = element.getCssValue("display");//заходим в его стили и берем стиль display

        System.out.println(papametr1);

        element.click();//кликаем по элементу

        driver.quit();
    }
}
