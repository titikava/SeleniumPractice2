import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class LoadFile {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //задаем неявное ожидание в 10 секунд

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("http://127.0.0.1:5500/index.html");
        WebElement button = driver.findElement(By.className("glow-on-hover"));

        JavascriptExecutor js = (JavascriptExecutor)driver;//что бы работать с помощью js


        /*
        "arguments[0].style.width = '2200px';" - это сам JavaScript-код, который будет выполнен.
        В данном случае, мы меняем стиль фона элемента на красный цвет. arguments[0] обозначает первый аргумент,
        который мы передаем в функцию executeScript(). В нашем случае, это переменная button.
         */
        js.executeScript("arguments[0].style.width = '2200px';", button);


        /*
        Таким образом мы можем находить скрытые элементы, такие как загрузка файлов, они обозначаются как
        input type="file"
        И дальше, используя методы sendkeys можем загрузить какой либо файл
        Например:
        element.sendKeys("C:\\Users\\iaros\\OneDrive\\Рабочий стол\\111.txt", Keys.ENTER);//таким образом можно загрузить файл
         */

    }
}
