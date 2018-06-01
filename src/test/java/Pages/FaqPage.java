package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

/**
 * Created by tester on 14.08.2017.
 */
public class FaqPage {
    private static final String BASEURL = "https://mycredit.ua/ru/faq/";

//    private static final java.lang.String BASEURL = "http://1bank2.myapp.com.ua/ru/faq/";

    protected WebDriver driver;

    /**Preloader*/
    private static final String preLoaderF = ".//*[@class='preloader preloader-bonus white'][(contains(@style, 'none'))]";


    /**Блок Общие вопросы*/

    //Что такое MyCredit
    @FindBy(xpath = ".//*[@id='question_84']/a")
    private WebElement faqQuestions1;

    //На какую сумму возможно оформить кредит?
    @FindBy (xpath = ".//*[@id='question_85']/a")
    private WebElement faqQuestions2;

    //Кто может оформить кредит
    @FindBy (xpath = ".//*[@id='question_86']/a")
    private WebElement faqQuestions3;

    /**Блок Оформление заявки*/

    //Почему мне отказали?
    @FindBy (xpath = ".//*[@class='side-bar']/a[1]")
    private WebElement faqBlockMove1;

    //Как подать заявку на оформление кредита?
    @FindBy (xpath = ".//*[@id='question_495']/a")
    private WebElement faqQuestions4;

    //Возможно получить кредит наличными?
    @FindBy (xpath = ".//*[@id='question_43']")
    private WebElement faqQuestion5;

    //Обязателен ли мобильный телефон для регистрации?
    @FindBy (xpath = ".//*[@id='question_44']/a")
    private WebElement faqQuestion6;

    //У меня не получается заполнить анкету. Что мне делать?
    @FindBy (xpath = ".//*[@id='question_45']/a")
    private WebElement faqQuestion7;

    //Возможно подать по телефону заявку на кредит в MyCredit?
    @FindBy (xpath = ".//*[@id='question_46']/a")
    private WebElement faqQuestion8;

    //В каких городах мы работаем?
    @FindBy (xpath = ".//*[@id='question_47']/a")
    private WebElement faqQuestion9;

    //Сколько времени рассматривается заявка на кредит и как узнать результат?
    @FindBy (xpath = ".//*[@id='question_48']/a")
    private WebElement faqQuestion10;

    //Рассматриваются ли заявки в выходные? А ночью?
    @FindBy (xpath = ".//*[@id='question_49']/a")
    private WebElement faqQuestion11;

    //Если я не гражданин Украины, могу ли я получить кредит?
    @FindBy (xpath = ".//*[@id='question_50']/a")
    private WebElement faqQuestion12;

    //Есть ли ограничения по возрасту при обращении за кредитом?
    @FindBy (xpath = ".//*[@id='question_51']/a")
    private WebElement faqQuestion13;

    //Мне не пришло SMS с кодом подтверждения. Что мне делать?
    @FindBy (xpath = ".//*[@id='question_52']/a")
    private WebElement faqQuestion14;

    //Заявка получила статус "В обработке". Что это значит?
    @FindBy (xpath = ".//*[@id='question_53']/a")
    private WebElement faqQuestion15;

    //Забыли пароль? Что делать?
    @FindBy (xpath = ".//*[@id='question_54']/a")
    private WebElement faqQuestion16;

    //Похоже, что мне не отправили сообщение с напоминанием пароля. Что мне делать?
    @FindBy (xpath = ".//*[@id='question_56']/a")
    private WebElement faqQuestion17;

    /**Блок Банковская карта*/
    @FindBy (xpath = ".//*[@class='side-bar']/a[2]")
    private WebElement faqBlockMove2;

    //Зачем на банковской карте блокируется сумма до 1грн?
    @FindBy (xpath = ".//*[@id='question_58']/a")
    private WebElement faqQuestion18;

    //Что такое CVV2 (CVC2)-код?
    @FindBy (xpath = ".//*[@id='question_59']/a")
    private WebElement faqQuestion19;

    //Если на банковской карте 0 грн. возможно ли подать заявку на кредит?
    @FindBy (xpath = ".//*[@id='question_60']/a")
    private WebElement faqQuestion20;

    //Как узнать заблокированную сумму на банковской карте?
    @FindBy (xpath = ".//*[@id='question_61']/a")
    private WebElement faqQuestion21;

    //Какую карту возможно указывать для получения кредита?
    @FindBy (xpath = ".//*[@id='question_62']/a")
    private WebElement faqQuestion22;

    //Как долго ждать перевода на банковскую карту?
    @FindBy (xpath = ".//*[@id='question_63']/a")
    private WebElement faqQuestion23;

    /**Блок Кредитный договор*/
    @FindBy (xpath = ".//*[@class='side-bar']/a[3]")
    private WebElement faqBlockMove3;

    //Где найти посмотреть договор?
    @FindBy (xpath = ".//*[@id='question_65']/a")
    private WebElement faqQuestion24;

    //Каким образом подписывается кредитный договор в MyCredit?
    @FindBy (xpath = ".//*[@id='question_66']/a")
    private WebElement faqQuestion25;

    //Что такое электронная подпись?
    @FindBy (xpath = ".//*[@id='question_67']/a")
    private WebElement faqQuestion26;

    /**Блок Личный кабинет*/
    @FindBy (xpath = ".//*[@class='side-bar']/a[4]")
    private WebElement faqBlockMove4;

    //Личный кабинет
    @FindBy (xpath = ".//*[@id='question_70']/a")
    private WebElement faqQuestion27;

    //Как выбрать пароль для личного кабинета пользователя?
    @FindBy (xpath = ".//*[@id='question_71']/a")
    private WebElement faqQuestion28;

    //Что делать если забыли пароль от личного кабинета?
    @FindBy (xpath = ".//*[@id='question_72']/a")
    private WebElement faqQuestion29;

    //Как мне изменить данные в личном кабинете?
    @FindBy (xpath = ".//*[@id='question_74']/a")
    private WebElement faqQuestion30;

    //Как удалить данные о себе
    @FindBy (xpath = ".//*[@id='question_180']/a")
    private WebElement faqQuestion31;


    /**Блок Как погасить / продлить кредит?*/

    @FindBy (xpath = ".//*[@class='side-bar']/a[5]")
    private WebElement faqBlockMove5;

    //Возможно погасить кредит раньше срока в MyCredit?
    @FindBy (xpath = ".//*[@id='question_77']/a")
    private WebElement faqQuestion32;

    //Возможно погашать кредит частями в MyCredit?
    @FindBy (xpath = ".//*[@id='question_78']/a")
    private WebElement faqQuestion33;

    //Когда возможно подать заявку на второй кредит?
    @FindBy (xpath = ".//*[@id='question_79']/a")
    private WebElement faqQuestion34;

    //Заявка на кредит была отклонена. Можно ли подать заявку еще раз?
    @FindBy (xpath = ".//*[@id='question_80']/a")
    private WebElement faqQuestion35;

    //На сколько дней возможно продлить кредит?
    @FindBy (xpath = ".//*[@id='question_81']/a")
    private WebElement faqQuestion36;

    //Почему мне отказали?
    @FindBy (xpath = ".//*[@id='question_82']/a")
    private WebElement faqQuestion37;

    //Заявка на кредит была отклонена. Можно ли подать заявку еще раз?
    @FindBy (xpath = ".//*[@id='question_497']/a")
    private WebElement faqQuestion38;

    //На сколько дней возможно продлить кредит?
    @FindBy (xpath = ".//*[@id='question_498']/a")
    private WebElement faqQuestion39;

    //Почему мне отказали?
    @FindBy (xpath = ".//*[@id='question_499']/a")
    private WebElement faqQuestion40;

    @BeforeTest
    protected WebDriver getDriver()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver_win32 (1)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1920, 1080));
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        PageFactory.initElements(driver,this);
        return driver;
    }

    public void open(){
        driver.get(BASEURL);
    }

    public void waiterPreloader(){
        WebDriverWait waitForOne = new WebDriverWait(driver, 10);
        waitForOne.until(ExpectedConditions.presenceOfElementLocated(By.xpath(preLoaderF)));
    }

    public void waiterElement(By Xpath){
        WebDriverWait waitForOne = new WebDriverWait(driver, 10);
        waitForOne.until(ExpectedConditions.presenceOfElementLocated(Xpath));
    }

    public boolean isElementXpathPresent(String s){
        boolean b = driver.findElements(By.xpath(s)).size() > 0;
        return b;
    }

    public void faqQuestion1Go() {
        deleteHeader();
        faqQuestions1.click();
    }

    public void faqQuestions2Go() {
        deleteHeader();
        faqQuestions2.click();
    }

    public void faqQuestions3Go() {
        deleteHeader();
        faqQuestions3.click();
    }

    public void faqQuestions4Go() throws InterruptedException{
        deleteHeader();
        Actions moveToElement = new Actions(driver);
        moveToElement.moveToElement(faqQuestions4).click().perform();
    }

    public void faqQuestions5Go() throws InterruptedException{
        deleteHeader();
        Actions moveToElement = new Actions(driver);
        moveToElement.moveToElement(faqQuestion5).click().perform();
    }

    public void faqQuestions6Go() throws InterruptedException{
        deleteHeader();
        Actions moveToElement = new Actions(driver);
        moveToElement.moveToElement(faqQuestion6).click().perform();
    }

    public void faqQuestions7Go() throws InterruptedException{
        deleteHeader();
        Actions moveToElement = new Actions(driver);
        moveToElement.moveToElement(faqQuestion7).click().perform();
    }

    public void faqQuestions8Go() throws InterruptedException{
        deleteHeader();
        Actions moveToElement = new Actions(driver);
        moveToElement.moveToElement(faqQuestion8).click().perform();
    }

    public void faqQuestions9Go() throws InterruptedException{
        deleteHeader();
        Actions moveToElement = new Actions(driver);
        moveToElement.moveToElement(faqQuestion9).click().perform();
    }

    public void faqQuestions10Go() throws InterruptedException{
        deleteHeader();
        Actions moveToElement = new Actions(driver);
        moveToElement.moveToElement(faqQuestion10).click().perform();
    }

    public void faqQuestions11Go() throws InterruptedException{
        deleteHeader();
        Actions moveToElement = new Actions(driver);
        moveToElement.moveToElement(faqQuestion11).click().perform();
    }

    public void faqQuestions12Go() throws InterruptedException{
        deleteHeader();
        Actions moveToElement = new Actions(driver);
        moveToElement.moveToElement(faqQuestion12).click().perform();
    }

    public void faqQuestions13Go() throws InterruptedException{
        deleteHeader();
        Actions moveToElement = new Actions(driver);
        moveToElement.moveToElement(faqQuestion13).click().perform();
    }

    public void faqQuestions14Go() throws InterruptedException{
        deleteHeader();
        Actions moveToElement = new Actions(driver);
        moveToElement.moveToElement(faqQuestion14).click().perform();
    }

    public void faqQuestions15Go() {
        deleteHeader();
        Actions moveToElement = new Actions(driver);
        moveToElement.moveToElement(faqQuestion15).click().perform();
    }

    public void faqQuestions16Go() {
        deleteHeader();
        Actions moveToElement = new Actions(driver);
        moveToElement.moveToElement(faqQuestion16).click().perform();
    }

    public void faqQuestions17Go() {
        deleteHeader();
        Actions moveToElement = new Actions(driver);
        moveToElement.moveToElement(faqQuestion17).click().perform();
    }

    public void faqQuestions18Go() {
        deleteHeader();
        Actions moveToElement = new Actions(driver);
        moveToElement.moveToElement(faqQuestion18).click().perform();
    }

    public void faqQuestions19Go() throws InterruptedException{
        deleteHeader();
        Actions moveToElement = new Actions(driver);
        moveToElement.moveToElement(faqQuestion19).click().perform();
    }

    public void faqQuestions20Go() throws InterruptedException{
        deleteHeader();
        Actions moveToElement = new Actions(driver);
        moveToElement.moveToElement(faqQuestion20).click().perform();
    }

    public void faqQuestions21Go() throws InterruptedException{
        deleteHeader();
        Actions moveToElement = new Actions(driver);
        moveToElement.moveToElement(faqQuestion21).click().perform();
    }

    public void faqQuestions22Go() throws InterruptedException{
        deleteHeader();
        Actions moveToElement = new Actions(driver);
        moveToElement.moveToElement(faqQuestion22).click().perform();
    }

    public void faqQuestions23Go() throws InterruptedException{
        deleteHeader();
        Actions moveToElement = new Actions(driver);
        moveToElement.moveToElement(faqQuestion23).click().perform();
    }

    public void faqQuestions24Go() throws InterruptedException{
        deleteHeader();
        Actions moveToElement = new Actions(driver);
        moveToElement.moveToElement(faqQuestion24).click().perform();
    }

    public void faqQuestions25Go() throws InterruptedException{
        deleteHeader();
        Actions moveToElement = new Actions(driver);
        moveToElement.moveToElement(faqQuestion25).click().perform();
    }

    public void faqQuestions26Go() throws InterruptedException{
        deleteHeader();
        Actions moveToElement = new Actions(driver);
        moveToElement.moveToElement(faqQuestion26).click().perform();
    }

    public void faqQuestions27Go() throws InterruptedException{
        deleteHeader();
        Actions moveToElement = new Actions(driver);
        moveToElement.moveToElement(faqQuestion27).click().perform();
    }

    public void faqQuestions28Go() throws InterruptedException{
        deleteHeader();
        Actions moveToElement = new Actions(driver);
        moveToElement.moveToElement(faqQuestion28).click().perform();
    }

    public void faqQuestions29Go() throws InterruptedException{
        deleteHeader();
        Actions moveToElement = new Actions(driver);
        moveToElement.moveToElement(faqQuestion29).click().perform();
    }

    public void faqQuestions30Go() throws InterruptedException{
        deleteHeader();
        faqQuestion30.click();
    }

    public void faqQuestions31Go() throws InterruptedException{
        deleteHeader();
        Actions moveToElement = new Actions(driver);
        moveToElement.moveToElement(faqQuestion31).click().perform();
    }

    public void faqQuestions32Go() throws InterruptedException{
        deleteHeader();
        Actions moveToElement = new Actions(driver);
        moveToElement.moveToElement(faqQuestion32).click().perform();
    }

    public void faqQuestions33Go() throws InterruptedException{
        deleteHeader();
        Actions moveToElement = new Actions(driver);
        moveToElement.moveToElement(faqQuestion33).click().perform();
    }

    public void faqQuestions34Go() throws InterruptedException{
        deleteHeader();
        Actions moveToElement = new Actions(driver);
        moveToElement.moveToElement(faqQuestion34).click().perform();
    }

    public void faqQuestions35Go() throws InterruptedException{
        deleteHeader();
        Actions moveToElement = new Actions(driver);
        moveToElement.moveToElement(faqQuestion35).click().perform();
    }

    public void faqQuestions36Go() throws InterruptedException{
        deleteHeader();
        Actions moveToElement = new Actions(driver);
        moveToElement.moveToElement(faqQuestion36).click().perform();
    }

    public void faqQuestions37Go() throws InterruptedException{
        deleteHeader();
        Actions moveToElement = new Actions(driver);
        moveToElement.moveToElement(faqQuestion37).click().perform();
    }

    public void faqQuestions38Go() throws InterruptedException{
        deleteHeader();
        Actions moveToElement = new Actions(driver);
        moveToElement.moveToElement(faqQuestion38).click().perform();
    }

    public void faqQuestions39Go() throws InterruptedException{
        deleteHeader();
        faqQuestion39.click();
    }

    public void faqQuestions40Go() throws InterruptedException{
        deleteHeader();
        faqQuestion40.click();
    }



    /**Метод удаление Header-a*/
    public void deleteHeader() {
        ((JavascriptExecutor) driver).executeScript("var elem = document.getElementById('myAffix');" + "elem.remove();");
    }

    @AfterTest
    protected void tearDown() {
        if(driver != null)
            driver.quit();
    }
}
