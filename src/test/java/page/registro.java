package page;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class registro extends Base {

    By registro = By.linkText("Sign Up Here");

    public registro(WebDriver driver) {
        super(driver);
    }

    public void clickRegistro() {
        click(registro);
    }
}
