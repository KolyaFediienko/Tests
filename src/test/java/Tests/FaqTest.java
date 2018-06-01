package Tests;


import Pages.FaqPage;
import com.sun.xml.internal.bind.v2.TODO;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.logging.Logger;

/**
 * Created by tester on 14.08.2017.
 */
public class FaqTest extends FaqPage {
    private SoftAssert softAssert = new SoftAssert();

    /**
     * Registration url
     */
    private static final String urlReg = "https://mycredit.ua/ru/registration/";

    /**
     * Preloader
     */
    private static final String preLoaderF = ".//*[@class='preloader preloader-bonus white'][(contains(@style, 'none'))]";

    /**
     * Общие вопросы --- Что такое MyCredit
     */
    private static final String question1Video = ".//*[@class='numbers-play text-center same-height-left same-height-right']";
    private static final String question1Button = ".//*[@class='question-button-wr']//*[text()='Получить деньги']";
    private static final String question1Text = ".//*[@class='questions-detail']/p";

    /**
     * Общие вопросы --- На какую сумму возможно оформить кредит?
     */
    private static final String question2Text = ".//*[@class='questions-detail']/*[text()='На какую сумму возможно оформить кредит?']";
    private static final String question2Text2 = ".//*[@class='questions-detail']/p[2]";
    private static final String question2Button = ".//*[@class='content-padding']/div[1]//*[text()='Получить деньги']";

    /**
     * Общие вопросы --- Кто может оформить кредит?
     */
    private static final String question3Text = ".//*[@class='questions-detail']//*[text()='Кто может оформить кредит?']";
    private static final String question3Text2 = ".//*[@class='questions-detail']/p[2]";
    private static final String question3Button = ".//*[@class='content-padding']/div[1]//*[text()='Получить деньги']";


    /**
     * Оформление заявки --- Как подать заявку на оформление кредита?
     */
    private static final String question4Text = ".//*[@class='questions-detail']//*[text()='Как подать заявку на оформление кредита?']";
    private static final String question4Text2 = ".//*[@class='questions-detail']/p[2]";
    private static final String question4Button = ".//*[@class='content-padding']/div[1]//*[text()='Получить деньги']";

    /**
     * Оформление заявки --- Возможно получить кредит наличными?
     */
    private static final String question5Text = ".//*[@class='questions-detail']//*[text()='Возможно получить кредит наличными?']";
    private static final String question5Text2 = ".//*[@class='questions-detail']/p[2]";
    private static final String question5Button = ".//*[@class='content-padding']/div[1]//*[text()='Получить деньги']";

    /**
     * Оформление заявки --- Обязателен ли мобильный телефон для регистрации?
     */
    private static final String question6Text = ".//*[@class='questions-detail']//*[text()='Обязателен ли мобильный телефон для регистрации?']";
    private static final String question6Text2 = ".//*[@class='questions-detail']//*[text()='Да, для подтверждения личности вам необходимо указать телефон, на который будет отправлено SMS.']";
    private static final String question6Button = ".//*[@class='content-padding']/div[1]//*[text()='Получить деньги']";

    /**
     * Оформление заявки --- У меня не получается заполнить анкету. Что мне делать?
     */
    private static final String question7Text = ".//*[@class='questions-detail']//*[text()='У меня не получается заполнить анкету. Что мне делать?']";
    private static final String question7Text2 = ".//*[@class='questions-detail']//*[text()='Вы получите оперативный ответ написав в онлайн-чат или позвонить по номерам горячей линии.']";
    private static final String question7Button = ".//*[@class='content-padding']/div[1]//*[text()='Получить деньги']";

    /**
     * Оформление заявки --- Возможно подать по телефону заявку на кредит в MyCredit?
     */
    private static final String question8Text = ".//*[@class='questions-detail']//*[text()='Возможно подать по телефону заявку на кредит в MyCredit?']";
    private static final String question8Text2 = ".//*[@class='questions-detail']//*[text()='Подать по телефону заявку на кредит в MyCredit, к сожалению не возможно. Заявки принимаються только онлайн (через интернет), отправленные через заполненную форму на сайте MyCredit. При этом подача заявки через сайт займет не больше 10 минут.']";
    private static final String question8Button = ".//*[@class='content-padding']/div[1]//*[text()='Получить деньги']";

    /**
     * Оформление заявки --- В каких городах Вы работаете?
     */
    private static final String question9Text = ".//*[@class='questions-detail']//*[text()='В каких городах Вы работаете?']";
    private static final String question9Text2 = ".//*[@class='content-padding']//*[text()='Наш сервис работает полностью онлайн, поэтому мы имеем возможность обслуживать все население Украины (кроме АР Крым и зоны АТО).']";
    private static final String question9cityBlock = ".//*[@class='city-holder']";
    private static final String question9Button = ".//*[@class='content-padding']/div[1]//*[text()='Получить деньги']";

    /**
     * Оформление заявки --- Сколько времени рассматривается заявка на кредит и как узнать результат?
     */
    private static final String question10Text = ".//*[@class='questions-detail']//*[text()='Сколько времени рассматривается заявка на кредит и как узнать результат?']";
    private static final String question10Text2 = ".//*[@class='questions-detail']//*[text()='Срок рассмотрения заявки может составлять до 10-15минут. После обработки Вашей заявки и принятия решения, Вы получите смс на Ваш мобильный номер телефона указанный в заявке и придет письмо на электронный ящик.']";
    private static final String question10Button = ".//*[@class='content-padding']/div[1]//*[text()='Получить деньги']";

    /**
     * Оформление заявки --- Рассматриваются ли заявки в выходные? А ночью?
     */
    private static final String question11Text = ".//*[@class='questions-detail']//*[text()='Рассматриваются ли заявки в выходные? А ночью?']";
    private static final String question11Text2 = ".//*[@class='questions-detail']//*[text()='А став нашим постоянным клиентом, ваши заявки будут подтверждаться автоматически и даже ночью.']";
    private static final String question11Button = ".//*[@class='content-padding']/div[1]//*[text()='Получить деньги']";

    /**
     * Оформление заявки --- Если я не гражданин Украины, могу ли я получить кредит?
     */
    private static final String question12Text = ".//*[@class='questions-detail']//*[text()='Если я не гражданин Украины, могу ли я получить кредит?']";
    private static final String question12Text2 = ".//*[@class='questions-detail']//*[text()='К сожалению, нет. Если вы гражданин другой страны подать заявку на получение займа у вас не получится. Мы предоставляем кредиты только гражданам Украины.']";
    private static final String question12Button = ".//*[@class='content-padding']/div[1]//*[text()='Получить деньги']";

    /**
     * Оформление заявки ---Есть ли ограничения по возрасту при обращении за кредитом?
     */
    private static final String question13Text = ".//*[@class='questions-detail']//*[text()='Есть ли ограничения по возрасту при обращении за кредитом?']";
    private static final String question13Text2 = ".//*[@class='questions-detail']//*[text()='Кредит может быть предоставлен всем гражданам Украины старше 18 лет.']";
    private static final String question13Button = ".//*[@class='content-padding']/div[1]//*[text()='Получить деньги']";

    /**
     * Оформление заявки --- Мне не пришло SMS с кодом подтверждения. Что мне делать?
     */
    private static final String question14Text = ".//*[@class='questions-detail']//*[text()='Мне не пришло SMS с кодом подтверждения. Что мне делать?']";
    private static final String question14Text2 = ".//*[@class='questions-detail']//*[text()='SMS не всегда приходят моментально. Если вы не получили SMS, проверьте правильность номера мобильного телефона в личном кабинете и нажмите кнопку «повторить SMS».']";
    private static final String question14Button = ".//*[@class='content-padding']/div[1]//*[text()='Получить деньги']";

    /**
     * Оформление заявки --- Заявка получила статус "В обработке". Что это значит?
     */
    private static final String question15Text = ".//*[@class='questions-detail']//*[text()='Заявка получила статус \"В обработке\". Что это значит?']";
    private static final String question15Text2 = ".//*[@class='questions-detail']//*[text()='Статус \"В обработке\" означает, что заявка находится на этапе рассмотрения. Заявка рассматривается до 20 минут.']";
    private static final String question15Button = ".//*[@class='content-padding']/div[1]//*[text()='Получить деньги']";

    /**
     * Оформление заявки --- Забыли пароль? Что делать?
     */
    private static final String question16Text = ".//*[@class='questions-detail']//*[text()='Забыли пароль? Что делать?']";
    private static final String question16Text2 = ".//*[@class='questions-detail']//*[text()='Вы можете восстановить пароль на странице входа в личный кабинет, нажав на кнопку \"Забыли пароль?\". Код доступа будет выслан на ваш номер мобильного телефона, который вы указали при регистрации. После этого введите новый пароль.']";
    private static final String question16Button = ".//*[@class='content-padding']/div[1]//*[text()='Получить деньги']";

    /**
     * Оформление заявки --- Похоже, что мне не отправили сообщение с напоминанием пароля. Что мне делать?
     */
    private static final String question17Text = ".//*[@class='questions-detail']//*[text()='Похоже, что мне не отправили сообщение с напоминанием пароля. Что мне делать? ']";
    private static final String question17Text2 = ".//*[@class='questions-detail']//*[text()='В первую очередь проверьте номер мобильного телефона,который вы указывали при регистрации на сайте MyCredit. Если сообщение с напоминанием пароля не было доставлено, повторите попытку восстановления пароля.']";
    private static final String question17Button = ".//*[@class='content-padding']/div[1]//*[text()='Получить деньги']";

    /**
     * Оформление заявки --- Зачем на банковской карте блокируется сумма до 5грн?
     */
    private static final String question18Text = ".//*[@class='questions-detail']//*[text()='Зачем на банковской карте блокируется сумма до 5грн?']";
    private static final String question18Text2 = ".//*[@class='questions-detail']//*[text()='Для подтверждения, что именно вы владеете банковской картой, чтобы исключить возможность использования мошенниками ваших данных']";
    private static final String question18Button = ".//*[@class='content-padding']/div[1]//*[text()='Получить деньги']";

    /**
     * Банковская карта --- Что такое CVV2 (CVC2)-код?
     */
    private static final String question19Text = ".//*[@class='questions-detail']//*[text()='Что такое CVV2 (CVC2)-код?']";
    private static final String question19Text2 = ".//*[@class='questions-detail']//*[text()='CVV2 (CVC2) - код для карт Visa или MasterCard - это специальное число, состоящие из 3-х цифр, которое обеспечивает дополнительную безопасность при проведении операций через интернет. Данный код как правило написан на обороте карты (последние три цифры из семизначного числа на полосе для подписи).']";
    private static final String question19Button = ".//*[@class='content-padding']/div[1]//*[text()='Получить деньги']";

    /**
     * Банковская карта --- Если на банковской карте 0 грн. возможно ли подать заявку на кредит?
     */
    private static final String question20Text = ".//*[@class='questions-detail']//*[text()='Если на банковской карте 0 грн. возможно ли подать заявку на кредит?']";
    private static final String question20Text2 = ".//*[@class='questions-detail']//*[text()='Для того, чтобы привязать банковскую карту, на которую мы переведем вам деньги, на ней должно быть не менее 5 грн. Это нужно для подтверждения работоспособности вашей карты: временно на ней будет списана сумма, которая вернется обратно после подтверждения.']";
    private static final String question20Button = ".//*[@class='content-padding']/div[1]//*[text()='Получить деньги']";

    /**
     * Банковская карта --- Как узнать заблокированную сумму на банковской карте?
     */
    private static final String question21Text = ".//*[@class='questions-detail']//*[text()='Как узнать заблокированную сумму на банковской карте?']";
    private static final String question21Text2 = ".//*[@class='questions-detail']//*[text()='Позвонить на гарячую линию Вашего банка ']";
    private static final String question21Button = ".//*[@class='content-padding']/div[1]//*[text()='Получить деньги']";

    /**
     * Банковская карта --- Какую карту возможно указывать для получения кредита?
     */
    private static final String question22Text = ".//*[@class='questions-detail']//*[text()='Какую карту возможно указывать для получения кредита?']";
    private static final String question22Text2 = ".//*[@class='questions-detail']//*[text()='Активную гривневую карту любого банка Украины на которой присутствует CVV-код, открытую на имя заявителя на кредит.']";
    private static final String question22Button = ".//*[@class='content-padding']/div[1]//*[text()='Получить деньги']";

    /**
     * Банковская карта --- Как долго ждать перевода на банковскую карту?
     */
    private static final String question23Text = ".//*[@class='questions-detail']//*[text()='Как долго ждать перевода на банковскую карту? ']";
    private static final String question23Text2 = ".//*[@class='questions-detail']//*[text()='Выплата денег на вашу банковскую карту произойдет в течение нескольких минут после подписания вами договора. Договор высылается вам на указанную почту после одобрения заявки.']";
    private static final String question23Button = ".//*[@class='content-padding']/div[1]//*[text()='Получить деньги']";

    /**
     * Банковская карта --- Где найти посмотреть договор?
     */
    private static final String question24Button = ".//*[@class='content-padding']/div[1]//*[text()='Получить деньги']";
    private static final String question24Text = ".//*[@class='questions-detail']//*[text()='Где найти посмотреть договор?']";
    private static final String question24Text2 = ".//*[@class='questions-detail']//*[text()='Ознакомиться с договором вы можете в личном кабинете, а также ссылка на него придет на указанную вами почту.']";

    /**
     * Кредитный договор --- Каким образом подписывается кредитный договор в MyCredit?
     */
    private static final String question25Text = ".//*[@class='questions-detail']//*[text()='Каким образом подписывается кредитный договор в MyCredit?']";
    private static final String question25Text2 = ".//*[@class='questions-detail']//*[text()='Кредитный договор подписывается электронной подписью, по нажатию кнопки \"Согласен с договором\"']";
    private static final String question25Button = ".//*[@class='content-padding']/div[1]//*[text()='Получить деньги']";

    /**
     * Кредитный договор --- Что такое электронная подпись?
     */
    private static final String question26Text = ".//*[@class='questions-detail']//*[text()='Что такое электронная подпись?']";
    private static final String question26Text2 = ".//*[@class='questions-detail']//*[text()='Электронная подпись - это подтверждение вами соглашения, путем нажатия кнопки \"Согласен с договором\"']";
    private static final String question26Button = ".//*[@class='content-padding']/div[1]//*[text()='Получить деньги']";

    /**
     * Кредитный договор --- Личный кабинет
     */
    private static final String question27Text = ".//*[@class='questions-detail']//*[text()='Что такое личный кабинет?']";
    private static final String question27Text2 = ".//*[@class='questions-detail']//*[text()='Это ваша персональная страница в сервисе MyCredit.']";
    private static final String question27Button = ".//*[@class='content-padding']//*[text()='Вход в личный кабинет']";

    /**
     * Личный кабинет --- Как выбрать пароль для личного кабинета пользователя?
     */
    private static final String question28Text = ".//*[@class='questions-detail']//*[text()='Как выбрать пароль для личного кабинета пользователя?']";
    private static final String question28Text2 = ".//*[@class='questions-detail']//*[text()='Пароль должен содержать не менее 6 символов с буквами верхнего и нижнего регистра и цифрами']";
    private static final String question28Button = ".//*[@class='content-padding']/div[1]//*[text()='Получить деньги']";

    /**
     * Личный кабинет --- Что делать если забыли пароль от личного кабинета?
     */
    private static final String question29Text = ".//*[@class='questions-detail']//*[text()='Что делать если забыли пароль от личного кабинета?']";
    private static final String question29Text2 = ".//*[@class='questions-detail']//*[text()='Вы можете восстановить пароль на странице входа в личный кабинет, нажав на кнопку \"Забыли пароль?\". Код доступа будет выслан на ваш номер мобильного телефона, который вы указали при регистрации. После этого введите новый пароль.']";
    private static final String question29Button = ".//*[@class='content-padding']/div[1]//*[text()='Получить деньги']";

    /**
     * Личный кабинет --- Как мне изменить данные в личном кабинете?
     */
    private static final String question30Text = ".//*[@class='questions-detail']//*[text()='Как мне изменить данные в личном кабинете?']";
    private static final String question30Text2 = ".//*[@class='questions-detail']//*[text()='Все данные вы можете изменить в специальной вкладке «Мои данные», если по какой-либо причине это сделать не удалось, то обратитесь в поддержку по телефону или в онлайн-чате.']";
    private static final String question30Button = ".//*[@class='content-padding']/div[1]//*[text()='Получить деньги']";

    /**
     * Личный кабинет --- Как удалить данные о себе?
     */
    private static final String question31Text = ".//*[@class='questions-detail']//*[text()='Как удалить данные о себе?']";
    private static final String question31Text2 = ".//*[@class='questions-detail']//*[text()='Письмо должно быть составлено четко по примеру ниже:']";
    private static final String question31Button = ".//*[@class='content-padding']/div[1]//*[text()='Получить деньги']";

    /**
     * Личный кабинет --- Возможно погасить кредит раньше срока в MyCredit?
     */
    private static final String question32Text = ".//*[@class='questions-detail']//*[text()='Возможно погасить кредит раньше срока в MyCredit? ']";
    private static final String question32Text2 = ".//*[@class='questions-detail']/p[2]";
    private static final String question32Button = ".//*[@class='content-padding']/div[1]//*[text()='Получить деньги']";

    /**
     * Как погасить/продлить кредит --- Возможно погашать кредит частями в MyCredit?
     */
    private static final String question33Text = ".//*[@class='questions-detail']//*[text()='Возможно погашать кредит частями в MyCredit?']";
    private static final String question33Text2 = ".//*[@class='questions-detail']//*[text()='Да, возможно погашать кредит удобными частям. Главное – погасить полностью кредит до основного срока погашения. В случае частичного погашения, проценты будут насчитываться только на размер непогашенной части кредита.']";
    private static final String question33Button = ".//*[@class='content-padding']/div[1]//*[text()='Получить деньги']";

    /**
     * Как погасить/продлить кредит --- Когда  возможно подать заявку на второй кредит?
     */
    private static final String question34Text = ".//*[@class='questions-detail']//*[text()='Когда  возможно подать заявку на второй кредит?']";
    private static final String question34Text2 = ".//*[@class='questions-detail']//*[text()='Повторно заявку на кредит вы сможете подать только после полного погашения первого кредита.']";
    private static final String question34Button = ".//*[@class='content-padding']/div[1]//*[text()='Получить деньги']";

    /**
     * Как погасить/продлить кредит --- Заявка на кредит была отклонена. Можно ли подать заявку еще раз?
     */
    private static final String question35Text = ".//*[@class='questions-detail']//*[text()='Заявка на кредит была отклонена. Можно ли подать заявку еще раз?']";
    private static final String question35Text2 = ".//*[@class='questions-detail']//*[text()='Перед тем как вынести решение учитываются многие факторы. Вы можете подать заявку на займ снова минимум через 30 дней с момента отказа.']";
    private static final String question35Button = ".//*[@class='content-padding']/div[1]//*[text()='Получить деньги']";

    /**
     * Как погасить/продлить кредит --- На сколько дней возможно продлить кредит?
     */
    private static final String question36Text = ".//*[@class='questions-detail']//*[text()='На сколько дней возможно продлить кредит?']";
    private static final String question36Text2 = ".//*[@class='questions-detail']//*[text()='Кредит может быть продлен на 7, 15, 30 или 45 дней за определенную плату, размер которой зависит от суммы первоначального кредита. Стоимость продления указана в личном кабинете заявителя.']";
    private static final String question36Button = ".//*[@class='content-padding']/div[1]//*[text()='Получить деньги']";

    /**
     * Как погасить/продлить кредит --- Почему мне отказали?
     */
    private static final String question37Text = ".//*[@class='questions-detail']//*[text()='Почему мне отказали?']";
    private static final String question37Text2 = ".//*[@class='questions-detail']//*[text()='Причину отказа верификаторы не разглашают, но, согласно правилам MyCredit, мы не сможем выдать вам займ, если:']";
    private static final String question37Button = ".//*[@class='content-padding']/div[1]//*[text()='Получить деньги']";

    /**
     * Программа лояльности --- Какие возможности дает программа лояльности?
     */
    private static final String question38Text = ".//*[@class='questions-detail']//*[text()='Какие возможности дает программа лояльности?']";
    private static final String question38Text2 = ".//*[@class='questions-detail']//*[text()='Все участники программы лояльности получают сразу несколько преимуществ:']";
    private static final String question38Button = ".//*[@class='content-padding']/div[1]//*[text()='Получить деньги']";

    /**
     * Программа лояльности --- Как стать участником программы?
     */
    private static final String question39Text = ".//*[@class='questions-detail']//*[text()='Как стать участником программы?']";
    private static final String question39Text2 = ".//*[@class='questions-detail']//*[text()='Участником программы лояльности автоматически становятся все действующие клиенты MyCredit. Программа активируется в вашем личном кабинете (кроме группы “Студенты” - см. подробнее ']";
    private static final String question39Button = ".//*[@class='content-padding']/div[1]//*[text()='Получить деньги']";

    /**
     * Программа лояльности --- Есть ли какие-то ограничения по бонусной системе?
     */
    private static final String question40Text = ".//*[@class='questions-detail']//*[text()='Есть ли какие-то ограничения по бонусной системе?']";
    private static final String question40Text2 = ".//*[@class='questions-detail']//*[text()='Для получения бонусов по программе лояльности, скидок и повышения суммы займа необходимо соблюдать несколько простых правил:']";
    private static final String question40Button = ".//*[@class='content-padding']/div[1]//*[text()='Получить деньги']";

    /**
     * Логирование
     */
    private static final Logger LOGGER1 = Logger.getLogger(Tests.FaqTest.class.getSimpleName());

    @Test
    public void faqQuestions1() {
        open();
        faqQuestion1Go();

        String Video = driver.findElement(By.xpath(".//*[@class='numbers-play--holder']//*[text()='Как взять кредит в MyCredit']")).getText();
        softAssert.assertEquals(Video, "Как взять кредит в MyCredit");
        softAssert.assertEquals(isElementXpathPresent(question1Video), true, "Элемент кнопка не найден Вопрос 1");
        softAssert.assertEquals(isElementXpathPresent(question1Button), true, "Элемент кнопка не найден Вопрос 1");
        softAssert.assertEquals(isElementXpathPresent(question1Text), true, "Элемент текст не найден Вопрос 1");

        softAssert.assertAll();
        LOGGER1.info("faqQuestions1" + " завершился Успешно");
    }

    @Test
    public void faqQuestions2() {
        open();
        faqQuestions2Go();

        softAssert.assertEquals(isElementXpathPresent(question2Button), true, "Элемент кнопка не найден Вопрос 2");
        softAssert.assertEquals(isElementXpathPresent(question2Text), true, "Элемент заголовок не найден Вопрос 2");
        softAssert.assertEquals(isElementXpathPresent(question2Text2), true, "Элемент текст не найден Вопрос 2");

        softAssert.assertAll();
        LOGGER1.info("faqQuestions2" + " завершился Успешно");
    }

    @Test
    public void faqQuestions3() {
        open();
        faqQuestions3Go();

        softAssert.assertEquals(isElementXpathPresent(question3Button), true, "Элемент кнопка не найден Вопрос 3");
        softAssert.assertEquals(isElementXpathPresent(question3Text), true, "Элемент заголовок не найден Вопрос 3");
        softAssert.assertEquals(isElementXpathPresent(question3Text2), true, "Элемент текст не найден Вопрос 3");

        softAssert.assertAll();
        LOGGER1.info("faqQuestions3" + " завершился Успешно");
    }

    @Test
    public void faqQuestions4() throws InterruptedException {
        open();
        faqQuestions4Go();

        softAssert.assertEquals(isElementXpathPresent(question4Text), true, "Элемент заголовок не найден Вопрос 4_1");
        softAssert.assertEquals(isElementXpathPresent(question4Text2), true, "Элемент текст не найден Вопрос 4_1");
        softAssert.assertEquals(isElementXpathPresent(question4Button), true, "Элемент кнопка не найден Вопрос 4_1");

        softAssert.assertAll();
        LOGGER1.info("faqQuestions4" + " завершился Успешно");
    }

    @Test
    public void faqQuestions5() throws InterruptedException {
        open();
        faqQuestions5Go();

        softAssert.assertEquals(isElementXpathPresent(question5Text), true, "Элемент заголовок не найден Вопрос 4");
        softAssert.assertEquals(isElementXpathPresent(question5Text2), true, "Элемент текст не найден Вопрос 4");
        softAssert.assertEquals(isElementXpathPresent(question5Button), true, "Элемент кнопка не найден Вопрос 4");

        softAssert.assertAll();
        LOGGER1.info("faqQuestions5" + " завершился Успешно");
    }

    @Test
    public void faqQuestions6() throws InterruptedException {
        open();
        faqQuestions6Go();

        softAssert.assertEquals(isElementXpathPresent(question6Button), true, "Элемент кнопка не найден Вопрос 5");
        softAssert.assertEquals(isElementXpathPresent(question6Text), true, "Элемент заголовок не найден Вопрос 5");
        softAssert.assertEquals(isElementXpathPresent(question6Text2), true, "Элемент текст не найден Вопрос 5");

        softAssert.assertAll();
        LOGGER1.info("faqQuestions6" + " завершился Успешно");
    }

    @Test
    public void faqQuestions7() throws InterruptedException {
        open();
        faqQuestions7Go();

        softAssert.assertEquals(isElementXpathPresent(question7Button), true, "Элемент кнопка не найден Вопрос 6");
        softAssert.assertEquals(isElementXpathPresent(question7Text), true, "Элемент заголовок не найден Вопрос 6");
        softAssert.assertEquals(isElementXpathPresent(question7Text2), true, "Элемент текст не найден Вопрос 6");

        softAssert.assertAll();
        LOGGER1.info("faqQuestions7" + " завершился Успешно");
    }

    @Test
    public void faqQuestions8() throws InterruptedException {
        open();
        faqQuestions8Go();

        softAssert.assertEquals(isElementXpathPresent(question8Button), true, "Элемент кнопка не найден Вопрос 7");
        softAssert.assertEquals(isElementXpathPresent(question8Text), true, "Элемент заголовок не найден Вопрос 7");
        softAssert.assertEquals(isElementXpathPresent(question8Text2), true, "Элемент текст не найден Вопрос 7");

        softAssert.assertAll();
        LOGGER1.info("faqQuestions8" + " завершился Успешно");
    }

    @Test
    public void faqQuestions9() throws InterruptedException {
        open();
        faqQuestions9Go();

        softAssert.assertEquals(isElementXpathPresent(question9Text), true, "Элемент заголовок не найден Вопрос 8");
        softAssert.assertEquals(isElementXpathPresent(question9Text2), true, "Элемент текст не найден Вопрос 8");
        softAssert.assertEquals(isElementXpathPresent(question9cityBlock), true, "Элемент блок городов не найден");
        softAssert.assertEquals(isElementXpathPresent(question9Button), true, "Элемент кнопка не найден Вопрос 8");

        softAssert.assertAll();
        LOGGER1.info("faqQuestions9" + " завершился Успешно");
    }

    @Test
    public void faqQuestions10() throws InterruptedException {
        open();
        faqQuestions10Go();

        softAssert.assertEquals(isElementXpathPresent(question10Button), true, "Элемент кнопка не найден Вопрос 9");
        softAssert.assertEquals(isElementXpathPresent(question10Text), true, "Элемент заголовок не найден Вопрос 9");
        softAssert.assertEquals(isElementXpathPresent(question10Text2), true, "Элемент текст не найден Вопрос 9");

        softAssert.assertAll();
        LOGGER1.info("faqQuestions10" + " завершился Успешно");
    }

    @Test
    public void faqQuestions11() throws InterruptedException {
        open();
        faqQuestions11Go();

        softAssert.assertEquals(isElementXpathPresent(question11Text), true, "Элемент заголовок не найден Вопрос 10");
        softAssert.assertEquals(isElementXpathPresent(question11Text2), true, "Элемент текст не найден Вопрос 10");
        softAssert.assertEquals(isElementXpathPresent(question11Button), true, "Элемент кнопка не найден Вопрос 10");

        softAssert.assertAll();
        LOGGER1.info("faqQuestions11" + " завершился Успешно");
    }


    @Test
    public void faqQuestions12() throws InterruptedException {
        open();
        faqQuestions12Go();

        softAssert.assertEquals(isElementXpathPresent(question12Button), true, "Элемент кнопка не найден Вопрос 11");
        softAssert.assertEquals(isElementXpathPresent(question12Text), true, "Элемент заголовок не найден Вопрос 11");
        softAssert.assertEquals(isElementXpathPresent(question12Text2), true, "Элемент текст не найден Вопрос 11");

        softAssert.assertAll();
        LOGGER1.info("faqQuestions12" + " завершился Успешно");
    }

    @Test
    public void faqQuestions13() throws InterruptedException {
        open();
        faqQuestions13Go();

        softAssert.assertEquals(isElementXpathPresent(question13Button), true, "Элемент кнопка не найден Вопрос 12");
        softAssert.assertEquals(isElementXpathPresent(question13Text), true, "Элемент заголовок не найден Вопрос 12");
        softAssert.assertEquals(isElementXpathPresent(question13Text2), true, "Элемент текст не найден Вопрос 12");

        softAssert.assertAll();
        LOGGER1.info("faqQuestions13" + " завершился Успешно");
    }

    @Test
    public void faqQuestions14() throws InterruptedException {
        open();
        faqQuestions14Go();

        softAssert.assertEquals(isElementXpathPresent(question14Button), true, "Элемент кнопка не найден Вопрос 13");
        softAssert.assertEquals(isElementXpathPresent(question14Text), true, "Элемент заголовок не найден Вопрос 13");
        softAssert.assertEquals(isElementXpathPresent(question14Text2), true, "Элемент текст не найден Вопрос 13");

        softAssert.assertAll();
        LOGGER1.info("faqQuestions14" + " завершился Успешно");
    }

    @Test
    public void faqQuestions15() {
        open();
        faqQuestions15Go();

        softAssert.assertEquals(isElementXpathPresent(question15Button), true, "Элемент кнопка не найден Вопрос 14");
        softAssert.assertEquals(isElementXpathPresent(question15Text), true, "Элемент заголовок не найден Вопрос 14");
        softAssert.assertEquals(isElementXpathPresent(question15Text2), true, "Элемент текст не найден Вопрос 14");

        softAssert.assertAll();
        LOGGER1.info("faqQuestions15" + " завершился Успешно");
    }

    @Test
    public void faqQuestions16() {
        open();
        faqQuestions16Go();

        softAssert.assertEquals(isElementXpathPresent(question16Button), true, "Элемент кнопка не найден Вопрос 15");
        softAssert.assertEquals(isElementXpathPresent(question16Text), true, "Элемент заголовок не найден Вопрос 15");
        softAssert.assertEquals(isElementXpathPresent(question16Text2), true, "Элемент текст не найден Вопрос 15");

        softAssert.assertAll();
        LOGGER1.info("faqQuestions16" + " завершился Успешно");
    }

    @Test
    public void faqQuestions17() {
        open();
        faqQuestions17Go();

        softAssert.assertEquals(isElementXpathPresent(question17Button), true, "Элемент кнопка не найден Вопрос 17");
        softAssert.assertEquals(isElementXpathPresent(question17Text), true, "Элемент заголовок не найден Вопрос 17");
        softAssert.assertEquals(isElementXpathPresent(question17Text2), true, "Элемент текст не найден Вопрос 17");

        softAssert.assertAll();
        LOGGER1.info("faqQuestions17" + " завершился Успешно");
    }

    @Test
    public void faqQuestions18() {
        open();
        faqQuestions18Go();

        softAssert.assertEquals(isElementXpathPresent(question18Button), true, "Элемент кнопка не найден Вопрос 18");
        softAssert.assertEquals(isElementXpathPresent(question18Text), true, "Элемент заголовок не найден Вопрос 18");
        softAssert.assertEquals(isElementXpathPresent(question18Text2), true, "Элемент текст не найден Вопрос 18");

        softAssert.assertAll();
        LOGGER1.info("faqQuestions18" + " завершился Успешно");
    }

    @Test
    public void faqQuestions19() throws InterruptedException {
        open();
        faqQuestions19Go();

        softAssert.assertEquals(isElementXpathPresent(question19Button), true, "Элемент кнопка не найден Вопрос 19");
        softAssert.assertEquals(isElementXpathPresent(question19Text), true, "Элемент заголовок не найден Вопрос 19");
        softAssert.assertEquals(isElementXpathPresent(question19Text2), true, "Элемент текст не найден Вопрос 19");

        softAssert.assertAll();
        LOGGER1.info("faqQuestions19" + " завершился Успешно");
    }

    @Test
    public void faqQuestions20() throws InterruptedException {
        open();
        faqQuestions20Go();

        softAssert.assertEquals(isElementXpathPresent(question20Button), true, "Элемент кнопка не найден Вопрос 20");
        softAssert.assertEquals(isElementXpathPresent(question20Text), true, "Элемент заголовок не найден Вопрос 20");
        softAssert.assertEquals(isElementXpathPresent(question20Text2), true, "Элемент текст не найден Вопрос 20");

        softAssert.assertAll();
        LOGGER1.info("faqQuestions20" + " завершился Успешно");
    }

    @Test
    public void faqQuestions21() throws InterruptedException {
        open();
        faqQuestions21Go();

        softAssert.assertEquals(isElementXpathPresent(question21Button), true, "Элемент кнопка не найден Вопрос 21");
        softAssert.assertEquals(isElementXpathPresent(question21Text), true, "Элемент заголовок не найден Вопрос 21");
        softAssert.assertEquals(isElementXpathPresent(question21Text2), true, "Элемент текст не найден Вопрос 21");

        softAssert.assertAll();
        LOGGER1.info("faqQuestions21" + " завершился Успешно");
    }

    @Test
    public void faqQuestions22() throws InterruptedException {
        open();
        faqQuestions22Go();

        softAssert.assertEquals(isElementXpathPresent(question22Button), true, "Элемент кнопка не найден Вопрос 22");
        softAssert.assertEquals(isElementXpathPresent(question22Text), true, "Элемент заголовок не найден Вопрос 22");
        softAssert.assertEquals(isElementXpathPresent(question22Text2), true, "Элемент текст не найден Вопрос 22");

        softAssert.assertAll();
        LOGGER1.info("faqQuestions22" + " завершился Успешно");
    }

    @Test
    public void faqQuestions23() throws InterruptedException {
        open();
        faqQuestions23Go();

        softAssert.assertEquals(isElementXpathPresent(question23Button), true, "Элемент кнопка не найден Вопрос 23");
        softAssert.assertEquals(isElementXpathPresent(question23Text), true, "Элемент заголовок не найден Вопрос 23");
        softAssert.assertEquals(isElementXpathPresent(question23Text2), true, "Элемент текст не найден Вопрос 23");

        softAssert.assertAll();
        LOGGER1.info("faqQuestions23" + " завершился Успешно");
    }

    @Test
    public void faqQuestions24() throws InterruptedException {
        open();
        faqQuestions24Go();

        softAssert.assertEquals(isElementXpathPresent(question24Button), true, "Элемент кнопка не найден Вопрос 24");
        softAssert.assertEquals(isElementXpathPresent(question24Text), true, "Элемент заголовок не найден Вопрос 24");
        softAssert.assertEquals(isElementXpathPresent(question24Text2), true, "Элемент текст не найден Вопрос 24");

        softAssert.assertAll();
        LOGGER1.info("faqQuestions24" + " завершился Успешно");
    }

    @Test
    public void faqQuestions25() throws InterruptedException {
        open();
        faqQuestions25Go();

        softAssert.assertEquals(isElementXpathPresent(question25Button), true, "Элемент кнопка не найден Вопрос 25");
        softAssert.assertEquals(isElementXpathPresent(question25Text), true, "Элемент заголовок не найден Вопрос 25");
        softAssert.assertEquals(isElementXpathPresent(question25Text2), true, "Элемент текст не найден Вопрос 25");

        softAssert.assertAll();
        LOGGER1.info("faqQuestions25" + " завершился Успешно");
    }

    @Test
    public void faqQuestions26() throws InterruptedException {
        open();
        faqQuestions26Go();

        softAssert.assertEquals(isElementXpathPresent(question26Button), true, "Элемент кнопка не найден Вопрос 26");
        softAssert.assertEquals(isElementXpathPresent(question26Text), true, "Элемент заголовок не найден Вопрос 26");
        softAssert.assertEquals(isElementXpathPresent(question26Text2), true, "Элемент текст не найден Вопрос 26");

        softAssert.assertAll();
        LOGGER1.info("faqQuestions26" + " завершился Успешно");
    }

    @Test
    public void faqQuestions27() throws InterruptedException {
        open();
        faqQuestions27Go();

        softAssert.assertEquals(isElementXpathPresent(question27Button), true, "Элемент кнопка не найден Вопрос 27");
        softAssert.assertEquals(isElementXpathPresent(question27Text), true, "Элемент заголовок не найден Вопрос 27");
        softAssert.assertEquals(isElementXpathPresent(question27Text2), true, "Элемент текст не найден Вопрос 27");

        softAssert.assertAll();
        LOGGER1.info("faqQuestions27" + " завершился Успешно");
    }

    @Test
    public void faqQuestions28() throws InterruptedException {
        open();
        faqQuestions28Go();

        softAssert.assertEquals(isElementXpathPresent(question28Button), true, "Элемент кнопка не найден Вопрос 28");
        softAssert.assertEquals(isElementXpathPresent(question28Text), true, "Элемент заголовок не найден Вопрос 28");
        softAssert.assertEquals(isElementXpathPresent(question28Text2), true, "Элемент текст не найден Вопрос 28");

        softAssert.assertAll();
        LOGGER1.info("faqQuestions28" + " завершился Успешно");
    }

    @Test
    public void faqQuestions29() throws InterruptedException {
        open();
        faqQuestions29Go();

        softAssert.assertEquals(isElementXpathPresent(question29Button), true, "Элемент кнопка не найден Вопрос 29");
        softAssert.assertEquals(isElementXpathPresent(question29Text), true, "Элемент заголовок не найден Вопрос 29");
        softAssert.assertEquals(isElementXpathPresent(question29Text2), true, "Элемент текст не найден Вопрос 29");

        softAssert.assertAll();
        LOGGER1.info("faqQuestions29" + " завершился Успешно");
    }

    @Test
    public void faqQuestions30() throws InterruptedException {
        open();
        faqQuestions30Go();

        softAssert.assertEquals(isElementXpathPresent(question30Button), true, "Элемент кнопка не найден Вопрос 30");
        softAssert.assertEquals(isElementXpathPresent(question30Text), true, "Элемент заголовок не найден Вопрос 30");
        softAssert.assertEquals(isElementXpathPresent(question30Text2), true, "Элемент текст не найден Вопрос 30");

        softAssert.assertAll();
        LOGGER1.info("faqQuestions30" + " завершился Успешно");
    }

    @Test
    public void faqQuestions31() throws InterruptedException {
        open();
        faqQuestions31Go();

        softAssert.assertEquals(isElementXpathPresent(question31Button), true, "Элемент кнопка не найден Вопрос 31");
        softAssert.assertEquals(isElementXpathPresent(question31Text), true, "Элемент заголовок не найден Вопрос 31");
        softAssert.assertEquals(isElementXpathPresent(question31Text2), true, "Элемент текст не найден Вопрос 31");

        softAssert.assertAll();
        LOGGER1.info("faqQuestions31" + " завершился Успешно");
    }

    @Test
    public void faqQuestions32() throws InterruptedException {
        open();
        faqQuestions32Go();

        softAssert.assertEquals(isElementXpathPresent(question32Button), true, "Элемент кнопка не найден Вопрос 32");
        softAssert.assertEquals(isElementXpathPresent(question32Text), true, "Элемент заголовок не найден Вопрос 32");
        softAssert.assertEquals(isElementXpathPresent(question32Text2), true, "Элемент текст не найден Вопрос 32");

        softAssert.assertAll();
        LOGGER1.info("faqQuestions32" + " завершился Успешно");
    }

    @Test
    public void faqQuestions33() throws InterruptedException {
        open();
        faqQuestions33Go();

        softAssert.assertEquals(isElementXpathPresent(question33Button), true, "Элемент кнопка не найден Вопрос 33");
        softAssert.assertEquals(isElementXpathPresent(question33Text), true, "Элемент заголовок не найден Вопрос 33");
        softAssert.assertEquals(isElementXpathPresent(question33Text2), true, "Элемент текст не найден Вопрос 33");

        softAssert.assertAll();
        LOGGER1.info("faqQuestions33" + " завершился Успешно");
    }

    @Test
    public void faqQuestions34() throws InterruptedException {
        open();
        faqQuestions34Go();

        softAssert.assertEquals(isElementXpathPresent(question34Button), true, "Элемент кнопка не найден Вопрос 34");
        softAssert.assertEquals(isElementXpathPresent(question34Text), true, "Элемент заголовок не найден Вопрос 34");
        softAssert.assertEquals(isElementXpathPresent(question34Text2), true, "Элемент текст не найден Вопрос 34");

        softAssert.assertAll();
        LOGGER1.info("faqQuestions34" + " завершился Успешно");
    }

    @Test
    public void faqQuestions35() throws InterruptedException {
        open();
        faqQuestions35Go();

        softAssert.assertEquals(isElementXpathPresent(question35Button), true, "Элемент кнопка не найден Вопрос 35");
        softAssert.assertEquals(isElementXpathPresent(question35Text), true, "Элемент заголовок не найден Вопрос 35");
        softAssert.assertEquals(isElementXpathPresent(question35Text2), true, "Элемент текст не найден Вопрос 35");

        softAssert.assertAll();
        LOGGER1.info("faqQuestions35" + " завершился Успешно");
    }

    @Test
    public void faqQuestions36() throws InterruptedException {
        open();
        faqQuestions36Go();

        softAssert.assertEquals(isElementXpathPresent(question36Button), true, "Элемент кнопка не найден Вопрос 36");
        softAssert.assertEquals(isElementXpathPresent(question36Text), true, "Элемент заголовок не найден Вопрос 36");
        softAssert.assertEquals(isElementXpathPresent(question36Text2), true, "Элемент текст не найден Вопрос 36");

        softAssert.assertAll();
        LOGGER1.info("faqQuestions36" + " завершился Успешно");
    }

    @Test
    public void faqQuestions37() throws InterruptedException {
        open();
        faqQuestions37Go();

        softAssert.assertEquals(isElementXpathPresent(question37Button), true, "Элемент кнопка не найден Вопрос 37");
        softAssert.assertEquals(isElementXpathPresent(question37Text), true, "Элемент заголовок не найден Вопрос 37");
        softAssert.assertEquals(isElementXpathPresent(question37Text2), true, "Элемент текст не найден Вопрос 37");

        softAssert.assertAll();
        LOGGER1.info("faqQuestions37" + " завершился Успешно");
    }

    @Test
    public void faqQuestions38() throws InterruptedException {
        open();
        faqQuestions38Go();

        softAssert.assertEquals(isElementXpathPresent(question38Button), true, "Элемент кнопка не найден Вопрос 37");
        softAssert.assertEquals(isElementXpathPresent(question38Text), true, "Элемент заголовок не найден Вопрос 37");
        softAssert.assertEquals(isElementXpathPresent(question38Text2), true, "Элемент текст не найден Вопрос 37");

        softAssert.assertAll();
        LOGGER1.info("faqQuestions38" + " завершился Успешно");
    }

    @Test
    public void faqQuestions39() throws InterruptedException {
        open();
        faqQuestions39Go();

        softAssert.assertEquals(isElementXpathPresent(question39Button), true, "Элемент кнопка не найден Вопрос 37");
        softAssert.assertEquals(isElementXpathPresent(question39Text), true, "Элемент заголовок не найден Вопрос 37");
        softAssert.assertEquals(isElementXpathPresent(question39Text2), true, "Элемент текст не найден Вопрос 37");

        softAssert.assertAll();
        LOGGER1.info("faqQuestions39" + " завершился Успешно");
    }

    @Test
    public void faqQuestions40() throws InterruptedException {
        open();
        faqQuestions40Go();

        softAssert.assertEquals(isElementXpathPresent(question40Button), true, "Элемент кнопка не найден Вопрос 37");
        softAssert.assertEquals(isElementXpathPresent(question40Text), true, "Элемент заголовок не найден Вопрос 37");
        softAssert.assertEquals(isElementXpathPresent(question40Text2), true, "Элемент текст не найден Вопрос 37");

        softAssert.assertAll();
        LOGGER1.info("faqQuestions40" + " завершился Успешно");
    }

    @Test
    public void faqQuestions1ButtonGo() {
        open();
        faqQuestion1Go();
        deleteHeader();
        driver.findElement(By.xpath(question1Button)).click();

        softAssert.assertEquals(driver.getCurrentUrl(), urlReg, "Кнопка получить деньги не перенаправила на регистрацию");

        softAssert.assertAll();
        LOGGER1.info("faqQuestions1ButtonGo" + " завершился Успешно");
    }

    @Test
    public void faqQuestions2ButtonGo() {
        open();
        faqQuestions2Go();
        driver.findElement(By.xpath(question2Button)).click();

        softAssert.assertEquals(driver.getCurrentUrl(), urlReg, "Кнопка получить деньги не перенаправила на регистрацию");

        softAssert.assertAll();
        LOGGER1.info("faqQuestions2ButtonGo" + " завершился Успешно");
    }

    @Test
    public void faqQuestions3ButtonGo() {
        open();
        faqQuestions3Go();
        driver.findElement(By.xpath(question3Button)).click();

        softAssert.assertEquals(driver.getCurrentUrl(), urlReg, "Кнопка получить деньги не перенаправила на регистрацию");

        softAssert.assertAll();
        LOGGER1.info("faqQuestions3ButtonGo" + " завершился Успешно");
    }

    @Test
    public void faqQuestions4ButtonGo() throws InterruptedException {
        open();
        faqQuestions4Go();
        driver.findElement(By.xpath(question4Button)).click();


        softAssert.assertEquals(driver.getCurrentUrl(), urlReg, "Кнопка получить деньги не перенаправила на регистрацию");

        softAssert.assertAll();
        LOGGER1.info("faqQuestions4ButtonGo" + " завершился Успешно");
    }

    @Test
    public void faqQuestions5ButtonGo() throws InterruptedException {
        open();
        faqQuestions5Go();
        driver.findElement(By.xpath(question5Button)).click();

        softAssert.assertEquals(driver.getCurrentUrl(), urlReg, "Кнопка получить деньги не перенаправила на регистрацию");

        softAssert.assertAll();
        LOGGER1.info("faqQuestions5ButtonGo" + " завершился Успешно");
    }

    @Test
    public void faqQuestions6ButtonGo() throws InterruptedException {
        open();
        faqQuestions6Go();
        driver.findElement(By.xpath(question6Button)).click();

        softAssert.assertEquals(driver.getCurrentUrl(), urlReg, "Кнопка получить деньги не перенаправила на регистрацию");

        softAssert.assertAll();
        LOGGER1.info("faqQuestions6ButtonGo" + " завершился Успешно");
    }

    @Test
    public void faqQuestions7ButtonGo() throws InterruptedException {
        open();
        faqQuestions7Go();
        driver.findElement(By.xpath(question7Button)).click();

        softAssert.assertEquals(driver.getCurrentUrl(), urlReg, "Кнопка получить деньги не перенаправила на регистрацию");

        softAssert.assertAll();
        LOGGER1.info("faqQuestions7ButtonGo" + " завершился Успешно");
    }

    @Test
    public void faqQuestions8ButtonGo() throws InterruptedException {
        open();
        faqQuestions8Go();
        driver.findElement(By.xpath(question8Button)).click();

        softAssert.assertEquals(driver.getCurrentUrl(), urlReg, "Кнопка получить деньги не перенаправила на регистрацию");

        softAssert.assertAll();
        LOGGER1.info("faqQuestions8ButtonGo" + " завершился Успешно");
    }

    @Test
    public void faqQuestions9ButtonGo() throws InterruptedException {
        open();
        faqQuestions9Go();
        driver.findElement(By.xpath(question9Button)).click();

        softAssert.assertEquals(driver.getCurrentUrl(), urlReg, "Кнопка получить деньги не перенаправила на регистрацию");

        softAssert.assertAll();
        LOGGER1.info("faqQuestions9ButtonGo" + " завершился Успешно");
    }

    @Test
    public void faqQuestions10ButtonGo() throws InterruptedException {
        open();
        faqQuestions10Go();
        driver.findElement(By.xpath(question10Button)).click();

        softAssert.assertEquals(driver.getCurrentUrl(), urlReg, "Кнопка получить деньги не перенаправила на регистрацию");

        softAssert.assertAll();
        LOGGER1.info("faqQuestions10ButtonGo" + " завершился Успешно");
    }

    @Test
    public void faqQuestions11ButtonGo() throws InterruptedException {
        open();
        faqQuestions11Go();
        driver.findElement(By.xpath(question11Button)).click();

        softAssert.assertEquals(driver.getCurrentUrl(), urlReg, "Кнопка получить деньги не перенаправила на регистрацию");

        softAssert.assertAll();
        LOGGER1.info("faqQuestions11ButtonGo" + " завершился Успешно");
    }

    @Test
    public void faqQuestions12ButtonGo() throws InterruptedException {
        open();
        faqQuestions12Go();
        driver.findElement(By.xpath(question12Button)).click();

        softAssert.assertEquals(driver.getCurrentUrl(), urlReg, "Кнопка получить деньги не перенаправила на регистрацию");

        softAssert.assertAll();
        LOGGER1.info("faqQuestions12ButtonGo" + " завершился Успешно");
    }

    @Test
    public void faqQuestions13ButtonGo() throws InterruptedException {
        open();
        faqQuestions13Go();
        driver.findElement(By.xpath(question13Button)).click();

        softAssert.assertEquals(driver.getCurrentUrl(), urlReg, "Кнопка получить деньги не перенаправила на регистрацию");

        softAssert.assertAll();
        LOGGER1.info("faqQuestions13ButtonGo" + " завершился Успешно");
    }

    @Test
    public void faqQuestions14ButtonGo() throws InterruptedException {
        open();
        faqQuestions14Go();
        driver.findElement(By.xpath(question14Button)).click();

        softAssert.assertEquals(driver.getCurrentUrl(), urlReg, "Кнопка получить деньги не перенаправила на регистрацию");

        softAssert.assertAll();
        LOGGER1.info("faqQuestions14ButtonGo" + " завершился Успешно");
    }

    @Test
    public void faqQuestions15ButtonGo() throws InterruptedException {
        open();
        faqQuestions15Go();
        driver.findElement(By.xpath(question15Button)).click();

        softAssert.assertEquals(driver.getCurrentUrl(), urlReg, "Кнопка получить деньги не перенаправила на регистрацию");

        softAssert.assertAll();
        LOGGER1.info("faqQuestions15ButtonGo" + " завершился Успешно");
    }

    @Test
    public void faqQuestions16ButtonGo() throws InterruptedException {
        open();
        faqQuestions16Go();
        driver.findElement(By.xpath(question16Button)).click();

        softAssert.assertEquals(driver.getCurrentUrl(), urlReg, "Кнопка получить деньги не перенаправила на регистрацию");

        softAssert.assertAll();
        LOGGER1.info("faqQuestions16ButtonGo" + " завершился Успешно");
    }

    @Test
    public void faqQuestions17ButtonGo() throws InterruptedException {
        open();
        faqQuestions17Go();
        driver.findElement(By.xpath(question17Button)).click();

        softAssert.assertEquals(driver.getCurrentUrl(), urlReg, "Кнопка получить деньги не перенаправила на регистрацию");

        softAssert.assertAll();
        LOGGER1.info("faqQuestions17ButtonGo" + " завершился Успешно");
    }

    @Test
    public void faqQuestions18ButtonGo() throws InterruptedException {
        open();
        faqQuestions18Go();
        driver.findElement(By.xpath(question18Button)).click();

        softAssert.assertEquals(driver.getCurrentUrl(), urlReg, "Кнопка получить деньги не перенаправила на регистрацию");

        softAssert.assertAll();
        LOGGER1.info("faqQuestions18ButtonGo" + " завершился Успешно");
    }

    @Test
    public void faqQuestions19ButtonGo() throws InterruptedException {
        open();
        faqQuestions19Go();
        driver.findElement(By.xpath(question19Button)).click();

        softAssert.assertEquals(driver.getCurrentUrl(), urlReg, "Кнопка получить деньги не перенаправила на регистрацию");

        softAssert.assertAll();
        LOGGER1.info("faqQuestions19ButtonGo" + " завершился Успешно");
    }

    @Test
    public void faqQuestions20ButtonGo() throws InterruptedException {
        open();
        faqQuestions20Go();
        driver.findElement(By.xpath(question20Button)).click();

        softAssert.assertEquals(driver.getCurrentUrl(), urlReg, "Кнопка получить деньги не перенаправила на регистрацию");

        softAssert.assertAll();
        LOGGER1.info("faqQuestions20ButtonGo" + " завершился Успешно");
    }

    @Test
    public void faqQuestions21ButtonGo() throws InterruptedException {
        open();
        faqQuestions21Go();
        driver.findElement(By.xpath(question21Button)).click();

        softAssert.assertEquals(driver.getCurrentUrl(), urlReg, "Кнопка получить деньги не перенаправила на регистрацию");

        softAssert.assertAll();
        LOGGER1.info("faqQuestions21ButtonGo" + " завершился Успешно");
    }

    @Test
    public void faqQuestions22ButtonGo() throws InterruptedException {
        open();
        faqQuestions22Go();
        driver.findElement(By.xpath(question22Button)).click();

        softAssert.assertEquals(driver.getCurrentUrl(), urlReg, "Кнопка получить деньги не перенаправила на регистрацию");

        softAssert.assertAll();
        LOGGER1.info("faqQuestions22ButtonGo" + " завершился Успешно");
    }


    @Test
    public void faqQuestions23ButtonGo() throws InterruptedException {
        open();
        faqQuestions23Go();
        driver.findElement(By.xpath(question23Button)).click();

        softAssert.assertEquals(driver.getCurrentUrl(), urlReg, "Кнопка получить деньги не перенаправила на регистрацию");

        softAssert.assertAll();
        LOGGER1.info("faqQuestions23ButtonGo" + " завершился Успешно");
    }

    @Test
    public void faqQuestions24ButtonGo() throws InterruptedException {
        open();
        faqQuestions24Go();
        driver.findElement(By.xpath(question24Button)).click();

        softAssert.assertEquals(driver.getCurrentUrl(), urlReg, "Кнопка получить деньги не перенаправила на регистрацию");

        softAssert.assertAll();
        LOGGER1.info("faqQuestions24ButtonGo" + " завершился Успешно");
    }

    @Test
    public void faqQuestions25ButtonGo() throws InterruptedException {
        open();
        faqQuestions25Go();
        driver.findElement(By.xpath(question25Button)).click();

        softAssert.assertEquals(driver.getCurrentUrl(), urlReg, "Кнопка получить деньги не перенаправила на регистрацию");

        softAssert.assertAll();
        LOGGER1.info("faqQuestions25ButtonGo" + " завершился Успешно");
    }

    @Test
    public void faqQuestions26ButtonGo() throws InterruptedException {
        open();
        faqQuestions26Go();
        driver.findElement(By.xpath(question26Button)).click();

        softAssert.assertEquals(driver.getCurrentUrl(), urlReg, "Кнопка получить деньги не перенаправила на регистрацию");

        softAssert.assertAll();
        LOGGER1.info("faqQuestions26ButtonGo" + " завершился Успешно");
    }

    @Test
    public void faqQuestions27ButtonGo() throws InterruptedException {
        open();
        faqQuestions27Go();
        driver.findElement(By.xpath(question27Button)).click();

        softAssert.assertEquals(driver.getCurrentUrl(), "https://mycredit.ua/ru/faq/lichnyj-kabinet1/lichnyj-kabinet2/", "Кнопка получить деньги не перенаправила на регистрацию");

        softAssert.assertAll();
        LOGGER1.info("faqQuestions27ButtonGo" + " завершился Успешно");
    }

    @Test
    public void faqQuestions28ButtonGo() throws InterruptedException {
        open();
        faqQuestions28Go();
        driver.findElement(By.xpath(question28Button)).click();

        softAssert.assertEquals(driver.getCurrentUrl(), urlReg, "Кнопка получить деньги не перенаправила на регистрацию");

        softAssert.assertAll();
        LOGGER1.info("faqQuestions28ButtonGo" + " завершился Успешно");
    }

    @Test
    public void faqQuestions29ButtonGo() throws InterruptedException {
        open();
        faqQuestions29Go();
        driver.findElement(By.xpath(question29Button)).click();

        softAssert.assertEquals(driver.getCurrentUrl(), urlReg, "Кнопка получить деньги не перенаправила на регистрацию");

        softAssert.assertAll();
        LOGGER1.info("faqQuestions29ButtonGo" + " завершился Успешно");
    }

    @Test
    public void faqQuestions30ButtonGo() throws InterruptedException {
        open();
        faqQuestions30Go();
        driver.findElement(By.xpath(question30Button)).click();

        softAssert.assertEquals(driver.getCurrentUrl(), urlReg, "Кнопка получить деньги не перенаправила на регистрацию");

        softAssert.assertAll();
        LOGGER1.info("faqQuestions30ButtonGo" + " завершился Успешно");
    }

    @Test
    public void faqQuestions31ButtonGo() throws InterruptedException {
        open();
        faqQuestions31Go();
        driver.findElement(By.xpath(question31Button)).click();

        softAssert.assertEquals(driver.getCurrentUrl(), urlReg, "Кнопка получить деньги не перенаправила на регистрацию");

        softAssert.assertAll();
        LOGGER1.info("faqQuestions31ButtonGo" + " завершился Успешно");
    }

    @Test
    public void faqQuestions32ButtonGo() throws InterruptedException {
        open();
        faqQuestions32Go();
        driver.findElement(By.xpath(question32Button)).click();

        softAssert.assertEquals(driver.getCurrentUrl(), urlReg, "Кнопка получить деньги не перенаправила на регистрацию");

        softAssert.assertAll();
        LOGGER1.info("faqQuestions32ButtonGo" + " завершился Успешно");
    }

    @Test
    public void faqQuestions33ButtonGo() throws InterruptedException {
        open();
        faqQuestions33Go();
        driver.findElement(By.xpath(question33Button)).click();

        softAssert.assertEquals(driver.getCurrentUrl(), urlReg, "Кнопка получить деньги не перенаправила на регистрацию");

        softAssert.assertAll();
        LOGGER1.info("faqQuestions33ButtonGo" + " завершился Успешно");
    }

    @Test
    public void faqQuestions34ButtonGo() throws InterruptedException {
        open();
        faqQuestions34Go();
        driver.findElement(By.xpath(question34Button)).click();

        softAssert.assertEquals(driver.getCurrentUrl(), urlReg, "Кнопка получить деньги не перенаправила на регистрацию");

        softAssert.assertAll();
        LOGGER1.info("faqQuestions34ButtonGo" + " завершился Успешно");
    }

    @Test
    public void faqQuestions35ButtonGo() throws InterruptedException {
        open();
        faqQuestions35Go();
        driver.findElement(By.xpath(question35Button)).click();

        softAssert.assertEquals(driver.getCurrentUrl(), urlReg, "Кнопка получить деньги не перенаправила на регистрацию");

        softAssert.assertAll();
        LOGGER1.info("faqQuestions35ButtonGo" + " завершился Успешно");
    }

    @Test
    public void faqQuestions36ButtonGo() throws InterruptedException {
        open();
        faqQuestions36Go();
        driver.findElement(By.xpath(question36Button)).click();

        softAssert.assertEquals(driver.getCurrentUrl(), urlReg, "Кнопка получить деньги не перенаправила на регистрацию");

        softAssert.assertAll();
        LOGGER1.info("faqQuestions36ButtonGo" + " завершился Успешно");
    }

    @Test
    public void faqQuestions37ButtonGo() throws InterruptedException {
        open();
        faqQuestions37Go();
        driver.findElement(By.xpath(question37Button)).click();

        softAssert.assertEquals(driver.getCurrentUrl(), urlReg, "Кнопка получить деньги не перенаправила на регистрацию");

        softAssert.assertAll();
        LOGGER1.info("faqQuestions37ButtonGo" + " завершился Успешно");
    }

    @Test
    public void faqQuestions38ButtonGo() throws InterruptedException {
        open();
        faqQuestions38Go();
        driver.findElement(By.xpath(question38Button)).click();

        softAssert.assertEquals(driver.getCurrentUrl(), urlReg, "Кнопка получить деньги не перенаправила на регистрацию");

        softAssert.assertAll();
        LOGGER1.info("faqQuestions38ButtonGo" + " завершился Успешно");
    }

    @Test
    public void faqQuestions39ButtonGo() throws InterruptedException {
        open();
        faqQuestions39Go();
        driver.findElement(By.xpath(question39Button)).click();

        softAssert.assertEquals(driver.getCurrentUrl(), urlReg, "Кнопка получить деньги не перенаправила на регистрацию");

        softAssert.assertAll();
        LOGGER1.info("faqQuestions39ButtonGo" + " завершился Успешно");
    }

    @Test
    public void faqQuestions40ButtonGo() throws InterruptedException {
        open();
        faqQuestions40Go();
        driver.findElement(By.xpath(question40Button)).click();

        softAssert.assertEquals(driver.getCurrentUrl(), urlReg, "Кнопка получить деньги не перенаправила на регистрацию");

        softAssert.assertAll();
        LOGGER1.info("faqQuestions40ButtonGo" + " завершился Успешно");
    }

}
