package questions;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import pageobjects.DriverFactory;
import pageobjects.MainPage;

@RunWith(Enclosed.class)
public class YandexSamokatQuestionPanelTests {

    @RunWith(Parameterized.class)
    public static class QuestionsYandexSamokatTests {

        private WebDriver driver;
        private final String questionText;
        private final String expectedAnswer;

        public QuestionsYandexSamokatTests(String questionText, String expectedAnswer) {
            this.questionText = questionText;
            this.expectedAnswer = expectedAnswer;
        }

        @Parameterized.Parameters(name = "Вопрос: {0}")
        public static Object[][] getQuestionsYandexSamokat() {
            return new Object[][] {
                    {"Сколько это стоит? И как оплатить?", "Сутки — 400 рублей. Оплата курьеру — наличными или картой."},
                    {"Хочу сразу несколько самокатов! Так можно?", "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим."},
                    {"Как рассчитывается время аренды?", "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30."},
                    {"Можно ли заказать самокат прямо на сегодня?", "Только начиная с завтрашнего дня. Но скоро станем расторопнее."},
                    {"Можно ли продлить заказ или вернуть самокат раньше?", "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010."},
                    {"Вы привозите зарядку вместе с самокатом?", "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится."},
                    {"Можно ли отменить заказ?", "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои."},
                    {"Я жизу за МКАДом, привезёте?", "Да, обязательно. Всем самокатов! И Москве, и Московской области."},
            };
        }

        @Rule
        public DriverFactory driverFactory = new DriverFactory();


        @Test
        public void testQuestionsYandexSamokat() {
            driver = driverFactory.getDriver();
            MainPage mainPage = new MainPage(driver);
            mainPage.openSite();
            mainPage.clickCookie();
            MainPage.clickAccordionHeaderByQuestionText(questionText);
            String actualAnswer = MainPage.getAccordionPanelTextByQuestionText(questionText);
            Assert.assertEquals("Текст ответа должен совпадать!", expectedAnswer, actualAnswer);
        }
    }
}
