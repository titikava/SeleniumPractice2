
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class PereklOkna {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();//создаем, что бы обращаться к браузеру

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //задаем неявное ожидание в 10 секунд

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        JavascriptExecutor js = (JavascriptExecutor)driver;//что бы работать с помощью js

        try {
            driver.get("http://127.0.0.1:5500/index.html");//открываем ссылку
            Thread.sleep(5000);

            String window1 = driver.getWindowHandle();//берем идентификатор окна и сохраняем его в переменную 1

            js.executeScript("window.open()");//открываем новое коно при помощи js

            Set<String> currentWindows = driver.getWindowHandles();//создаем лист из открытых окон
            //ВАЖНО - в некоторых браузерах новые вкладки рассматриваются как новые окна (chrome), а в некоторых именно как вкладки (IE, Firefox)

            String window2 = null; //создаем переменную, что бы потом впихнуть туда идентификатор новго окна


            /*создаем цикл, который прогонит наш лист currentWindows и если идентификатор в нем не будет равнятся
            идентификатору window1, то он его закинет в переменную window2
             */
            for (String window : currentWindows) {
                if (!window.equals(window1)) {
                    window2 = window;
                    break;
                }
            }
            driver.switchTo().window(window2); //переключаемся на новое окно (вкладку) в браузере
            driver.get("http://127.0.0.1:5500/index.html");
            Thread.sleep(3000);
            driver.close(); // закрываем теперь это новое окно
            driver.switchTo().window(window1);//возвращаемся на первое окно
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            Thread.sleep(5000);
            driver.quit();
        }
    }
}
