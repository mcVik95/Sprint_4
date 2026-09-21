import org.junit.Rule;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageObjects.MainPage;
import static org.junit.Assert.assertEquals;


public class YandexSamokatQuestionPanelTests {

    private WebDriver driver;

    @Rule
    public DriverFactory driverFactory = new DriverFactory();


    @Test
    public void correctTextFirstQuestionsPanelTest(){
        driver = driverFactory.getDriver();
        MainPage mainPage = new MainPage(driver);
        mainPage.openSite();
        mainPage.scrollMainPageForQuestions();
        mainPage.clickFirstQuestionPanel();
        assertEquals("Не верный текст вопроса!", "Сколько это стоит? И как оплатить?",
                driver.findElement(By.xpath("//div[@id='accordion__heading-0']")).getText());
        assertEquals("Не верный текст в инфо поле!", "Сутки — 400 рублей. Оплата курьеру — наличными или картой.",
                driver.findElement(By.xpath("//div[@id='accordion__panel-0']")).getText());
    }

    @Test
    public void correctTextSecondQuestionsPanelTest(){
        driver = driverFactory.getDriver();
        MainPage mainPage = new MainPage(driver);
        mainPage.openSite();
        mainPage.scrollMainPageForQuestions();
        mainPage.clickSecondQuestionPanel();
        assertEquals("Не верный текст вопроса!", "Хочу сразу несколько самокатов! Так можно?",
                driver.findElement(By.xpath("//div[@id='accordion__heading-1']")).getText());
        assertEquals("Не верный текст в инфо поле!", "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.",
                driver.findElement(By.xpath("//div[@id='accordion__panel-1']")).getText());
    }

    @Test
    public void correctTextThirdQuestionsPanelTest(){
        driver = driverFactory.getDriver();
        MainPage mainPage = new MainPage(driver);
        mainPage.openSite();
        mainPage.scrollMainPageForQuestions();
        mainPage.clickThirdQuestionPanel();
        assertEquals("Не верный текст вопроса!", "Как рассчитывается время аренды?",
                driver.findElement(By.xpath("//div[@id='accordion__heading-2']")).getText());
        assertEquals("Не верный текст в инфо поле!", "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.",
                driver.findElement(By.xpath("//div[@id='accordion__panel-2']")).getText());
    }

    @Test
    public void correctTextFourthQuestionsPanelTest(){
        driver = driverFactory.getDriver();
        MainPage mainPage = new MainPage(driver);
        mainPage.openSite();
        mainPage.scrollMainPageForQuestions();
        mainPage.clickFourthQuestionPanel();
        assertEquals("Не верный текст вопроса!", "Можно ли заказать самокат прямо на сегодня?",
                driver.findElement(By.xpath("//div[@id='accordion__heading-3']")).getText());
        assertEquals("Не верный текст в инфо поле!", "Только начиная с завтрашнего дня. Но скоро станем расторопнее.",
                driver.findElement(By.xpath("//div[@id='accordion__panel-3']")).getText());
    }

    @Test
    public void correctTextFifthQuestionsPanelTest(){
        driver = driverFactory.getDriver();
        MainPage mainPage = new MainPage(driver);
        mainPage.openSite();
        mainPage.scrollMainPageForQuestions();
        mainPage.clickFifthQuestionPanel();
        assertEquals("Не верный текст вопроса!", "Можно ли продлить заказ или вернуть самокат раньше?",
                driver.findElement(By.xpath("//div[@id='accordion__heading-4']")).getText());
        assertEquals("Не верный текст в инфо поле!", "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.",
                driver.findElement(By.xpath("//div[@id='accordion__panel-4']")).getText());
    }

    @Test
    public void correctTextSixthQuestionsPanelTest(){
        driver = driverFactory.getDriver();
        MainPage mainPage = new MainPage(driver);
        mainPage.openSite();
        mainPage.scrollMainPageForQuestions();
        mainPage.clickSixthQuestionPanel();
        assertEquals("Не верный текст вопроса!", "Вы привозите зарядку вместе с самокатом?",
                driver.findElement(By.xpath("//div[@id='accordion__heading-5']")).getText());
        assertEquals("Не верный текст в инфо поле!", "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.",
                driver.findElement(By.xpath("//div[@id='accordion__panel-5']")).getText());
    }

    @Test
    public void correctTextSeventhQuestionsPanelTest(){
        driver = driverFactory.getDriver();
        MainPage mainPage = new MainPage(driver);
        mainPage.openSite();
        mainPage.scrollMainPageForQuestions();
        mainPage.clickSeventhQuestionPanel();
        assertEquals("Не верный текст вопроса!", "Можно ли отменить заказ?",
                driver.findElement(By.xpath("//div[@id='accordion__heading-6']")).getText());
        assertEquals("Не верный текст в инфо поле!", "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.",
                driver.findElement(By.xpath("//div[@id='accordion__panel-6']")).getText());
    }

    @Test
    public void correctTextEighthQuestionsPanelTest(){
        driver = driverFactory.getDriver();
        MainPage mainPage = new MainPage(driver);
        mainPage.openSite();
        mainPage.scrollMainPageForQuestions();
        mainPage.clickEighthQuestionPanel();
        assertEquals("Не верный текст вопроса!", "Я жизу за МКАДом, привезёте?",
                driver.findElement(By.xpath("//div[@id='accordion__heading-7']")).getText());
        assertEquals("Не верный текст в инфо поле!", "Да, обязательно. Всем самокатов! И Москве, и Московской области.",
                driver.findElement(By.xpath("//div[@id='accordion__panel-7']")).getText());
    }

}
