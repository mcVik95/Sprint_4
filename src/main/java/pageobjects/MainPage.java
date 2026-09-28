package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {

    private WebDriver driver;

    public MainPage(WebDriver driver){
        this.driver = driver;
    }

    private final String openSiteRentSamokats = "https://qa-scooter.praktikum-services.ru/";
    private final By topOrderButton = By.xpath("//button[@class='Button_Button__ra12g']");
    private final By middleOrderButton = By.xpath("//button[@class='Button_Button__ra12g Button_UltraBig__UU3Lp']");
    private final By questionHowPayRent = By.xpath("//div[@id='accordion__heading-0']"); //1 вопрос
    private final By questionTakeManySamokats = By.xpath("//div[@id='accordion__heading-1']"); //2 вопрос
    private final By questionHowRentTime = By.xpath("//div[@id='accordion__heading-2']"); //3 вопрос
    private final By questionRentTodaySamokat = By.xpath("//div[@id='accordion__heading-3']"); //4 вопрос
    private final By questionRentReturnSamokatEarlier = By.xpath("//div[@id='accordion__heading-4']"); //5 вопрос
    private final By questionDeliverCharger = By.xpath("//div[@id='accordion__heading-5']"); //6 вопрос
    private final By questionCancelOrder = By.xpath("//div[@id='accordion__heading-6']"); //7 вопрос
    private final By questionMkadDeliver = By.xpath("//div[@id='accordion__heading-7']"); //8 вопрос


    public void openSite(){
        driver.get(openSiteRentSamokats);
    }

    public void scrollMainPageForOrderButton(){
        WebElement element = driver.findElement(middleOrderButton);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
    }

    public void scrollMainPageForQuestions(){
        WebElement element = driver.findElement(questionMkadDeliver);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
    }

    public void clickQuestionHowPayRent(){
        driver.findElement(questionHowPayRent).click();
    }

    public void clickQuestionTakeManySamokats(){
        driver.findElement(questionTakeManySamokats).click();
    }

    public void clickQuestionHowRentTime(){
        driver.findElement(questionHowRentTime).click();
    }

    public void clickQuestionRentTodaySamokat(){
        driver.findElement(questionRentTodaySamokat).click();
    }

    public void clickQuestionRentReturnSamokatEarlier(){
        driver.findElement(questionRentReturnSamokatEarlier).click();
    }

    public void clickQuestionDeliverCharger(){
        driver.findElement(questionDeliverCharger).click();
    }

    public void clickQuestionCancelOrder(){
        driver.findElement(questionCancelOrder).click();
    }

    public void clickQuestionMkadDeliver(){
        driver.findElement(questionMkadDeliver).click();
    }

    public void clickTopOrderButton(){
        driver.findElement(topOrderButton).click();
    }

    public void clickMiddleOrderButton(){
        driver.findElement(middleOrderButton).click();
    }

}
