package Tests;

import Pages.SharesPage;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;
import java.util.List;

public class SharesTest extends SharesPage {

    private SoftAssert softAssert = new SoftAssert();
    private final static String BaseURL = "https://mycredit.ua/ru/news/";
    private static final String Shareli1 = "/html/body/div[1]/div[4]/div/div[2]/div/div/ul/li[1]";
    private static final String Aboutshare1img = "/html/body/div[1]/div[3]/div/div[2]/div/div[2]/div/div[1]/img";
    private static final String Aboutshare2img = "/html/body/div[1]/div[4]/div/div[2]/div/div[2]/div/div[1]/img";
    private static final String Aboutshare3img = "/html/body/div[1]/div[4]/div/div[2]/div/div/div[1]/img";
    private static final String Buttonprevious = ".//*[@class='previous']";
    private static final String Buttonbar1 = ".//*[@class='news-pagination']//*[text()='1']";
    private static final String Buttonbar2 = ".//*[@class='news-pagination']//*[text()='2']";
    private static final String Buttonbar3 = ".//*[@class='news-pagination']//*[text()='3']";
    private static final String Buttonbar4 = ".//*[@class='news-pagination']//*[text()='4']";
    private static final String Buttonbar5 = ".//*[@class='news-pagination']//*[text()='5']";
    private static final String Buttonbar6 = ".//*[@class='next']";



    @Test(priority = 1)
    public void TestSharesHeader() {
        openSharesHeader();
        String Sharestext = driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[1]/div/p")).getText();
        softAssert.assertEquals(Sharestext, "Акции");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL);
        softAssert.assertEquals(isElementXpathPresent(Shareli1), true, "Элемент найден");
        softAssert.assertAll();

    }

    @Test(priority = 2)
    public void TestAboutShare1() {
        openSharesHeader();
        clickAboutShare1();
        String AboutShare26text = driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div/div[2]/div/div[1]/div[2]/p[1]")).getText();
        softAssert.assertEquals(AboutShare26text, "Беспроцентный кредит под 0% - это реальность! Теперь получить кредит в MyCredit можно не только без лишних документов, но и без лишних процентов. Да, деньги в MyCredit дают бесплатно!");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "sladkij-noyabr-mycredit/");
        softAssert.assertEquals(isElementXpathPresent(Aboutshare2img), true, "Элемент найден");
    }

    @Test(priority = 3)
    public void TestAboutShare2() {
        openSharesHeader();
        clickAboutShare2();
        String AboutShare1text = driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div/div[2]/div/div[1]/div[2]/p[1]")).getText();
        softAssert.assertEquals(AboutShare1text, "Акция \"НЕАНГЕЛЫ вместе с MyCredit\" подошла к концу. И мы готовы назвать 9 победителей второго этапа акции, которые оформили займ с 07 сентября по 31 октября в MyCredit.");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "rezultaty-akcii-s-gruppoj-neangely-koncencerty-noyabrya/");
        softAssert.assertEquals(isElementXpathPresent(Aboutshare2img), true, "Элемент найден");
    }

    @Test(priority = 4)
    public void TestAboutShare3() {
        openSharesHeader();
        clickAboutShare3();
        String AboutShare2text = driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div/div/div[1]/div[2]/p[1]")).getText();
        softAssert.assertEquals(AboutShare2text, "Целый месяц мы отмечали свой первый День рождения и в праздничном настроении радовали подарками своих любимым клиентов.");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "chto-my-sdelali-dlya-vas-v-oktyabre/");
        softAssert.assertEquals(isElementXpathPresent(Aboutshare3img), true, "Элемент найден");
    }

        @Test(priority = 5)
    public void TestAboutShare4() {
        openSharesHeader();
        clickAboutShare4();
        String AboutShare3text = driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div/div[2]/div/div[1]/div[2]/p[1]")).getText();
        softAssert.assertEquals(AboutShare3text, "Вот и подошел к концу первый этап нашей грандиозной акции с группой НЕАНГЕЛЫ. Сразу 16 счастливчиков стали победителями и получают в подарок по 2 билета на феерическое шоу SLAVAVIСTORIA, которое пройдет в их городе уже в октябре.");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "akciya-s-gruppoj-neangely-rezultaty-oktyabrya/");
        softAssert.assertEquals(isElementXpathPresent(Aboutshare2img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test(priority = 6)
    public void TestAboutShare5() {
        openSharesHeader();
        clickAboutShare5();
        String AboutShare4text = driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div/div/div[1]/div[2]/p[1]")).getText();
        softAssert.assertEquals(AboutShare4text, "Целый месяц мы отмечали свой первый День рождения и в праздничном настроении радовали подарками своих любимым клиентов.");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "rezultaty-mycredit-v-sentyabre/");
        softAssert.assertEquals(isElementXpathPresent(Aboutshare3img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test(priority = 7)
    public void TestAboutShare6() {
        openSharesHeader();
        clickAboutShare6();
        String AboutShare5text = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div/div[2]/div/div[1]/div[2]/p[1]")).getText();
        softAssert.assertEquals(AboutShare5text, "MyCredit исполнился 1 год и к этому событию мы приурочили совместную акцию с группой НЕАНГЕЛЫ.");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "neangely-vmeste-s-mycredit/");
        softAssert.assertEquals(isElementXpathPresent(Aboutshare1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test(priority = 8)
    public void TestButtonsbar() throws InterruptedException {
        openSharesHeader();
        clickPageTwo();
        movetoPageTwo2();
        softAssert.assertEquals(isElementXpathPresent(Buttonprevious), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(Buttonbar1), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(Buttonbar2), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(Buttonbar3), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(Buttonbar4), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(Buttonbar5), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(Buttonbar6), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test(priority = 9)
    public void TestButtontwo() throws InterruptedException {
        openSharesHeader();
        clickPageTwo();
        movetoPageTwo2();
        softAssert.assertEquals("rgba(0, 86, 184, 1)", driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div/div/ul/div/ul/li[3]")).getCssValue("background-color"));
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "?news_start=6");
        softAssert.assertAll();
    }

    @Test(priority = 10)
    public void TestAboutShare7() throws InterruptedException {
        openSharesHeader();
        clickPageTwo();
        clickAboutShare1();
        String AboutShare6text = driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div/div[2]/div/div[1]/div[2]/p[1]")).getText();
        softAssert.assertEquals(AboutShare6text, "Помните мы говорили, что готовим для вас грандиозный сюрприз к первому Дню рождения нашего сервиса? Так вот сегодня наконец-то мы готовы о нем рассказать!");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "neangely-stali-licom-mycredit/");
        softAssert.assertEquals(isElementXpathPresent(Aboutshare2img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test(priority = 11)
    public void TestAboutShare8() throws InterruptedException {
        openSharesHeader();
        clickPageTwo();
        clickAboutShare2();
        String AboutShare7text = driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div/div/div[1]/div[2]/p")).getText();
        softAssert.assertEquals(AboutShare7text, "В августе, несмотря на сезон отпусков и изматывающую жару, мы старались не сбавлять свой темп, и вот результат:");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "nashi-dostizheniya-v-avguste/");
        softAssert.assertEquals(isElementXpathPresent(Aboutshare3img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test(priority = 12)
    public void TestAboutShare9() throws InterruptedException {
        openSharesHeader();
        clickPageTwo();
        clickAboutShare3();
        String AboutShare8text = driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div/div[2]/div/div[1]/div[2]/p[1]")).getText();
        softAssert.assertEquals(AboutShare8text, "Вслед уходящему лету говорим “Спасибо” и поздравляем победителей акции - четырех счастливчиков, которые не просто взяли займ, а остались в плюсе благодаря финансовому помощнику MyCredit.");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "pobediteli-akcii-provozhaem-leto/");
        softAssert.assertEquals(isElementXpathPresent(Aboutshare2img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test(priority = 13)
    public void TestAboutShare10() throws InterruptedException {
        openSharesHeader();
        clickPageTwo();
        clickAboutShare4();
        String AboutShare9text = driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div/div[2]/div/div[1]/div[2]/p[1]")).getText();
        softAssert.assertEquals(AboutShare9text, "Последние дни лета нужно проводить ярко, решили мы. Поэтому если вы не успели отдохнуть, то просто необходимо наверстать такую возможность. Встретиться с друзьями, сходить в кафе или купить обновку — финансовый помощник MyCredit добавит красок в последние дни августа!");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "byt-v-plyuse-s-mycredit/");
        softAssert.assertEquals(isElementXpathPresent(Aboutshare2img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test(priority = 14)
    public void TestAboutShare11() throws InterruptedException {
        openSharesHeader();
        clickPageTwo();
        clickAboutShare5();
        String AboutShare10text = driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div/div/div[1]/div[2]/p")).getText();
        softAssert.assertEquals(AboutShare10text, "Прошел второй месяц лета, сезон отпусков только набрал свои обороты, но мы с командой не складываем руки, а только продолжаем трудится над улучшением сервиса и его работы. Что мы успели сделать для вас в июле:");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "dostizheniya-mycredit-v-iyule/");
        softAssert.assertEquals(isElementXpathPresent(Aboutshare3img), true, "Элемент найден");
        softAssert.assertAll();
    }

   @Test(priority = 15)
    public void TestAboutShare12() throws InterruptedException {
        openSharesHeader();
        clickPageTwo();
        clickAboutShare6();
        String AboutShare11text = driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div/div/div[1]/div[2]/p[1]")).getText();
        softAssert.assertEquals(AboutShare11text, "Вы выбираете MyCredit, а мы стараемся для вас. Благодарим, что вы с нами и делаете нас лучше! В июне месяце мы решили сказать \"спасибо\" своим клиентам и постарались сделать наш сервис еще более удобным. Нововведения в июне для наших клиентов:");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "new-features/");
        softAssert.assertEquals(isElementXpathPresent(Aboutshare3img), true, "Элемент найден");
        softAssert.assertAll();
    }



    @Test(priority = 16)
    public void TestButtonThree() throws InterruptedException {
        openSharesHeader();
        clickPageThree();
        movetoPageThree2();
        softAssert.assertEquals("rgba(0, 86, 184, 1)", driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div/div/ul/div/ul/li[4]")).getCssValue("background-color"));
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "?news_start=12");
        softAssert.assertAll();
    }

    @Test(priority = 17)
    public void TestAboutShare13() throws InterruptedException {
        openSharesHeader();
        clickPageThree();
        clickAboutShare1();
        String AboutShare12text = driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div/div[2]/div/div[1]/div[2]/p[1]")).getText();
        softAssert.assertEquals(AboutShare12text, "Готовы к новому сюрпризу от MyCredit? Сегодня мы объявляем о запуске бонусной программы лояльности “Любимый клиент” для постоянных клиентов MyCredit.");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "programma-loyalnosti-lyubimyj-klient/");
        softAssert.assertEquals(isElementXpathPresent(Aboutshare2img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test(priority = 18)
    public void TestAboutShare14() throws InterruptedException {
        openSharesHeader();
        clickPageThree();
        clickAboutShare2();
        String AboutShare13text = driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div/div[2]/div/div[1]/div[2]/p[1]")).getText();
        softAssert.assertEquals(AboutShare13text, "Вы рады наступлению лета? И мы тоже! Рады настолько, что запускаем новую акцию - “500 под 0”. Целых три летних месяца мы готовы баловать наших новых клиентов фантастической ставкой - кредит под 0%*!");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "v-leto-s-mycredit/");
        softAssert.assertEquals(isElementXpathPresent(Aboutshare2img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test(priority = 19)
    public void TestAboutShare15() throws InterruptedException {
        openSharesHeader();
        clickPageThree();
        clickAboutShare3();
        String AboutShare14text = driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div/div[2]/div/div[1]/div[2]/p[1]")).getText();
        softAssert.assertEquals(AboutShare14text, "Что самое главное в студенческой жизни? Конечно же, быть в курсе всех событий и ничего не пропустить! Обидно, что именно в это время у тебя напряг с деньгами. Не откладывай ничего на завтра - живи сейчас!");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "studencheskaya-programma/");
        softAssert.assertEquals(isElementXpathPresent(Aboutshare2img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test(priority = 20)
    public void TestAboutShare16() throws InterruptedException {
        openSharesHeader();
        clickPageThree();
        clickAboutShare4();
        String AboutShare15text = driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div/div[2]/div/div[1]/div[2]/p[1]")).getText();
        softAssert.assertEquals(AboutShare15text, "Говорят, что клиент всегда прав, а наши клиенты еще и самые лучшие! Поэтому мы не удержались и решили отблагодарить вас приятными бонусами.");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "uletnye-dni-v-mycredit/");
        softAssert.assertEquals(isElementXpathPresent(Aboutshare2img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test(priority = 21)
    public void TestAboutShare17() throws InterruptedException {
        openSharesHeader();
        clickPageThree();
        clickAboutShare5();
        String AboutShare16text = driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div/div[2]/div/div[1]/div[2]/p[1]")).getText();
        softAssert.assertEquals(AboutShare16text, "Как же давно мы ждали этих дней! Весна, тепло, выходные и друзья рядом - настоящий шашлычный weekend! Мы знаем, как вы устали и понимаем, как важно в эти дни просто наслаждаться отдыхом и не думать ни о чем. Но иногда ситуация выходит из под контроля. Именно тогда на помощь к вам спешит ваш финансовый помощник MyCredit!");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "shashlychnyj-weekend/");
        softAssert.assertEquals(isElementXpathPresent(Aboutshare2img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test(priority = 22)
    public void TestAboutShare18() throws InterruptedException {
        openSharesHeader();
        clickPageThree();
        clickAboutShare6();
        String AboutShare17text = driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div/div[2]/div/div[1]/div[2]/p[1]")).getText();
        softAssert.assertEquals(AboutShare17text, "Компания MyCredit поздравляет всех клиентов с наступающим праздником Светлой Пасхи. В канун этого замечательного дня подводим итоги нашей акции “Семейные традиции с MyCredit” и уже готовы объявить победителей!");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "pobediteli-akcii-k-svetloj-pashe/");
        softAssert.assertEquals(isElementXpathPresent(Aboutshare2img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test(priority = 23)
    public void TestButtonFour() throws InterruptedException {
        openSharesHeader();
        clickPageFour();
        movetoPageFour2();
        softAssert.assertEquals("rgba(0, 86, 184, 1)", driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div/div/ul/div/ul/li[5]")).getCssValue("background-color"));
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "?news_start=18");
        softAssert.assertAll();
    }

    @Test(priority = 24)
    public void TestAboutShare19() throws InterruptedException {
        openSharesHeader();
        clickPageFour();
        clickAboutShare1();
        String AboutShare18text = driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div/div[2]/div/div[1]/div[2]/p[1]")).getText();
        softAssert.assertEquals(AboutShare18text, "Что самое главное в жизни? Конечно же наша семья и родные люди! К сожалению, часто, растворяясь в рабочих буднях, мы забываем об этом. MyCredit в канун Светлого праздника возвращает традиции и предлагает собрать дорогих сердцу людей за одним столом!");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "semejnye-tradicii-s-mycredit/");
        softAssert.assertEquals(isElementXpathPresent(Aboutshare2img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test(priority = 25)
    public void TestAboutShare20() throws InterruptedException {
        openSharesHeader();
        clickPageFour();
        clickAboutShare2();
        String AboutShare19text = driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div/div[2]/div/div[1]/div[2]/p[1]")).getText();
        softAssert.assertEquals(AboutShare19text, "Прекрасный весенний женский день незаметно промелькнул. А подарки от MyCredit еще не заканчиваются! Самое время объявить победителей нашей акции для всех девушек и женщин. Ими стали сразу 10 наших клиенток:");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "podvodim-itogi-vesennej-akcii/");
        softAssert.assertEquals(isElementXpathPresent(Aboutshare2img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test(priority = 26)
    public void TestAboutShare21() throws InterruptedException {
        openSharesHeader();
        clickPageFour();
        clickAboutShare3();
        String AboutShare20text = driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div/div[2]/div/div[1]/div[2]/p[1]")).getText();
        softAssert.assertEquals(AboutShare20text, "Сервис онлайн-кредитования MyCredit поздравляет всех девушек и женщин с весной!");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "vesennyaya-akciya-k-8-marta/");
        softAssert.assertEquals(isElementXpathPresent(Aboutshare2img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test(priority = 27)
    public void TestAboutShare22() throws InterruptedException {
        openSharesHeader();
        clickPageFour();
        clickAboutShare4();
        String AboutShare21text = driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div/div[2]/div/div[1]/div[2]/p[1]")).getText();
        softAssert.assertEquals(AboutShare21text, "Акция ко Дню всех влюбленных подошла к концу. Спешим поздравить победителей! По итогам розыгрыша счастливчиками стали:");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "itogi-romanticheskoj-akcii-k-14-fevralya/");
        softAssert.assertEquals(isElementXpathPresent(Aboutshare2img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test(priority = 28)
    public void TestAboutShare23() throws InterruptedException {
        openSharesHeader();
        clickPageFour();
        clickAboutShare5();
        String AboutShare22text = driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div/div[2]/div/div[1]/p[1]")).getText();
        softAssert.assertEquals(AboutShare22text, "До 14 февраля осталось всего две недели, а денег на подарок для " +
                "любимого человека нет? На помощь к вам спешит ваш финансовый помощник MyCredit! А для всех оформивших кредит - возможность выиграть ювелирные украшения от “Золотой Век”.");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "rozygrysh-ko-dnyu-vseh-vlyublennyh/");
        softAssert.assertEquals(isElementXpathPresent(Aboutshare2img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test(priority = 29)
    public void TestAboutShare24() throws InterruptedException {
        openSharesHeader();
        clickPageFour();
        clickAboutShare6();
        String AboutShare23text = driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div/div[2]/div/div[1]/p[1]")).getText();
        softAssert.assertEquals(AboutShare23text, "Уважаемые клиенты!");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "pobediteli-happy-new-credit-2017-ii-etap/");
        softAssert.assertEquals(isElementXpathPresent(Aboutshare2img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test(priority = 30)
    public void TestButtonFive() throws InterruptedException {
        openSharesHeader();
        clickPageFive();
        movetoPageFive2();
        softAssert.assertEquals("rgba(0, 86, 184, 1)", driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div/div/ul/div/ul/li[6]")).getCssValue("background-color"));
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "?news_start=24");
        softAssert.assertAll();
    }

    @Test(priority = 31)
    public void TestAboutShare25() throws InterruptedException {
        openSharesHeader();
        clickPageFive();
        clickAboutShare1();
        String AboutShare24text = driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div/div[2]/div/div[1]/p[1]")).getText();
        softAssert.assertEquals(AboutShare24text, "Уважаемые клиенты! Спешим сообщить, что определился победитель I этапа розыгрыша смартфонов в акции “Happy New Credit 2017”.");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "pobeditel-happy-new-credit-2017-i-etap/");
        softAssert.assertEquals(isElementXpathPresent(Aboutshare2img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test(priority = 32)
    public void TestAboutShare26() throws InterruptedException {
        openSharesHeader();
        clickPageFive();
        clickAboutShare2();
        String AboutShare25text = driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div/div[2]/div/div[1]/h2")).getText();
        softAssert.assertEquals(AboutShare25text, "Новогодний розыгрыш призов от MyCredit!");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "novogodnya-akciya/");
        softAssert.assertEquals(isElementXpathPresent(Aboutshare2img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test(priority = 33)
    public void TestShareSitebar()
    {
        openSharesHeader();
        clickAboutShare6();
        String Sitebar = driver.findElement(By.xpath(".//*[@class='side-bar']//*[text()='НЕАНГЕЛЫ вместе с MyCredit']")).getText();
        softAssert.assertEquals(Sitebar, "НЕАНГЕЛЫ вместе с MyCredit");
        List<String> list = new ArrayList<String>();
        for (int i = 1; i <= 25; i++) {
            list.add(driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div/div[1]/div[1]/a[" + i + "]")).getText());
        }

        softAssert.assertEquals(list.get(0), "Новогодняя акция от MyCredit");
        softAssert.assertEquals(list.get(1), "Победитель “Happy New Credit 2017” (I этап)");
        softAssert.assertEquals(list.get(2), "Победители “Happy New Credit 2017” (II этап)");
        softAssert.assertEquals(list.get(3), "Розыгрыш ко Дню всех влюбленных");
        softAssert.assertEquals(list.get(4), "Итоги романтической акции к 14 февраля");
        softAssert.assertEquals(list.get(5), "Весенняя акция к 8 марта!");
        softAssert.assertEquals(list.get(6), "Подводим итоги весенней акции");
        softAssert.assertEquals(list.get(7), "Семейные традиции с MyCredit");
        softAssert.assertEquals(list.get(8), "Победители акции к Светлой Пасхе");
        softAssert.assertEquals(list.get(9), "Шашлычный Weekend");
        softAssert.assertEquals(list.get(10), "Улетные дни в MyCredit!");
        softAssert.assertEquals(list.get(11), "Студенческая программа");
        softAssert.assertEquals(list.get(12), "В лето с MyCredit!");
        softAssert.assertEquals(list.get(13), "Программа лояльности “Любимый клиент”");
        softAssert.assertEquals(list.get(14), "5 важных нововведений MyCredit в июне");
        softAssert.assertEquals(list.get(15), "Достижения MyCredit в июле");
        softAssert.assertEquals(list.get(16), "Быть в плюсе с MyCredit");
        softAssert.assertEquals(list.get(17), "Победители акции “Провожаем лето”");
        softAssert.assertEquals(list.get(18), "Наши достижения в августе");
        softAssert.assertEquals(list.get(19), "НЕАНГЕЛЫ стали лицом MyCredit");
        softAssert.assertEquals(list.get(20), "Акция с группой НЕАНГЕЛЫ: результаты октября");
        softAssert.assertEquals(list.get(21), "Результаты MyCredit в сентябре");
        softAssert.assertEquals(list.get(22), "Урожай октября. Нововведения месяца");
        softAssert.assertEquals(list.get(23), "Результаты акции с группой НЕАНГЕЛЫ: концерты ноября");
        softAssert.assertEquals(list.get(24), "Сладкий ноябрь MyCredit");
        softAssert.assertAll();
    }

    @Test(priority = 34)
    public void TestCalculator() throws InterruptedException {
        openSharesHeader();
        clickAboutShare1();
        Thread.sleep(300);
        movetoCalculator();
        softAssert.assertEquals("rgba(0, 177, 129, 1)", driver.findElement(By.xpath(".//*[@class='btn btn-slider']")).getCssValue("background-color"));
//        softAssert.assertEquals("rgba(0, 0, 0, 0)", driver.findElement(By.xpath(".//*[@class = 'small-slider-holder ']//*[text() = 'Какую сумму вы желаете получить?']")).getCssValue("background-color"));
        softAssert.assertAll();
    }
}