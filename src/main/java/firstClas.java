import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.ui.ExpectedConditions.alertIsPresent;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class firstClas {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();//создаем, что бы обращаться к браузеру

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //задаем неявное ожидание в 10 секунд



        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            driver.get("http://127.0.0.1:5500/index.html");//открываем ссылку
            Thread.sleep(5000);
            WebElement element = driver.findElement(By.id("a"));
            WebElement element2 = driver.findElement(By.id("b"));
            WebElement element3 = driver.findElement(By.id("c"));

            element.click();

//            Alert alert = driver.switchTo().alert(); - классический способ переключеия на алерты

            Alert alert = wait.until(alertIsPresent());//ждет пока появится алерт и обращается потом к нему
            alert.accept();//метод который жмет ок на алерт


            element2.click();
            Alert prompt = wait.until(alertIsPresent());
            prompt.sendKeys("Что-то ввел");//вводим в модальном окне
            prompt.accept();//жмем ок

            Alert prompt2 = wait.until(alertIsPresent());//появляется новое модальное окно
            Thread.sleep(5000);//ждем маленько
            prompt2.accept();//принимаем


            element3.click();
            Alert confirm = wait.until(alertIsPresent());
            confirm.dismiss();//жмем отмена


        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            Thread.sleep(5000);
            driver.quit();
        }

    }
}
