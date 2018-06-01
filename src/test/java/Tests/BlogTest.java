package Tests;

import Pages.BlogPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;
import java.util.List;

public class BlogTest extends BlogPage {

    private SoftAssert softAssert = new SoftAssert();
    private static final String BaseURL = "https://mycredit.ua/ru/blog/";
    private static final String Blogli1 = "/html/body/div[1]/div[4]/div/div[2]/div/div/ul/li[1]";
    private static final String Aboutblog1img = "/html/body/div[1]/div[4]/div/div[2]/div/div[2]/div/div[1]/img";
    private static final String Text = "/html/body/div[1]/div[4]/div/div[2]/div/div[2]/div/div[1]/div[2]/p[1]";
    private static final String Text2 = "/html/body/div[1]/div[4]/div/div[2]/div/div[2]/div/div[1]/p[2]";
    private static final String Buttonprevious = ".//*[@class='previous']";
    private static final String Buttonbar1 = ".//*[@class='news-pagination']//*[text()='1']";
    private static final String Buttonbar2 = ".//*[@class='news-pagination']//*[text()='2']";
    private static final String Buttonbar3 = ".//*[@class='news-pagination']//*[text()='3']";
    private static final String Buttonbar4 = ".//*[@class='news-pagination']//*[text()='4']";
    private static final String Buttonbar5 = ".//*[@class='news-pagination']//*[text()='5']";
    private static final String Buttonbar6 = ".//*[@class='news-pagination']//*[text()='6']";
    private static final String Buttonbar7 = ".//*[@class='news-pagination']//*[text()='7']";
    private static final String Buttonbar8 = ".//*[@class='news-pagination']//*[text()='8']";
    private static final String Buttonbar9 = ".//*[@class='news-pagination']//*[text()='9']";
    private static final String Buttonbar10 = ".//*[@class='news-pagination']//*[text()='10']";
    private static final String Buttonbar11 = ".//*[@class='news-pagination']//*[text()='11']";
    private static final String Buttonbar12 = ".//*[@class='news-pagination']//*[text()='12']";
    private static final String Buttonbar13 = ".//*[@class='news-pagination']//*[text()='13']";
    private static final String Buttonbar14 = ".//*[@class='news-pagination']//*[text()='14']";
    private static final String Buttonbar15 = ".//*[@class='news-pagination']//*[text()='15']";
    private static final String Buttonbar16 = ".//*[@class='news-pagination']//*[text()='16']";
    private static final String Buttonbar17 = ".//*[@class='news-pagination']//*[text()='17']";
    private static final String Buttonbar18 = ".//*[@class='news-pagination']//*[text()='18']";
    private static final String ButtonNext = ".//*[@class='next']";


    @Test
    public void TestSharesHeader() {
        openBlogHeader();
        String Sharestext = driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[1]/div/p")).getText();
        softAssert.assertEquals(Sharestext, "Блог");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL);
        softAssert.assertEquals(isElementXpathPresent(Blogli1), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestButtonsbar() throws InterruptedException {
        openBlogHeader();
        clickPageTwo();
        softAssert.assertEquals(isElementXpathPresent(Buttonprevious), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(Buttonbar1), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(Buttonbar2), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(Buttonbar3), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(Buttonbar4), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(Buttonbar5), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(Buttonbar6), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(Buttonbar7), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(Buttonbar8), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(Buttonbar9), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(Buttonbar10), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(Buttonbar11), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(Buttonbar12), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(Buttonbar13), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(Buttonbar14), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(Buttonbar15), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(Buttonbar16), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(Buttonbar17), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(Buttonbar18), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(ButtonNext), true, "Элемент найден");
        softAssert.assertAll();
    }


    @Test
    public void TestAboutShare1() throws InterruptedException {
        openBlogHeader();
        clickAboutBlog1();
        softAssert.assertEquals(Gettext(Text), "Коммунальные услуги – «головная боль» большинства украинцев. Каждый год тарифы растут, при этом ни качество услуг, ни какой-либо помощи на их оплату государство не предоставляет. Остается только выкручиваться своими силами. Но что делать, если денег нет, а платить надо уже в этом месяце?");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "otklyuchili-gaz-i-vodu-za-neuplatu-chto-delat/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare2() throws InterruptedException {
        openBlogHeader();
        clickAboutBlog2();
        softAssert.assertEquals(Gettext(Text), "Прожиточный минимум определяется правительством и на практике часто отличается от реального бюджета украинца, который бы он потратил в месяц. Но, тем не менее, он формируется и в некоторых случаях позволяет оценить, насколько в Украине большие зарплаты, пенсии и т.п. Рассмотрим детальнее.");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "kakoj-minimalnyj-prozhitochnyj-minimum-v-ukraine/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare3() throws InterruptedException {
        openBlogHeader();
        clickAboutBlog3();
        softAssert.assertEquals(Gettext(Text), "Украина постепенно выходит из экономического кризиса и уже в 2017 году можно наблюдать увеличение минимальной зарплаты в 2 раза. Конечно, в результате сумма получается небольшой (3200 грн), но с учетом анализа ее роста с 2000 года, есть надежда, что рост будет стабильным и стремительным.");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "kakaya-minimalnaya-zarplata-v-ukraine/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare4() throws InterruptedException {
        openBlogHeader();
        clickAboutBlog4();
        softAssert.assertEquals(Gettext(Text), "Пенсии в Украине особенно никогда не были большими, и пенсионерам приходилось очень сильно экономить, чтобы хоть как-то вложиться в бюджет на месяц. Какие изменения произошли в 2017, и что стоит ожидать дальше?");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "povyshenie-pensii-v-ukraine-v-2017-godu/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare5() throws InterruptedException {
        openBlogHeader();
        clickAboutBlog5();
        softAssert.assertEquals(Gettext(Text), "Если заработную плату в Украине повысили с января 2017 года до 3200 грн, то до повышения пенсий «дошли» только в октябре 2017 и повысили ее всего лишь до 1400 грн. Как выжить пенсионерам на эти деньги и что делать, если они закончились?");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "razmer-minimalnoj-pensii-v-ukraine-v-2017/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare6() throws InterruptedException {
        openBlogHeader();
        clickAboutBlog6();
        softAssert.assertEquals(Gettext(Text2), "Прежде чем обращаться в банк, каждый думает, а сможет ли он получить кредит? Никто не хочет оказаться в неловкой ситуации, когда получает отказ, из-за того, что мало зарабатывает или имеет плохую кредитную историю. Вот именно поэтому нужно знать, как пройти банковскую проверку.");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "kak-projti-bankovskie-proverki/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestButtonTwo() throws InterruptedException {
        openBlogHeader();
        clickPageTwo();
        softAssert.assertEquals("rgba(0, 86, 184, 1)", driver.findElement(By.xpath(".//*[@class='news-pagination']//*[text()='2']")).getCssValue("background-color"));
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "?news_start=6");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare7() throws InterruptedException {
        openBlogHeader();
        clickPageTwo();
        clickAboutBlog1();
        softAssert.assertEquals(Gettext(Text), "Очень сложно обращаться в банк, если знаешь, что раньше у вас были проблемы с выплатами: допускались просрочки или даже дело доходило до суда. Но что делать, если снова нужны деньги, а надежды, что банк удовлетворит заявку, нет? Есть ли хоть какие-то шансы или альтернативы?");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "kak-vzyat-kredit-s-otricatelnoj-kreditnoj-istoriej/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare8() throws InterruptedException {
        openBlogHeader();
        clickPageTwo();
        clickAboutBlog2();
        softAssert.assertEquals(Gettext(Text), "За последние 3 года в Украине закрылось более 100 банков, при этом кредитный портфель работающих банков значительно уменьшился. В ситуациях, когда вам срочно нужны средства, вы обращаетесь в банк, однако не всегда вы получаете одобрение в получении кредита. Именно поэтому важно знать возможные причины отказа, чтобы подготовиться заранее и не тратить время зря.");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "prichiny-otkaza-v-vydache-kredita/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare9() throws InterruptedException {
        openBlogHeader();
        clickPageTwo();
        clickAboutBlog3();
        softAssert.assertEquals(Gettext(Text), "В кризисное время сложно выплачивать кредиты. Повысились цены на коммунальные услуги, минимальная зарплата хоть и выросла до 3200 грн, но реальные затраты на семью из 2-х человек могут достигать до 4000-5000 грн в месяц. Как быть с банками и находить возможность выплачивать кредит?");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "chto-takoe-refinansirovanie-kredita-perekreditovanie/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare10() throws InterruptedException {
        openBlogHeader();
        clickPageTwo();
        clickAboutBlog4();
        softAssert.assertEquals(Gettext(Text), "Многие пытаются экономить на коммунальных услугах по-разному, и самым распространенным способом является установка двухфакторного счетчика, который настроен под время активного и неактивного использования приборов, Действительно ли эффективна такая схема и сколько позволяет сэкономить?");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "dvuhtarifnyj-schetchik-elektroenergii-realnaya-vozmozhnost-platit-menshe/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare11() throws InterruptedException {
        openBlogHeader();
        clickPageTwo();
        clickAboutBlog5();
        softAssert.assertEquals(Gettext(Text), "В Киеве для семьи из 2-х человек средняя сумма квитанции за счет – 300 грн. И это с учетом того, что электричеством пользуются только в нерабочее время. Есть ли варианты сэкономить и если да, какая разница будет в сумме?");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "pribory-dlya-ekonomii-elektroenergii/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare12() throws InterruptedException {
        openBlogHeader();
        clickPageTwo();
        clickAboutBlog6();
        softAssert.assertEquals(Gettext(Text), "Текущие тарифы за свет просто пугают. Мало у кого, кто получает минимальную зарплату, хватит умения распределить семейный бюджет на месяц так, чтобы хотя бы «выйти в ноль». Вопрос экономии – актуальный. Рассмотрим его подробнее.");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "kak-ekonomit-elektroenergiyu-sposoby-ekonomii-elektroenergii-v-bytu/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestButtonThree() throws InterruptedException {
        openBlogHeader();
        clickPageThree();
        softAssert.assertEquals("rgba(0, 86, 184, 1)", driver.findElement(By.xpath(".//*[@class='news-pagination']//*[text()='3']")).getCssValue("background-color"));
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "?news_start=12");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare13() throws InterruptedException {
        openBlogHeader();
        clickPageThree();
        clickAboutBlog1();
        softAssert.assertEquals(Gettext(Text), "В 2017 у 30% украинцев есть долги по коммуналке. Почему так? Потому что счета за коммунальные услуги могут действительно превышать доходы. Особенно это актуально для тех, кто живет на пенсию или минимальную зарплату. Что делать в такой ситуации и где можно найти деньги?");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "kak-oplatit-zadolzhennost-po-kommunalnym-platezham/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare14() throws InterruptedException {
        openBlogHeader();
        clickPageThree();
        clickAboutBlog2();
        softAssert.assertEquals(Gettext(Text), "За последние несколько лет цены на коммунальные услуги увеличились, коснулось это и электрической энергии. Счета за свет приходят немаленькие и платить их могут не многие. Но какие есть варианты, чтобы быстро найти деньги и что делать, если уже появился долг?");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "kak-oplatit-dolg-za-elektroenergiyu/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare15() throws InterruptedException {
        openBlogHeader();
        clickPageThree();
        clickAboutBlog3();
        softAssert.assertEquals(Gettext(Text), "Свет все еще остается одной из самых дорогих составляющих счетов за коммунальные услуги. Какие приборы «берут» больше всего электроэнергии и есть ли способы, чтобы сэкономить? Весьма актуальный вопрос, который интересует большинство украинцев.");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "tarify-na-elektroenergiyu-dlya-naseleniya-v-ukraine-stoimost-1-kvt-v-2017-godu/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare16() throws InterruptedException {
        openBlogHeader();
        clickPageThree();
        clickAboutBlog4();
        softAssert.assertEquals(Gettext(Text), "В Украине образование стоит недешево, а стоимость обучения ведущих ВУЗов вполне соизмерима с европейскими ценами (Польшей, Германией и т.п.). Чтобы выучить ребенка, часто берут деньги в долг у банка. Но в 2017 украинцу со средним уровнем дохода сложно «укладываться» в бюджет на месяц. Как можно вернуть долг и при этом не экономить на чем-то другом?");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "kak-pogasit-obrazovatelnyj-kredit/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare17() throws InterruptedException {
        openBlogHeader();
        clickPageThree();
        clickAboutBlog5();
        softAssert.assertEquals(Gettext(Text), "Вода – обязательная составляющая квитанций за коммунальные услуги. Стоимость горячей и холодный воды ежегодно увеличивается и приходится задуматься, можно ли сэкономить и что делать, если появился долг?");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "stoimost-1-kuba-goryachej-i-holodnoj-vody-v-ukraine-v-2017-godu/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare18() throws InterruptedException {
        openBlogHeader();
        clickPageThree();
        clickAboutBlog6();
        softAssert.assertEquals(Gettext(Text), "В случае, когда по займу допущена просрочка и начинает звонить банк с требованием вернуть долг, важно знать, какие последствия могут наступить, а какие – нет. Часто коллекторы могут «шантажировать» незаконными и не совсем реальными последствиями, поэтому вопрос актуален.");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "nakazanie-za-neuplatu-kredita-kakovy-posledstviya-i-chto-vam-grozit/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }


    @Test
    public void TestButtonFour() throws InterruptedException {
        openBlogHeader();
        clickPageFour();
        softAssert.assertEquals("rgba(0, 86, 184, 1)", driver.findElement(By.xpath(".//*[@class='news-pagination']//*[text()='4']")).getCssValue("background-color"));
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "?news_start=18");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare19() throws InterruptedException {
        openBlogHeader();
        clickPageFour();
        clickAboutBlog1();
        softAssert.assertEquals(Gettext(Text), "Довольно часто кто-то мог становиться «жертвой» банковского террора, когда сотрудники по несколько раз день звонят на личный номер, друзьям или родственникам и даже шлют письма с требованием вернуть деньги вместо кого-то. Возможна ли ситуация, когда вы не обращались в банк, но он напоминает о себе и насколько законными можно считать такие действия?");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "chto-delat-esli-bank-trebuet-pogasit-kredit-kotoryj-ya-ne-bral/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare20() throws InterruptedException {
        openBlogHeader();
        clickPageFour();
        clickAboutBlog2();
        softAssert.assertEquals(Gettext(Text), "Вопросы выплата долга интересует каждого, у кого есть займ. В кризисное время невозможно спланировать бюджет на месяц, а потому легко пропустить оплату. Какой наиболее легкий и выгодный выход найти из ситуации, чтобы закрыть задолженность?");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "kak-pogasit-prosrochennyj-kredit/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare21() throws InterruptedException {
        openBlogHeader();
        clickPageFour();
        clickAboutBlog3();
        softAssert.assertEquals(Gettext(Text), "Отопительный сезон для большинства украинцев кажется «тихим ужасом», когда счета в квитанциях превышают в несколько раз сумму зарплаты. Но платить за коммуналку нужно и допускать просрочки недопустимо. Что делать, если не успел отложить деньги и понимаешь, что сам не заплатишь?");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "stoimost-gaza-dlya-naseleniya-v-ukraine/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare22() throws InterruptedException {
        openBlogHeader();
        clickPageFour();
        clickAboutBlog4();
        softAssert.assertEquals(Gettext(Text), "Когда коллекторская фирма начинает звонить по несколько раз в день, когда они успели дозвониться родственникам и даже начальнику, полезно знать, куда можно обратиться, чтобы эти звонки перестали поступать. Как вести себя в таких ситуациях?");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "kuda-obrashhatsya-esli-donimayut-kollektory/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare23() throws InterruptedException {
        openBlogHeader();
        clickPageFour();
        clickAboutBlog5();
        softAssert.assertEquals(Gettext(Text), "Если по кредиту в 1000-3000 гривен возник долг и после пары месяцев неоплат начинают звонить коллекторы, удивляешься, почему из-за такой небольшой просрочки поступают звонки по 10-30 раз в день? Неужели сотрудникам коллекторских фирм «больше нечем заняться», чем как донимать клиента из-за каких-то 1000 гривен?");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "pochemu-mikrozajmy-ne-podayut-v-sud-na-dolzhnikov-a-peredayut-kollektoram/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare24() throws InterruptedException {
        openBlogHeader();
        clickPageFour();
        clickAboutBlog6();
        softAssert.assertEquals(Gettext(Text), "Когда начинают звонить представители коллекторской компании, начинаешь теряться и думать, как ответить на самые простые вопросы? Коллекторы – профессионалы своего дела и гуру манипуляций, поэтому даже к самому простому разговору следует быть готовым. А звонков не избежать.");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "kak-pravilno-obshhatsya-s-kollektorami/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestButtonFive() throws InterruptedException {
        openBlogHeader();
        clickPageFive();
        softAssert.assertEquals("rgba(0, 86, 184, 1)", driver.findElement(By.xpath(".//*[@class='news-pagination']//*[text()='5']")).getCssValue("background-color"));
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "?news_start=24");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare25() throws InterruptedException {
        openBlogHeader();
        clickPageFive();
        clickAboutBlog1();
        softAssert.assertEquals(Gettext(Text), "Когда начинают звонить сотрудники коллекторской фирмы, это может быть первый сигнал о том, что долг продан, и вы больше не являетесь клиентом банка. Но прежде чем разговаривать с представителями фирмы и вносить оплаты, важно разобраться в ситуации.");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "kakie-banki-prodayut-dolgi-kollektoram/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare26() throws InterruptedException {
        openBlogHeader();
        clickPageFive();
        clickAboutBlog2();
        softAssert.assertEquals(Gettext(Text), "Когда начинают звонить сотрудники коллекторской компании, начинаешь думать о том, насколько законны их действия и стоит ли им платить? Имеет ли банк право «подключить» к работе 3-х лиц, если процесс взыскания станет эффективнее?");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "kak-ne-platit-kredit-kollektoram-v-ukraine/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare27() throws InterruptedException {
        openBlogHeader();
        clickPageFive();
        clickAboutBlog3();
        softAssert.assertEquals(Gettext(Text), "Если у вас есть большая задолженность по кредиту или пропущен только один платеж, важно знать о том, в каких случаях и когда начнутся телефонные звонки с требованием вернуть долг. И что еще может сделать кредитор?");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "kak-prohodit-vzyskanie-dolgov-po-kreditu/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare28() throws InterruptedException {
        openBlogHeader();
        clickPageFive();
        clickAboutBlog4();
        softAssert.assertEquals(Gettext(Text), "Все, кто хотя бы раз допускал просрочку, знают, каким надоедливым в этот момент может стать банк. Но все ли методы по взысканию долгов можно считать законными, и если нет, как с ними бороться?");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "kto-takie-kollektory/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare29() throws InterruptedException {
        openBlogHeader();
        clickPageFive();
        clickAboutBlog5();
        softAssert.assertEquals(Gettext(Text), "Прежде чем обращаться в банк, важно знать, на что обращать внимание. Банковский займ может оказаться дорогим не только из-за большой процентной ставки, но из-за других нюансов, речь о которых пойдет в этой статье.");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "kak-rasschityvaetsya-procentnaya-stavka-po-kreditu/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare30() throws InterruptedException {
        openBlogHeader();
        clickPageFive();
        clickAboutBlog6();
        softAssert.assertEquals(Gettext(Text), "В большинстве случаев клиент при выборе кредита, обращает внимание на проценты, однако такое понятие как «эффективная ставка» позволяет реально оценить стоимость продукта и определить переплату.");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "chto-takoe-effektivnaya-stavka-po-kreditu/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestButtonSix() throws InterruptedException {
        openBlogHeader();
        clickPageSix();
        softAssert.assertEquals("rgba(0, 86, 184, 1)", driver.findElement(By.xpath(".//*[@class='news-pagination']//*[text()='6']")).getCssValue("background-color"));
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "?news_start=30");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare31() throws InterruptedException {
        openBlogHeader();
        clickPageSix();
        clickAboutBlog1();
        softAssert.assertEquals(Gettext(Text), "Решающим аспектом при выборе займа всегда остается его стоимость, ведь чем меньше процентов, предполагается, что будет дешевле и цена. В Украине вместе с банковским, активно развивается микрокредитование, поэтому важно знать, куда же все-таки выгоднее обращаться?");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "v-kakom-banke-samaya-nizkaya-procentnaya-stavka-po-kreditu/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare32() throws InterruptedException {
        openBlogHeader();
        clickPageSix();
        clickAboutBlog2();
        softAssert.assertEquals(Gettext(Text), "Что делать в ситуации, когда не по вашей вине по кредиту появился долг, а банк и слушать не хочет все доводы и не желает идти на уступки? Есть ли смысл уговаривать сотрудников еще немного подождать или нужно искать альтернативные варианты?");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "kak-izbavitsya-ot-dolgov-po-kreditam/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare33() throws InterruptedException {
        openBlogHeader();
        clickPageSix();
        clickAboutBlog3();
        softAssert.assertEquals(Gettext(Text), "«Банк отберет дом!» - эту фразу слышат многие, кто рассказал родственникам о своем займе. Но является ли это главной целью банка и так ли просто лишить кого-то имущества и выселить? Нужно разобраться.");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "vyselenie-iz-kvartiry-za-dolgi-po-kreditu-vozmozhno-li-eto/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare34() throws InterruptedException {
        openBlogHeader();
        clickPageSix();
        clickAboutBlog4();
        softAssert.assertEquals(Gettext(Text), "Интернет-кредитование уже давно вытесняет стандартное банковское и привлекает все больше украинцев. Но некоторые все же опасаются брать средства в взаймы, когда не видишь своими глазами ни сотрудников, ни документов. Давайте разберемся, безопасно ли это и как есть альтернативы?");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "gde-zanyat-deneg-v-internete/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare35() throws InterruptedException {
        openBlogHeader();
        clickPageSix();
        clickAboutBlog5();
        softAssert.assertEquals(Gettext(Text), "Когда ломается техника, сразу начинаешь думать, где взять деньги и что будет дешевле – починить старую или купить новую? Давайте разберемся и попробуем сэкономить средства.");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "ceny-na-remont-holodilnikov-v-kieve/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare36() throws InterruptedException {
        openBlogHeader();
        clickPageSix();
        clickAboutBlog6();
        softAssert.assertEquals(Gettext(Text), "Что происходит, когда ломается техника? Паника и страх, а сколько будет стоить ремонт или того хуже, новая покупка. Но делать нечего и нужно готовиться к предстоящим растратам. Главное, знать, куда обратиться и где искать деньги.");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "cena-remonta-stiralnoj-mashiny-v-kieve/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestButtonSeven() throws InterruptedException {
        openBlogHeader();
        clickPageSeven();
        softAssert.assertEquals("rgba(0, 86, 184, 1)", driver.findElement(By.xpath(".//*[@class='news-pagination']//*[text()='7']")).getCssValue("background-color"));
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "?news_start=36");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare37() throws InterruptedException {
        openBlogHeader();
        clickPageSeven();
        clickAboutBlog1();
        softAssert.assertEquals(Gettext(Text), "Украинцы ежедневно обращаются в банки, поэтому кредитование не теряет своей актуальности. Однако многие банки после кризиса еще не кредитуют, а те, кто соглашаются выдать деньги, предоставляют займ на разных условиях. Где выгоднее заключить сделку в 2017 и можно ли обратиться куда-либо еще, кроме банка?");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "gde-samyj-nizkij-procent-na-potrebitelskij-kredit/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare38() throws InterruptedException {
        openBlogHeader();
        clickPageSeven();
        clickAboutBlog2();
        softAssert.assertEquals(Gettext(Text), "Кредитование не теряет актуальности для украинцев. Все чаще приобретаются товары в рассрочку, оформляются кредитные карты. Но сейчас работают более 90 банковских организаций, поэтому важно понимать, куда обращаться выгодно и существуют ли другие альтернативные варианты?");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "gde-samye-nizkie-procenty-po-kreditam/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare39() throws InterruptedException {
        openBlogHeader();
        clickPageSeven();
        clickAboutBlog3();
        softAssert.assertEquals(Gettext(Text), "Еще 4-5 лет назад банковская система Украины стабильно развивалась, но в связи с экономическим кризисом начала резко приходит в упадок. Это сказывается и на условиях обслуживания, и на привлекательности сделок для клиентов. Но можно ли еще сегодня выгодно заключить сделку в банке или стоит начинать рассматривать альтернативные варианты?");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "rejting-bankov-i-kreditnyh-organizacij-ukrainy-po-kreditam/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare40() throws InterruptedException {
        openBlogHeader();
        clickPageSeven();
        clickAboutBlog4();
        softAssert.assertEquals(Gettext(Text), "Те, у кого была просрочка по кредитам, знают, как тяжело выходить из ситуации и пытаться найти общий язык с банком. Но и уступки, например, реструктуризация не всегда может быть «спасением», так как в основном ведет к переплате. Важно понимать, стоит ли принимать новые условия или лучше стараться погасить долг своими силами.");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "chto-takoe-restrukturizaciya-dolga-po-kreditu/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare41() throws InterruptedException {
        openBlogHeader();
        clickPageSeven();
        clickAboutBlog5();
        softAssert.assertEquals(Gettext(Text), "«На кого идти учиться?» - важный вопрос для каждого выпускника. И если специальности юристов, программистов, архитекторов и дизайнеров вытесняют друг друга с рынка, медицинская специальность остается всегда в престиже. Сколько стоит выучиться на доктора в Украине в 2017?");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "stoimost-obucheniya-v-medicinskih-vuzah-i-kolledzhah-ukrainy/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare42() throws InterruptedException {
        openBlogHeader();
        clickPageSeven();
        clickAboutBlog6();
        softAssert.assertEquals(Gettext(Text), "«Ты взял кредит? Хочешь без дома остаться?» - именно такие вопросы слышат те, кто рассказали родственникам, что оформили кредит. Действительно ли банковский договор приводит к тому, что забирают дом, машину и все имущество или это - вымысел?");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "mogut-li-bank-otobrat-kvartiru-za-neuplatu-kredita/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestButtonEight() throws InterruptedException {
        openBlogHeader();
        clickPageEight();
        softAssert.assertEquals("rgba(0, 86, 184, 1)", driver.findElement(By.xpath(".//*[@class='news-pagination']//*[text()='8']")).getCssValue("background-color"));
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "?news_start=42");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare43() throws InterruptedException {
        openBlogHeader();
        clickPageEight();
        clickAboutBlog1();
        softAssert.assertEquals(Gettext(Text), "Казалось бы, взять деньги взаймы у знакомы – куда проще, чем в банке. Не переживаешь, что будут звонить родственникам, запугивать вернуть долг, да и договориться с человеком, чем с банком легче. Но не все так просто. Следует знать, почему стоит быть внимательным.");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "kredit-pod-raspisku/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare44() throws InterruptedException {
        openBlogHeader();
        clickPageEight();
        clickAboutBlog2();
        softAssert.assertEquals(Gettext(Text), "Банк всегда обращает внимание на кредитную историю, когда принимает решение по заявке, поэтому взять деньги с испорченной финансовой репутацией будет сложно. Какие в таком случае можно рассматривать варианты, и будут ли они экономными?");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "kak-vzyat-kredit-esli-ty-v-chernom-spiske/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare45() throws InterruptedException {
        openBlogHeader();
        clickPageEight();
        clickAboutBlog3();
        softAssert.assertEquals(Gettext(Text), "Многих интересует, что может сделать банк с должником? Какие действия будут законными, а на какие следует подать жалобу? Даже если возникла просрочка, нужно знать, как следует себя вести и на что вы имеете юридическое право.");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "dejstviya-banka-pri-nevyplate-kredita/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare46() throws InterruptedException {
        openBlogHeader();
        clickPageEight();
        clickAboutBlog4();
        softAssert.assertEquals(Gettext(Text), "Долг ради долга? Довольно абсурдно, но допустимо, если подойти к делу со знанием. От банковской просрочки не убежать и платить ее придется в любом случае, поэтому знать, что нужно делать и к кому обратиться в такой ситуации – важно.");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "gde-vzyat-kredit-dlya-pogasheniya-kredita-v-drugom-banke/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare47() throws InterruptedException {
        openBlogHeader();
        clickPageEight();
        clickAboutBlog5();
        softAssert.assertEquals(Gettext(Text), "Благонадежность – первое, на что обращает внимание банк. Что это такое и что делать, если она испорчена? Какие альтернативные варианты существуют?");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "kak-uznat-est-li-ya-v-chernom-spiske-dolzhnikov-po-kreditam/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare48() throws InterruptedException {
        openBlogHeader();
        clickPageEight();
        clickAboutBlog6();
        softAssert.assertEquals(Gettext(Text), "Вероятно, каждый сталкивался с проблемой, когда обращаешься в финансовую организацию за займом и переживаешь, что получишь отказ. Какая вероятность того, что кредитор не согласится выдать деньги в долг?");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "usloviya-kreditovaniya-v-bankah-ukrainy-i-veroyatnost-odobreniya-kredita/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestButtonNine() throws InterruptedException {
        openBlogHeader();
        clickPageNine();
        softAssert.assertEquals("rgba(0, 86, 184, 1)", driver.findElement(By.xpath(".//*[@class='news-pagination']//*[text()='9']")).getCssValue("background-color"));
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL +"?news_start=48");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare49() throws InterruptedException {
        openBlogHeader();
        clickPageNine();
        clickAboutBlog1();
        softAssert.assertEquals(Gettext(Text), "Иногда кажется, что одолжить средства проще у родственников или друзей. Но действительно ли это так, и какие последствия могут быть, если заключить сделку с незнакомым человеком?");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "stoit-li-brat-kredit-ot-chastnogo-lica-preimushhestva-i-riski-chastnyh-zajmov/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare50() throws InterruptedException {
        openBlogHeader();
        clickPageNine();
        clickAboutBlog2();
        softAssert.assertEquals(Gettext(Text), "Учеба является необходимостью для карьерного роста и получения высокой зарплаты. Однако, диплом – не выступает гарантией профессионального успеха. Тем не менее, цены на образование растут. Чего стоит ожидать родителям и студентам в 2017 году?");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "stoimost-obucheniya-v-vuzah-kieva-i-harkova/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare51() throws InterruptedException {
        openBlogHeader();
        clickPageNine();
        clickAboutBlog3();
        softAssert.assertEquals(Gettext(Text), "Многие сталкиваются с проблемой отказа по кредиту в банке. Но так ли все категорично с системой или можно все же несколько раз пропустить оплату и не переживать о своей кредитной истории?");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "skolko-nuzhno-ne-platit-kredit-chtoby-popast-v-chernyj-spisok/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare52() throws InterruptedException {
        openBlogHeader();
        clickPageNine();
        clickAboutBlog4();
        softAssert.assertEquals(Gettext(Text), "Когда нужны деньги, легко соглашаешься на все условия, на которых их тебе выдают. Но на самом деле найти средства действительно на выгодных условиях можно найти в Украине. Где? Давайте разберемся.");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "gde-mozhno-vzyat-kredit-na-5000-grn/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare53() throws InterruptedException {
        openBlogHeader();
        clickPageNine();
        clickAboutBlog5();
        softAssert.assertEquals(Gettext(Text), "Много банков – много условий. В условиях конкуренции каждый хочет привлечь новых клиентов, и займ под 0% - именно то, что может помочь. Однако существуют ли подводные камни и действительно ли это возможно?");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "besprocentnyj-kredit-mif-ili-realnost/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare54() throws InterruptedException {
        openBlogHeader();
        clickPageNine();
        clickAboutBlog6();
        softAssert.assertEquals(Gettext(Text), "Неработающих в Украине очень много. И если одни действительно не могут работать официально по состоянию здоровья, другие получают зарплату в конверте и уже теряют лояльное отношение кредиторов.");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "v-kakom-banke-vzyat-kredit-bez-spravki-o-dohodah/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestButtonTen() throws InterruptedException {
        openBlogHeader();
        clickPageTen();
        softAssert.assertEquals("rgba(0, 86, 184, 1)", driver.findElement(By.xpath(".//*[@class='news-pagination']//*[text()='10']")).getCssValue("background-color"));
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "?news_start=54");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare55() throws InterruptedException {
        openBlogHeader();
        clickPageTen();
        clickAboutBlog1();
        softAssert.assertEquals(Gettext(Text), "Проблемная кредитная история интересует многих, особенно тогда, когда предстоит путешествие и нужно будет пересекать рубеж.");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "vypustyat-li-zagranicu-s-kreditom/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare56() throws InterruptedException {
        openBlogHeader();
        clickPageTen();
        clickAboutBlog2();
        softAssert.assertEquals(Gettext(Text), "Семестр университета в Украине стоит недешево и даже если речь идет о бюджетной форме, расходов не избежать: канцелярия, учебники, аренда жилья, оплата курсов и даже проезд домой. Где взять деньги и что делать, если они нужны уже сегодня?");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "gde-vzyat-kredit-studentam-na-obuchenie/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare57() throws InterruptedException {
        openBlogHeader();
        clickPageTen();
        clickAboutBlog3();
        softAssert.assertEquals(Gettext(Text), "Почему-то многие следуют брендам, но кто сказал, что качественная вещь может стоить дешево? Если вы приняли решение о покупке дорогой техники, где взять деньги на выгодных условиях?");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "gde-kupit-ajfon-v-kredit-vygodnee/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare58() throws InterruptedException {
        openBlogHeader();
        clickPageTen();
        clickAboutBlog4();
        softAssert.assertEquals(Gettext(Text), "Лето - пора каникул и окончание сессии. Теперь можно отдохнуть, поэтому остается узнать, где это можно это сделать, сколько будет стоить путешествие и где лучше взять деньги, если отложенных будет недостаточно?");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "gde-mozhno-otdohnut-studentam-byudzhetnyj-otdyh-2017/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare59() throws InterruptedException {
        openBlogHeader();
        clickPageTen();
        clickAboutBlog5();
        softAssert.assertEquals(Gettext(Text), "Ученикам очень часто нужны деньги: на учебу, университет, оплату курсов, покупку литературы и канцелярии. Родители могут помочь не всем, а если и могут, суммы может просто не хватить и ситуацию нужно решать самостоятельно.");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "kakie-banki-vydayut-kredit-studentam/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare60() throws InterruptedException {
        openBlogHeader();
        clickPageTen();
        clickAboutBlog6();
        softAssert.assertEquals(Gettext(Text), "Если работающему человеку может быть сложно, что говорить о безработном или о том, кто не имеет крыши над головой или ввиду некоторых обстоятельств просто без прописки. В финансовом займе может нуждаться каждый и что делать тем, к кому банки относятся не лояльно.");
        softAssert.assertEquals(driver.getCurrentUrl(),BaseURL + "gde-vzyat-kredit-bez-propiski-v-pasporte/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestButtonEleven() throws InterruptedException {
        openBlogHeader();
        clickPageEleven();
        softAssert.assertEquals("rgba(0, 86, 184, 1)", driver.findElement(By.xpath(".//*[@class='news-pagination']//*[text()='11']")).getCssValue("background-color"));
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "?news_start=60");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare61() throws InterruptedException {
        openBlogHeader();
        clickPageEleven();
        clickAboutBlog1();
        softAssert.assertEquals(Gettext(Text), "За время экономического кризиса у многих граждан возникают проблемы с банками и когда видишь рекламу «Поможем получить займ», задумываешься, правда это или нет. Можно ли за деньги избавиться от юридических проблем и одолжить средства через посредников на самом деле?");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "pomoshh-v-poluchenie-kredita-realnyj-vyhod-ili-zapadnya/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare62() throws InterruptedException {
        openBlogHeader();
        clickPageEleven();
        clickAboutBlog2();
        softAssert.assertEquals(Gettext(Text), "В Украине стоимость проживания в каждом областном центре – разная. И хотя многие получают стипендию и даже помощь от родителей, ситуации, когда срочно нужны деньги, случаются часто. Какие затраты несут ученики ВУЗов и к кому можно обратиться за помощью в случае необходимости?");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "skolko-stoit-zhizn-studenta-v-kieve/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare63() throws InterruptedException {
        openBlogHeader();
        clickPageEleven();
        clickAboutBlog3();
        softAssert.assertEquals(Gettext(Text), "Учащиеся ПТУ и ВУЗов – одна из самых незащищенных категорий граждан в Украине: ежегодно меняются условия поступления в ВУЗы, сложно найти жилье или устроиться в общежитие и совмещать работу с учебой. Как выплаты предусмотрены государством и где можно найти деньги, если случилась проблема?");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "skolko-stipendiya-u-studentov-v-2017-godu/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare64() throws InterruptedException {
        openBlogHeader();
        clickPageEleven();
        clickAboutBlog4();
        softAssert.assertEquals(Gettext(Text), "На кредитном рынке столько услуг, что обычный человек может легко запутаться. Залоговые, безцелевые, ипотечные, со страховкой и без, лизинговые кредиты – что это и есть ли смысл вникать? Или не стоит «выдумывать велосипед» и если нужны деньги, получить их по обычной схеме – потребительский кредит?");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "chem-otlichaetsya-lizing-ot-kredita/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare65() throws InterruptedException {
        openBlogHeader();
        clickPageEleven();
        clickAboutBlog5();
        softAssert.assertEquals(Gettext(Text), "Наверняка каждый сталкивался с ситуацией, когда долг сложно погасить, однако срок подходит к концу и вернуть его нужно. Что делать в такой ситуации?");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "chto-takoe-problemnyj-kredit/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare66() throws InterruptedException {
        openBlogHeader();
        clickPageEleven();
        clickAboutBlog6();
        softAssert.assertEquals(Gettext(Text), "Несмотря на то, что минимальная заработная плата украинцев увеличилась с января 2017 года в два раза, на практике это произошло не везде: минимальная пенсия так и составляет чуть более 1000 гривен, а некоторые работодатели продолжают платить «зарплату в конверте», которая меньше законных 3200 гривен. С учетом того, что увеличилась сумма «продуктовой корзины», коммунальных тарифов, цен на одежду и развлечения, важно знать, где можно взять деньги, можно минимизировать, вовсе избежать, за жилье нужно платить всегда.");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "kak-ne-platit-kommunalnye-uslugi/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestButtonTwelwe() throws InterruptedException {
        openBlogHeader();
        clickPageTwelwe();
        softAssert.assertEquals("rgba(0, 86, 184, 1)", driver.findElement(By.xpath(".//*[@class='news-pagination']//*[text()='12']")).getCssValue("background-color"));
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "?news_start=66");
        softAssert.assertAll();
    }


    @Test
    public void TestAboutShare67() throws InterruptedException {
        openBlogHeader();
        clickPageTwelwe();
        clickAboutBlog1();
        softAssert.assertEquals(Gettext(Text), "Здравоохранение – важная социальная составляющая любого государства. В Украине по Закону медицинская помощь предоставляется бесплатно, но законодательство систематически изменяется и уже в 2017 г. вводится плата на некоторые услуги. Чего ожидать от МОЗ и где брать деньги на лечение?");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "kakie-medicinskie-uslugi-predostavlyayutsya-besplatno-a-kakie-platno-v-ukraine/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare68() throws InterruptedException {
        openBlogHeader();
        clickPageTwelwe();
        clickAboutBlog2();
        softAssert.assertEquals(Gettext(Text), "Каждый год возникает вопрос «Куда поехать летом?». И если с выбором уже кто-то определился, остается решить финансовый вопрос. Особенно это важно в тех ситуациях, когда отложить средства не успели, а выезжать нужно через неделю.");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "dostupnyj-otdyh-na-more-2017/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare69() throws InterruptedException {
        openBlogHeader();
        clickPageTwelwe();
        clickAboutBlog3();
        softAssert.assertEquals(Gettext(Text), "Кто не хочет жить уютно и с комфортом? Пожалуй, состояние жилья и качество бытовой жизни беспокоит каждого, поэтому косметический или капитальный, ремонт дома всегда будет выгодной инвестиции.");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "stoimost-remonta-kvartiry-v-ukraine/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare70() throws InterruptedException {
        openBlogHeader();
        clickPageTwelwe();
        clickAboutBlog4();
        softAssert.assertEquals(Gettext(Text), "Компьютер стал предметом первой необходимости в быту. Связь с родственниками, обмен информацией, средство заработка – все это относится к ноутбуку и если он ломается, нужно быстро его отремонтировать. Сколько денег нужно потратить, и есть ли варианты сэкономить?");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "skolko-stoit-remont-noutbuka-kompyutera-pk-v-kieve/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare71() throws InterruptedException {
        openBlogHeader();
        clickPageTwelwe();
        clickAboutBlog5();
        softAssert.assertEquals(Gettext(Text), "Столица всегда привлекала туристов и украинцев: красивая архитектура, большие возможности, высокие зарплаты. Но квартирный вопрос существовал не только во времена Булгакова, он остался и сейчас, ведь 45% киевлян – приезжие, которые снимают жилье. На каких условиях можно снять жилье в Киеве и сколько это стоит? Красивая жизнь обходится дорого и если некоторые думают, что каждый, кто приехал в столицу, может себе позволить все, ошибается. На самом деле порой около 40%-60% зарплаты может уходить на съем жилья, ведь аренда квартир в Киеве дорогая. Конечно, есть много факторов, влияющих на стоимость, а именно:");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "skolko-stoit-arenda-kvartir-v-kieve-v-2017-godu/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare72() throws InterruptedException {
        openBlogHeader();
        clickPageTwelwe();
        clickAboutBlog6();
        softAssert.assertEquals(Gettext(Text), "Автомобиль – не роскошь, а средство передвижения. Многие уже так привыкли к комфорту, что жизни не представляют без машины. Удобство, быстрота – вот качества, за которые ценится транспорт. Но что делать, если ваше транспортное средство находится в ремонте или вы, к примеру, гость столицы? Стоит подумать об аренде.");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "skolko-stoit-arenda-avto-v-kieve/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestButtonThirteen() throws InterruptedException {
        openBlogHeader();
        clickPageThirteen();
        softAssert.assertEquals("rgba(0, 86, 184, 1)", driver.findElement(By.xpath(".//*[@class='news-pagination']//*[text()='13']")).getCssValue("background-color"));
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "?news_start=72");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare73() throws InterruptedException {
        openBlogHeader();
        clickPageThirteen();
        clickAboutBlog1();
        softAssert.assertEquals(Gettext(Text), "Каждый знает, что технический сервис и услуги СТО стоят недешево. В то же время, автомобиль – один из главных помощников, который обеспечивает комфорт жизни, а для некоторых связан с работой. Что делать, если машина сломалась, а денег нет?");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "5/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare74() throws InterruptedException {
        openBlogHeader();
        clickPageThirteen();
        clickAboutBlog2();
        softAssert.assertEquals(Gettext(Text), "Жилье, его качество, комфорт и уют – важный элемент нашей жизни. это не только быт. Правильно обставленный дом способен создавать настроение и заряжать эмоциями на целый день, поэтому следить за его состоянием необходимо. Но что делать, если средств не хватает?");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "gde-vzyat-deneg-na-remont-kvartiry/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare75() throws InterruptedException {
        openBlogHeader();
        clickPageThirteen();
        clickAboutBlog3();
        softAssert.assertEquals(Gettext(Text), "Лечение зубов во всем мире обходится дорого, Украина – не исключение. И если за лечебной профилактикой сердца, давления некоторые забывают следить, то когда болит или выпал зуб, терпеть – невозможно. Нужно действовать быстро, поэтому важно знать, куда можно обратиться за помощью и где найти деньги.");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "gde-vzyat-dengi-na-lechenie-zubov/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare76() throws InterruptedException {
        openBlogHeader();
        clickPageThirteen();
        clickAboutBlog4();
        softAssert.assertEquals(Gettext(Text), "Финансовые ситуации бывают разные: у кого-то не хватает денег на автомобиль, а кто-то банально не может позволить себе купить одежду. Многим сложно сегодня одеть не только себя, но семью и детей. Новая одежда стоит дорого и перед каждой покупкой делаешь выбор: невысокая цена или хорошее качество.");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "gde-vzyat-dengi-na-odezhdu/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare77() throws InterruptedException {
        openBlogHeader();
        clickPageThirteen();
        clickAboutBlog5();
        softAssert.assertEquals(Gettext(Text), "Если вы все еще полагаете, что только банк может предоставить юридические гарантии, когда нужно взять кредит, вы ошибаетесь. Закон один для всех и на рынке услуг не могут существовать организации, которые без юридической регистрации кредитуют граждан. Поэтому если вы знаете другие альтернативные банку варианты, смело можете воспользоваться ими.");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "chto-takoe-nebankovskaya-kreditnaya-organizaciya/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare78() throws InterruptedException {
        openBlogHeader();
        clickPageThirteen();
        clickAboutBlog6();
        softAssert.assertEquals(Gettext(Text), "Почему-то многих продолжают настораживать банковские кредиты. Одни боятся стать «вечными должниками», другие опасаются лишиться имущества. И тот, и другой вариант может случиться, но только при нарушении кредитного договора и игнорировании его изучения еще на стадии подписания. На самом деле опасаться не стоит. Если вам нужен кредит, главное разобраться в том, где его можно выгодно получить.");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "gde-vzyat-dengi-krome-banka/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestButtonFourteen() throws InterruptedException {
        openBlogHeader();
        clickPageFourteen();
        softAssert.assertEquals("rgba(0, 86, 184, 1)", driver.findElement(By.xpath(".//*[@class='news-pagination']//*[text()='14']")).getCssValue("background-color"));
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "?news_start=78");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare79() throws InterruptedException {
        openBlogHeader();
        clickPageFourteen();
        clickAboutBlog1();
        softAssert.assertEquals(Gettext(Text), "Если случается проблема, всегда нужны деньги. Хорошо, если есть накопленные средства или вы знаете, к кому обратиться. Но вот когда остаешься со своей проблемой один на один, тогда важно знать, кто из посторонних может помочь и куда можно обратиться.");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "gde-odolzhit-dengi-pod-procenty/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare80() throws InterruptedException {
        openBlogHeader();
        clickPageFourteen();
        clickAboutBlog2();
        softAssert.assertEquals(Gettext(Text), "Каждая новая зима для украинцев обходится все дороже и дороже. Некоторым даже зарплаты не хватает, чтобы оплатить один месяц за газ и свет, поэтому неудивительно, что у большинства населения появились долги за коммунальные услуги. Как выходить из ситуации и что будет, если не оплачивать квитанции?");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "chto-delat-esli-nechem-platit-za-kommunalku/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare81() throws InterruptedException {
        openBlogHeader();
        clickPageFourteen();
        clickAboutBlog3();
        softAssert.assertEquals(Gettext(Text), "Проблемы со здоровьем могут случиться в любое время и затраты на лечение будут большими. И если отложенных средств нет, придется брать деньги в долг у знакомых или оформлять кредит. Главное знать, как решить проблему быстро и как найти нужную сумму самостоятельно.");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "gde-vzyat-dengi-na-operaciyu/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare82() throws InterruptedException {
        openBlogHeader();
        clickPageFourteen();
        clickAboutBlog4();
        softAssert.assertEquals(Gettext(Text), "Если случаются проблемы, не следует вдаваться в крайности и бежать в банк сломя голову, чтобы заключить любой договор лишь бы получить деньги. Это серьезный шаг. Он должен быть хорошо обдуман. Тем более выбор кредитных продуктов в 2017 году большой и разнообразный.");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "chem-opasen-kredit-pod-zalog-kvartiry/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare83() throws InterruptedException {
        openBlogHeader();
        clickPageFourteen();
        clickAboutBlog5();
        softAssert.assertEquals(Gettext(Text), "Мы научились отдыхать не только летом. Мир дает новые возможности, Украина открывает безвизовые режимы со многие южными странами, цена перелетов становится доступнее, а поэтому в путешествие можно отправиться, когда угодно. Но что делать, если отпуск получен, а денег нет? Рассмотрим возможные варианты.");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "otkuda-vzyat-dengi-na-puteshestviya/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare84() throws InterruptedException {
        openBlogHeader();
        clickPageFourteen();
        clickAboutBlog6();
        softAssert.assertEquals(Gettext(Text), "За последние три года количество кредитующих организаций в Украине сократилось в три раза. Ужесточились условия и получить средства без справки о доходах сложно. Всех интересуют юридические гарантии, которыми можно воспользоваться в любое время и обезопасить себя от неуплаты. Важно знать ключевые моменты.");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "kredit-pod-zalog-nedvizhimosti-chto-nuzhno-znat/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestButtonFifteen() throws InterruptedException {
        openBlogHeader();
        clickPageFifteen();
        softAssert.assertEquals("rgba(0, 86, 184, 1)", driver.findElement(By.xpath(".//*[@class='news-pagination']//*[text()='15']")).getCssValue("background-color"));
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "?news_start=84");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare85() throws InterruptedException {
        openBlogHeader();
        clickPageFifteen();
        clickAboutBlog1();
        softAssert.assertEquals(Gettext(Text), "Кредитование стало популярным среди украинцев, но остается не менее таинственным. Предлагаются разные условия - выгодные и не очень. Какие допустимые последствия сделки и есть ли альтернатива?");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "kakoj-bank-daet-kredit-pod-zalog/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare86() throws InterruptedException {
        openBlogHeader();
        clickPageFifteen();
        clickAboutBlog2();
        softAssert.assertEquals(Gettext(Text), "Вопрос правильного кредитования всегда актуален. Все чаще мы обращаемся за оформлением займа и обычно даже не читаем условия договора, просто веря словам сотрудника. Спустя время оказывается, что следует платить большие комиссии, страховки, а единственное, что знаем точно, так это со сроком.");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "kakoj-bank-daet-kredit-bez-zaloga/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare87() throws InterruptedException {
        openBlogHeader();
        clickPageFifteen();
        clickAboutBlog3();
        softAssert.assertEquals(Gettext(Text), "Трудности не приходят с предупреждением и проблемы со здоровьем возглавляют этот список. Больница, лекарства, операции обходятся дорого, но мы готовые отдать многое, лишь бы помочь, даже заключить договор на невыгодных условиях. Когда кто-то болеет, нужно предпринимать срочные меры. Стационар, медицинская помощь должного уровня стоят достаточно недешево, а экономить с государственными бесплатными программами – не эффективно, поэтому мы и соглашаемся взять деньги в долг у постороннего. Куда обращаться в этой ситуации? Родственники не всегда смогут помочь, а вот взять деньги на лечение под проценты стоит попробовать.");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "gde-vzyat-dengi-na-lechenie/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare88() throws InterruptedException {
        openBlogHeader();
        clickPageFifteen();
        clickAboutBlog4();
        softAssert.assertEquals(Gettext(Text), "Когда возникают финансовые проблемы, каждый хочет решить их быстро. Ситуации бывают разные: свадьба, день рождение, а может просто не хватает денег до зарплаты. Помочь может интернет-кредитование, благодаря которому возможно быстро получить деньги на карту даже не выходя из дома.");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "kakoj-bank-vydaet-kredit-bezrabotnym/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare89() throws InterruptedException {
        openBlogHeader();
        clickPageFifteen();
        clickAboutBlog5();
        softAssert.assertEquals(Gettext(Text), "С начала 2017 года в Украине осталось работать 97 банков, по сравнению с 2013 годом, когда эта цифра составляла 200 единиц. Тем не менее, направление банковской деятельности не изменилось, главная цель осталась – кредитование. Но если банков так много, условий кредитов еще больше, как обычному человеку можно разобраться во всем этом? Зная несколько основных правил, можно без труда понять, какой кредит и где лучше оформить.");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "kakie-byvayut-potrebitelskie-kredity/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare90() throws InterruptedException {
        openBlogHeader();
        clickPageFifteen();
        clickAboutBlog6();
        softAssert.assertEquals(Gettext(Text), "У каждого случаются разные проблемы, которые всегда нужно решить быстро. Большинство вопросов связано с деньгами: внезапный ремонт, свадьба, просто не хватает денег до зарплаты. Взрослый человек привык решать проблемы самостоятельно, именно поэтому следует не бояться оформить кредит, чтобы быстро решить любой вопрос.");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "kakie-byvayut-vidy-kredita/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestButtonSixteen() throws InterruptedException {
        openBlogHeader();
        clickPageSixteen();
        softAssert.assertEquals("rgba(0, 86, 184, 1)", driver.findElement(By.xpath(".//*[@class='news-pagination']//*[text()='16']")).getCssValue("background-color"));
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "?news_start=90");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare91() throws InterruptedException {
        openBlogHeader();
        clickPageSixteen();
        clickAboutBlog1();
        softAssert.assertEquals(Gettext(Text), "За последнее десятилетие Украина пережила два кризиса, который пошатнул не только экономическую ситуацию, но и личный бюджет каждого. Начиная с 2005 года, каждый 10-й украинец имел кредит, но в связи с обстоятельствами мог погашать его с просрочками - все это влияет на кредитную историю. И если на одну просрочку банк может закрыть глаза, то более значительный пропуск может привести к невозможности получить кредит в дальнейшем.");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "kakie-banki-dayut-kredit-s-plohoj-kreditnoj-istoriej-i-prosrochkami/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare92() throws InterruptedException {
        openBlogHeader();
        clickPageSixteen();
        clickAboutBlog2();
        softAssert.assertEquals(Gettext(Text), "К сожалению, проблемы могут возникнуть у каждого независимо от возраста. И чем моложе человек, тем больше проблем ему предстоит решить: обучение, съем жилья, учебники, курсы. Студентам, например, всегда нужны деньги, и просить взаймы у родителей – не всегда удобно и возможно. Как поступать в такой ситуации, как решить все проблемы «одним махом»? Взять кредит.");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "kakie-banki-dayut-kredit-studentam/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare93() throws InterruptedException {
        openBlogHeader();
        clickPageSixteen();
        clickAboutBlog3();
        softAssert.assertEquals(Gettext(Text), "Кредитование стало очень популярно последние 5 лет в Украине. Для решения любых вопросов, на любые суммы, мы обращаемся в банки для оформления кредитов. Никого уже не смущают ни проценты, ни требования к заемщикам. Кредит стал европейским, цивилизованным методом решения проблем взрослого человека. Но так ли легко оформить займ в Украине как это обещают банки?");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "kakie-banki-dayut-kredit-po-pasportu/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare94() throws InterruptedException {
        openBlogHeader();
        clickPageSixteen();
        clickAboutBlog4();
        softAssert.assertEquals(Gettext(Text), "Проблемы с деньгами могут возникнуть у каждого, независимо от того, сколько вам лет. Чем старше человек, тем проще ему решить свои проблемы. Если кредитование стало популярным последние 7-10 лет, банки продолжают с неохотой выдавать кредитам лицам младше 21 года. Не совсем справедливо, правда?");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "kakie-banki-vydayut-kredity-s-18-let/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare95() throws InterruptedException {
        openBlogHeader();
        clickPageSixteen();
        clickAboutBlog5();
        softAssert.assertEquals(Gettext(Text), "Не смотря на то, что минимальная заработная плата в Украине с января 2017 года составляет более 3000 гривен, пенсия осталась на прежнем уровне. Прожить на 1300 гривен в месяц сложно, а решить финансовые проблемы, заплатить коммунальные услуги – невозможно. Если дети помочь не могут, следует подумать о том, где можно оформить займ на выгодных условиях.");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "kakie-banki-vydayut-kredity-pensioneram/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare96() throws InterruptedException {
        openBlogHeader();
        clickPageSixteen();
        clickAboutBlog6();
        softAssert.assertEquals(Gettext(Text), "Каждый день мы видим рекламы банков, магазинов, призывающих взять технику в кредит. Яркие картинки, привлекательные условия, горячие «0% годовых». Но все ли действительно так просто и неужели оформив займ на 10000 гривен сроком на 6 месяцев спустя полгода можно вернуть эту же сумму и ни гривной больше? Важно выяснить, какие банки Украины предлагают выгодные условия, существуют ли альтернативные не менее экономные варианты.");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "v-kakom-banke-luchshe-vzyat-potrebitelskij-kredit/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestButtonSeventeen() throws InterruptedException {
        openBlogHeader();
        clickPageSeventeen();
        softAssert.assertEquals("rgba(0, 86, 184, 1)", driver.findElement(By.xpath(".//*[@class='news-pagination']//*[text()='17']")).getCssValue("background-color"));
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "?news_start=96");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare97() throws InterruptedException {
        openBlogHeader();
        clickPageSeventeen();
        clickAboutBlog1();
        softAssert.assertEquals(Gettext(Text), "Квартирный вопрос всегда остается актуальным для 40% граждан Украины. Особенно это касается молодых семей, которые только поженились и еще не успели скопить капитал на собственное жилье. Жить на съемной площади – дорого, а проживать вместе с родителями, пусть даже в большом просторном доме - сложно. Выход один – жилье в кредит.");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "gde-vzyat-dengi-na-kvartiru-molodoj-seme/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare98() throws InterruptedException {
        openBlogHeader();
        clickPageSeventeen();
        clickAboutBlog2();
        softAssert.assertEquals(Gettext(Text), "Человек стремится к успешной, независимой жизни. Что для этого нужно? Семья, работа и собственный дом. Но что делать, если государство не оказывает поддержку, отложенной зарплаты едва хватит на половину стоимости недвижимости, а помочь некому? Хорошо, если есть друзья, состоятельные родственники, но в большинстве случаев единственным вариантом остается кредит.");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "gde-vzyat-dengi-na-pokupku-doma/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare99() throws InterruptedException {
        openBlogHeader();
        clickPageSeventeen();
        clickAboutBlog3();
        softAssert.assertEquals(Gettext(Text), "Каждая девушка еще с детства представляла свадьбу сказочной церемонией, где она - принцесса, а жених – волшебный принц. Праздник в светлых оттенках, много счастливых гостей, родители с трогательными улыбками, лучшие друзья и дружки, которые выстраиваются в очередь, чтобы словить букет невесты. Парень же не так ярко представляет этот день, для него свадьба – это время, когда наступает новая, семейная ответственность. Теперь он – мужчина – глава семьи, главный добытчик и будущий отец. Но как бы там ни было, день бракосочетания очень важен, каждый хочет, чтобы он запомнился на всю жизнь.");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "gde-vzyat-kredit-na-svadbu/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare100() throws InterruptedException {
        openBlogHeader();
        clickPageSeventeen();
        clickAboutBlog4();
        softAssert.assertEquals(Gettext(Text), "Для каждого важно иметь собственный дом. И чем старше становится человек, тем больше возрастает потребность. А что говорить, когда появляется семья, дети. На зарплату, без посторонней помощи приобрести квартиру – сложно, поэтому единственным вариантом остается взять кредит на квартиру.");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "gde-luchshe-vzyat-kredit-na-pokupku-zhilya/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare101() throws InterruptedException {
        openBlogHeader();
        clickPageSeventeen();
        clickAboutBlog5();
        softAssert.assertEquals(Gettext(Text), "Каждый человек, которому нужен кредит наличными, попытается выяснить, на каких условиях и где можно получить займ. Банковские кредиты не кажутся такими страшными как несколько лет назад, но разобраться лишний раз и напомнить себе, что на самом деле скрывается под рекламными предложениями от банков, все же стоит. Ведь одни клиенты берут наличные в кредит из раза в раз, другие – не могут закрыть, казалось бы, небольшую сумму в течение 3-5 лет. Одни банки предлагают оформить моментальный кредит наличными онлайн без процентов, другие привлекают отсутствием комиссий, а третьи - и вовсе беспроцентной рассрочкой. А ведь кредитор не останется без выгоды, а по закону выдавать беспроцентные займы запрещено. Также можно получить выгодный экспресс кредит наличными в онлайн сервисах, например, MyCredit. Вариантов множество.");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "kak-vzyat-kredit-nalichnym-chtoby-ne-ostatsya-vechnym-dolzhnikom/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare102() throws InterruptedException {
        openBlogHeader();
        clickPageSeventeen();
        clickAboutBlog6();
        softAssert.assertEquals(Gettext(Text), "Когда вы наконец-то решили купить новый автомобиль или поменять старый, нередко сталкиваетесь с проблемой - нехваткой денег. Финансовый вопрос – самый сложный, но решить его нужно быстро или «прямо сейчас». Модель и марка машины уже выбрана, продавец согласился сделать скидку, даже куплены новые чехлы на сидения, но не хватает буквально нескольких тысяч гривен. Выход один – кредит.");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "gde-vzyat-kredit-na-mashinu/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestButtonEighteen() throws InterruptedException {
        openBlogHeader();
        clickPageEighteen();
        softAssert.assertEquals("rgba(0, 86, 184, 1)", driver.findElement(By.xpath(".//*[@class='news-pagination']//*[text()='18']")).getCssValue("background-color"));
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "?news_start=102");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare103() throws InterruptedException {
        openBlogHeader();
        clickPageEighteen();
        clickAboutBlog1();
        softAssert.assertEquals(Gettext(Text), "Если купить дом – дорого, не всегда возможно, можно подумать о его строительстве собственными силами. Конечно, понадобится время, деньги на поиск рабочих, оформление земли, покупку материалов. В любом случае самостоятельное строительство даже небольшого дома может стоить дешевле, чем приобретение квартиры у застройщика.");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "skolko-nuzhno-deneg-na-stroitelstvo-doma/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare104() throws InterruptedException {
        openBlogHeader();
        clickPageEighteen();
        clickAboutBlog2();
        softAssert.assertEquals(Gettext(Text), "Каждый из нас сталкивался с проблемой нехватки денег. Это могут быть любые заботы: день рождение родственника, срочный ремонт в квартире, покупка техники или просто мобильного телефона, который сломался в самый неподходящий момент. Нам свойственно планировать бюджет, но некоторые расходы предвидеть не удается. И если ранее мы могли занять деньги у друга, а само слово «кредит» было чем-то пугающим и незнакомым, то сейчас лучше всего взять кредит наличными онлайн, потому что именно так вы экономите время и можете быстро решить любой финансовый вопрос.");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "gde-luchshe-vsego-vzyat-kredit-nalichnymi-v-ukraine/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestAboutShare105() throws InterruptedException {
        openBlogHeader();
        clickPageEighteen();
        clickAboutBlog3();
        softAssert.assertEquals(Gettext(Text), "Ремонт квартиры – ответственное мероприятие, от качества которого зависит не только комфорт, но и безопасность проживания. Состояние внутренней отделки квартиры влияет на наше эстетическое восприятие и психологическое самочувствие. Исправность технических систем: водопровода, канализации, газовой сети – вопрос безопасности, требующий особого внимания.");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "skolko-nuzhno-deneg-na-remont-dvuhkomnatnoj-kvartiry-i-stoit-li-brat-kredit/");
        softAssert.assertEquals(isElementXpathPresent(Aboutblog1img), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestShareSitebar() throws InterruptedException {
        openBlogHeader();
        clickPageFour();
        clickAboutBlog4();
        String Sitebar = driver.findElement(By.xpath(".//span[.='Куда обращаться если донимают коллекторы?']")).getText();
        softAssert.assertEquals(Sitebar, "Куда обращаться если донимают коллекторы?");
        List<String> list = new ArrayList<String>();
        for (int i = 1; i <= 104; i++) {
            list.add(driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div/div[1]/div[1]/a[" + i + "]")).getText());
        }

        softAssert.assertEquals(list.get(0), "Сколько нужно денег на ремонт двухкомнатной квартиры, и стоит ли брать кредит");
        softAssert.assertEquals(list.get(1), "Где лучше всего взять кредит наличными в Украине?");
        softAssert.assertEquals(list.get(2), "Сколько нужно денег на строительство дома?");
        softAssert.assertEquals(list.get(3), "Где взять кредит на машину?");
        softAssert.assertEquals(list.get(4), "Как взять кредит наличным, чтобы не остаться вечным должником?");
        softAssert.assertEquals(list.get(5), "Где лучше взять кредит на покупку жилья?");
        softAssert.assertEquals(list.get(6), "Где взять кредит на свадьбу?");
        softAssert.assertEquals(list.get(7), "Где взять деньги на покупку дома?");
        softAssert.assertEquals(list.get(8), "Где взять деньги на квартиру молодой семье?");
        softAssert.assertEquals(list.get(9), "В каком банке лучше взять потребительский кредит?");
        softAssert.assertEquals(list.get(10), "Какие банки выдают кредиты пенсионерам?");
        softAssert.assertEquals(list.get(11), "Какие банки выдают кредиты с 18 лет?");
        softAssert.assertEquals(list.get(12), "Какие банки дают кредит по паспорту?");
        softAssert.assertEquals(list.get(13), "Какие банки дают кредит с плохой кредитной историей и просрочками?");
        softAssert.assertEquals(list.get(14), "Какие банки дают кредит студентам?");
        softAssert.assertEquals(list.get(15), "Какие бывают виды кредита?");
        softAssert.assertEquals(list.get(16), "Какие бывают потребительские кредиты?");
        softAssert.assertEquals(list.get(17), "Какой банк выдает кредит безработным?");
        softAssert.assertEquals(list.get(18), "Где взять деньги на лечение?");
        softAssert.assertEquals(list.get(19), "Какой банк дает кредит без залога?");
        softAssert.assertEquals(list.get(20), "Какой банк дает кредит под залог?");
        softAssert.assertEquals(list.get(21), "Кредит под залог недвижимости: что нужно знать?");
        softAssert.assertEquals(list.get(22), "Откуда взять деньги на путешествия?");
        softAssert.assertEquals(list.get(23), "Чем опасен кредит под залог квартиры?");
        softAssert.assertEquals(list.get(24), "Где взять деньги на операцию?");
        softAssert.assertEquals(list.get(25), "Что делать, если нечем платить за коммуналку?");
        softAssert.assertEquals(list.get(26), "Где одолжить деньги под проценты?");
        softAssert.assertEquals(list.get(27), "Где взять деньги кроме банка?");
        softAssert.assertEquals(list.get(28), "Что такое небанковская кредитная организация?");
        softAssert.assertEquals(list.get(29), "Где взять деньги на одежду?");
        softAssert.assertEquals(list.get(30), "Где взять деньги на лечение зубов?");
        softAssert.assertEquals(list.get(31), "Где взять денег на ремонт квартиры?");
        softAssert.assertEquals(list.get(32), "Где взять кредит на ремонт автомобиля?");
        softAssert.assertEquals(list.get(33), "Сколько стоит аренда авто в Киеве?");
        softAssert.assertEquals(list.get(34), "Сколько стоит аренда квартир в Киеве в 2017 году?");
        softAssert.assertEquals(list.get(35), "Сколько стоит ремонт ноутбука (компьютера ПК) в Киеве?");
        softAssert.assertEquals(list.get(36), "Стоимость ремонта квартиры в Украине");
        softAssert.assertEquals(list.get(37), "Доступный отдых на море 2017");
        softAssert.assertEquals(list.get(38), "Какие медицинские услуги предоставляются бесплатно, а какие платно в Украине?");
        softAssert.assertEquals(list.get(39), "Как не платить коммунальные услуги?");
        softAssert.assertEquals(list.get(40), "Что такое проблемный кредит?");
        softAssert.assertEquals(list.get(41), "Чем отличается лизинг от кредита?");
        softAssert.assertEquals(list.get(42), "Сколько стипендия у студентов в 2017 году?");
        softAssert.assertEquals(list.get(43), "Сколько стоит жизнь студента в Киеве?");
        softAssert.assertEquals(list.get(44), "Помощь в получение кредита: реальный выход или западня?");
        softAssert.assertEquals(list.get(45), "Где взять кредит без прописки в паспорте?");
        softAssert.assertEquals(list.get(46), "Какие банки выдают кредит студентам?");
        softAssert.assertEquals(list.get(47), "Где можно отдохнуть студентам? Бюджетный отдых 2017");
        softAssert.assertEquals(list.get(48), "Где купить Айфон в кредит выгоднее?");
        softAssert.assertEquals(list.get(49), "Где взять кредит студентам на обучение?");
        softAssert.assertEquals(list.get(50), "Выпустят ли заграницу с кредитом?");
        softAssert.assertEquals(list.get(51), "В каком банке взять кредит без справки о доходах?");
        softAssert.assertEquals(list.get(52), "Беспроцентный кредит: миф или реальность?");
        softAssert.assertEquals(list.get(53), "Где можно взять кредит на 5000 грн?");
        softAssert.assertEquals(list.get(54), "Сколько нужно не платить кредит, чтобы попасть в черный список?");
        softAssert.assertEquals(list.get(55), "Стоимость обучения в вузах Киева и Харькова");
        softAssert.assertEquals(list.get(56), "Стоит ли брать кредит от частного лица? Преимущества и риски частных займов");
        softAssert.assertEquals(list.get(57), "Условия кредитования в банках Украины и вероятность одобрения кредита");
        softAssert.assertEquals(list.get(58), "Как узнать есть ли я в черном списке должников по кредитам?");
        softAssert.assertEquals(list.get(59), "Где взять кредит для погашения кредита в другом банке?");
        softAssert.assertEquals(list.get(60), "Действия банка при невыплате кредита");
        softAssert.assertEquals(list.get(61), "Как взять кредит, если ты в черном списке?");
        softAssert.assertEquals(list.get(62), "Кредит под расписку");
        softAssert.assertEquals(list.get(63), "Могут ли банк отобрать квартиру за неуплату кредита?");
        softAssert.assertEquals(list.get(64), "Стоимость обучения в медицинских вузах и колледжах Украины");
        softAssert.assertEquals(list.get(65), "Что такое реструктуризация долга по кредиту?");
        softAssert.assertEquals(list.get(66), "Рейтинг банков и кредитных организаций Украины по кредитам");
        softAssert.assertEquals(list.get(67), "Где самые низкие проценты по кредитам?");
        softAssert.assertEquals(list.get(68), "Где самый низкий процент на потребительский кредит?");
        softAssert.assertEquals(list.get(69), "Цена ремонта стиральной машины в Киеве");
        softAssert.assertEquals(list.get(70), "Цены на ремонт холодильников в Киеве");
        softAssert.assertEquals(list.get(71), "Где занять денег в интернете?");
        softAssert.assertEquals(list.get(72), "Выселение из квартиры за долги по кредиту – возможно ли это?");
        softAssert.assertEquals(list.get(73), "Как избавиться от долгов по кредитам?");
        softAssert.assertEquals(list.get(74), "В каком банке самая низкая процентная ставка по кредиту");
        softAssert.assertEquals(list.get(75), "Что такое эффективная ставка по кредиту?");
        softAssert.assertEquals(list.get(76), "Как рассчитывается процентная ставка по кредиту?");
        softAssert.assertEquals(list.get(77), "Кто такие коллекторы?");
        softAssert.assertEquals(list.get(78), "Как проходит взыскание долгов по кредиту?");
        softAssert.assertEquals(list.get(79), "Как не платить кредит коллекторам в Украине");
        softAssert.assertEquals(list.get(80), "Какие банки продают долги коллекторам?");
        softAssert.assertEquals(list.get(81), "Как правильно общаться с коллекторами?");
        softAssert.assertEquals(list.get(82), "Почему микрозаймы не подают в суд на должников, а передают коллекторам?");
        softAssert.assertEquals(list.get(83), "Стоимость газа для населения в Украине");
        softAssert.assertEquals(list.get(84), "Как погасить просроченный кредит?");
        softAssert.assertEquals(list.get(85), "Что делать если банк требует погасить кредит, который я не брал?");
        softAssert.assertEquals(list.get(86), "Наказание за неуплату кредита. Каковы последствия и что вам грозит?");
        softAssert.assertEquals(list.get(87), "Стоимость 1 куба горячей и холодной воды в Украине в 2017 году");
        softAssert.assertEquals(list.get(88), "Как погасить образовательный кредит?");
        softAssert.assertEquals(list.get(89), "Тарифы на электроэнергию для населения в Украине. Стоимость 1 квт в 2017 году");
        softAssert.assertEquals(list.get(90), "Как оплатить долг за электроэнергию?");
        softAssert.assertEquals(list.get(91), "Как оплатить задолженность по коммунальным платежам?");
        softAssert.assertEquals(list.get(92), "Как экономить электроэнергию? Способы экономии электроэнергии в быту");
        softAssert.assertEquals(list.get(93), "Приборы для экономии электроэнергии");
        softAssert.assertEquals(list.get(94), "Двухтарифный счетчик электроэнергии - реальная возможность платить меньше");
        softAssert.assertEquals(list.get(95), "Что такое рефинансирование кредита (перекредитование)?");
        softAssert.assertEquals(list.get(96), "Причины отказа в выдаче кредита");
        softAssert.assertEquals(list.get(97), "Как взять кредит с отрицательной кредитной историей?");
        softAssert.assertEquals(list.get(98), "Как пройти банковские проверки?");
        softAssert.assertEquals(list.get(99), "Размер минимальной пенсии в Украине в 2017");
        softAssert.assertEquals(list.get(100), "Повышение пенсии в Украине в 2017 году");
        softAssert.assertEquals(list.get(101), "Какая минимальная зарплата в Украине?");
        softAssert.assertEquals(list.get(102), "Какой минимальный прожиточный минимум в Украине");
        softAssert.assertEquals(list.get(103), "Отключили газ и воду за неуплату - что делать?");

        softAssert.assertAll();
    }

    @Test
    public void TestCalculator()
    {
        openBlogHeader();
        clickAboutBlog1();
        movetoCalculator();
        softAssert.assertEquals("rgba(0, 177, 129, 1)", driver.findElement(By.xpath(".//*[@class='btn btn-slider']")).getCssValue("background-color"));
//        softAssert.assertEquals("rgba(0, 0, 0, 0)", driver.findElement(By.xpath(".//*[@class = 'small-slider-holder ']//*[text() = 'Какую сумму вы желаете получить?']")).getCssValue("background-color"));
        softAssert.assertAll();
    }
}
