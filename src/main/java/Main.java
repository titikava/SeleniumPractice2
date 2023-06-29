import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


/*
Поиск через XPath:
Ищем через elements при помощи ctrl+f
1. //div[@class='g'] - поиск в элементе div значения class='g'
2. //div[@class='g'][1] - поиск в элементе div значения class='g' (если один элемент и класс несколько раз встречается,
 то идет отсчет начиная с 1)
3. //div[@class='g'][last()] - поиск в элементе div значения class='g' (последний встречающийся класс)
4. //*[text()='Какой-то текст'] - поиск в любом элементе html определенного текста (Например ищем статью "Собаки-повадыри")
5. //*[contains(text(),'Какой-то текст')] - поиск в любом элементе html части текста (за счет contains). Т.е.
если брать случай выше, то можем искать //*[contains(text(),'повадыри')] и найдем "Собаки-повадыри"
6. //h3[contains(@class,'MyClass')] - ищем по элементам h3 атрибут class со значением MyClass + возможно что-то еще за счет contains
7. //div[@class='g'][5]//a[@class='fl'] - ищем внутри div под номером 5 элемент "а" с атрибутом class='fl'
8. //span[text()='Социальная сеть']/../../div[2] - ищем текст "Соц сеть" и найдя его поднимаемся к его родительскому
классу, а далее еще выше к еще одному родительскому классу и в нем уже ищем div[2]
9. //span[text()='Социальная сеть']/parent::/parent::div - тоже самое - поднимаемся к родителям
10. //span[text()='Социальная сеть']/parent::/parent::div/following-sibling::div - переходим к следующему div в родителе
на которого мы перескочили.
11. //span[text()='Социальная сеть']/parent::/parent::div/following-sibling::div/div/a в следующем div раскрываем
div и обращаемся к элементу 'a'
12. Можно получить XPath простым способом - во вкладке Elements кликаем на элемент на сайте через поиск элементов
DevTools его находит в html, далее кликаем правой кнопкой мыши - copy - copy as XPath
Метод не всегода работает, необходимо перепроверят
 */
/*
* Поиск через CSS Selector:
* Поиск работает через консоль,(Console) - записывается как $$("")
* 1. $$("body") - поиск через название тега
* 2. $$("#id который нас интересует") - поиск по id
* 3. $$(".className") - поиск по названию класса
* 4. $$("[role='main']") - поиск по какому-либо атрибуту и его значению. Но значение является не обязательным при поиске.
* Можно оставить просто [role]. Так же если сделать так:
* - $$("[role*='ai']") - будет искать атрибут role с любым значением, содержащим 'ai'
* - $$("[role^='ma']") - будет искать атрибут role с значением, начинающимся на 'ma'
* - $$("[role$='in']") - будет искать атрибут role с значением, заканчивающимся на 'in'
* 5. $$(".className.className2.className3") - поиск элемента, который содержит сразу несколько классов
* 6. $$(".className.className2[]") - поиск элемента, который содержит сразу несколько классов и какой-то атрибут
* 7. $$("div:not(.className)") - поиск элемента, который НЕ содержит класс className
* 8. $$("a:not(href^='http')") - ищем все ссылки, которые не содержать http
* 9. $$(div[jsoncontroller='asdW'] div.className - ищет div jsoncontroller и внутри него ищем div у которого есть класс className
* 9. $$(div[jsoncontroller='asdW'] > div.className - ищет div.className только в ребенке jsoncontroller (т.е. только в первом
* вложенном div. Не переходит к поиску по внука, правнукам и т.д.
* 10. $$("ul li:first-child") - ищем атрибут ul, который содержит много атрибутов li и берем отттуда первый li
* 11. $$("ul li:last-child") - ищем атрибут ul, который содержит много атрибутов li и берем отттуда последний li
* 10. $$("ul li:nth-child(2)") - ищем атрибут ul, который содержит много атрибутов li и берем отттуда li с порядковым номером 2*/



public class Main {

public static void main(String[] args) {
    WebDriver driver = new ChromeDriver();//создаем, что бы обращаться к браузеру
    driver.get("https://google.com");//открываем ссылку

//    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //задаем неявное ожидание в 10 секунд, но этот метод устарел
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //задаем неявное ожидание в 10 секунд

    WebElement element1 = (new WebDriverWait(driver, Duration.ofSeconds(10))
            .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//textarea[@aria-label='Найти']"))));
    //в element1 записывается элемент с ожиданием его в 10 секунд

    WebElement input = driver.findElement(By.xpath("//textarea[@aria-label='Найти']"));//ищем элемент по XPath и записываем
//    в переменную input
    input.click();//кликаем по найденному
    WebElement input2 = driver.findElement(By.className("wM6W7d"));//ищем элемент по классу
    input2.click();//кликаем по найденному
//    driver.quit();//выходим из браузера

}
}
