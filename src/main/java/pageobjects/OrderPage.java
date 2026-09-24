package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderPage {
    private WebDriver driver;

    public OrderPage(WebDriver driver){
        this.driver = driver;
    }

    private final By userNameInput = By.xpath("//input[@placeholder='* Имя']"); //Заполнение поля имя
    private final By userSurnameInput = By.xpath("//input[@placeholder='* Фамилия']"); //Заполнение поля фамилия
    private final By addressInput = By.xpath("//input[@placeholder='* Адрес: куда привезти заказ']"); //Заполнение поля адреса доставки самоката
    private final By stationList = By.className("select-search__input"); //Открытие списка станций метро
    private final By stationInput = By.className("Order_Text__2broi"); //Выбор станции метро
    private final By phoneNumberInput = By.xpath("//input[@placeholder='* Телефон: на него позвонит курьер']"); //Заполнение поля телефон
    private final By nextButtonInOrderPage = By.cssSelector(".Button_Button__ra12g.Button_Middle__1CSJM"); //Нажатие кнопки далее на странице заказа
    private final By openCalendarForTakeDateOrder = By.xpath("//input[@placeholder='* Когда привезти самокат']"); //Открытие календаря, выбора даты доставки самоката
    private final By dateOrderComplite = By.xpath("//div[@aria-label='Choose понедельник, 14-е сентября 2026 г.']"); //Выбор даты, когда нужно доставить самокат
    private final By commentForCurier = By.xpath("//input[@placeholder='Комментарий для курьера']"); //Комментарий для курьера
    private final By nextButtonInDetailsPage = By.xpath("//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and text()='Заказать']"); //Нжатие на кнопку заказать
    private final By compliteButtonInFinalOrderPage = By.xpath("//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and text()='Да']"); //Нажатие на кнопку подтверждения заказа


    public void enterUserName(String userName){
        driver.findElement(userNameInput).sendKeys(userName);
    }

    public void enterUserSurname(String userSurname){
        driver.findElement(userSurnameInput).sendKeys(userSurname);
    }

    public void enterAddress(String address){
        driver.findElement(addressInput).sendKeys(address);
    }

    public void enterStation(){
        driver.findElement(stationList).click();
        driver.findElement(stationInput).click();
    }

    public void enterPhoneNumber(String phoneNumber){
        driver.findElement(phoneNumberInput).sendKeys(phoneNumber);
    }

    public void clickNextButtonInOrderPage(){
        driver.findElement(nextButtonInOrderPage).click();
    }

    public void takeDateOrderComplite(){
        driver.findElement(openCalendarForTakeDateOrder).click();
        driver.findElement(dateOrderComplite).click();
    }

    public void takeHowManyDaysRentSamokat(){
        driver.findElement(By.className("Dropdown-arrow")).click();
        driver.findElement(By.xpath("//div[text()='сутки']")).click();
    }

    public void takeColorSamokat(){
        driver.findElement(By.id("black")).click();
    }

    public void readCommentForCurier(String comment){
        driver.findElement(commentForCurier).sendKeys(comment);
    }

    public void clickNextButtonInDetailsPage(){
        driver.findElement(nextButtonInDetailsPage).click();
    }

    public void clickCompliteButtonInFinalOrderPage(){
        driver.findElement(compliteButtonInFinalOrderPage).click();
    }

}
