package order;


import org.junit.Rule;
import pageobjects.DriverFactory;
import pageobjects.MainPage;
import pageobjects.OrderPage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;

    @RunWith(Parameterized.class)
    public class YandexSamokatOrderTests {
        private WebDriver driver;
        private final String name;
        private final String surname;
        private final String address;
        private final String metroStation;
        private final String phoneNumber;
        private final String orderDate;
        private final String rentalPeriod;
        private final String colour;
        private final String comment;
        private final String buttonType;

        public YandexSamokatOrderTests(String name, String surname, String address, String metroStation, String phoneNumber, String orderDate, String rentalPeriod, String colour, String comment, String buttonType) {
            this.name = name;
            this.surname = surname;
            this.address = address;
            this.metroStation = metroStation;
            this.phoneNumber = phoneNumber;
            this.orderDate = orderDate;
            this.rentalPeriod = rentalPeriod;
            this.colour = colour;
            this.comment = comment;
            this.buttonType = buttonType;
        }

        @Parameterized.Parameters
        public static Object[][] getCredentials() {
            return new Object[][]{
                    {"Владимир", "Звягин", "Ленина 64", "Черкизовская", "89824366389", "14.09.2026", "сутки", "серая безысходность", "Вези самокат скорее!", "верхняя"},
                    {"Артем", "Муратов", "Крупской 12", "Чистые пруды", "+79991231231", "20.10.2026", "пятеро суток", "чёрный жемчуг", "Хочу кататьсяяяя!", "нижняя"},
            };
        }

        @Rule
        public DriverFactory driverFactory = new DriverFactory();

    @Test
    public void orderSamokat() {
        driver = driverFactory.getDriver();
        MainPage mainPage = new MainPage(driver);
        mainPage.openSite();
        mainPage.clickCookie();
        mainPage.clickButtonOrder(buttonType);

        OrderPage orderPage = new OrderPage(driver);
        orderPage.firstLoginForm(name, surname, address, metroStation, phoneNumber);
        orderPage.clickNextButton();
        orderPage.secondLoginForm(orderDate, rentalPeriod, colour, comment);
        orderPage.clickOrderButton();
        orderPage.clickYesButton();
        assertTrue(orderPage.isOrderModalDisplayed());

    }
}
