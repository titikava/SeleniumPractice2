import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class ActionsPractice {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();//создаем, что бы обращаться к браузеру

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //задаем неявное ожидание в 10 секунд

        try {
            driver.get("http://crossbrowsertesting.github.io/drag-and-drop.html");//открываем ссылку
            Thread.sleep(2000);
            WebElement element1 = driver.findElement(By.id("draggable"));
            WebElement element2 = driver.findElement(By.id("droppable"));
            Actions actions = new Actions(driver);

            //берем иконку, зажимаем и перетаскивааем на другой элемент
            actions.moveToElement(element1).clickAndHold().moveToElement(element2).release().build().perform();

            //тоже самое
            actions.dragAndDrop(element1, element2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            Thread.sleep(20000);
            driver.quit();
        }


//        element.clear();// - очищает поле ввода
//        actions.contextClick(); // клик правой кнопкой мыши, можно передать элемент куда нажать
//        actions.clickAndHold(); // зажали и держим
//        actions.doubleClick(); // двойное нажатие
//        actions.pause(2000);// пауза в милисекундах
//        actions.moveToElement(); // навести курсор
//        actions.keyDown(); // нажимаем на какуюто кнопку
//        actions.keyUp(); // отжимаем какую-то кнопку обратно
//        actions.release(); // отпустить (например кнопку мыши)
//        actions.build(); // собираем все что наворотили
//        actions.perform(); // применить все что наворотили
//        driver.quit();
    }
}
