package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class OrderPage {
    private WebDriver driver;

    public OrderPage(WebDriver driver){
        this.driver = driver;
    }

    private static final By userNameInput = By.xpath("//input[@placeholder='* Имя']"); //Заполнение поля имя
    private static final By userSurnameInput = By.xpath("//input[@placeholder='* Фамилия']"); //Заполнение поля фамилия
    private static final By addressInput = By.xpath("//input[@placeholder='* Адрес: куда привезти заказ']"); //Заполнение поля адреса доставки самоката
    private static final By stationInput = By.xpath(".//input[@placeholder='* Станция метро']"); //Выбор станции метро
    private static final By phoneNumberInput = By.xpath("//input[@placeholder='* Телефон: на него позвонит курьер']"); //Заполнение поля телефон
    private static final By nextButtonInOrderPage = By.cssSelector(".Button_Button__ra12g.Button_Middle__1CSJM"); //Нажатие кнопки далее на странице заказа
    private static final By orderDateField = By.xpath(".//input[@placeholder='* Когда привезти самокат']"); //Поле когда привезти самокат
    private static final By openCalendarForTakeDateOrder = By.xpath(".//div[@class='Dropdown-placeholder' and text()='* Срок аренды']/.."); //Открытие списка, выбора срока аренды самоката
    private static final By commentForCurier = By.xpath("//input[@placeholder='Комментарий для курьера']"); //Комментарий для курьера
    private static final By nextButtonInDetailsPage = By.xpath("//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and text()='Заказать']"); //Нжатие на кнопку заказать
    private static final By compliteButtonInFinalOrderPage = By.xpath("//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and text()='Да']"); //Нажатие на кнопку подтверждения заказа
    private static final By orderModal = By.xpath(".//div[contains(text(), 'Заказ оформлен')]"); //Окно об успешном заказе самоката

    public void firstLoginForm(String name, String surname, String address, String metroStation, String phoneNumber) {
        driver.findElement(userNameInput).sendKeys(name);
        driver.findElement(userSurnameInput).sendKeys(surname);
        driver.findElement(addressInput).sendKeys(address);
        driver.findElement(stationInput).click();
        driver.findElement(By.xpath(".//div[text()='" + metroStation + "']")).click();
        driver.findElement(phoneNumberInput).sendKeys(phoneNumber);
    }

    public void clickNextButton() {
        driver.findElement(nextButtonInOrderPage).click();
    }

    public void secondLoginForm(String orderDate, String rentalPeriod, String colour, String comment) {
        driver.findElement(orderDateField).sendKeys(orderDate);
        driver.findElement(orderDateField).sendKeys(Keys.ENTER);
        driver.findElement(openCalendarForTakeDateOrder).click();
        driver.findElement(By.xpath(".//div[text()='" + rentalPeriod + "']")).click();
        driver.findElement(By.xpath(".//label[text()='" + colour + "']")).click();
        driver.findElement(commentForCurier).sendKeys(comment);
    }

    public void clickOrderButton() {
        driver.findElement(nextButtonInDetailsPage).click();
    }

    public void clickYesButton() {
        driver.findElement(compliteButtonInFinalOrderPage).click();
    }

    public boolean isOrderModalDisplayed() {
        return driver.findElement(orderModal).isDisplayed();
    }

}
