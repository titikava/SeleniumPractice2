package lessonSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class AssertsWithTestNG {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //задаем неявное ожидание в 10 секунд

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("http://127.0.0.1:5500/index.html");
        String title = driver.getTitle();
        /*
        Используя библиотеку TestNG и метод в ней assertEquals мы можем сравнивать различные типы данных
        В случае ниже мы сравниваем переменную title с текстом Document. Если все будет ок, то выполнение
        программы закончится с кодом 0
         */
        Assert.assertEquals(title, "Document");
    }
}
