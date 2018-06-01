package Tests;

import Pages.StudentsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class StudentsTest extends StudentsPage{

    private SoftAssert softAssert = new SoftAssert();

    private static final String BaseURL = "https://mycredit.ua/ru/";

    private static final String MainPart = "/html/body/div[1]/div[3]/div[1]";
    private static final String Calculatorbutton = "/html/body/div[1]/div[3]/div[2]/div/div/form/div/div[2]/div[1]/div[3]/button";
    private static final String Aboutstudents2img = "/html/body/div[1]/div[4]/div/div[2]/div/div[2]/div/div[1]/img";
    private static final String Why1 = "/html/body/div[1]/section[1]/div/div[1]/div[1]";
    private static final String Why2 = "/html/body/div[1]/section[1]/div/div[1]/div[2]";
    private static final String Why3 = "/html/body/div[1]/section[1]/div/div[1]/div[3]";
    private static final String Why4 = "/html/body/div[1]/section[1]/div/div[1]/div[4]";
    private static final String Dalee = "//*[@id=\"how\"]/div/div/div/div/form/button";
    private static final String How1 = "/html/body/div[1]/section[2]/ol/li[1]/div[1]/img";
    private static final String How2 = "/html/body/div[1]/section[2]/ol/li[2]/div[1]/img";
    private static final String How3 = "/html/body/div[1]/section[2]/ol/li[3]/div[1]/img";
    private static final String How4 = "/html/body/div[1]/section[2]/ol/li[4]/div[1]/img";
    private static final String Howbutton = "/html/body/div[1]/section[2]/div/div[1]/p/img";
    private static final String InCabinet = "/html/body/div[1]/section[4]/div/div/div[1]/div/div/div[1]/div/img[1]";
    private static final String Terminals = "/html/body/div[1]/section[4]/div/div/div[2]/div/div/div[1]/div/img";
    private static final String PrivatBank = "/html/body/div[1]/section[4]/div/ul/li[1]/img";
    private static final String UkrBank = "/html/body/div[1]/section[4]/div/ul/li[2]/img";
    private static final String UniCreditBank= "/html/body/div[1]/section[4]/div/ul/li[3]/img";
    private static final String AlfaBank = "/html/body/div[1]/section[4]/div/ul/li[4]/img";






    @Test(priority = 1)
    public void OpenStudentsTest() throws InterruptedException
    {
         openStudentsHeader();
        String Studentsbacktext = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div/div/div")).getText();
        softAssert.assertEquals(Studentsbacktext, "МЕЖДУ НАМИ ТАЕТ ЛЕД\n" +
                "СТУДЕНТ? ПОЛУЧАЙ ЗАЙМ ПО ВЫГОДНОЙ СТАВКЕ!");
        String Studentssabout = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div/div/a")).getText();
        softAssert.assertEquals(Studentssabout, "Подробнее");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "uslugi-kreditovaniya/kredit-dlya-studentov-v-ukraine/");
        softAssert.assertEquals(isElementXpathPresent(MainPart), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test(priority = 2)
    public void CalculatorTest() throws InterruptedException
    {
        openStudentsHeader();
        Drag();
        String Studentsthreethouthand = driver.findElement(By.xpath("//*[@id=\"span_amount_large_main\"]")).getText();
        softAssert.assertEquals(Studentsthreethouthand, "1000");
        String Studentsthreethouthand1 = driver.findElement(By.xpath("//*[@id=\"span_amount_day_large_main\"]")).getText();
        softAssert.assertEquals(Studentsthreethouthand1, "35");
        String Studentsprocent = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/div/div")).getText();
        softAssert.assertEquals(Studentsprocent, "0.84%\n" +
                "для всех студентов");
        softAssert.assertEquals(isElementXpathPresent(Calculatorbutton), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test(priority = 3)
    public void StudentsAboutTest() throws InterruptedException
    {
        openStudentsHeader();
        clickStudentsAbout();
        String AboutStudents = driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div/div[2]/div/div[1]/div[2]/p[1]")).getText();
        softAssert.assertEquals(AboutStudents, "Что самое главное в студенческой жизни? Конечно же, быть в курсе всех событий и ничего не пропустить! Обидно, что именно в это время у тебя напряг с деньгами. Не откладывай ничего на завтра - живи сейчас!");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "news/studencheskaya-programma/");
        softAssert.assertEquals(isElementXpathPresent(Aboutstudents2img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test(priority = 4)
    public void WhyitakecreditTest() throws InterruptedException
    {
        openStudentsHeader();
        Whyitakecredit();
        String whytakecredit1 = driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[1]/div[1]/p")).getText();
        softAssert.assertEquals(whytakecredit1, "Предоставим вам 1 день бесплатного пользования кредитом");
        String whytakecredit2 = driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[1]/div[2]/p")).getText();
        softAssert.assertEquals(whytakecredit2, "Гарантируем 100% Конфиденциальность");
        String whytakecredit3 = driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[1]/div[3]/p")).getText();
        softAssert.assertEquals(whytakecredit3, "Погашение в любой момент");
        String whytakecredit4 = driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[1]/div[4]/p")).getText();
        softAssert.assertEquals(whytakecredit4, "Достаточно иметь лишь паспорт и ИНН");
        softAssert.assertEquals(isElementXpathPresent(Why1), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(Why2), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(Why3), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(Why4), true, "Элемент найден");
        softAssert.assertEquals("rgba(0, 177, 129, 1)", driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[2]/button")).getCssValue("background-color"));
        softAssert.assertAll();
    }

    @Test(priority = 5)
    public void WhyitakecreditbuttonTest() throws InterruptedException
    {
        openStudentsHeader();
        clickWhyitakecredit();
        String whytakecreditdalee = driver.findElement(By.xpath("//*[@id=\"how\"]/div/div/div/div/div")).getText();
        softAssert.assertEquals(whytakecreditdalee, "Личные данные");
        softAssert.assertEquals(isElementXpathPresent(Dalee), true, "Элемент найден");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "lichnye-dannye-dlya-studentov/");
        clickDalee();
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "registration/");
        softAssert.assertAll();
    }

    @Test(priority = 6)
    public void HowtomakecreditTest() throws InterruptedException {
        openStudentsHeader();
        Howtomakecredit();
        String whytakecredit1 = driver.findElement(By.xpath("/html/body/div[1]/section[2]/ol/li[1]/div[2]")).getText();
        softAssert.assertEquals(whytakecredit1, "Выберите\n" +
                "сумму и срок");
        String whytakecredit2 = driver.findElement(By.xpath("/html/body/div[1]/section[2]/ol/li[2]/div[2]")).getText();
        softAssert.assertEquals(whytakecredit2, "Заполните\n" +
                "заявку");
        String whytakecredit3 = driver.findElement(By.xpath("/html/body/div[1]/section[2]/ol/li[3]/div[2]")).getText();
        softAssert.assertEquals(whytakecredit3, "Привяжите\n" +
                "карту");
        String whytakecredit4 = driver.findElement(By.xpath("/html/body/div[1]/section[2]/ol/li[4]/div[2]")).getText();
        softAssert.assertEquals(whytakecredit4, "Получите\n" +
                "деньги на карту");
        softAssert.assertEquals(isElementXpathPresent(How1), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(How2), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(How3), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(How4), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(Howbutton), true, "Элемент найден");
        softAssert.assertEquals("rgba(240, 240, 240, 1)", driver.findElement(By.xpath("/html/body/div[1]/section[2]")).getCssValue("background-color"));
        softAssert.assertAll();
    }

    @Test(priority = 7)
    public void PeoplesTest() throws InterruptedException
    {
        openStudentsHeader();
        Peoples();
        String people = driver.findElement(By.xpath("/html/body/div[1]/section[3]/div[1]/p")).getText();
        softAssert.assertEquals(people, "Нам доверяют сотни людей");
        softAssert.assertEquals("rgba(255, 255, 255, 1)", driver.findElement(By.xpath("/html/body/div[1]/section[3]/div[1]/div/div/div/div/div[1]/div/div[3]/div/div")).getCssValue("background-color"));
        clickPeoples();
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "lichnye-dannye-dlya-studentov/");
        softAssert.assertAll();
    }

    @Test(priority = 8)
    public void HowrepayaloanTest() throws InterruptedException
    {
        openStudentsHeader();
        Howrepayaloan();
        String incabinet = driver.findElement(By.xpath("/html/body/div[1]/section[4]/div/div/div[1]/div/div/div[2]/div/p[1]")).getText();
        softAssert.assertEquals(incabinet, "В личном кабинете MyCredit");
        String terminals = driver.findElement(By.xpath("/html/body/div[1]/section[4]/div/div/div[2]/div/div/div[2]/div/p[1]")).getText();
        softAssert.assertEquals(terminals, "Через платежные терминалы");
        softAssert.assertEquals(isElementXpathPresent(InCabinet), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(Terminals), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(PrivatBank), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(UkrBank), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(UniCreditBank), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(AlfaBank), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test(priority = 9)
    public void CreditforstudentsinUkraineTest() throws InterruptedException
    {
        openStudentsHeader();
        CreditforstudentsinUkraine();
        String creditfor = driver.findElement(By.xpath("/html/body/div[1]/section[5]/div/div/div/div/div/h1")).getText();
        softAssert.assertEquals(creditfor, "Кредит для студентов в Украине");
        DrugtextCreditforstudentsinUkraine();
        String textdrug = driver.findElement(By.xpath("/html/body/div[1]/section[5]/div/div/div/div/div/div/div/div[1]/p[5]")).getText();
        softAssert.assertEquals(textdrug, "Оформить кредиты студентам в Украине теперь намного проще и доступнее.");
        softAssert.assertAll();
    }

    @Test(priority = 10)
    public void InformationTest() throws InterruptedException
    {
        openStudentsHeader();
        Information();
        String Sroki = driver.findElement(By.xpath("/html/body/div[1]/section[6]/div/div[1]/div[1]/p[3]")).getText();
        softAssert.assertEquals(Sroki, "Максимальная годовая процентная ставка, включающая ссудный процент, а также все остальные комиссии и расходы за год составляет 547,5%");
        String Contact = driver.findElement(By.xpath("/html/body/div[1]/section[6]/div/div[1]/div[2]/p[3]")).getText();
        softAssert.assertEquals(Contact, "Свидетельство о регистрации финансового учреждения серия IK №146, регистрационный номер №16103223, выданное Национальной комиссией по государственному регулированию в сфере рынков финансовых услуг 20.10.2015 года.");
        String creditfor = driver.findElement(By.xpath("/html/body/div[1]/section[6]/div/div[2]/div/p[2]")).getText();
        softAssert.assertEquals(creditfor, "При оформлении первого кредита - 1000 грн на 14 дней, сумма к оплате составит 1138 грн. При этом максимальная годовая процентная ставка APR – 547,5 %. Мы прекращаем начисление процентов спустя 90 дней после просрочки по кредиту. Поэтому Вам в любом случае не придется возвращать в разы больше, чем Вы заняли.");
        softAssert.assertAll();
    }


}
