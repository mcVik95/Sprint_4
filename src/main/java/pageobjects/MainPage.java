package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage {

    private static WebDriver driver;
    private static WebDriverWait wait;

    public MainPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    private static final String openSiteRentSamokats = "https://qa-scooter.praktikum-services.ru/";
    private static final By cookieButton = By.id("rcc-confirm-button");
    private static final By topOrderButton = By.xpath("//button[@class='Button_Button__ra12g']");
    private static final By middleOrderButton = By.xpath("//button[@class='Button_Button__ra12g Button_UltraBig__UU3Lp']");

    public void openSite(){
        driver.get(openSiteRentSamokats);
    }

    public void clickCookie() {
        driver.findElement(cookieButton).click();
    }

    public void clickButtonOrder(String buttonType) {
        if (buttonType.equals("верхняя")) {
            driver.findElement(topOrderButton).click();
        } else {
            driver.findElement(middleOrderButton).click();
        }
    }

    public static void clickAccordionHeaderByQuestionText(String questionText) {
        WebElement button = driver.findElement(
                By.xpath("//div[contains(@class, 'accordion__button') and contains(text(), '" + questionText + "')]")
        );
        button.click();
    }

    public static String getAccordionPanelTextByQuestionText(String questionText) {
        WebElement button = driver.findElement(
                By.xpath("//div[contains(@class, 'accordion__button') and contains(text(), '" + questionText + "')]")
        );
        String panelId = button.getAttribute("aria-controls");
        WebElement panel = driver.findElement(By.id(panelId));
        wait.until(ExpectedConditions.visibilityOf(panel));
        return panel.getText();
    }
}
