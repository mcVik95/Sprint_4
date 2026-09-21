import org.junit.Rule;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageObjects.MainPage;
import pageObjects.OrderPage;

import static org.junit.Assert.assertEquals;

public class YandexSamokatOrderTests {

    private WebDriver driver;
    @Rule
    public DriverFactory driverFactory = new DriverFactory();

    @Test
    public void correctFirstOrderTest(){
        driver = driverFactory.getDriver();
        MainPage mainPage = new MainPage(driver);
        OrderPage orderPage = new OrderPage(driver);
        mainPage.openSite();
        driver.findElement(By.id("rcc-confirm-button")).click();
        mainPage.clickFirstOrderButton();
        orderPage.enterUserName("Владимир");
        orderPage.enterUserSurname("Звягин");
        orderPage.enterAddress("Ленина 64");
        orderPage.enterStation();
        orderPage.enterPhoneNumber("89824366389");
        orderPage.clickNextButtonInOrderPage();
        orderPage.takeDateOrderComplite();
        orderPage.takeHowManyDaysRentSamokat();
        orderPage.takeColorSamokat();
        orderPage.readCommentForCurier("Вези самокат скорее!");
        orderPage.clickNextButtonInDetailsPage();
        orderPage.clickCompliteButtonInFinalOrderPage();
        assertEquals("Не верный текст на странице информации о подтверждении заказа!", "Заказ оформлен",
                driver.findElement(By.className("Order_ModalHeader__3FDaJ")));
    }

    @Test
    public void correctSecondOrderTest(){
        driver = driverFactory.getDriver();
        MainPage mainPage = new MainPage(driver);
        OrderPage orderPage = new OrderPage(driver);
        mainPage.openSite();
        driver.findElement(By.id("rcc-confirm-button")).click();
        mainPage.scrollMainPageForOrderButton();
        mainPage.clickSecondOrderButton();
        orderPage.enterUserName("Владимир");
        orderPage.enterUserSurname("Звягин");
        orderPage.enterAddress("Ленина 64");
        orderPage.enterStation();
        orderPage.enterPhoneNumber("89824366389");
        orderPage.clickNextButtonInOrderPage();
        orderPage.takeDateOrderComplite();
        orderPage.takeHowManyDaysRentSamokat();
        orderPage.takeColorSamokat();
        orderPage.readCommentForCurier("Вези самокат скорее!");
        orderPage.clickNextButtonInDetailsPage();
        orderPage.clickCompliteButtonInFinalOrderPage();
        assertEquals("Не верный текст на странице информации о подтверждении заказа!", "Заказ оформлен",
                driver.findElement(By.className("Order_ModalHeader__3FDaJ")));
    }
}
