import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class WaitElementLost {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //задаем неявное ожидание в 10 секунд

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


        try {
            driver.get("https://pagination.js.org/");
            Thread.sleep(2000);

            //сохраняем элементы в список
            List<WebElement> elements = driver.findElements(By.xpath("//div[@class='data-container']/ul/li"));

            //сохраняем страницы в список
            List<WebElement> pages = driver.findElements(By.xpath("//div[@class='paginationjs-pages']/ul/li"));

            String text = elements.get(5).getText();
            System.out.println(text);

            //переключаем страницу
            pages.get(2).click();

            //ждем пока пропадет элемент (т.е. произойдет переключение страницы и появтяся новые элементы)
            wait.until(ExpectedConditions.stalenessOf(elements.get(5)));

            //Добавляем новые, свеже загруженные элементы в лист
            elements = driver.findElements(By.xpath("//div[@class='data-container']/ul/li"));
            text = elements.get(5).getText();
            System.out.println(text);

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.quit();
        }


    }
}
