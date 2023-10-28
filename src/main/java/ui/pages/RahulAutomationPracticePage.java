package ui.pages;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.DriverFactory;
import utils.WebDriverActions;

public class RahulAutomationPracticePage {

    private WebDriver driver;
    private WebDriverActions actions;


    @BeforeEach
    public void setUp() {
        driver = DriverFactory.getDriver();
        actions = new WebDriverActions(driver);
    }

    @Test
    public void testLogin() {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        /*WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("login"));

        actions.type(usernameField, "mi_usuario");
        actions.type(passwordField, "mi_contraseña");
        actions.click(loginButton);*/

    }
    @AfterEach
    public void tearDown() {
        DriverFactory.closeDriver();
    }
}
