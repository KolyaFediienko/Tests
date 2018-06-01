package Tests;

import Pages.ONasPage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;
import java.util.List;

public class ONasTest extends Pages.ONasPage {

    private SoftAssert softAssert = new SoftAssert();
    private static final String BaseURL = "https://mycredit.ua/ru/";
    private static final String TextZagolovok = ".//*[@class='about-left']//*[contains(text(),'О нас')]";
    private static final String TextPogZagolovkom = ".//*[@class='about-left']//*[contains(text(),'Вы получаете деньги тогда, когда они необходимы вам больше всего')]";
    private static final String TextLeft = ".//*[@class='about-left']//p";
    private static final String ONasBlok= ".//*[@class='about-us-top']";

    private static final String YuotubeBlok = ".//*[@class='embed-wrapper']";

    private static final String ZagolovokServisMycreditEto = ".//*[@class='about-info text-center']//*[contains(text(),'Сервис MyCredit - это:')]";
    private static final String ServisMycreditEtoBlok1 = ".//*[@class='about-info text-center']//li[1]";
    private static final String ServisMycreditEtoBlok2 = ".//*[@class='about-info text-center']//li[2]";
    private static final String ServisMycreditEtoBlok3 = ".//*[@class='about-info text-center']//li[3]";
    private static final String ServisMycreditEtoBlok4 = ".//*[@class='about-info text-center']//li[4]";
    private static final String ButtonOformitCredit = ".//*[@class='about-info--footer']//*[text()='Оформить кредит']";

    private static final String RegistraciaZagolovok= ".//*[@class='registration-h1']";
    private static final String RegistraciaRightBlok= ".//*[@class='col-md-4']";

    private static final String ZagolovokServisMyCreditVLizah = ".//*[@class='container-fluid']//*[contains(text(),'MyCredit в лицах')]";
    private static final String MyCreditVLizahText = ".//*[@class='container-fluid']//*[contains(text(),'Сервис онлайн-кредитования MyCredit')]";
    private static final String MyCreditVLizahBlok1 = ".//*[@class='js-people-wr']//li[1]";
    private static final String MyCreditVLizahBlok2 = ".//*[@class='js-people-wr']//li[2]";
    private static final String MyCreditVLizahBlok3 = ".//*[@class='js-people-wr']//li[3]";
    private static final String MyCreditVLizahBlok4 = ".//*[@class='js-people-wr']//li[4]";

    private static final String ZagolovokChtoDlyaNasVashno = ".//*[@class='container-fluid']//*[contains(text(),'Что для нас важно')]";
    private static final String ChtoDlyaNasVashnoBlok1 = ".//*[@class='about-important text-center']//div[1]//div[2]";
    private static final String ChtoDlyaNasVashnoBlok2 = ".//*[@class='about-important text-center']//div[1]//div[3]";
    private static final String ChtoDlyaNasVashnoBlok3 = ".//*[@class='about-important text-center']//div[1]//div[4]";
    private static final String ChtoDlyaNasVashnoBlok4 = ".//*[@class='about-important text-center']//div[1]//div[5]";

    private static final String ZagolovokOtlichiya = ".//*[@class='container-fluid']//*[contains(text(),'Отличия MyCredit от других систем микрокредитования')]";
    private static final String OtlichiyaBlok1 = ".//*[@class='about-different-wr']//div[1]";
    private static final String OtlichiyaBlok2 = ".//*[@class='about-different-wr']//div[2]";
    private static final String OtlichiyaBlok3 = ".//*[@class='about-different-wr']//div[3]";
    private static final String OtlichiyaBlok4 = ".//*[@class='about-different-wr']//div[4]";

    private static final String ZagolovokPravovayaInfo = ".//*[@class='content-padding']//*[text()='Правовая информация']";
    private static final String PravovayaInfoOnas = ".//*[@class='tab-pane fade in active']";
    private static final String PravovayaInfoPravila = ".//*[@class='tab-pane fade active in']";
    private static final String PravovayaInfoSvidetelstvo = ".//*[@class='tab-pane fade active in']//*[contains(text(),'Свідоцтво')]\n";

    private static final String ZagolovokDogovorZayma = ".//*[@class='content-padding']//*[text()='Договор займа']";
    private static final String DogovorZayma = ".//*[@class='content']";
    private static final String DogovorZaymaBlok = ".//*[@class='pgwSlideshow wide']";

    private static final String ZagolovokFinansovayaOtchetnost = ".//*[@class='content-padding']//*[text()='Финансовая отчетность']";
    private static final String FinansovayaOtchetnostBlok = ".//*[@class='tab-content']";
    private static final String FinansovayaOtchetnost2016Blok = ".//*[@class='tab-content']";

    private static final String ZagolovokPolitikaKonf = ".//*[@class='content-padding']//*[text()='Политика конфиденциальности']";
    private static final String PolitikaKonfBlok = ".//*[@class='content']";

    private static final String ZagolovokOtzyvy = ".//*[@class='content-padding']//*[text()='Отзывы']";
    private static final String Otzyvy = ".//*[@class='reviews-list']";
    private static final String NoviyOtzuvBlok = ".//*[@class='reviews-constructor']";

    private static final String ZagolovokKontaktu= ".//*[@class='container-fluid']//*[text()='Контакты и реквизиты']";
    private static final String KontaktuBlok1= ".//*[@class='contact-list']";
    private static final String KontaktuTextBlok2= ".//*[@class='contact-rekvizits']";
    private static final String KontaktuTextBlok3= ".//*[@class='callback']";
    private static final String SetSMS= ".//*[@class='feedback']";





    @Test
    public void ONasPageTest()
    {
        openONasHeader();
        softAssert.assertEquals(Gettext(TextZagolovok),"О нас");
        softAssert.assertEquals(Gettext(TextLeft), "Мы стараемся сделать получение займа простым для каждого, при этом придерживаясь нашего основного принципа — помощь должна прийти моментально, как только она потребовалась. Для подписания договора вам не придется ехать к нам в офис. В качестве подписи мы используем цифровой код, которым вы подтверждаете согласие со всеми пунктами договора.");
        softAssert.assertEquals(Gettext(TextPogZagolovkom),"Вы получаете деньги тогда, когда они необходимы вам больше всего");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL +"about/");
        softAssert.assertEquals(isElementXpathPresent(ONasBlok), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void ButtonPlayTest()
    {
        openONasHeader();
        clickButtonPlay();
        softAssert.assertEquals(isElementXpathPresent(YuotubeBlok), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void ServisMycreditEtoTest()
    {
        openONasHeader();
        movetoServisMycreditEto();
        softAssert.assertEquals(Gettext(ZagolovokServisMycreditEto),"Сервис MyCredit - это:");
        softAssert.assertEquals(isElementXpathPresent(ServisMycreditEtoBlok1), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(ServisMycreditEtoBlok2), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(ServisMycreditEtoBlok3), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(ServisMycreditEtoBlok4), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(ButtonOformitCredit), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void OformitCreditButtonTest()
    {
        openONasHeader();
        movetoServisMycreditEto();
        clickOformitCredit();
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL +"registration/");
        softAssert.assertEquals(isElementXpathPresent(RegistraciaZagolovok), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(RegistraciaRightBlok), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void MyCreditVLizahTest()
    {
        openONasHeader();
        movetoMycreditVLizah();
        softAssert.assertEquals(Gettext(ZagolovokServisMyCreditVLizah),"MyCredit в лицах");
        softAssert.assertEquals(Gettext(MyCreditVLizahText),"Сервис онлайн-кредитования MyCredit - это не просто сайт, который с помощью специальной программы выдает кредиты, это лучшие специалисты, ежедневно работающие над тем, чтобы MyCredit стал вашим незаменимым помощником в повседневной жизни.");
        softAssert.assertEquals(isElementXpathPresent(MyCreditVLizahBlok1), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(MyCreditVLizahBlok2), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(MyCreditVLizahBlok3), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(MyCreditVLizahBlok4), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void ChtoDlyaNasVashnoTest()
    {
        openONasHeader();
        movetoChtoDlyaNasVashno();
        softAssert.assertEquals(Gettext(ZagolovokChtoDlyaNasVashno),"Что для нас важно");
        softAssert.assertEquals(isElementXpathPresent(ChtoDlyaNasVashnoBlok1), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(ChtoDlyaNasVashnoBlok2), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(ChtoDlyaNasVashnoBlok3), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(ChtoDlyaNasVashnoBlok4), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void OtlichiyaTest()
    {
        openONasHeader();
        movetoOtlichiya();
        softAssert.assertEquals(Gettext(ZagolovokOtlichiya), "Отличия MyCredit от других систем микрокредитования");
        softAssert.assertEquals(isElementXpathPresent(OtlichiyaBlok1), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(OtlichiyaBlok2), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(OtlichiyaBlok3), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(OtlichiyaBlok4), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void PravovayaInfoTest()
    {
        openONasHeader();
        clickPravovayaInfo();
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL +"documents-license/");
        softAssert.assertEquals(Gettext(ZagolovokPravovayaInfo), "Правовая информация");
        softAssert.assertEquals(Gettext(PravovayaInfoOnas), "Повна назва фінансової установи:\n" +
                "Товариство з обмеженою відповідальністю \"1 БЕЗПЕЧНЕ АГЕНСТВО НЕОБХІДНИХ КРЕДИТІВ\"\n" +
                "Індифікаційний код:\n" +
                "ЄДРПОУ 39861924\n" +
                "Юридична адреса:\n" +
                "01004, м. Київ, бул. Тараса Шевченка, буд. 11, приміщення 51а\n" +
                "Перелік фінансових послуг, що надаються фінансовою установою (види діяльності):\n" +
                "64.19 Інші види грошового посередництва;\n" +
                "64.92 Інші види кредитування\n" +
                "Відомості про власників істотної участі (у тому числі осіб, які здійснюють контроль за фінансовою установою):\n" +
                "ТОВАРИСТВО З ОБМЕЖЕНОЮ ВІДПОВІДАЛЬНІСТЮ \"СТАНДАРТ ФІНАНС\", індекс 01103, м.Київ, Печерський район, ВУЛИЦЯ КІКВІДЗЕ, будинок 18 Б, офіс 52, 39733345, розмір внеску до статутного фонду - 8000000.00 грн.; \"КІНЦЕВИЙ БЕНЕФІЦІАРНИЙ ВЛАСНИК (КОНТРОЛЕР) ЮРИДИЧНОЇ ОСОБИ, ЯКЩО УЧАСНИК-ЮРИДИЧНА ОСОБА-39578560- КУЗЬМЕНКО ВЛАДИСЛАВ ОЛЕКСАНДРОВИЧ, СО474426, УКРАЇНА, М. КИЇВ, ВУЛ. ВАСИЛЕНКА, БУД., 14В, КВ., 60\"\n" +
                "Відомості про склад наглядової ради та виконавчого органу фінансової установи:\n" +
                "немає\n" +
                "Відомості про відокремлені підрозділи фінансової установи:\n" +
                "немає\n" +
                "Відомості про ліцензії та дозволи, видані фінансовій установ:\n" +
                "немає\n" +
                "Відомості про порушення провадження у справі про банкрутство, застосування процедури санації фінансової установи:\n" +
                "немає\n" +
                "Рішення про ліквідацію фінансової установи:\n" +
                "немає");
        softAssert.assertAll();
        clickPravovayaInfoPravila();
        softAssert.assertEquals(Gettext(PravovayaInfoPravila), "Правила надання фінансових кредитів за рахунок власних та залучених коштів Товариством з обмеженою відповідальністю “Кредитна установа “Індекс Фінгруп”\n" +
                "Выберите сумму и срок кредита, который Вы желаете получить. Ознакомьтесь с Правилами предоставления кредита.\n" +
                "Зарегистрируйте на сайте свой личный кабинет. Для регистрации заполните поля анкеты (эл. почта, мобильный телефон). Придумайте пароль, который будет служить подтверждением Вашей личности при пользовании сайтом. Никому не сообщайте свой пароль.\n" +
                "Подтвердите регистрацию. На указанный номер телефона Вам будет отправлен смс-код, используя который, Вы сможете заключать (подписывать) соглашения на нашем сайте, при помощи электронной цифровой подписи одноразовым идентификатором (согласно Закона Украины «Про электронную коммерцию»).\n" +
                "Заполните заявку. Внимательно заполняйте все поля, наличие ошибки может послужить причиной отказа в предоставлении кредита.\n" +
                "Верифицируйте свою платёжную карту. После того, как Вы введете данные своей банковской карты, на ней будет временно заблокирована произвольная сумма, не превышающая 1 грн. Для подтверждения того, что именно Вы являетесь владельцем карты, введите значение заблокированной суммы в Личном кабинете. Эта процедура позволяет нам предотвратить оформление кредита мошенниками на чужую карту.\n" +
                "Подпишите Кредитный договор. В Вашем личном кабинете будет доступен текст Кредитного договора с данными и реквизитами, которые Вы указали при регистрации. Внимательно проверьте указанные реквизиты, ознакомьтесь с текстом договора, и для подтверждения своего согласия с условиями договора нажмите на кнопку «Принимаю условия сделки» и введите код из смс-сообщения.\n" +
                "Ожидайте принятия решения. Решение по кредиту будет отправлено Вам в смс-сообщении, электронном письме а также доступно в Личном кабинете на сайте.\n" +
                "Скачать");
        softAssert.assertAll();
        clickPravovayaInfoSvidetelstvo();
        softAssert.assertEquals(Gettext(PravovayaInfoSvidetelstvo), "Свідоцтво про реєстрацію фінансової установи ТОВ “1 Безпечне Агентство Безпечних Кредитів”.\n" +
                "Серія та номер свідотства: ІК № 146 від 20.10.2015");
        softAssert.assertAll();
    }

    @Test
    public void DogovorZaymaTest()
    {
        openONasHeader();
        clickDogovorZayma();
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL +"kreditnyj-dogovor1/");
        softAssert.assertEquals(Gettext(ZagolovokDogovorZayma), "Договор займа");
        softAssert.assertEquals(Gettext(DogovorZayma), "Пример договора займа, который заключается между компанией \"1БАНК\" и клиентом. Договор утвержден Национальной комиссией, осуществляющей государственное регулирование в сфере рынков финансовых услуг." );
        softAssert.assertEquals(isElementXpathPresent(DogovorZaymaBlok), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void FinansovayaOtchetnostTest()
    {
        openONasHeader();
        clickFinansovayaOtchetnost();
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL +"finansovaya-otchetnost/");
        softAssert.assertEquals(Gettext(ZagolovokFinansovayaOtchetnost), "Финансовая отчетность");
        softAssert.assertEquals(isElementXpathPresent(FinansovayaOtchetnostBlok), true, "Элемент найден");
        softAssert.assertAll();
        clickFinansovayaOtchetnost2016();
        softAssert.assertEquals(isElementXpathPresent(FinansovayaOtchetnost2016Blok), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void PolitikaKonfTest()
    {
        openONasHeader();
        clickPolitikaKonf();
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL +"politika-konfidencialnosti/");
        softAssert.assertEquals(Gettext(ZagolovokPolitikaKonf), "Политика конфиденциальности");
        softAssert.assertEquals(Gettext(PolitikaKonfBlok), "Вашему вниманию предлагаются Правила сбора, обработки и хранения персональных данных клиентов, которые установлены сервисом краткосрочного кредитования «MyCredit» и определяют порядок обращения с персональными данными пользователей, зарегистрированными на сайте mycredit.ua\n" +
                "Основные положения.\n" +
                "Регистрируясь на сайте mycredit.ua\n" +
                "Сбор и использование персональных данных клиента\n" +
                "Соглашаясь с Правилами, предоставленными ООО \"1Безопасное Агенство Необходимых Кредитов\", Пользователь подтверждает согласие на использование персональных данных для:\n" +
                "Предоставления услуг клиентам;\n" +
                "Поддержки пользователей сайта;\n" +
                "Улучшения качества содержания сайта;\n" +
                "Уведомления клиентов об услугах и предложениях, которые предоставляет ООО \"1Безопасное Агенство Необходимых Кредитов\"\n" +
                "ООО \"1Безопасное Агенство Необходимых Кредитов\" имеет право на сбор, хранение и использование следующих данных:\n" +
                "ФИО клиента\n" +
                "ник\n" +
                "дата рождения\n" +
                "контактная информация (e-mail, контактный телефон, место проживания)\n" +
                "пароль\n" +
                "история пользования услугами сайта\n" +
                "Разглашение персональных данных\n" +
                "ООО \"1Безопасное Агенство Необходимых Кредитов\" получает право предоставлять информацию о клиенте третьим лицам в следующих случаях:\n" +
                "Клиент дал дополнительное согласие на использование персональных данных;\n" +
                "ООО \"1Безопасное Агенство Необходимых Кредитов\" предоставляет информацию о клиенте своим партнерам и другим третьим лицам с целью, для которой эта информация была собрана;\n" +
                "В случае официального запроса информации государственными и правоохранительными органами. В этом случае владелец базы данных имеет право предоставлять следующие данные о клиенте: ФИО, адрес клиента, номер контактного телефона, e-mail, дату рождения, данные о покупке;\n" +
                "Публикация обобщенной информации, которая не касается персональных данных клиента, не требует соглашения Пользователя;\n" +
                "ООО \"1Безопасное Агенство Необходимых Кредитов\" имеет право перемещать персональные данные через границу в целях, для которой информация была собрана, в случае, если клиент находится за рубежом. Владелец базы данных обязуется соблюдать все меры безопасности для защиты информацию от неправомерного доступа к ней или ее изменения, незаконного разглашения или удаления;\n" +
                "ООО \"1Безопасное Агенство Необходимых Кредитов\" также может передавать персональные данные клиента другим третьим лицам, входящим в группу компаний, к которой относится собственник базы данных, в том числе компаниям за пределами Украины;\n" +
                "ООО \"1Безопасное Агенство Необходимых Кредитов\" несет единоличную и полную юридическую ответственность за сбор, хранение, использование и защиту персональных данных клиента;\n" +
                "Права Пользователей как субъектов персональных данных\n" +
                "получать доступ к своим персональным данным;\n" +
                "получать информацию касательно условий предоставления доступа к персональным данным;\n" +
                "получать информацию об источниках сбора и местонахождении своих персональных данных;\n" +
                "получать информацию о месте проживания и пребывания собственника или распорядителя базы данных, а также дать соответствующее поручение такой информации уполномоченным лицам, кроме случаев, установленных законом.\n" +
                "получать ответ на запрос о том, обрабатываются ли персональные данные клиента и каково их содержание, но не позднее чем за тридцать дней с дня предоставления запроса, кроме случаев предусмотренных законом;\n" +
                "вносить оговорки касательно ограничения права на обработку своих персональных данных во время предоставления согласия;\n" +
                "предъявлять требования владельцу персональных данных с возражением против обработки своих персональных данных;\n" +
                "знать механизм автоматической обработки персональных данных;\n" +
                "на защиту от автоматизированного решения, которое имеет для него правовые последствия;\n" +
                "отозвать согласие на обработку персональных данных;\n" +
                "предъявлять требование относительно изменения либо уничтожения своих персональных данных, если эти данные обрабатываются незаконно или являются недостоверными;\n" +
                "обращаться с жалобами касательно обработки своих персональных данных к Уполномоченному, или к суду;\n" +
                "на защиту своих персональных данных от незаконной обработки, утраты, уничтожения, повреждения в связи с умышленным сокрытием, не предоставлением или несвоевременным их предоставлением, а также на защиту от предоставления недостоверной информации, которая порочит репутацию, честь и гордость физического лица;\n" +
                "применять средства правовой защиты в случае нарушения законодательства о защите персональных данных;\n" +
                "Удаление персональных данных и отказ от рассылки\n" +
                "В случае, если Пользователь не хочет пользоваться услугами сервиса \"1Безопасное Агенство Необходимых Кредитов\", или в случае изменения персональных данных, Пользователь имеет право на удаление/деактивацию данных.\n" +
                "ООО \"1Безопасное Агенство Необходимых Кредитов\" также предоставляет клиентам право отказаться от получения любой информации, связанной с услугами, которые предоставляет сервис. При этом владелец базы данных оставляет за собой право использовать персональные данные Пользователя с целью, для которой эта информация была собрана, на протяжении 30 дней после деактивации данных Пользователя.\n" +
                "Собственником базы данных Пользователей интернет-сайта mycredit.ua\n" +
                "Адрес: 01004, г. Киев, бул. Тараса Шевченко, дом 11, помещение 51а\n" +
                "Контактный телефон: 0 800 214 111\n" +
                "E-mail: support@mycredit.ua");
        softAssert.assertAll();
    }

    @Test
    public void OtzyvyTest()
    {
        openONasHeader();
        clickOtzyvy();
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL +"otzyvy/");
        softAssert.assertEquals(Gettext(ZagolovokOtzyvy), "Отзывы");
        softAssert.assertEquals(isElementXpathPresent(Otzyvy), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(NoviyOtzuvBlok), true, "Элемент найден");
        softAssert.assertAll();
        clickOtzyvyPageTwo();
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL +"otzyvy/?reviews_start=6");
        softAssert.assertAll();
    }

    @Test
    public void KontaktuTest()
    {
        openONasHeader();
        clickKontaktu();
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL +"contacts/");
        softAssert.assertEquals(Gettext(ZagolovokKontaktu), "Контакты и реквизиты");
        softAssert.assertEquals(isElementXpathPresent(KontaktuBlok1), true, "Элемент найден");
        softAssert.assertEquals(Gettext(KontaktuTextBlok2), "Реквизиты\n" +
                "ООО\n" +
                "«1 Безопасное Агенство Необходимых Кредитов»\n" +
                "Код ЕГРПОУ\n" +
                "39861924\n" +
                "Р/с\n" +
                "№ 26504052600258 в ПАО КБ \"ПРИВАТБАНК\"\n" +
                "МФО\n" +
                "320649");
        softAssert.assertEquals(Gettext(KontaktuTextBlok3), "Мы всегда на связи и рады ответить на все возникшие у Вас вопросы.\n" +
                "Наша электронная почта:    support@mycredit.ua\n" +
                "Наш скайп:   mycredit\n" +
                "Наши телефоны:    0 800 214 111(бесплатный многоканальный телефон)\n" +
                "   073 369 41 11; 067 369 41 11; 050 369 41 11\n" +
                "График работы службы поддержки: ежедневно с     09:00 до 19:00\n" +
                "По вопросам сотрудничества и рекламы пишите пожалуйста на     support@mycredit.ua\n" +
                "Мы крайне внимательно относимся ко всем деталям деятельности нашего сервиса и если у Вас возникли какие-то вопросы или предложения в наш адрес, то мы с радостью ответим на них. Благодарим всех Вас за внимание и желаем всем успехов!");
        softAssert.assertEquals(isElementXpathPresent(SetSMS), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void TestShareSitebar()
    {
        openONasHeader();
        clickPravovayaInfo();
        String Sitebar = driver.findElement(By.xpath(".//*[@class='side-bar ']//*[text()='Правовая информация']")).getText();
        softAssert.assertEquals(Sitebar, "Правовая информация");
        List<String> list = new ArrayList<String>();
        for (int i = 1; i <= 6; i++) {
            list.add(driver.findElement(By.xpath(".//*[@class='side-bar ']//a["+i+"]")).getText());
        }
        softAssert.assertEquals(list.get(0), "Договор займа");
        softAssert.assertEquals(list.get(1), "Финансовая отчетность");
        softAssert.assertEquals(list.get(2), "Политика конфиденциальности");
        softAssert.assertEquals(list.get(3), "Партнерам");
        softAssert.assertEquals(list.get(4), "Отзывы");
        softAssert.assertEquals(list.get(5), "Контакты");
        softAssert.assertAll();

    }

    @Test
    public void TestCalculator()
    {
        openONasHeader();
        clickPravovayaInfo();
        movetoCalculator();
        softAssert.assertEquals("rgba(0, 177, 129, 1)", driver.findElement(By.xpath(".//*[@class='btn btn-slider']")).getCssValue("background-color"));
//        softAssert.assertEquals("rgba(0, 0, 0, 0)", driver.findElement(By.xpath(".//*[@class = 'small-slider-holder ']//*[text() = 'Какую сумму вы желаете получить?']")).getCssValue("background-color"));
        softAssert.assertAll();
    }

}
