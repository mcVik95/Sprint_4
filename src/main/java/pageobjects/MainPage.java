package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {

    private WebDriver driver;

    public MainPage(WebDriver driver){
        this.driver = driver;
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

    public void clickQuestion(String questionId) {
        driver.findElement(By.id(questionId)).click();

    }

    public void clickButtonOrder(String buttonType) {
        if (buttonType.equals("верхняя")) {
            driver.findElement(topOrderButton).click();
        } else {
            driver.findElement(middleOrderButton).click();
        }
    }

    public String getAnswerText(String panelId) {
        return driver.findElement(By.id(panelId)).getText();
    }
}
