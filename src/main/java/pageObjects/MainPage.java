package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {

    private WebDriver driver;

    public MainPage(WebDriver driver){
        this.driver = driver;
    }

    private final By firstOrderButton = By.xpath("//button[@class='Button_Button__ra12g']");
    private final By secondOrderButton = By.xpath("//button[@class='Button_Button__ra12g Button_UltraBig__UU3Lp']");
    private final By firstQuestInQuestionsPanel = By.xpath("//div[@id='accordion__heading-0']"); //1 вопрос
    private final By secondQuestInQuestionsPanel = By.xpath("//div[@id='accordion__heading-1']"); //2 вопрос
    private final By thirdQuestInQuestionsPanel = By.xpath("//div[@id='accordion__heading-2']"); //3 вопрос
    private final By fourthQuestInQuestionsPanel = By.xpath("//div[@id='accordion__heading-3']"); //4 вопрос
    private final By fifthQuestInQuestionsPanel = By.xpath("//div[@id='accordion__heading-4']"); //5 вопрос
    private final By sixthQuestInQuestionsPanel = By.xpath("//div[@id='accordion__heading-5']"); //6 вопрос
    private final By seventhQuestInQuestionsPanel = By.xpath("//div[@id='accordion__heading-6']"); //7 вопрос
    private final By eighthQuestInQuestionsPanel = By.xpath("//div[@id='accordion__heading-7']"); //8 вопрос


    public void openSite(){
        driver.get("https://qa-scooter.praktikum-services.ru/");
    }

    public void scrollMainPageForOrderButton(){
        WebElement element = driver.findElement(secondOrderButton);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
    }

    public void scrollMainPageForQuestions(){
        WebElement element = driver.findElement(eighthQuestInQuestionsPanel);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
    }

    public void clickFirstQuestionPanel(){
        driver.findElement(firstQuestInQuestionsPanel).click();
    }

    public void clickSecondQuestionPanel(){
        driver.findElement(secondQuestInQuestionsPanel).click();
    }

    public void clickThirdQuestionPanel(){
        driver.findElement(thirdQuestInQuestionsPanel).click();
    }

    public void clickFourthQuestionPanel(){
        driver.findElement(fourthQuestInQuestionsPanel).click();
    }

    public void clickFifthQuestionPanel(){
        driver.findElement(fifthQuestInQuestionsPanel).click();
    }

    public void clickSixthQuestionPanel(){
        driver.findElement(sixthQuestInQuestionsPanel).click();
    }

    public void clickSeventhQuestionPanel(){
        driver.findElement(seventhQuestInQuestionsPanel).click();
    }

    public void clickEighthQuestionPanel(){
        driver.findElement(eighthQuestInQuestionsPanel).click();
    }

    public void clickFirstOrderButton(){
        driver.findElement(firstOrderButton).click();
    }

    public void clickSecondOrderButton(){
        driver.findElement(secondOrderButton).click();
    }

}
