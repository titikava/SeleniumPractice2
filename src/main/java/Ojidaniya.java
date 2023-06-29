import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.not;

public class Ojidaniya {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();//создаем, что бы обращаться к браузеру

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //задаем неявное ожидание в 10 секунд

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://www.avito.ru/moskva/transport");//открываем ссылку

        WebElement elementAvto = driver.findElement(By.xpath("//a[@title=\"Автомобили\"]"));
        WebElement elementWhat = driver.findElement(By.xpath("//a[@title=\"Крокодилы\"]"));

        List<WebElement> webElementList = driver.findElements(By.xpath("//a[@title=\"Автомобили\"]"));

        wait.until(ExpectedConditions.stalenessOf(elementAvto));//будем ожидать наш элемент


        wait.until(ExpectedConditions.attributeContains(elementAvto, "attr1", "value1"));
        /*ждет эллемент, который содержит определенный атрибут, который содержит определенное значение. Но так как
        это contains, то сходство не обязательно, он может просто туда входить - типа '%value1%'
        attributeToBe - обязательно должен содержать точное совпадение атрибута и значение
        attributeToBeNotEmpty
*/
        wait.until(ExpectedConditions.elementToBeClickable(elementAvto));
        /*
        * elementToBeClickable - проверит, что элемент кликабелен (виден ли и можно ли по нему щелкнуть одновременно)
        * elementToBeSelected - проверит, что элемент выбран (чекбокс)*/

        wait.until(ExpectedConditions.invisibilityOf(elementAvto));
        /*
        * invisibilityOf - проверка на то, что элемент не виден
        * invisibilityOfAllElements - проверка, что все элементы, которые мы передадим - невидимы
        * invisibilityOfElementLocated - проверка, что элемент не видим или отсутствует в доме
        * invisibilityOfElementWithText - проверка, что элемент не видим или отсутствует в доме по какому-то
        * тексту (не по локатору) */

        wait.until(ExpectedConditions.visibilityOf(elementAvto));
        /*
        * visibility - тоже самое, что и выше, только проверка на видимость элементов*/

        wait.until(not(ExpectedConditions.visibilityOf(elementAvto))); // получаем обратный эффект от того, что мы хотели бы

        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//a[@title=\"Автомобили\"]"), 5));
        /*
        * numberOfElementsToBe - ожидает определенное количество с определенным локатором (конкретное кол-во)
        * numberOfElementsToBeLessThan - ожидает определенное количество с определенным локатором (меньше чем кол-во(5 например))
        * numberOfElementsToBeMoreThan - ожидает определенное количество с определенным локатором (больше чем кол-во(5 например))*/

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@title=\"Автомобили\"]")));
        /*
        * presenceOfAllElementsLocatedBy - ожидает появление элемента на веб странице
        * presenceOfElementLocated - ожидает появление элемента в доме страницы*/

        wait.until(ExpectedConditions.stalenessOf(elementAvto));
        /*
        * ожидание исчезновения элемента*/

        wait.until(ExpectedConditions.textToBePresentInElement(elementAvto, "Авто"));
        /*
        * textToBe - элемент содержит определенный текст
        * textToBePresentInElement - ожидаем элемент в котором присутствует какой-то текст
        * textToBePresentInElementValue - исчем текст именно у атрибута а не у элемента*/

        wait.until(ExpectedConditions.titleContains("Авто"));
        /*
        * titleIs - ищет определенный тайтл
        * titleContains - ищет тайтл, который содержит какой-то текст*/

        wait.until(ExpectedConditions.urlToBe("https://www.avito.ru/moskva/transport"));
        /*
        * urlContains - ожидаем урл с примерным содержанием
        * urlMatches - урл по регулярным выражениям(?)
        * urlToBe - ожидаем точно какой-то определенный урл*/
        driver.quit();
    }
}
